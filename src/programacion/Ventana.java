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
        this.getContentPane().setBackground(Color.black);

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
        login_container.setBorder(BorderFactory.createLoweredBevelBorder());


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
            panel_users.setSize(200,300);
            panel_users.setLocation(100,200);
            panel_users.setLayout(null);
            panel_users.setBackground(Color.white);
            this.add(panel_users);

            String[] table_head ={"No.control","Nombre","Apellidos","Correo electronico","Semestre","Carrera","Acciones"};
            
            Object[][]table_body = {{"20231001","Carlos","Ramirez Lopez","carlos.ramirez@gmail.com","3°","ingenieria en sistemas","Editar"},{"20231002","Maria", "Hernandez Torres","maria.torres@gmail.com","1°","Editar"}};


            JTable students = new JTable(table_body,table_head);

            JScrollPane final_table = new JScrollPane(students);
            final_table.setSize(700,150);
            final_table.setLocation(100,100);
            
            panel_users.add(final_table);

            panel_users.repaint();


            
        }




}