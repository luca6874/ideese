package programacion;

import javax.swing.*;
import java.awt.*;

public class Paint extends JFrame {

    private Lienzo lienzo;

    public Paint(){
        setTitle("paint");
        setSize(900,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        lienzo = new Lienzo();

        add(herramientas(), BorderLayout.WEST);
        add(colores(), BorderLayout.SOUTH);
        add(lienzo, BorderLayout.CENTER);
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

        JSlider slider = new JSlider(1, 10, 3);
        slider.addChangeListener(e -> lienzo.setGrosor(slider.getValue()));
        panel.add(slider);

        JButton limpiar = new JButton("Limpiar");
        limpiar.addActionListener(e -> lienzo.limpiar());
        panel.add(limpiar);

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
        btn.addActionListener(e -> lienzo.setColor(color));
        return btn;
    }

    class Lienzo extends JPanel {

        private int x1, y1, x2, y2;
        private Color colorActual = Color.BLACK;
        private int grosor = 3;
        private Image imagen;
        private Graphics2D g2;

        public Lienzo() {
            setBackground(Color.WHITE);

            addMouseListener(new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent e) {
                    x1 = e.getX();
                    y1 = e.getY();
                }
            });

            addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                public void mouseDragged(java.awt.event.MouseEvent e) {
                    x2 = e.getX();
                    y2 = e.getY();

                    if (g2 != null) {
                        g2.setColor(colorActual);
                        g2.setStroke(new BasicStroke(grosor));
                        g2.drawLine(x1, y1, x2, y2);
                        repaint();
                    }

                    x1 = x2;
                    y1 = y2;
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            if (imagen == null) {
                imagen = createImage(getWidth(), getHeight());
                g2 = (Graphics2D) imagen.getGraphics();
                g2.setColor(Color.WHITE);
                g2.fillRect(0, 0, getWidth(), getHeight());
            }

            g.drawImage(imagen, 0, 0, null);
        }

        public void setColor(Color c) {
            this.colorActual = c;
        }

        public void setGrosor(int g) {
            this.grosor = g;
        }

        public void limpiar() {
            if (g2 != null) {
                g2.setColor(Color.WHITE);
                g2.fillRect(0, 0, getWidth(), getHeight());
                repaint();
            }
        }
    }
}