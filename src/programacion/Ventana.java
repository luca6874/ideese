package programacion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
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


public class Ventana extends JFrame{

    public Ventana(){

        //Configuraciones basicas

        this.setBounds(400,400,800,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(200,200));
        this.setMaximumSize(new Dimension(800,800));
        this.setLayout(null);
        this.setTitle("Waltuh");
        this.getContentPane().setBackground(Color.decode("#ffffff"));
        ImageIcon icon = new ImageIcon("src/imagen/2164111.png");
        this.setIconImage(icon.getImage());


        this.menu();
        //this.router("login");
        this.examen();        
            
        //this.mario();

        this.setVisible(true);
        this.repaint();
    }

    public void menu(){
        
        JMenuBar barra = new JMenuBar();
        this.setJMenuBar(barra);

        JMenu menu1 = new JMenu("Archivo");
        barra.add(menu1);

        JMenuItem opt1 = new JMenuItem("Abrir");
        menu1.add(opt1);
        JMenuItem opt2 = new JMenuItem("Cerrar");
        menu1.add(opt2);
        JMenuItem opt3 = new JMenuItem("Más");
        menu1.add(opt3);

        menu1.addSeparator();

        JMenu menu2 = new JMenu("Guardar");

        menu1.add(menu2);

        JMenuItem opt4 = new JMenuItem("Guardar");
        menu2.add(opt4);

        JMenuItem opt5 = new JMenuItem("Guardar como");
        menu2.add(opt5);

        JMenu menu3 = new JMenu("Cuenta");
        barra.add(menu3);

        JMenuItem opt1_acces= new JMenuItem("Iniciar sesión");
        menu3.add(opt1_acces);

        JMenuItem opt_re = new JMenuItem("Registrarse");
        menu3.add(opt_re);

        JMenuItem opt_recuperacion = new JMenuItem("Recuperacion");
        menu3.add(opt_recuperacion);

        JMenu menu4 = new JMenu("Ayuda");
        barra.add(menu4);

        JMenuItem opt_help= new JMenuItem("recuperar contraseña");
        menu4.add(opt_help);

        JMenuItem opt_help2 = new JMenuItem("¿Cómo acceder al sistema?");
        menu4.add(opt_help2);

        JMenuItem opt_help3 = new JMenuItem("¿como crear usuario?");
        menu4.add(opt_help3);

        
        JMenu menu5 = new JMenu("Usuarios");
        barra.add(menu5);
        JMenuItem opt_alta= new JMenuItem("Alta usuario");
        menu5.add(opt_alta);

        JMenuItem opt_baja = new JMenuItem("Baja usuario");
        menu5.add(opt_baja);

        JMenuItem opt_consult = new JMenuItem("Consultar usuario");
        menu5.add(opt_consult);



        opt1_acces.addActionListener(e ->{
            this.router("login");
        });
        opt_re.addActionListener(e ->{
            this.router("registro");
        });
         opt_recuperacion.addActionListener(e ->{
            this.router("recuperarUsuario");
        });

        opt_help.addActionListener(e ->{
            this.router("recuperarContraseña");
        });

        opt_help2.addActionListener(e ->{
            this.router("AccederSistema");
        });
        opt_help3.addActionListener(e ->{
            this.router("CrearUsuario");
        });

        opt_alta.addActionListener(e ->{
            this.router("AltaUsuario");
        });
        opt_baja.addActionListener(e ->{
            this.router("BajaUsuario");
        });
        opt_consult.addActionListener(e ->{
            this.router("ConsultarUsuario");
        });


        
    }

    public void ayuda(){}

