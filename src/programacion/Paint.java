package programacion;

import javax.swing.*;
import java.awt.*;


public class Paint extends JFrame {

    public Paint(){
        setTitle("paint");
        setSize(900,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        add(herramientas(), BorderLayout.WEST);
        add(colores(), BorderLayout.SOUTH);
        add(Dibujo(), BorderLayout.CENTER);

        
    }

    public static void main(String[] args) {

        new Paint().setVisible(true);
    }

    private JPanel herramientas(){

         JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(10, 1, 5, 5));
            panel.setPreferredSize(new Dimension(120, 0));

            panel.setBorder(BorderFactory.createTitledBorder("Herramientas"));

            panel.add(new JButton("Pincel"));
            panel.add(new JButton("Borrador"));
            panel.add(new JButton("Rectángulo"));
            panel.add(new JButton("Círculo"));
            panel.add(new JButton("Triángulo"));
            panel.add(new JButton("Línea"));

            panel.add(new JLabel("Grosor"));
            panel.add(new JSlider(1, 10, 3));

            panel.add(new JButton("Limpiar"));

             return panel;


    }

    private JPanel colores(){
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Colores"));

        panel.add(crearColor(Color.WHITE));
        panel.add(crearColor(Color.BLACK));
        panel.add(crearColor(Color.GRAY));
        panel.add(crearColor(Color.BLUE));
        panel.add(crearColor(Color.RED));
        panel.add(crearColor(Color.GREEN));

        return panel;
    }

    private JButton crearColor(Color color) {
        JButton btn = new JButton();
        btn.setBackground(color);
        btn.setPreferredSize(new Dimension(40, 40));
        return btn;
    }

    private JPanel Dibujo() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        return panel;
    }

    
    
}
