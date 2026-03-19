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

        this.setBounds(400,400,1000,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(200,200));
        this.setMaximumSize(new Dimension(800,800));
        this.setLayout(null);
        this.setTitle("Waltuh");
        this.getContentPane().setBackground(Color.decode("#ebbad8"));


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

       
        ImageIcon icon = new ImageIcon("src/imagen/2164111.png");
        this.setIconImage(icon.getImage());


        //this.user_log();
        //this.tax();
        //this.calculadora();
        //this.users();
        this.login();
        this.registro();
        //this.pintar();
        //this.casa();

        this.setVisible(true);
        this.repaint();
    }


    public void user_log(){

        
        JPanel contenedor = new JPanel();
        contenedor.setLayout(new BorderLayout());
        contenedor.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        this.add(contenedor, BorderLayout.CENTER);


        JPanel datos_generales = new JPanel();
        datos_generales.setBackground(Color.decode("#94e9b5"));
        datos_generales.setLayout(new GridLayout(0, 2,10,10));
        datos_generales.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.decode("#41e47f")),"Datos generales"),BorderFactory.createEmptyBorder(10,10,10,10)));
        contenedor.add(datos_generales, BorderLayout.NORTH);

        JLabel nombres = new JLabel("Nombres: ");
        datos_generales.add(nombres);

        JTextField name = new JTextField();
        datos_generales.add(name);

        JLabel apellidoP = new JLabel("Apellido paterno: ");
        datos_generales.add(apellidoP);
        
        JTextField lname = new JTextField();
        datos_generales.add(lname);


        JLabel apellidoM = new JLabel("Apellido materno: ");
        datos_generales.add(apellidoM);

        JTextField lname2 = new JTextField();
        datos_generales.add(lname2);

        
        JLabel date = new JLabel("Fecha de nacimiento: ");
        datos_generales.add(date);

        JTextField daTextField = new JTextField();
        datos_generales.add(daTextField);

        JLabel SEXO = new JLabel("Sexo: ");
        datos_generales.add(SEXO);

        JLabel space = new JLabel("");
        datos_generales.add(space);


        JRadioButton Male = new JRadioButton("Masculino");
        Male.setOpaque(false);
        datos_generales.add(Male);
        JRadioButton Female = new JRadioButton("Femenino");
        Female.setOpaque(false);
        datos_generales.add(Female);

        ButtonGroup segs = new ButtonGroup();

        segs.add(Female);
        segs.add(Male);

        JLabel nacionalidad = new JLabel("Nacionalidad: ");
        datos_generales.add(nacionalidad);

        String[] Pais = {"Perú", "México", "Argentina", "chile","Brazil"};

        JComboBox Pais_combo = new JComboBox(Pais);

        datos_generales.add(Pais_combo);













       JPanel datos_opcionales = new JPanel();
       datos_opcionales.setBackground(Color.decode("#fa7f7f"));
       datos_opcionales.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.decode("#eb5050")),"Datos opcionales"));
       datos_opcionales.setLayout(new BorderLayout(10,10));
       contenedor.add(datos_opcionales, BorderLayout.SOUTH);



    
        JPanel parteSuperior = new JPanel(new GridLayout(1,2,10,10));
        parteSuperior.setOpaque(false);

        JLabel pref = new JLabel("Preferencias:");
        pref.setHorizontalAlignment(JLabel.RIGHT);

        String[] preferencias = {"Cantar","Escuchar música","Leer","Deportes","Otros"};
        JComboBox Pref_combo = new JComboBox(preferencias);

        parteSuperior.add(pref);
        parteSuperior.add(Pref_combo);

        datos_opcionales.add(parteSuperior, BorderLayout.NORTH);

        JTextArea descJTextArea = new JTextArea(4,20);
        JScrollPane scroll = new JScrollPane(descJTextArea);

        datos_opcionales.add(scroll, BorderLayout.CENTER);



        /*Aqui inicia todo lo del contenedor 2 */




        JPanel contenedor2 = new JPanel();
        contenedor2.setLayout(new BorderLayout());
        contenedor2.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        this.add(contenedor2, BorderLayout.EAST);

        JPanel user = new JPanel();
        user.setBackground(Color.decode("#fa7f7f"));
        user.setLayout(new GridLayout(3,1,5,5));
        user.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.decode("#eb5050")),"Perfil de usuario"));
        
        contenedor2.add(user, BorderLayout.NORTH);

        
        ImageIcon icon = new ImageIcon("src/imagen/robloxito2.png");

        Image img0 = icon.getImage();
        Image nueva0 = img0.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        ImageIcon iconPequeno0 = new ImageIcon(nueva0);

        JLabel perfil = new JLabel(iconPequeno0);
        perfil.setHorizontalAlignment(JLabel.CENTER);
        
        

        JCheckBox mostrar = new JCheckBox("Mostrar foto de perfil");
        mostrar.setOpaque(false);
        JCheckBox mostrar2 = new JCheckBox("Mostrar Fecha de nacimiento");
        mostrar2.setOpaque(false);

              
        user.add(perfil);
        user.add(mostrar);
        user.add(mostrar2);

        mostrar.setHorizontalAlignment(JCheckBox.CENTER);
        mostrar2.setHorizontalAlignment(JCheckBox.CENTER);
        
        

        JPanel botones = new JPanel();
        botones.setBackground(Color.decode("#94e9b5"));
        botones.setLayout(new GridLayout(3,1,5,5));
        contenedor2.add(botones, BorderLayout.SOUTH);

         //imagen guardar 
        ImageIcon ico = new ImageIcon("src/imagen/guardar.png");

        Image img = ico.getImage();
        Image nueva = img.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon iconPequeno = new ImageIcon(nueva);
        JButton calcular = new JButton("Nuevo", iconPequeno);

        //imagen cancelar

        ImageIcon icon2 = new ImageIcon("src/imagen/cancelar.png");

        Image img2 = icon2.getImage();
        Image nueva2 = img2.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon iconPequeno2 = new ImageIcon(nueva2);
        JButton cancelar = new JButton("Cancelar", iconPequeno2);
       
        //imagen salir

        ImageIcon icon3 = new ImageIcon("src/imagen/salir.png");

        Image img3 = icon3.getImage();
        Image nueva3 = img3.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon iconPequeno3 = new ImageIcon(nueva3);
        JButton salir = new JButton("Salir", iconPequeno3);
       


        botones.add(salir);
        botones.add(calcular);
        botones.add(cancelar);

        
  





    }

    public void tax(){
        
        
        /*Cree la funcion tax desde cero, pero olvide hacer pull, luego un desastre
        entonces no me salen todos los cambios que hice, aaah */







        JPanel contenedor = new JPanel();
        contenedor.setLayout(new BorderLayout());
        this.add(contenedor, BorderLayout.CENTER);

        JPanel contenedor2 = new JPanel();
        contenedor2.setLayout(new BorderLayout());
        this.add(contenedor2, BorderLayout.SOUTH);


        JPanel borde1 = new JPanel();
        borde1.setBackground(Color.decode("#ebbad8"));
        this.add(borde1, BorderLayout.EAST);

        JPanel borde2 = new JPanel();
        borde2.setBackground(Color.decode("#ebbad8"));
        this.add(borde2, BorderLayout.WEST);



        JLabel titulo = new JLabel();
        titulo.setText("                              Calculando el interés"); //pueden cuestionar mis metodos momento xd
        titulo.setFont(new Font("Arial",Font.BOLD,20));
        this.add(titulo, BorderLayout.NORTH);

        /*Todo lo de la enttrada */
        JPanel entrada = new JPanel();
        entrada.setBackground(Color.decode("#86f7b1"));
        entrada.setLayout(new GridLayout(3, 2));

        contenedor.add(entrada, BorderLayout.CENTER);

        entrada.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.decode("#000000")),  "Datos de entrada"));

        //los botones
        JPanel botones = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10)); 
               botones.setBackground(Color.decode("#94e9b5"));


        //imagen guardar 
        ImageIcon icon = new ImageIcon("src/imagen/guardar.png");

        Image img = icon.getImage();
        Image nueva = img.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon iconPequeno = new ImageIcon(nueva);
        JButton calcular = new JButton("Calcular", iconPequeno);

        //imagen cancelar

        ImageIcon icon2 = new ImageIcon("src/imagen/cancelar.png");

        Image img2 = icon2.getImage();
        Image nueva2 = img2.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon iconPequeno2 = new ImageIcon(nueva2);
        JButton cancelar = new JButton("Cancelar", iconPequeno2);
       




        botones.add(calcular);
        botones.add(cancelar);

        contenedor.add(botones, BorderLayout.SOUTH);




        //Botones de operacion
        JLabel capital = new JLabel("capital: ");
        capital.setBackground(Color.decode("#56f593"));
        capital.setOpaque(true);
        entrada.add(capital);
        JTextField capital_txt = new JTextField();
        entrada.add(capital_txt);

        JLabel Tiempo = new JLabel("Tiempo: ");
        Tiempo.setBackground(Color.decode("#5ff599"));
        entrada.add(Tiempo);
        JTextField tiempo_txt = new JTextField();
        entrada.add(tiempo_txt);

        JLabel tasa = new JLabel("Tasa de interes: ");
        tasa.setBackground(Color.decode("#56f593"));
        tasa.setOpaque(true);
        entrada.add(tasa);
        JTextField tasa_txt = new JTextField();
        entrada.add(tasa_txt);








        /*Todo lo de salida */
        JPanel salida = new JPanel();
        salida.setBackground(Color.decode("#fa7f7f"));
        salida.setLayout(new GridLayout(2,2));
        contenedor2.add(salida, BorderLayout.CENTER);
        salida.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED),"Resultados"));


        JPanel borde = new JPanel();
        borde.setBackground(Color.decode("#ebbad8"));
        contenedor2.add(borde, BorderLayout.SOUTH);

        JPanel borde3 = new JPanel();
        borde3.setBackground(Color.decode("#ebbad8"));
        contenedor2.add(borde3, BorderLayout.EAST);

        JPanel borde4 = new JPanel();
        borde4.setBackground(Color.decode("#ebbad8"));
        contenedor2.add(borde4, BorderLayout.WEST);

        JPanel borde5 = new JPanel();
        borde5.setBackground(Color.decode("#ebbad8"));
        contenedor2.add(borde5, BorderLayout.NORTH);











        JLabel msj_interes = new JLabel("Interés: ");
        msj_interes.setBackground(Color.decode("#f14e4e"));
        msj_interes.setOpaque(true);
        msj_interes.setBorder(BorderFactory.createLineBorder(Color.red));
        salida.add(msj_interes);


        JLabel result_interes = new JLabel("");
        result_interes.setBackground(Color.white);
        result_interes.setOpaque(true);
        result_interes.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        salida.add(result_interes);

        JLabel msj_monto = new JLabel("Monto: ");
        msj_monto.setBackground(Color.decode("#f14e4e"));
        msj_monto.setOpaque(true);
        msj_monto.setBorder(BorderFactory.createLineBorder(Color.RED));
        salida.add(msj_monto);

        JLabel result_monto = new JLabel("");
        result_monto.setBackground(Color.white);
        result_monto.setOpaque(true);
        result_monto.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        salida.add(result_monto);




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

         acces_btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String email = email_input.getText();
                char[] passwordChars = password_input.getPassword();
                String password = new String(passwordChars);              
                boolean tieneEspacio2 = password.contains(" ");  
                boolean tieneEspacio = email.contains(" ");

                int longitud = password.length();

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
					email_input.setBorder(BorderFactory.createLineBorder(Color.green,3));
                    password_input.setBorder(BorderFactory.createLineBorder(Color.green,3));
                 }
				
				
			}
		}); 


       // login_container.setComponentZOrder(fondo_label, login_container.getComponentCount()-1);

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

        JButton register_btn = new JButton("Crear cuenta");
        register_btn.setBounds(50,390,300,40);
        rg_container.add(register_btn);


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
    public void users(){
            JPanel panel_users = new JPanel();
            panel_users.setSize(970,850);
            panel_users.setLocation(10,10);
            panel_users.setLayout(null);
            panel_users.setBackground(Color.pink);
            this.add(panel_users);
            panel_users.setBorder(BorderFactory.createLoweredBevelBorder());

            JButton dld_btn = new JButton();
            dld_btn.setText("Descargar");
            dld_btn.setBounds(750,140,100,30);
            dld_btn.setFont(new Font("Arial",Font.ITALIC,13));
        
            panel_users.add(dld_btn);

            JButton add_btn = new JButton();
            add_btn.setText("Añadir");
            add_btn.setBounds(630,140,100,30);
            add_btn.setFont(new Font("Arial",Font.ITALIC,13));
        
            panel_users.add(add_btn);


            JLabel total = new JLabel();
            total.setText("Usuarios 20");
            total.setSize(200,40);
            total.setLocation(50,140);
            total.setBackground(Color.CYAN);
            total.setOpaque(true);
            total.setFont(new Font("Times New Roman",Font.PLAIN,22));
            total.setHorizontalAlignment(JLabel.CENTER);
            total.setBorder(BorderFactory.createRaisedBevelBorder());
            panel_users.add(total);

            JLabel titulo = new JLabel();
            titulo.setText("Usuarios");
            titulo.setSize(200,50);
            titulo.setLocation(350,30);
            //titulo.setBackground(Color.YELLOW);
            titulo.setOpaque(false);
            titulo.setFont(new Font("Comic Sans MS",Font.PLAIN,40));
            titulo.setHorizontalAlignment(JLabel.CENTER);
            panel_users.add(titulo);







            String[] table_head ={"No.control","Nombre","Apellidos","Correo electronico","Semestre","Carrera","Estado"};
            
            Object[][] table_body = {

                {"20231001","Carlos","Ramirez Lopez",
                "carlos.ramirez@gmail.com","3°",
                "Ingenieria en Sistemas","Activo"},

                {"20231002","Maria","Hernandez Torres",
                "maria.torres@gmail.com","1°",
                "Ingenieria Industrial","Activo"},

                {"20231003","Luis","Garcia Mendoza",
                "luis.garcia@gmail.com","2°",
                "Ingenieria Civil","Activo"},

                {"20231004","Ana","Martinez Ruiz",
                "ana.martinez@gmail.com","4°",
                "Arquitectura","Inactivo"},

                {"20231005","Jorge","Lopez Castillo",
                "jorge.lopez@gmail.com","5°",
                "Ingenieria Mecatronica","Activo"},

                {"20231006","Fernanda","Sanchez Perez",
                "fernanda.sanchez@gmail.com","6°",
                "Ingenieria en Sistemas","Activo"},

                {"20231007","Diego","Morales Cruz",
                "diego.morales@gmail.com","2°",
                "Contaduria","Activo"},

                {"20231008","Valeria","Ortega Flores",
                "valeria.ortega@gmail.com","7°",
                "Administracion","Inactivo"},

                {"20231009","Ricardo","Navarro Diaz",
                "ricardo.navarro@gmail.com","8°",
                "Ingenieria Industrial","Activo"},

                {"20231010","Sofia","Vargas Romero",
                "sofia.vargas@gmail.com","3°",
                "Ingenieria Civil","Activo"},

                {"20231011","Andres","Gutierrez Silva",
                "andres.gutierrez@gmail.com","1°",
                "Ingenieria en Sistemas","Activo"},

                {"20231012","Daniela","Rojas Castillo",
                "daniela.rojas@gmail.com","2°",
                "Psicologia","Activo"},

                {"20231013","Miguel","Torres Alvarez",
                "miguel.torres@gmail.com","3°",
                "Ingenieria Industrial","Activo"},

                {"20231014","Camila","Fernandez Soto",
                "camila.fernandez@gmail.com","4°",
                "Derecho","Activo"},

                {"20231015","Sebastian","Jimenez Lara",
                "sebastian.jimenez@gmail.com","5°",
                "Ingenieria Civil","Inactivo"},

                {"20231016","Paola","Mendoza Reyes",
                "paola.mendoza@gmail.com","6°",
                "Arquitectura","Inactivo"},

                {"20231017","Emilio","Castro Navarro",
                "emilio.castro@gmail.com","7°",
                "Administracion","Inactivo"},

                {"20231018","Lucia","Herrera Campos",
                "lucia.herrera@gmail.com","8°",
                "Contaduria","Inactivo"},

                {"20231019","Alejandro","Vega Morales",
                "alejandro.vega@gmail.com","2°",
                "Ingenieria Mecatronica","Inactivo"},

                {"20231020","Natalia","Salazar Ortiz",
                "natalia.salazar@gmail.com","3°",
                "Ingenieria en Sistemas","Activo"}

             };

            JTable students = new JTable(table_body,table_head);

            JScrollPane final_table = new JScrollPane(students);
            final_table.setSize(800,300);
            final_table.setLocation(50,200);
            
            panel_users.add(final_table);

            panel_users.repaint();


            
        }

    public void calculadora(){
            JPanel panel_users = new JPanel();
            panel_users.setSize(500,700);
            panel_users.setLocation(250,50);
            panel_users.setBackground(Color.decode("#d4abd4"));

            BorderLayout mi_layout = new BorderLayout();
            mi_layout.setVgap(20);

            panel_users.setLayout(mi_layout);
            this.add(panel_users);

            JLabel field = new JLabel("180.00");
            field.setOpaque(true);
            field.setBackground(Color.white);
            field.setFont(new Font("Arial",Font.BOLD,22));
            field.setBorder(BorderFactory.createEmptyBorder(10,20,10,20));
            panel_users.add(field,BorderLayout.NORTH);


            JPanel centro = new JPanel();
            centro.setBackground(Color.red);
            centro.setLayout(new GridLayout(4,3));
            panel_users.add(centro,BorderLayout.CENTER);

            String[] botones = {"9","8","7","6","5","4","3","2","1","0",".",""};

           
            for(int i = 0; i<botones.length; i++){
                JButton ce = new JButton(botones[i]);
                ce.setSize(100,100);
                ce.setFont(new Font("Arial",Font.BOLD,22));
                centro.add(ce);
            }

           
            JPanel sidebar = new JPanel();
            sidebar.setBackground(Color.GRAY);
            sidebar.setLayout(new GridLayout(6,1));
            panel_users.add(sidebar,BorderLayout.EAST);

            String[] botones2 = {"+","-","*","/","=","CE"};

            for (int i = 0; i < botones2.length; i++) {

                JButton ce = new JButton(botones2[i]);
                ce.setSize(100,100);
                ce.setFont(new Font("Arial",Font.BOLD,22));
                sidebar.add(ce);
            }




        }

    public void pintar(){

        JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Graphics2D g2d = (Graphics2D) g;

                g2d.drawLine(0, 0, 1000, 700);

                g2d.setColor(Color.orange);
                g2d.setStroke(new BasicStroke(4));

                g2d.drawOval(500, 100, 150, 100);


                g2d.setStroke(new BasicStroke(5));
                g2d.setColor(Color.MAGENTA);

                g2d.drawPolygon(new int [] {300,100,300}, new int[] {100,200,250},3);
                g2d.setColor(Color.red);

                g2d.drawRect(300, 350, 100, 100);
                g2d.setColor(Color.cyan);

                g2d.drawRoundRect(500, 250, 100, 100, 10,10 );

                g2d.setColor(Color.DARK_GRAY);

                g2d.drawArc(400, 100, 100, 100, 90, 290);

                g2d.setFont(new Font("Arial", Font.BOLD,22));
                g2d.drawString("WALTuH", 600, 400);

                g2d.fillOval(400, 400, 100, 100);
                g2d.fillPolygon(new int [] {300,100,300}, new int[] {100,200,250},3);
                g2d.fillRect(310, 360, 100, 100);
                g2d.setColor(Color.yellow);
                g2d.fillRoundRect(500, 250, 100, 100, 15,15);
                g2d.fillArc(400, 100, 100, 100, 90, 290);

                g2d.setColor(Color.DARK_GRAY);
                g2d.fillOval(425, 130, 10, 10);

                BufferedImage image;

                try {
                    image = ImageIO.read(new File("src/imagen/robloxito2.png"));
                    g2d.drawImage(image, 0, 300, null);

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
        };
        pane.setSize(1000,700);
        pane.setLocation(0,0);
        this.add(pane);
        

    }

 public void casa(){

        JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Graphics2D g2d = (Graphics2D) g;

                g2d.setColor(Color.decode("#6d4108"));
                g2d.fillRect(0, 510, 1000, 50);

                g2d.setColor(Color.decode("#e7f7a1"));
                g2d.fillRect(0, 460, 1000, 50);

                g2d.setColor(Color.decode("#0a4e0f"));
                g2d.fillRect(0, 410, 1000, 50);

                g2d.setColor(Color.decode("#052907"));
                g2d.fillRect(0, 390, 1000, 20);

                g2d.setColor(Color.decode("#a09e29"));
                g2d.fillRect(30, 270,1000, 25);

                g2d.setColor(Color.decode("#a09e29"));
                g2d.fillRect(30, 340,1000, 25);

                int cor = 0;
                for (int i = 0; i <=15; i++) {
                    g2d.setColor(Color.decode("#d8bc1e"));
                    g2d.fillRect(cor, 240,30, 150);
                    cor+=50;
                }

                g2d.setColor(Color.decode("#f3f17d"));
                g2d.fillRect(200, 110,330, 230);
                
                int cor2 = 130;
                for (int i = 0; i <=6; i++) {
                    g2d.setColor(Color.decode("#4b3212"));
                    g2d.setStroke(new BasicStroke(4));
                    g2d.drawLine(200, cor2, 530,cor2);
                    cor2+=30;
                }

                g2d.setColor(Color.decode("#b40d0d"));
                g2d.fillPolygon(new int [] {170,550,360}, new int[] {115,115,10},3);
                g2d.setStroke(new BasicStroke(3));
                g2d.setColor(Color.decode("#7a0707"));
                g2d.drawPolygon(new int [] {170,550,360}, new int[] {115,115,10},3);

                g2d.setColor(Color.decode("#474747"));
                g2d.fillRect(450, 40,70, 20);

                g2d.setColor(Color.decode("#3d3d3d"));
                g2d.fillRect(440, 10,90, 30);

                g2d.setColor(Color.decode("#4b4b4b"));
                g2d.fillPolygon(new int [] {450,520,520}, new int[] {60,60,100},3);

                g2d.setColor(Color.decode("#2b2a2a"));
                g2d.fillPolygon(new int [] {450,520,520}, new int[] {40,40,80},3);

                g2d.setColor(Color.decode("#f2f7f8"));
                g2d.fillRect(410, 150,90, 90);

                g2d.setColor(Color.decode("#805216"));
                g2d.fillRect(230, 160,90, 180);

                g2d.setStroke(new BasicStroke(5));
                g2d.setColor(Color.decode("#58370c"));
                g2d.drawRect(230, 160,90, 180);

                g2d.setStroke(new BasicStroke(5));
                g2d.setColor(Color.decode("#5c0c0c"));
                g2d.drawRect(410, 150,90, 90);

                g2d.setStroke(new BasicStroke(7));
                g2d.drawLine(455, 240, 455, 150);

                g2d.setStroke(new BasicStroke(4));
                g2d.drawLine(410, 195, 500,195);

                g2d.setColor(Color.decode("#474747"));
                g2d.fillRect(400, 240,110, 20);

                g2d.setColor(Color.decode("#474747"));
                g2d.fillRect(160, 340,410, 50);

                g2d.setColor(Color.white);
                g2d.fillArc(300, 250, 15, 15, 90, 360);

                g2d.setFont(new Font("Times new Roman", Font.BOLD,25));
                g2d.setColor(Color.decode("#e99eca"));
                g2d.drawString("Eri", 250, 190);
                
            }
        };
        pane.setSize(1000,700);
        pane.setBackground(Color.decode("#0cd4ee"));
        pane.setLocation(0,0);
        this.add(pane);
        
    }
}