    public void examen(){


        JPanel table_container = new JPanel();
        table_container.setSize(600,470);
        table_container.setLocation(200,40);
        table_container.setLayout(null);
        table_container.setBackground(Color.decode("#d4d2d2"));
        table_container.setBorder(BorderFactory.createLineBorder(Color.decode("#b9b9b9")));
        this.add(table_container);

        
        JPanel frame_container2 = new JPanel();
        frame_container2.setPreferredSize(new Dimension(200, 800));
        frame_container2.setLayout(null);
        frame_container2.setBackground(Color.decode("#ece9e9"));
        frame_container2.setBorder(BorderFactory.createLineBorder(Color.decode("#b9b9b9")));


        JScrollPane scroll = new JScrollPane(frame_container2);
        scroll.setBounds(0,40,190,470);

        this.add(scroll);

       JButton[] botones = new JButton[10];

       int cor_Y = 50;
       for(int i = 0; i<10; i++){
            botones[i] = new JButton("opcion->"+ (i+1));
            botones[i].setBounds(10,cor_Y,150,20);

            frame_container2.add(botones[i]);

            cor_Y+=40;

       }






        JPanel barra = new JPanel();
        barra.setSize(800,30);
        barra.setLocation(0,0);
        barra.setLayout(null);
        barra.setBackground(Color.decode("#d4d2d2"));
        barra.setBorder(BorderFactory.createLineBorder(Color.decode("#b9b9b9")));
        this.add(barra);

        
        JLabel arriba_carpetas = new JLabel("wazuh");
        arriba_carpetas.setSize(100,20);
        arriba_carpetas.setOpaque(true);
        arriba_carpetas.setLocation(0,0);
        arriba_carpetas.setLayout(null);
        arriba_carpetas.setBorder(BorderFactory.createEmptyBorder(10,20,10,20));
        barra.add(arriba_carpetas);

        JLabel arriba_carpetas2 = new JLabel("waltuh");
        arriba_carpetas2.setSize(100,20);
        arriba_carpetas2.setOpaque(true);
        arriba_carpetas2.setLocation(105,0);
        arriba_carpetas2.setLayout(null);
        arriba_carpetas2.setBorder(BorderFactory.createEmptyBorder(10,20,10,20));
        barra.add(arriba_carpetas2);
        

        //inician datos de la tabla
        String[] table_head ={"No","Nombre","edad","cantidad","Dinero","Status"};
        Object[][]table_body = {{"1","Carlos","10","11","12","activo"},{"2","Maria", "33","34","35","activo"},{"3","Jose","10","117","124","activo"},{"4","Darnell", "323","341","345","baja"},{"5","Iran","150","161","612","activo"},{"6","Ruiz", "733","374","356","activo"},{"7","Medellin","150","114","132","activo"},{"8","Leonardo", "3","4","3","activo"},{"9","Mata","110","111","112","activo"}};

        JTable tabla = new JTable(table_body, table_head);

        JScrollPane final_table = new JScrollPane(tabla);
        final_table.setSize(500,160);
        final_table.setLocation(40,25);

        table_container.add(final_table);
        //termina datos de la tabla

        JTextArea descripcion = new JTextArea("Descripcion: ");
        descripcion.setBounds(40,310,500,140);
        descripcion.setOpaque(true);
        descripcion.setBorder(BorderFactory.createLineBorder(Color.decode("#7a7979")));
        table_container.add(descripcion);

        JLabel opt1 = new JLabel("opcion 1");
        opt1.setSize(100,20);
        opt1.setLocation(40,200);
        opt1.setBorder(BorderFactory.createLineBorder(Color.decode("#b9b9b9")));
        opt1.setLayout(null);
        table_container.add(opt1);

        JLabel opt2 = new JLabel("opcion 2");
        opt2.setSize(100,20);
        opt2.setLocation(150,200);
        opt2.setBorder(BorderFactory.createLineBorder(Color.decode("#b9b9b9")));
        opt2.setLayout(null);
        table_container.add(opt2);

        JLabel opt3 = new JLabel("opcion 3");
        opt3.setSize(100,20);
        opt3.setLocation(260,200);
        opt3.setBorder(BorderFactory.createLineBorder(Color.decode("#b9b9b9")));
        opt3.setLayout(null);
        table_container.add(opt3);


       
        JLabel txt_lb = new JLabel("texto 1:");
        txt_lb.setSize(100,20);
        txt_lb.setLocation(40,225);
        txt_lb.setOpaque(false);
        table_container.add(txt_lb);
        JTextField txt_1 = new JTextField();
        txt_1.setSize(90,20);
        txt_1.setLocation(100,225);
        txt_1.setBorder(BorderFactory.createLineBorder(Color.decode("#b9b9b9")));
        txt_1.setLayout(null);
        table_container.add(txt_1);


        JLabel txt_lb2 = new JLabel("texto 2:");
        txt_lb2.setSize(100,20);
        txt_lb2.setLocation(200,225);
        txt_lb2.setOpaque(false);
        table_container.add(txt_lb2);
        JTextField txt_2 = new JTextField();
        txt_2.setSize(100,20);
        txt_2.setLocation(260,225);
        txt_2.setBorder(BorderFactory.createLineBorder(Color.decode("#b9b9b9")));
        txt_2.setLayout(null);
        table_container.add(txt_2);

        
        JLabel txt_lb3 = new JLabel("texto 3:");
        txt_lb3.setSize(100,20);
        txt_lb3.setLocation(380,225);
        txt_lb3.setOpaque(false);
        table_container.add(txt_lb3);
        JTextField txt_3 = new JTextField();
        txt_3.setSize(100,20);
        txt_3.setLocation(440,225);
        txt_3.setBorder(BorderFactory.createLineBorder(Color.decode("#b9b9b9")));
        txt_3.setLayout(null);
        table_container.add(txt_3);

        JLabel txt_big = new JLabel("big_text:");
        txt_big.setSize(100,20);
        txt_big.setLocation(80,250);
        txt_big.setOpaque(false);
        txt_big.setLayout(null);
        table_container.add(txt_big);

        JTextField bg_txt = new JTextField();
        bg_txt.setSize(400,20);
        bg_txt.setLocation(140,250);
        bg_txt.setLayout(null);
        table_container.add(bg_txt);

        
        JLabel txt_big2 = new JLabel("big_text2:");
        txt_big2.setSize(100,20);
        txt_big2.setLocation(40,280);
        txt_big2.setOpaque(false);
        table_container.add(txt_big2);
        JTextField bg_txt2 = new JTextField();
        bg_txt2.setSize(150,20);
        bg_txt2.setLocation(110,280);
        bg_txt2.setLayout(null);
        table_container.add(bg_txt2);

        JLabel txt_big3 = new JLabel("big_text3:");
        txt_big3.setSize(100,20);
        txt_big3.setLocation(320,280);
        txt_big3.setOpaque(false);
        table_container.add(txt_big3);
        JTextField bg_txt3 = new JTextField();
        bg_txt3.setSize(150,20);
        bg_txt3.setLocation(390,280);
        bg_txt3.setLayout(null);
        table_container.add(bg_txt3);


        







    }
     

