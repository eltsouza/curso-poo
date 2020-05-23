package cursojava.executavel;
import cursojava.classes.AlunoList;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		
		AlunoList alunoList = new AlunoList();
		
		alunoList.setNome("Elton Souza");
		alunoList.setNomeEscola("JDev - Treinamento");
		alunoList.setIdade(16);
		
		Diretor diretor = new Diretor();
		
		diretor.setNome("Alex Egidio");
        diretor.setRegistroEducacao("12312312321");
        diretor.setTempoDirecao(20);
        diretor.setIdade(60);
		
		Secretario secretario = new Secretario();
		
		secretario.setNome("Helen Varjao");
		secretario.setExperiencia("Administradora");
		secretario.setNivelCargo("SR");
		secretario.setIdade(18);
		
		System.out.println("---------Relatório Escola JDev.-----------");
		 
		System.out.println("Aluno..:" + alunoList.getNome());
		System.out.println("Escola.:"+ alunoList.getNomeEscola());
		System.out.println("-------------------------------");
		System.out.println("Diretor..:" + diretor.getNome());
		System.out.println("Registro.:"+ diretor.getRegistroEducacao());
		System.out.println("Tempo....:"+ diretor.getTempoDirecao() + " anos.");
		System.out.println("-------------------------------");
		System.out.println("Secretário..:" + secretario.getNome());
		System.out.println("Experiência.:" + secretario.getExperiencia());
		System.out.println("Nivel Cargo.:" + secretario.getNivelCargo());
		
		
		System.out.println(alunoList);
		System.out.println(diretor);
		System.out.println(secretario);
		
		alunoList.pessoaMaiorIdade();
		diretor.pessoaMaiorIdade();
		secretario.pessoaMaiorIdade();
		
		System.out.println(alunoList.pessoaMaiorIdade() + " - " + alunoList.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Salário Aluno é.:" + alunoList.salario());
		System.out.println("Salário Diretor é.:" + diretor.salario());
		System.out.println("Salário Secretário é.:" + secretario.salario());

		
		testePolimorfismo(alunoList);
		testePolimorfismo(diretor);
		testePolimorfismo(secretario);
		
	}
	
	public static void testePolimorfismo(Pessoa pessoa) {
		System.err.println("Essa pessoa é demais = " + pessoa.getNome() + " e o salário é de = " + pessoa.salario());
	}

}
