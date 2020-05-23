package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread2 extends JDialog {

	private JPanel jPanel = new JPanel(new GridBagLayout()); // painel de componentes

	private JLabel descricaoNome = new JLabel("Nome");
	private JTextField mostraNome = new JTextField();
	private JLabel descricaoEmail = new JLabel("Email");
	private JTextField mostraEmail = new JTextField();
	private JButton jbuttonAddLista = new JButton("Add Lista");
	private JButton jbuttonStop = new JButton("Stop");

	private ImplementacaoFilaThread filaThread = new ImplementacaoFilaThread();

	//
	// implementando o construtor. Executa o que tiver dentro no momento da abertura
	// ou execução do objeto
	public TelaTimeThread2() {

		setTitle("Tela 2 com Thread e fila");
		setSize(new Dimension(250, 250));
		setLocationRelativeTo(null);
		setResizable(false);// nao altera o tamanho da tela.

		// Gerenciador de Layout para desktop
		GridBagConstraints gridBagConstraints = new GridBagConstraints();// controlador de posicionamento de componentes
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;

		descricaoNome.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoNome, gridBagConstraints);

		mostraNome.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++; // Andando a coluna
		mostraNome.setEditable(true);
		jPanel.add(mostraNome, gridBagConstraints);

		descricaoEmail.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++; // Andando a coluna
		jPanel.add(descricaoEmail, gridBagConstraints);

		mostraEmail.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++; // Andando a coluna
		mostraEmail.setEditable(true);
		jPanel.add(mostraEmail, gridBagConstraints);

		gridBagConstraints.gridwidth = 1;

		jbuttonAddLista.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++; // Andando a coluna
		jPanel.add(jbuttonAddLista, gridBagConstraints);

		jbuttonStop.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++; // Andando a linha
		jPanel.add(jbuttonStop, gridBagConstraints);

		// adicionando a ação aos botões

		jbuttonAddLista.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { // executa o clique no botão start

				if (filaThread == null) {
					filaThread = new ImplementacaoFilaThread();
					filaThread.start();
				}
				for (int qtd = 0; qtd < 100; qtd++) {// simulando 100 envios em massa

					ObjetoFilaThread objetoFilaThread = new ObjetoFilaThread();
					objetoFilaThread.setNome(mostraNome.getText());
					objetoFilaThread.setEmail(mostraEmail.getText() + " - " + qtd);

					filaThread.add(objetoFilaThread);
				}
			}
		});

		jbuttonStop.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { // executa o clique no botão stop

				filaThread.stop();
				filaThread = null;

			}
		});

		filaThread.start();

		add(jPanel, BorderLayout.WEST);// alinha a esquerda
		setVisible(true); // torna a tela visivel para o usuário. Sempre será o ultimo comando

	}

}