    public void login(){


        //aqui es el login, donde van los botones y todo eso


        JPanel login_container = new JPanel();
        login_container.setSize(400,470);
        login_container.setLocation(50,50);
        login_container.setLayout(null);
        this.add(login_container);

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

        logBtn.addActionListener(e ->{
            this.router("registro");

        });



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

        



        }


    public void recuperarContraseña(){


        //aqui es el login, donde van los botones y todo eso


        JPanel login_container = new JPanel();
        login_container.setSize(400,470);
        login_container.setLocation(50,50);
        login_container.setLayout(null);
        this.add(login_container);

        /*login_container.setBorder(BorderFactory.createRaisedBevelBorder());


        /*ImageIcon fondo = new ImageIcon("src/imagen/2164111.png");
        JLabel fondo_label = new JLabel(fondo);
        fondo_label.setBounds(0,0,600,470);

        login_container.add(fondo_label);



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

        logBtn.addActionListener(e ->{
            this.router("registro");

        });



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

            
		}); */

        



        }

    public void AccederSistema(){


        //aqui es el login, donde van los botones y todo eso


        JPanel login_container = new JPanel();
        login_container.setSize(400,470);
        login_container.setLocation(50,50);
        login_container.setLayout(null);
        login_container.setBackground(Color.BLACK);
        this.add(login_container);

        /*login_container.setBorder(BorderFactory.createRaisedBevelBorder());
            
		}); */

        }

    public void CrearUsuario(){

        JPanel login_container = new JPanel();
        login_container.setSize(400,470);
        login_container.setLocation(50,50);
        login_container.setLayout(null);
        login_container.setBackground(Color.cyan);
        this.add(login_container);

        }


 public void AltaUsuario(){

        JPanel login_container = new JPanel();
        login_container.setSize(400,470);
        login_container.setLocation(50,50);
        login_container.setLayout(null);
        login_container.setBackground(Color.BLUE);
        this.add(login_container);

        }

 public void BajaUsuario(){

        JPanel login_container = new JPanel();
        login_container.setSize(400,470);
        login_container.setLocation(50,50);
        login_container.setLayout(null);
        login_container.setBackground(Color.DARK_GRAY);
        this.add(login_container);

        }

 public void ConsultarUsuario(){

        JPanel login_container = new JPanel();
        login_container.setSize(400,470);
        login_container.setLocation(50,50);
        login_container.setLayout(null);
        login_container.setBackground(Color.yellow);
        this.add(login_container);

        }

public void recuperarUsuario(){

        JPanel login_container = new JPanel();
        login_container.setSize(400,470);
        login_container.setLocation(50,50);
        login_container.setLayout(null);
        login_container.setBackground(Color.red);
        this.add(login_container);

        }





    public void registro(){
            //el otro coso
        JPanel rg_container = new JPanel();
        rg_container.setBounds(500,50,400,470);
        rg_container.setOpaque(true);
        rg_container.setBackground(Color.pink);
        rg_container.setLayout(null);
        this.add(rg_container);
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

        lg_btn.addActionListener(e ->{
            this.router("login");

        });



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


        }

