package programacion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{

    public Ventana(){

        //Configuraciones basicas

        this.setVisible(true);
        this.setBounds(400,400,1000,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(200,200));
        this.setMaximumSize(new Dimension(1000,1000));
        this.setTitle("Waltuh");
        this.setLayout(null);
        this.getContentPane().setBackground(Color.pink);

        this.users();
        //this.login();
        this.repaint();
    }

    public void login(){
        JPanel login_container = new JPanel();
        login_container.setSize(400,470);
        login_container.setLocation(50,50);
        login_container.setBackground(Color.yellow);
        login_container.setLayout(null);
        this.add(login_container);

        login_container.setBorder(BorderFactory.createRaisedBevelBorder());


        //añadiendo elementos

        JLabel tag_tittle = new JLabel();
        tag_tittle.setText("Acceso");
        tag_tittle.setSize(150,40);
        tag_tittle.setLocation(140,10);
        tag_tittle.setBackground(Color.white);
        tag_tittle.setOpaque(true);
        tag_tittle.setFont(new Font("Arial",Font.PLAIN,22));
        tag_tittle.setHorizontalAlignment(JLabel.CENTER);
        login_container.add(tag_tittle);

        JLabel usuario = new JLabel();
        usuario.setText("ingrese correo");
        usuario.setSize(200,20);
        usuario.setLocation(10,70);
        usuario.setBackground(Color.white);
        //usuario.setOpaque(true);
        usuario.setFont(new Font("Arial",Font.PLAIN,19));
        usuario.setHorizontalAlignment(JLabel.CENTER);
        login_container.add(usuario);

        JLabel password = new JLabel();
        password.setText("ingrese contraseña");
        password.setSize(200,20);
        password.setLocation(10,170);
        password.setBackground(Color.white);
        //usuario.setOpaque(true);
        password.setFont(new Font("Arial",Font.PLAIN,19));
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
        dulce.setOpaque(false);
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
        accept_terms.setOpaque(false);
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

        


}