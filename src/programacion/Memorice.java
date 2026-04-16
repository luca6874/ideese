package programacion;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;

public class Memorice extends JFrame {

    public Memorice() {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 500);
        this.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(117, 202, 251));
        getContentPane().add(panel, BorderLayout.NORTH);
        panel.setLayout(new GridLayout(0, 3, 0, 0));
        
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
        panel_1.setBackground(new Color(237, 243, 125));
        getContentPane().add(panel_1, BorderLayout.SOUTH);
        
        JButton btnNewButton_1 = new JButton("Eri mi loba");
        panel_1.add(btnNewButton_1);

        
        JButton btnNewButton = new JButton("SShlk");
        panel_1.add(btnNewButton);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(137, 246, 216));
        getContentPane().add(panel_2, BorderLayout.CENTER);
        panel_2.setLayout(new GridLayout(3, 4, 5, 5));

        ImageIcon iconOriginal = new ImageIcon(getClass().getResource("/imagen/yo.png"));
        Image imagen = iconOriginal.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(imagen);
        
        

        for (int i = 0; i < 12; i++) {
            JButton btn = new JButton();
            btn.setIcon(icon);
            panel_2.add(btn);
            btn.setPreferredSize(new Dimension(100, 100));

            btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Botón presionado");
                }
            });
        }

            

        this.setVisible(true);
    }

    public void flip(){}

    public static void main(String[] args) {
        new Memorice();
    }
}
