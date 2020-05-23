package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

// classe filha da Pessoa
public class Secretario extends Pessoa implements PermitirAcesso{
	
	private String registro;
	private String nivelCargo;
	private String experiencia;
	
	private String login;
	private String senha;
	
	public  Secretario() {
		
	}
	
    public  Secretario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public String getRegistro() {
		return registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	@Override
	public String toString() {
		return "Secretario [Registro=" + registro + ", NivelCargo=" + nivelCargo + ", Experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}
	
	@Override
	public double salario() {
		return 1800.80 * 0.9;
	}
	//Esse é o moetodo do cotrato de autenticacao

	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticar();
	}

	@Override
	public boolean autenticar() {
		
		return login.equals("admin") && senha.equals("admin");
	}
	
	
	
	
	

}
