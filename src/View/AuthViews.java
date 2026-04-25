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

        logBtn.addActionListener(e -> registro());



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


    public void registro(){
            //el otro coso

         JFrame ventana = new JFrame(); 


        ventana.setSize(1000, 620); 
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);

        JPanel rg_container = new JPanel();
        rg_container.setBounds(500,50,400,470);
        rg_container.setLayout(null);

        ventana.add(rg_container);





        rg_container.setBounds(500,50,400,470);
        rg_container.setOpaque(true);
        rg_container.setBackground(Color.pink);
        rg_container.setLayout(null);
        rg_container.setBorder(BorderFactory.createRaisedBevelBorder());
        rg_container.setBorder(BorderFactory.createLoweredBevelBorder());



        //La etiqueta
        JLabel bio_tag = new JLabel("BIO");
        bio_tag.setBounds(50,120,300,20);
        bio_tag.setHorizontalAlignment(JLabel.CENTER);
        bio_tag.setOpaque(true);
        rg_container.add(bio_tag);
        
        JTextArea bio_text = new JTextArea();
        bio_text.setLocation(50,150);
        bio_text.setSize(300,80);
        rg_container.add(bio_text);

        //checkboxes

        JCheckBox dulce = new JCheckBox("Dulce");
        dulce.setBounds(50,260,100,40);
        dulce.setOpaque(true);
        dulce.setBackground(null);
        rg_container.add(dulce);


        JCheckBox salado = new JCheckBox("salado");
        salado.setBounds(150,260,100,40);
        salado.setOpaque(false);
        rg_container.add(salado);


        JCheckBox saludable = new JCheckBox("Saludable");
        saludable.setBounds(250,260,100,40);
        saludable.setOpaque(false);
        rg_container.add(saludable);

        //boton redondo 

        JRadioButton accept_terms = new JRadioButton("Acepto los terminos");
        accept_terms.setBounds(50,320,200,40);
        accept_terms.setOpaque(true);
        accept_terms.setBackground(null);
        rg_container.add(accept_terms);

        JRadioButton reject_terms = new JRadioButton("Rechazo los terminos");
        reject_terms.setBounds(200,320,200,40);
        reject_terms.setOpaque(false);
        rg_container.add(reject_terms);

        ButtonGroup terms = new ButtonGroup();
        terms.add(accept_terms);
        terms.add(reject_terms);
        
        //waza

        String[] colonias = {"Camino real", "Miramar", "Diana laura", "8 de octubre"};

        JComboBox colonias_combo = new JComboBox(colonias);

        colonias_combo.setBounds(50,360,300,20);
        rg_container.add(colonias_combo);

        JButton register_btn = new JButton("crear cuenta");
        register_btn.setBounds(50,390,300,30);
        rg_container.add(register_btn);


        JButton lg_btn = new JButton("ir al login");
        lg_btn.setBounds(50,430,300,30);
        rg_container.add(lg_btn);

         lg_btn.addActionListener(e -> login());

        JLabel rg_tittle = new JLabel();
        rg_tittle.setText("Términos");
        rg_tittle.setSize(300,20);
        rg_tittle.setLocation(50,300);
        rg_tittle.setBackground(Color.CYAN);
        rg_tittle.setOpaque(true);
        rg_tittle.setFont(new Font("Arial",Font.PLAIN,22));
        rg_tittle.setHorizontalAlignment(JLabel.CENTER);
        rg_container.add(rg_tittle);

        JLabel preferencias = new JLabel();
        preferencias.setText("Preferencias");
        preferencias.setSize(300,20);
        preferencias.setLocation(50,240);
        preferencias.setBackground(Color.pink);
        preferencias.setOpaque(false);
        preferencias.setFont(new Font("Arial",Font.PLAIN,22));
        preferencias.setHorizontalAlignment(JLabel.CENTER);
        rg_container.add(preferencias);

        JTextField nombreDeUsuario = new JTextField();
        nombreDeUsuario.setSize(350,30);
        nombreDeUsuario.setLocation(20,85);
        rg_container.add(nombreDeUsuario);


        JLabel nombre_etiqueta = new JLabel();
        nombre_etiqueta.setText("Nombre de usuario");
        nombre_etiqueta.setSize(300,20);
        nombre_etiqueta.setLocation(50,61);
        nombre_etiqueta.setBackground(Color.CYAN);
        nombre_etiqueta.setOpaque(true);
        nombre_etiqueta.setFont(new Font("Arial",Font.PLAIN,22));
        nombre_etiqueta.setHorizontalAlignment(JLabel.CENTER);
        rg_container.add(nombre_etiqueta);

        JLabel acceso_etiqueta = new JLabel();
        acceso_etiqueta.setText("Acceso");
        acceso_etiqueta.setSize(200,20);
        acceso_etiqueta.setLocation(100,20);
       // acceso_etiqueta.setBackground(Color.CYAN);
        acceso_etiqueta.setOpaque(true);
        acceso_etiqueta.setFont(new Font("Arial",Font.PLAIN,22));
        acceso_etiqueta.setHorizontalAlignment(JLabel.CENTER);
        rg_container.add(acceso_etiqueta);


          
            register_btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

                
                boolean seleccion = dulce.isSelected() || salado.isSelected() || saludable.isSelected();
    
                if(!seleccion){
                    dulce.setBorder(BorderFactory.createLineBorder(Color.red,3));
                    dulce.setBackground(Color.red);
                    System.out.println("Debe seleccionar al menos una preferencia");


                }
                
                if(!accept_terms.isSelected()){
                    accept_terms.setBackground(Color.red);
                    System.out.println("Debes aceptar los términos para continuar");
                }
            }
        
        });
        
        ventana.setVisible(true);


        }


}
