package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

import javax.xml.stream.events.StartDocument;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}

	@Override
	public void run() {

		System.out.println("Testando implementacao");

		while (true) {

			synchronized (pilha_fila) { // bloquear o acesso a esta lista por outros processos

				Iterator iteracao = pilha_fila.iterator();

				while (iteracao.hasNext()) { // enquanto conter dados na lista, ira processar

					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next(); // pega o objeto atual, processa e
																						// remove

					// processar 10 mil notas fiscais por exemplo
					// Gerar uma lista enorme de PDF
					// Gerar por exemplo um envio e massa de email

					System.out.println("---------------------------------------------");
					System.out.println("Nome..:" + processar.getNome());
					System.out.println("Email.:" + processar.getEmail());
					System.out.println("---------------------------------------------");

					iteracao.remove();

					try {
						Thread.sleep(1000); // dar um tempo de descargo de memória
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // fim while

			}

			try {
				Thread.sleep(1000); // depois de processar toda a lista, da um tempo para descargo de memória
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
