package cursojava.classes;

//Classe filha da pessoa
public class Diretor extends Pessoa {
	
	private String RegistroEducacao;
	private int TempoDirecao;
	private String Titulacao;
	
	
	public String getRegistroEducacao() {
		return RegistroEducacao;
	}
	public int getTempoDirecao() {
		return TempoDirecao;
	}
	public String getTitulacao() {
		return Titulacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		RegistroEducacao = registroEducacao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		TempoDirecao = tempoDirecao;
	}
	public void setTitulacao(String titulacao) {
		Titulacao = titulacao;
	}
	
	@Override
	public String toString() {
		return "Diretor [RegistroEducacao=" + RegistroEducacao + ", TempoDirecao=" + TempoDirecao + ", Titulacao="
				+ Titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + "]";
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 4000.00;
	}

	
	
	
	

}