        public void mario(){

        JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Graphics2D g2d = (Graphics2D) g;

                g2d.setColor(Color.decode("#8f5b18"));
                g2d.fillRect(0, 460, 1000, 80);

                /*Bloques */

                g2d.setStroke(new BasicStroke(3));
                g2d.setColor(Color.decode("#000000"));
                g2d.drawRect(150, 300, 120, 150);

                g2d.setColor(Color.decode("#7b9feb")); //bloque azul
                g2d.fillRect(152, 302, 117, 155);

                g2d.setStroke(new BasicStroke(3));
                g2d.setColor(Color.decode("#467cf3"));
                g2d.drawLine(266, 304, 266, 444);



                g2d.setColor(Color.decode("#000000"));
                g2d.drawRect(100, 330, 120, 120);

                g2d.setColor(Color.decode("#db8f71"));
                g2d.fillRect(102, 332, 117, 112); //bloque naranja/salmon ns

                g2d.setStroke(new BasicStroke(3));
                g2d.setColor(Color.decode("#cc6f4a"));
                g2d.drawLine(217, 335, 217, 444);

                g2d.setColor(Color.DARK_GRAY);
                g2d.fillOval(105, 335, 10, 10);
                g2d.setColor(Color.DARK_GRAY);
                g2d.fillOval(200, 335, 10, 10);

                
                g2d.setColor(Color.DARK_GRAY);
                g2d.fillOval(105, 425, 10, 10);
                g2d.setColor(Color.DARK_GRAY);
                g2d.fillOval(105, 335, 10, 10);



              
                g2d.setColor(Color.DARK_GRAY);
                g2d.fillOval(200, 425, 10, 10);
                g2d.setColor(Color.DARK_GRAY);
                g2d.fillOval(200, 335, 10, 10);

                g2d.setStroke(new BasicStroke(2));

                //inicia bordes de ovalos en bloques
                g2d.setColor(Color.decode("#000000"));
                g2d.drawOval(105, 425, 10, 10);
                g2d.setColor(Color.decode("#000000"));
                g2d.drawOval(200, 425, 10, 10);
                g2d.setColor(Color.decode("#000000"));
                g2d.drawOval(105, 335, 10, 10);
                g2d.setColor(Color.decode("#000000"));
                g2d.drawOval(200, 335, 10, 10);


                //finaliza aqui
                g2d.setStroke(new BasicStroke(3));
                g2d.setColor(Color.decode("#000000"));
                g2d.drawRect(658, 330, 130, 120);

                g2d.setColor(Color.decode("#2f922f"));
                g2d.fillRect(660, 332, 130, 112); //bloque verde
                g2d.setStroke(new BasicStroke(3));
                g2d.setColor(Color.decode("#0f2e0e"));
                g2d.drawLine(662, 438, 782, 438);
                g2d.setColor(Color.DARK_GRAY);
                g2d.fillOval(662, 425, 10, 10);
                g2d.setColor(Color.DARK_GRAY);
                g2d.fillOval(662, 335, 10, 10);

                g2d.setStroke(new BasicStroke(2));


                g2d.setColor(Color.decode("#000000"));
                g2d.drawOval(662, 425, 10, 10);
                g2d.setColor(Color.decode("#000000"));
                g2d.drawOval(662, 335, 10, 10);

                g2d.setStroke(new BasicStroke(13));
                g2d.setColor(Color.decode("#000000"));
                g2d.drawLine(225, 360, 225, 444);

                g2d.setStroke(new BasicStroke(13));
                g2d.setColor(Color.decode("#000000"));
                g2d.drawLine(275, 330, 275, 444);




                /*tuberia*/

                g2d.setColor(Color.decode("#116827"));
                g2d.fillRect(395, 350, 73, 100);
                g2d.setColor(Color.decode("#116827"));
                g2d.fillRect(387, 320, 88, 30);

                g2d.setStroke(new BasicStroke(2));
                g2d.setColor(Color.decode("#000000"));
                g2d.drawRect(395, 350, 73, 100);
                g2d.setColor(Color.decode("#000000"));
                g2d.drawRect(387, 320, 88, 30);  

                /*Bloques de interrogacion */

                g2d.setStroke(new BasicStroke(2));

                //bloque1
                g2d.setColor(Color.decode("#c77b24"));
                g2d.fillRect(100, 150, 30, 30);
                g2d.setColor(Color.decode("#000000"));
                g2d.drawRect(100, 150, 30, 30);

                g2d.setColor(Color.decode("#000000"));
                g2d.fillOval(101, 152, 7, 7);
                g2d.setColor(Color.decode("#000000"));
                g2d.fillOval(101, 170, 7, 7);
                
                g2d.setColor(Color.decode("#000000"));
                g2d.fillOval(120, 152, 7, 7);
                g2d.setColor(Color.decode("#000000"));
                g2d.fillOval(120, 170, 7, 7);

                //bloque2

                g2d.setColor(Color.decode("#c77b24"));
                g2d.fillRect(130, 150, 30, 30);
                g2d.setColor(Color.decode("#000000"));
                g2d.drawRect(130, 150, 30, 30);

                g2d.setColor(Color.decode("#000000"));
                g2d.fillOval(131, 152, 7, 7);
                g2d.setColor(Color.decode("#000000"));
                g2d.fillOval(131, 170, 7, 7);
                
                g2d.setColor(Color.decode("#000000"));
                g2d.fillOval(150, 152, 7, 7);
                g2d.setColor(Color.decode("#000000"));
                g2d.fillOval(150, 170, 7, 7);

                //bloque3

                g2d.setColor(Color.decode("#c77b24"));
                g2d.fillRect(30, 250, 30, 30);
                g2d.setColor(Color.decode("#000000"));
                g2d.drawRect(30, 250, 30, 30);

                
                g2d.setColor(Color.decode("#000000"));
                g2d.fillOval(31, 252, 7, 7);
                g2d.setColor(Color.decode("#000000"));
                g2d.fillOval(31, 270, 7, 7);
                
                g2d.setColor(Color.decode("#000000"));
                g2d.fillOval(50, 252, 7, 7);
                g2d.setColor(Color.decode("#000000"));
                g2d.fillOval(50, 270, 7, 7);
                //bloque4
                g2d.setColor(Color.decode("#c77b24"));
                g2d.fillRect(700, 250, 30, 30);
                g2d.setColor(Color.decode("#000000"));
                g2d.drawRect(700, 250, 30, 30);
                
                g2d.setColor(Color.decode("#000000"));
                g2d.fillOval(701, 252, 7, 7);
                g2d.setColor(Color.decode("#000000"));
                g2d.fillOval(701, 270, 7, 7);
                
                g2d.setColor(Color.decode("#000000"));
                g2d.fillOval(720, 252, 7, 7);
                g2d.setColor(Color.decode("#000000"));
                g2d.fillOval(720, 270, 7, 7);

                

                /*Arbusto */

                g2d.setColor(Color.decode("#116827"));
                g2d.fillArc(10, 390, 80, 100, 30,100);
                g2d.fillArc(10, 390, 80, 100, 0, 60);
                g2d.fillArc(10, 390, 80, 100, 120, 60);


                g2d.setColor(Color.decode("#000000"));
                g2d.drawArc(10, 390, 80, 100, 0, 60);
                g2d.drawArc(10, 390, 80, 100, 120, 60);
                g2d.drawArc(10, 390, 80, 100, 30,100);




                /*El suelo */
                g2d.setColor(Color.decode("#ddb177"));
                g2d.fillRect(0, 440, 1000, 20);


                int cor = 460;

                for(int i = 0; i<=3; i++){
                    g2d.setStroke(new BasicStroke(3));
                    g2d.setColor(Color.decode("#3d2404"));
                    g2d.drawLine(0, cor, 1000, cor);

                    cor+=30;

                }

                int cor2 = 0;

                 for(int i = 0; i<=30; i++){
                    g2d.setStroke(new BasicStroke(3));
                    g2d.setColor(Color.decode("#3d2404"));
                    g2d.drawLine(cor2, 460, cor2, 540);

                    cor2+=30;

                 }
                







                



                        }
        };
        pane.setSize(1000,700);
        pane.setBackground(Color.decode("#a3ebf5"));
        pane.setLocation(0,0);
        this.add(pane);


    }
    

    public void router (String target){
        this.getContentPane().removeAll();;

        if(target.equals("login"))
            this.login();
        if(target.equals("registro"))
            this.registro();
         if(target.equals("recuperarUsuario"))
            this.recuperarUsuario();
        if(target.equals("recuperarContraseña"))
            this.recuperarContraseña();
        if(target.equals("AccederSistema"))
            this.AccederSistema();
        if(target.equals("CrearUsuario"))
            this.CrearUsuario();

        if(target.equals("AltaUsuario"))
            this.AltaUsuario();
        if(target.equals("BajaUsuario"))
            this.BajaUsuario();
        if(target.equals("ConsultarUsuario"))
            this.ConsultarUsuario();


        this.repaint();
        this.validate();
    }
}