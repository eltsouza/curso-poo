package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.BrokenBarrierException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {
	
	private JPanel jPanel = new JPanel(new GridBagLayout()); //painel de componentes
	
	private JLabel descricaoHora = new JLabel("Time Thread 1");
	private JTextField mostraTempo = new JTextField();
	private JLabel descricaoHora2 = new JLabel("Time Thread 2");
	private JTextField mostraTempo2 = new JTextField();
	private JButton jbuttonStart = new JButton("Start");
	private JButton jbuttonStop = new JButton("Stop");
	//
	//Declarando thread
	
	private Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {

			while(true) { //fica sempre rodando
				
				mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
	
	private Thread thread1Time; //declaração global para acessar a thread de qualquer lugar da classe

	private Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {

			while(true) { //fica sempre rodando
				
				mostraTempo2.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};	
	
	private Thread thread2Time; //declaração global para acessar a thread de qualquer lugar da classe
	
	//implementando o construtor. Executa o que tiver dentro no momento da abertura ou execução do objeto
	public TelaTimeThread() {

        
		setTitle("Minha tela de Time com Thread");
		setSize(new Dimension(250,250));
		setLocationRelativeTo(null);
		setResizable(false);//nao altera o tamanho da tela.
		
		//Gerenciador de Layout para desktop
		GridBagConstraints gridBagConstraints = new GridBagConstraints();//controlador de posicionamento de componentes
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new Insets(5, 10, 5, 5);
        gridBagConstraints.anchor = GridBagConstraints.WEST;
		
        descricaoHora.setPreferredSize(new Dimension(200,25));
        jPanel.add(descricaoHora,gridBagConstraints);
        
        mostraTempo.setPreferredSize(new Dimension(200,25));
        gridBagConstraints.gridy ++; // Andando a coluna
        mostraTempo.setEditable(false);
        jPanel.add(mostraTempo,gridBagConstraints);
        
        descricaoHora2.setPreferredSize(new Dimension(200,25));
        gridBagConstraints.gridy ++; // Andando a coluna
        jPanel.add(descricaoHora2,gridBagConstraints);
        
        mostraTempo2.setPreferredSize(new Dimension(200,25));
        gridBagConstraints.gridy ++; // Andando a coluna
        mostraTempo2.setEditable(false);
        jPanel.add(mostraTempo2,gridBagConstraints);
		
        gridBagConstraints.gridwidth = 1;

        jbuttonStart.setPreferredSize(new Dimension(92,25));
        gridBagConstraints.gridy ++; // Andando a coluna
        jPanel.add(jbuttonStart,gridBagConstraints);         
		
        jbuttonStop.setPreferredSize(new Dimension(92,25));
        gridBagConstraints.gridx ++; //Andando a linha
        jPanel.add(jbuttonStop,gridBagConstraints);         
		
		//adicionando a ação aos botões
        
        jbuttonStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { //executa o clique no botão start
			
				thread1Time = new Thread(thread1);
				thread1Time.start();
				
				thread2Time = new Thread(thread2);
				thread2Time.start();
				
		        jbuttonStop.setEnabled(true);
		        jbuttonStart.setEnabled(false);

			}
		});
        
        jbuttonStop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { //executa o clique no botão stop

				thread1Time.stop();
				thread2Time.stop();		
		        jbuttonStart.setEnabled(true);
		        jbuttonStop.setEnabled(false);

				
			}
		});
        
        jbuttonStop.setEnabled(false);
        
		add(jPanel,BorderLayout.WEST);// alinha a esquerda
		setVisible(true); // torna a tela visivel para o usuário. Sempre será o ultimo comando
		
	}
	

}
