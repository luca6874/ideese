package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class AuthViews {

    public AuthViews(){
        
    }

    public void login(){
        JFrame ventana = new JFrame();
		
		ventana.setSize(1000, 620); 
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setMinimumSize(new Dimension(200,200));
		ventana.setMaximumSize(new Dimension(1000,800));
		ventana.setLocationRelativeTo(null);
		ventana.setTitle("Hola");
		ventana.setLayout(null); 
		ventana.getContentPane().setBackground(Color.gray); 

        
        //aqui es el login, donde van los botones y todo eso


        JPanel login_container = new JPanel();
        login_container.setSize(400,470);
        login_container.setLocation(50,50);
        login_container.setLayout(null);
        ventana.add(login_container);

        login_container.setBorder(BorderFactory.createRaisedBevelBorder());


        /*ImageIcon fondo = new ImageIcon("src/imagen/2164111.png");
        JLabel fondo_label = new JLabel(fondo);
        fondo_label.setBounds(0,0,600,470);

        login_container.add(fondo_label);*/



        //añadiendo elementos al panel de login

        JLabel tag_tittle = new JLabel();
        tag_tittle.setText("Acceso");
        tag_tittle.setSize(150,40);
        tag_tittle.setLocation(120,10);
        tag_tittle.setBackground(Color.cyan);
        tag_tittle.setOpaque(true);
        tag_tittle.setFont(new Font("Arial",Font.ITALIC,22));
        tag_tittle.setHorizontalAlignment(JLabel.CENTER);
        tag_tittle.setBorder(BorderFactory.createRaisedBevelBorder());

        login_container.add(tag_tittle);

        JLabel usuario = new JLabel();
        usuario.setText("ingrese correo");
        usuario.setSize(200,20);
        usuario.setLocation(10,70);
        usuario.setBackground(Color.white);
        //usuario.setOpaque(true);
        usuario.setFont(new Font("Arial",Font.BOLD,19));
        usuario.setHorizontalAlignment(JLabel.CENTER);
        login_container.add(usuario);

        JLabel password = new JLabel();
        password.setText("ingrese contraseña");
        password.setSize(200,20);
        password.setLocation(10,170);
        password.setBackground(Color.white);
        //usuario.setOpaque(true);
        password.setFont(new Font("Arial",Font.BOLD,19));
        password.setHorizontalAlignment(JLabel.CENTER);
        login_container.add(password);

        //wazuh

        JTextField email_input = new JTextField();
        email_input.setSize(200,40);
        email_input.setLocation(20,100);
        login_container.add(email_input);

       


        JPasswordField password_input = new JPasswordField();
        password_input.setSize(200,40);
        password_input.setLocation(20,200);
        login_container.add(password_input);

        JCheckBox rememberme = new JCheckBox();
        rememberme.setSize(170,40);
        rememberme.setLocation(60,300);
        rememberme.setText("¿recordar contraseña?");
        rememberme.setOpaque(false);
        login_container.add(rememberme);

        JButton acces_btn = new JButton();
        acces_btn.setText("Acceder");
        acces_btn.setBounds(100,350,200,40);
        acces_btn.setFont(new Font("Arial",Font.ITALIC,18));
        
        login_container.add(acces_btn);


        JButton logBtn = new JButton();
        logBtn.setText("ir a registro");
        logBtn.setBounds(100,410,200,40);
        logBtn.setFont(new Font("Arial",Font.ITALIC,18));
        
        login_container.add(logBtn);

        /*logBtn.addActionListener(e ->{
            this.router("registro");

        });*/



        //credenciales de prueba
        String usuario2 = "Alex";
        String contraseña = "EriMiLoba";


         acces_btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String email = email_input.getText();
                char[] passwordChars = password_input.getPassword();
                String password = new String(passwordChars);              
                boolean tieneEspacio2 = password.contains(" ");  
                boolean tieneEspacio = email.contains(" ");

                int longitud = password.length();

                //validaciones
				if(email.equals("")) {
					System.out.println("vacio");
					
					email_input.setBorder(BorderFactory.createLineBorder(Color.red,3));
					
				}else if(tieneEspacio){
                    System.out.println("Tiene espacios en blanco");
					
					email_input.setBorder(BorderFactory.createLineBorder(Color.red,3));
                    
                }else if(tieneEspacio2){
                    System.out.println("Contiene espacios la contraseña");
					
					password_input.setBorder(BorderFactory.createLineBorder(Color.red,3));
                    
                 }else if(longitud<=6){
                    System.out.println("minimo 6 caracteres para contraseña");
					
					password_input.setBorder(BorderFactory.createLineBorder(Color.red,3));

                 }else{
                    password_input.setBorder(BorderFactory.createLineBorder(Color.green,3));
                 }
				
				 //validaciones de credenciales
            if(email.equals(usuario2) && password.equals(contraseña)){
                JOptionPane.showMessageDialog(null, "Login correcto, bienvenido a bimbo", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                
                email_input.setBorder(BorderFactory.createLineBorder(Color.green,3));
                password_input.setBorder(BorderFactory.createLineBorder(Color.green,3));

            }else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                
                email_input.setBorder(BorderFactory.createLineBorder(Color.red,3));
                password_input.setBorder(BorderFactory.createLineBorder(Color.red,3));
            }

			}

            
		}); 

        ventana.setVisible(true);
        




    }
}
