package cursojava.interfaces;


//Essa interface será nosso contrato de atuenticação
public interface PermitirAcesso {

	
	//public boolean autenticar(); // somente a declaração do metodo na interface
	
	public boolean autenticar(String login, String senha);// somente a declaração do metodo na interface
	
	public boolean autenticar();
}
