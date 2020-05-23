package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		// Thread processo paralelo de envio de email
		Thread threadEmail =  new Thread(thread1);
        threadEmail.start();      
		
		// =================Divisao Thread ======================

		// Thread processo paralelo de envio de nota fiscal
		Thread threadNF =  new Thread(thread2);
		threadNF.start();
        
        
        
		// fim do codigo executado em paralelo do usuario, mas continua o fluxo do trabalho
		System.out.println("Fim codigo Thread.");

		// fluxo do sistema, cadastro de venda, emissao de NF
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuario.");

	}

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {

			// codigo da rotina executada em paralelo
			for (int pos = 0; pos < 10; pos++) {

				// Executando este envio com tempo de parada, ou tempo determinado

				System.out.println("Executando a rotina de envio de e-mail");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}
	};

	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {

			// codigo da rotina executada em paralelo
			for (int pos = 0; pos < 10; pos++) {

				// Executando este envio com tempo de parada, ou tempo determinado

				System.out.println("Executando a rotina de envio de Nota Fiscal");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}
	};

}
