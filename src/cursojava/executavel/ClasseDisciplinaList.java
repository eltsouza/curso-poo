package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import cursojava.classes.AlunoList;
import cursojava.classes.DisciplinaList;
import cursojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAntenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.interfaces.PermitirAcesso;

public class ClasseDisciplinaList {

	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe o login.");		
		String senha = JOptionPane.showInputDialog("Informe a senha.");
		
		//PermitirAcesso secretario = new Secretario();

		
		PermitirAcesso permitirAcesso = new Secretario(login, senha);
		
		
		if (new FuncaoAntenticacao(permitirAcesso).autenticar()) { // se true acessa, se false não acessa
		
			List<AlunoList> alunos = new ArrayList<AlunoList>();
			
			//HashMap é uma lista que dentro existe uma chave que identifica uma sequencia de valores
			HashMap<String, List<AlunoList>> maps = new HashMap<String, List<AlunoList>>();
	
			//List<AlunoList> alunosAprovados = new ArrayList<AlunoList>();
			//List<AlunoList> alunosRecuperacao = new ArrayList<AlunoList>();
			//List<AlunoList> alunosReprovados = new ArrayList<AlunoList>();
	
			for (int qtd = 1; qtd <= 1; qtd++) {
	
				AlunoList alunoList = new AlunoList();
	
				String nome = JOptionPane.showInputDialog("Nome do aluno." + qtd);
				//String idade = JOptionPane.showInputDialog("Idade do aluno." + qtd);
				// String dataNascimento = JOptionPane.showInputDialog("Data nascimento do
				// aluno.");
	
				alunoList.setNome(nome);
				//alunoList.setIdade(Integer.valueOf(idade));
				// alunoList.setDataNascimento(dataNascimento);
				//alunoList.setIdade(Integer.valueOf(idade));
	
				// Loop na lista para informar as disciplinas
				for (int pos = 1; pos <= 1; pos++) {
					String disciplina = JOptionPane.showInputDialog("Nome da Disciplina..:" + pos);
					String nota = JOptionPane.showInputDialog("Nota da Disciplina." + pos);
					DisciplinaList disciplinaList = new DisciplinaList();
					disciplinaList.setDisciplina(disciplina);
				//	disciplinaList.setNota(Double.valueOf(nota));
					alunoList.getDisciplinas().add(disciplinaList);
				}
	
				int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
	
				if (escolha == 0) {// Opção SIM é 0 - Opção NÃO é 0
	
					int continuarRemover = 0;
					int posicao = 1;
	
					while (continuarRemover == 0) {
						String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4 ?");
						alunoList.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
						posicao++;
						continuarRemover = JOptionPane.showConfirmDialog(null,
								"Deseja continuar removendo as disciplinas ?");
					}
				}
	
				alunos.add(alunoList);
	
			} // fim primeiro for qtd alunos
			
			maps.put(StatusAluno.APROVADO, new ArrayList<AlunoList>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<AlunoList>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<AlunoList>());
	
			for (AlunoList alunoList : alunos) {
	
				if (alunoList.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					//alunosAprovados.add(alunoList);
					maps.get(StatusAluno.APROVADO).add(alunoList);
				} else {
					if (alunoList.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						//alunosRecuperacao.add(alunoList);
						maps.get(StatusAluno.RECUPERACAO).add(alunoList);
	
					} else {
						//alunosReprovados.add(alunoList);
						maps.get(StatusAluno.REPROVADO).add(alunoList);
					}
				}
	
			}
	
			System.out.println("Lista dos aprovados");
	
			for (AlunoList alunoList2 : maps.get(StatusAluno.APROVADO)) {
				System.out.println("O aluno .:" + alunoList2.getNome());
				System.out.println("Média do aluno.:" + alunoList2.getMediaNota());
				System.out.println("Resultado..:" + alunoList2.getAlunoAprovado2());
				System.out.println("--------------------------------------------------------------");
	
			}
	
			System.out.println("Lista dos recuperacao");
	
			for (AlunoList alunoList3 : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("O aluno .:" + alunoList3.getNome());
				System.out.println("Média do aluno.:" + alunoList3.getMediaNota());
				System.out.println("Resultado..:" + alunoList3.getAlunoAprovado2());
				System.out.println("--------------------------------------------------------------");
	
			}
			
			System.out.println("Lista dos reprovados");
	
			for (AlunoList alunoList4 : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("O aluno .:" + alunoList4.getNome());
				System.out.println("Média do aluno.:" + alunoList4.getMediaNota());
				System.out.println("Resultado..:" + alunoList4.getAlunoAprovado2());
				System.out.println("--------------------------------------------------------------");
	
			}		
	
			/*
			 * for (AlunoList alunoList2 : alunos) {
			 * 
			 * if (alunoList2.getNome().equalsIgnoreCase("elton")) {
			 * alunos.remove(alunoList2); System.out.println("O aluno " +
			 * alunoList2.getNome() +" foi remvoido da lista"); break; }else {
			 * System.out.println(alunoList2.toString()); // toString descrição do objeto na
			 * memoria. System.out.println("Média do aluno.:" + alunoList2.getMediaNota());
			 * System.out.println("Resultado..:" + alunoList2.getAlunoAprovado2());
			 * System.out.println(
			 * "--------------------------------------------------------------"); } }
			 * 
			 * for (AlunoList alunoList2 : alunos) {
			 * System.out.println("Alunos na lista.:");
			 * System.out.println(alunoList2.getNome());
			 * System.out.println("Suas disciplinas são.:"); for (DisciplinaList
			 * disciplinaList : alunoList2.getDisciplinas()) {
			 * System.out.println(disciplinaList.getDisciplina()); }
			 * 
			 * }
			 * 
			 * //For para percorrer uma lista pelas posições for(int pos = 0 ; pos <
			 * alunos.size(); pos++) {
			 * 
			 * AlunoList alunoList = alunos.get(pos);
			 * 
			 * //Substituindo um aluno na lista
			 * 
			 * if (alunoList.getNome().equalsIgnoreCase("alex")) { AlunoList alunoListTrocar
			 * = new AlunoList(); alunoListTrocar.setNome("Aluno foi trocado");
			 * 
			 * DisciplinaList discListTrocada = new DisciplinaList();
			 * discListTrocada.setDisciplina("Matematica"); discListTrocada.setNota(90);
			 * 
			 * alunoListTrocar.getDisciplinas().add(discListTrocada);
			 * 
			 * //trocando o aluno pela posicao alunos.set(pos, alunoListTrocar); alunoList =
			 * alunos.get(pos); }
			 * 
			 * System.out.println("O aluno .:" + alunoList.getNome());
			 * System.out.println("Média do aluno.:" + alunoList.getMediaNota());
			 * System.out.println("Resultado..:" + alunoList.getAlunoAprovado2());
			 * System.out.println(
			 * "--------------------------------------------------------------");
			 * 
			 * //for (DisciplinaList disciplinaList : alunoList.getDisciplinas()) { for(int
			 * posd = 0 ; posd < alunoList.getDisciplinas().size(); pos++) {
			 * 
			 * DisciplinaList dist = alunoList.getDisciplinas().get(posd);
			 * System.out.println("Disciplina.:" + dist.getDisciplina());
			 * System.out.println("Nota..:" + dist.getNota()); }
			 * 
			 * }
			 */
			
			}else{
			 JOptionPane.showMessageDialog(null, "Acesso Negado. Usuario/Senha inválidos.");
			}//fim if login
		

		}

	}
