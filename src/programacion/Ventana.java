package programacion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ventana extends JFrame{

    public Ventana(){

        //Configuraciones basicas

        this.setVisible(true);
        this.setBounds(300,300,500,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(200,200));
        this.setMaximumSize(new Dimension(800,800));
        this.setTitle("hola");
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
        tag_tittle.setText("Acceder");
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

        this.repaint();
    }
}
