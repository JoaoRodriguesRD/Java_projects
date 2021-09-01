package Game;

import java.awt.EventQueue;
import java.math.BigInteger;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuGame {

	private JFrame frame;
	JLabel lblNewLabel = new JLabel("Seu dinheiro:");
	JLabel lblNewLabel_1 = new JLabel("0");
	BigInteger dinheiro = new BigInteger("0");
	JProgressBar progressBar = new JProgressBar();
	JButton btnNewButton = new JButton("aperta\r\n");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                }
				
				
				try {
					MenuGame window = new MenuGame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		progressBar.setBounds(190, 53, 146, 23);
		progressBar.setMinimum(0);
		progressBar.setMaximum(100);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//btnNewButton.setEnabled(false);
				carregar();
				
				
				
				
				dinheiro = dinheiro.add(new BigInteger("1"));
				String dinheiroAtualizado = dinheiro.toString();
				lblNewLabel_1.setText(dinheiroAtualizado);
				int a = dinheiro.intValue();
				
				
				
			}

			
		});
		btnNewButton.setBounds(22, 53, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		
		
		progressBar.setValue(0);
		frame.getContentPane().add(progressBar);
		
		
		lblNewLabel.setBounds(10, 11, 83, 14);
		frame.getContentPane().add(lblNewLabel);
		
		
		lblNewLabel_1.setBounds(85, 11, 169, 14);
		frame.getContentPane().add(lblNewLabel_1);
	}
	
	
	
	private void carregar() {
		//while(progressBar.isMaximumSizeSet());
		long createdMillis = System.currentTimeMillis();
		while(System.currentTimeMillis() - createdMillis<1000) {
			int valor = (int) (System.currentTimeMillis() - createdMillis);
//			System.out.println(valor);
//			progressBar.setValue(valor);
//			
			//progressBar.setValue(progressBar.getValue()+valor);
			
			System.out.println(progressBar.getValue());
//			long processed = System.currentTimeMillis() - createdMillis;
//			if(processed%10==0) {
//				System.out.println("AQUI");
//				int valor = (int) (processed/100);
//				
//			}
//			System.out.println(processed);
//			//progressBar.setValue(width);
//			
//			
			
			
			
		}
		System.out.println("AAAAAAA");
		for( int i = 0; i <= 100; i++ ) {
            
            try {
                Thread.sleep(100); // 1s
                progressBar.setValue(i);
            } catch( Exception e ) {
                e.printStackTrace();
            }
            
            System.out.println(progressBar.getValue());
            dinheiro = dinheiro.add(new BigInteger("1"));
			String dinheiroAtualizado = dinheiro.toString();
			lblNewLabel_1.setText(dinheiroAtualizado);
        }
		
	}
	
	public class ProgressWorker extends SwingWorker<Object, Object> {

        @Override
        protected Object doInBackground() throws Exception {

            for (int i = 0; i < 100; i++) {        
                setProgress(i);
                try {
                    Thread.sleep(25);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            return null;
        }
    }
	
}
