package cursojava.interfaces;


//Essa interface ser� nosso contrato de atuentica��o
public interface PermitirAcesso {

	
	//public boolean autenticar(); // somente a declara��o do metodo na interface
	
	public boolean autenticar(String login, String senha);// somente a declara��o do metodo na interface
	
	public boolean autenticar();
}
