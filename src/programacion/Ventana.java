package programacion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
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

        JPanel login_container = new JPanel();
        login_container.setSize(400,400);
        login_container.setLocation(50,50);
        login_container.setBackground(Color.yellow);
        login_container.setLayout(null);
        this.add(login_container);

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

        //el otro coso
        JPanel rg_container = new JPanel();
        rg_container.setBounds(500,50,400,400);
        rg_container.setOpaque(true);
        rg_container.setBackground(Color.green);
        rg_container.setLayout(null);
        this.add(rg_container);
        //La etiqueta
        JLabel bio_tag = new JLabel("BIO");
        bio_tag.setBounds(50,50,300,40);
        bio_tag.setHorizontalAlignment(JLabel.CENTER);
        bio_tag.setOpaque(true);
        rg_container.add(bio_tag);
        
        JTextArea bio_text = new JTextArea();
        bio_text.setLocation(50,100);
        bio_text.setSize(300,80);
        rg_container.add(bio_text);

        //checkboxes

        JCheckBox dulce = new JCheckBox("Dulce");
        dulce.setBounds(50,200,100,40);
        dulce.setOpaque(false);
        rg_container.add(dulce);


        JCheckBox salado = new JCheckBox("salado");
        salado.setBounds(150,200,100,40);
        salado.setOpaque(false);
        rg_container.add(salado);


        JCheckBox saludable = new JCheckBox("Saludable");
        saludable.setBounds(250,200,100,40);
        saludable.setOpaque(false);
        rg_container.add(saludable);

        //boton redondo 

        JRadioButton accept_terms = new JRadioButton("Acepto los terminos");
        accept_terms.setBounds(50,260,200,40);
        accept_terms.setOpaque(false);
        rg_container.add(accept_terms);

        JRadioButton reject_terms = new JRadioButton("Rechazo los terminos");
        reject_terms.setBounds(200,260,200,40);
        reject_terms.setOpaque(false);
        rg_container.add(reject_terms);

        ButtonGroup terms = new ButtonGroup();
        terms.add(accept_terms);
        terms.add(reject_terms);
        
        //waza

        String[] colonias = {"Camino real", "Miramar", "Diana laura", "8 de octubre"};

        JComboBox colonias_combo = new JComboBox(colonias);

        colonias_combo.setBounds(50,310,300,50);
        rg_container.add(colonias_combo);

        JButton register_btn = new JButton("Crear cuenta");
        register_btn.setBounds(50,340,300,55);
        rg_container.add(register_btn);
        









        this.repaint();
    }
}