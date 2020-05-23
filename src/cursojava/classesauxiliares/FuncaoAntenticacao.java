package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

//Responsabel por recebem alguma pessoa que tem o contrato da interface de PermitirAcesso
public class FuncaoAntenticacao {
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAntenticacao (PermitirAcesso acesso) {
		
		this.permitirAcesso = acesso;
		
	}

}
