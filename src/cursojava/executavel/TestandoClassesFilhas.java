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
		
		System.out.println("---------Relat�rio Escola JDev.-----------");
		 
		System.out.println("Aluno..:" + alunoList.getNome());
		System.out.println("Escola.:"+ alunoList.getNomeEscola());
		System.out.println("-------------------------------");
		System.out.println("Diretor..:" + diretor.getNome());
		System.out.println("Registro.:"+ diretor.getRegistroEducacao());
		System.out.println("Tempo....:"+ diretor.getTempoDirecao() + " anos.");
		System.out.println("-------------------------------");
		System.out.println("Secret�rio..:" + secretario.getNome());
		System.out.println("Experi�ncia.:" + secretario.getExperiencia());
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
		
		System.out.println("Sal�rio Aluno �.:" + alunoList.salario());
		System.out.println("Sal�rio Diretor �.:" + diretor.salario());
		System.out.println("Sal�rio Secret�rio �.:" + secretario.salario());

		
		testePolimorfismo(alunoList);
		testePolimorfismo(diretor);
		testePolimorfismo(secretario);
		
	}
	
	public static void testePolimorfismo(Pessoa pessoa) {
		System.err.println("Essa pessoa � demais = " + pessoa.getNome() + " e o sal�rio � de = " + pessoa.salario());
	}

}
