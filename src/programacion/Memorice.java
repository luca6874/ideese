package programacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Memorice {

	private JFrame frame;
	public Integer [] cartas = {1,1,2,2,3,3,4,4,5,5,6,6};
	public int [] status = {0,0,0,0,0,0,0,0,0,0,0,0};
	public int tarjetas_mostradas = 0;
	public int carta_1=0,carta_2=0;
	public List<JButton> botonesTablero = new ArrayList<>();
    public List<JButton> botonesVolteados = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Memorice window = new Memorice();
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
	public Memorice() {
		initialize();
	}


   

   

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 689, 569);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//desordenar cartas 
		List<Integer> lista = Arrays.asList(cartas);
        Collections.shuffle(lista);
        
        lista.toArray(cartas);
        
        System.out.println(Arrays.toString(cartas));
        //desordenar cartas
        
        
		JPanel panel = new JPanel();
		panel.setBackground(new Color(119, 188, 253));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(1, 3, 0, 0));
		
		JLabel lblNewLabel = new JLabel("0");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("0");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("0");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(171, 250, 255));
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(3, 4, 0, 0));
		
		panel_1.setLayout(new GridLayout(3, 4, 5, 5));

        for (int i = 0; i < 12; i++) {
            
            JButton btn = new JButton();
           btn.setIcon(escalarImagen("/imagen/yo.png"));
            
            int index = i; 
            
            btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    flip(index, btn);
                }
            });
            
            botonesTablero.add(btn);
            panel_1.add(btn);
        }
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(247, 239, 127));
		frame.getContentPane().add(panel_2, BorderLayout.SOUTH); 
		
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                List<Integer> lista = Arrays.asList(cartas);
                Collections.shuffle(lista);
                lista.toArray(cartas);

                carta_1 = 0;
                carta_2 = 0;
                tarjetas_mostradas = 0;

        
                for(int i = 0; i<12; i++){
                    status[i] = 0;
                }

                for(JButton btn : botonesTablero){
                    btn.setIcon(escalarImagen("/imagen/yo.png"));
                    btn.setEnabled(true);
                }

                botonesVolteados.clear();

			}
		});
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Pausa");
		panel_2.add(btnNewButton_1);
	}
	
	public void flip(Integer n,JButton b) {
		
		if(status[n] == 0) { 
			
			if(carta_1 == 0) {
				carta_1 =   cartas[n];
			}else {
				carta_2 =  cartas[n];
			}  
			
			status[n] = 1;
			
			
            b.setIcon(escalarImagen("/imagen/" + cartas[n] + ".png"));			
			botonesVolteados.add(b);
			
			tarjetas_mostradas+= 1;
			
			if(tarjetas_mostradas == 2) {
				
				if (carta_1 == carta_2 && carta_1!=0) {
                    System.out.println("Pares");

                    for(int i =0; i<12; i++){
                        if(status[i] == 1){
                            status[i] =2;
                        }
                    }

                    for (Iterator iterator = botonesVolteados.iterator(); iterator.hasNext();) {
                        JButton jButton = (JButton) iterator.next(); 
                        jButton.setEnabled(false);
                    }
                    botonesVolteados.clear();

                    tarjetas_mostradas = 0; 
                    carta_1 = 0;
                    carta_2 = 0; 

                    ganar();

                   
					
				}else {
					
					tarjetas_mostradas = 0; 
					carta_1 = 0;
					carta_2 = 0; 
					
					for (int i = 0; i < 12; i++) {
						
						if(status[i]!=2) {
							status[i]=0;
						}
					}
					
					JOptionPane.showMessageDialog(null, "alert", "alert", JOptionPane.ERROR_MESSAGE);
					
					for (Iterator iterator = botonesVolteados.iterator(); iterator.hasNext();) {
						JButton jButton = (JButton) iterator.next();
                        jButton.setIcon(escalarImagen("/imagen/yo.png"));					
                    }
					
					botonesVolteados.clear();
				}
				
			}
			
			
		}else {
			//System.out.println(status[n]);
		}
		
	}

     public void ganar (){

        for(int i = 0; i<12; i++){
            if(status[i]!=2){
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "damn, has ganao");
    }
	
     public ImageIcon escalarImagen(String ruta) {
            ImageIcon icon = new ImageIcon(getClass().getResource(ruta));
            Image img = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            return new ImageIcon(img);
        }//pa q se vea bonito, es clave
	
	
	
	

}