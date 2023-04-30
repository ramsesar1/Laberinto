package GUI;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JButton;

public class Main extends JFrame {
    private JPanel contentPane;
//    ArrayList<Rectangle> hitbox = new ArrayList<>();
    ArrayList<Rectangle> nivel1Hitboxes = new ArrayList<>();
    ArrayList<Rectangle> nivel2Hitboxes = new ArrayList<>();
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main frame = new Main();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }



    public Main() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));


        //hitboxes para nivel 1

        nivel1Hitboxes.add(new Rectangle(30, 30, 10, 280));


        //-----------------------hitboxes del nivel1----------------------------------------

        //----------filas------------

        //fila 1
        nivel1Hitboxes.add(new Rectangle(570, 0, 10, 280));
        nivel1Hitboxes.add(new Rectangle(30, 35, 520, 10));
        nivel2Hitboxes.add(new Rectangle(30, 35, 520, 10));

        nivel1Hitboxes.add(new Rectangle(30, 0, 550, 10));
        nivel1Hitboxes.add(new Rectangle(30, 0, 10, 60));
        //fila2
        nivel1Hitboxes.add(new Rectangle(280, 65, 360, 10));
        nivel1Hitboxes.add(new Rectangle(60, 65, 190, 10));
        //fila3
        nivel1Hitboxes.add(new Rectangle(280, 95, 80, 10));
        nivel1Hitboxes.add(new Rectangle(30, 95, 180, 10));
        //fila4
        nivel1Hitboxes.add(new Rectangle(60, 125, 250, 10));
        nivel1Hitboxes.add(new Rectangle(350, 125, 140, 10));
        //fila5
        nivel1Hitboxes.add(new Rectangle(30, 155, 120, 10));
        nivel1Hitboxes.add(new Rectangle(250, 155, 40, 10));
        nivel1Hitboxes.add(new Rectangle(370, 155, 120, 10));
        //fila6
        nivel1Hitboxes.add(new Rectangle(60, 185, 90, 10));
        nivel1Hitboxes.add(new Rectangle(120, 185, 250, 10));
        nivel1Hitboxes.add(new Rectangle(420, 185, 120, 10));
        //fila7
        nivel1Hitboxes.add(new Rectangle(60, 215, 120, 10));
        nivel1Hitboxes.add(new Rectangle(220, 215, 150, 10));
        nivel1Hitboxes.add(new Rectangle(480, 215, 200, 10));
        //fila8
        nivel1Hitboxes.add(new Rectangle(60, 245, 100, 10));
        nivel1Hitboxes.add(new Rectangle(180, 245, 80, 10));
        nivel1Hitboxes.add(new Rectangle(380, 245, 140, 10));
        //fila9
        nivel1Hitboxes.add(new Rectangle(60, 270, 520, 10));


        //----------------columnas--------------------

        //fila1
        nivel1Hitboxes.add(new Rectangle(120,35,10,30));
        nivel1Hitboxes.add(new Rectangle(150,35,10,30));
        //fila2
        nivel1Hitboxes.add(new Rectangle(240,65,10,30));
        nivel1Hitboxes.add(new Rectangle(350,65,10,30));
        nivel1Hitboxes.add(new Rectangle(410,65,10,30));
        //fila3
        nivel1Hitboxes.add(new Rectangle(280,95,10,30));
        nivel1Hitboxes.add(new Rectangle(350,95,10,30));
        nivel1Hitboxes.add(new Rectangle(480,95,10,30));
        //fila4
        nivel1Hitboxes.add(new Rectangle(180,125,10,30));
        nivel1Hitboxes.add(new Rectangle(510,125,10,30));
        //fila5
        nivel1Hitboxes.add(new Rectangle(80,155,10,30));
        nivel1Hitboxes.add(new Rectangle(240,155,10,30));
        nivel1Hitboxes.add(new Rectangle(360,155,10,30));
        nivel1Hitboxes.add(new Rectangle(140,155,10,30));
        nivel1Hitboxes.add(new Rectangle(510,155,10,30));
        //fila6
        nivel1Hitboxes.add(new Rectangle(510,185,10,30));
        nivel1Hitboxes.add(new Rectangle(450,185,10,30));
        nivel1Hitboxes.add(new Rectangle(360,185,10,30));
        //fila7
        nivel1Hitboxes.add(new Rectangle(510,215,10,30));
        nivel1Hitboxes.add(new Rectangle(350,215,10,30));
        nivel1Hitboxes.add(new Rectangle(60,215,10,30));
        //fila8
        nivel1Hitboxes.add(new Rectangle(60,245,10,30));
        nivel1Hitboxes.add(new Rectangle(180,245,10,30));
        nivel1Hitboxes.add(new Rectangle(120,245,10,30));

        //-----------------------hitboxes del nivel2----------------------------------------
        //se agregaran primero a nivel1 para testeo, despues se hace el reemplazo para nivel2

        nivel2Hitboxes.add(new Rectangle(30, 30, 10, 280));
        nivel2Hitboxes.add(new Rectangle(30, 0, 550, 10));
        nivel2Hitboxes.add(new Rectangle(30, 0, 10, 60));

        //----------filas------------

        //fila 1
        nivel2Hitboxes.add(new Rectangle(570, 0, 10, 280));
        nivel2Hitboxes.add(new Rectangle(30, 35, 520, 10));
        nivel2Hitboxes.add(new Rectangle(30, 35, 520, 10));

        //fila2
        nivel2Hitboxes.add(new Rectangle(30, 65, 110, 10));
        nivel2Hitboxes.add(new Rectangle(170, 65, 110, 10));
        nivel2Hitboxes.add(new Rectangle(300, 65, 110, 10));
        nivel2Hitboxes.add(new Rectangle(430, 65, 110, 10));

        //fila3
        nivel2Hitboxes.add(new Rectangle(30, 95, 110, 10));
        nivel2Hitboxes.add(new Rectangle(170, 95, 110, 10));
        nivel2Hitboxes.add(new Rectangle(300, 95, 110, 10));
        nivel2Hitboxes.add(new Rectangle(430, 95, 110, 10));
        //fila4
        nivel2Hitboxes.add(new Rectangle(30, 125, 110, 10));
        nivel2Hitboxes.add(new Rectangle(170, 125, 110, 10));
        nivel2Hitboxes.add(new Rectangle(300, 125, 110, 10));
        nivel2Hitboxes.add(new Rectangle(430, 125, 110, 10));
        //fila5
        nivel2Hitboxes.add(new Rectangle(30, 155, 110, 10));
        nivel2Hitboxes.add(new Rectangle(170, 155, 110, 10));
        nivel2Hitboxes.add(new Rectangle(300, 155, 110, 10));
        nivel2Hitboxes.add(new Rectangle(430, 155, 110, 10));
        //fila6
        nivel2Hitboxes.add(new Rectangle(30, 185, 110, 10));
        nivel2Hitboxes.add(new Rectangle(170, 185, 110, 10));
        nivel2Hitboxes.add(new Rectangle(300, 185, 110, 10));
        nivel2Hitboxes.add(new Rectangle(430, 185, 110, 10));
        //fila7
        nivel2Hitboxes.add(new Rectangle(30, 215, 110, 10));
        nivel2Hitboxes.add(new Rectangle(170, 215, 110, 10));
        nivel2Hitboxes.add(new Rectangle(300, 215, 110, 10));
        nivel2Hitboxes.add(new Rectangle(430, 215, 110, 10));
        //fila8
        nivel2Hitboxes.add(new Rectangle(30, 245, 110, 10));
        nivel2Hitboxes.add(new Rectangle(170, 245, 110, 10));
        nivel2Hitboxes.add(new Rectangle(300, 245, 110, 10));
        nivel2Hitboxes.add(new Rectangle(430, 245, 110, 10));
        //fila9
        nivel2Hitboxes.add(new Rectangle(30, 270, 110, 10));
        nivel2Hitboxes.add(new Rectangle(170, 270, 110, 10));
        nivel2Hitboxes.add(new Rectangle(300, 270, 110, 10));
        nivel2Hitboxes.add(new Rectangle(430, 270, 110, 10));

        //filas cortas

        //fila 2
        nivel2Hitboxes.add(new Rectangle(280, 65, 40, 10));
        nivel2Hitboxes.add(new Rectangle(410, 65, 40, 10));

     //   nivel1Hitboxes.add(new Rectangle(540, 65, 40, 10));

        //fila3
        nivel2Hitboxes.add(new Rectangle(280, 95, 40, 10));

        nivel2Hitboxes.add(new Rectangle(410, 95, 40, 10));

        nivel2Hitboxes.add(new Rectangle(540, 95, 40, 10));


        //fila4
        nivel2Hitboxes.add(new Rectangle(540, 125, 40, 10));

        //fila5
        nivel2Hitboxes.add(new Rectangle(540, 155, 40, 10));

        //fila6
        nivel2Hitboxes.add(new Rectangle(280, 185, 40, 10));

        nivel2Hitboxes.add(new Rectangle(540, 185, 40, 10));

        //fila7
        nivel2Hitboxes.add(new Rectangle(410, 215, 40, 10));

        nivel2Hitboxes.add(new Rectangle(540, 215, 40, 10));

        //fila8
        nivel2Hitboxes.add(new Rectangle(280, 245, 40, 10));

        nivel2Hitboxes.add(new Rectangle(540, 245, 40, 10));

        //fila9
        nivel2Hitboxes.add(new Rectangle(140, 270, 40, 10));

        nivel2Hitboxes.add(new Rectangle(410, 270, 40, 10));






        //---------columnas---------------


        //fila2
   //     nivel1Hitboxes.add(new Rectangle(170,35,10,30));
   //     nivel1Hitboxes.add(new Rectangle(300,35,10,30));
        //fila3
        nivel2Hitboxes.add(new Rectangle(480,65,10,30));
        nivel2Hitboxes.add(new Rectangle(80,65,10,30));
        //fila4
        nivel2Hitboxes.add(new Rectangle(360,95,10,30));
        nivel2Hitboxes.add(new Rectangle(190,95,10,30));
        //fila5
        nivel2Hitboxes.add(new Rectangle(210,125,10,30));
        nivel2Hitboxes.add(new Rectangle(110,125,10,30));
        //fila6
        nivel2Hitboxes.add(new Rectangle(460,155,10,30));
        nivel2Hitboxes.add(new Rectangle(340,155,10,30));
        //fila7
        nivel2Hitboxes.add(new Rectangle(190,185,10,30));
        nivel2Hitboxes.add(new Rectangle(490,185,10,30));
        //fila8
        nivel2Hitboxes.add(new Rectangle(460,215,10,30));
        nivel2Hitboxes.add(new Rectangle(100,215,10,30));
        nivel2Hitboxes.add(new Rectangle(260,215,10,30));

        //fila9
        nivel2Hitboxes.add(new Rectangle(210,245,10,30));
        nivel2Hitboxes.add(new Rectangle(480,245,10,30));




        JPanel nivel2 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;

                g2d.setColor(Color.RED);
                g2d.fillRect(60, 270, 60, 60);
                g.setColor(Color.BLACK);


                for (Rectangle rect : nivel2Hitboxes) {
                    g.fillRect(rect.x, rect.y, rect.width, rect.height);
                }
            }
        };


        JPanel nivel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;

                g2d.setColor(Color.RED);
                g2d.fillRect(60, 270, 60, 60);
                g.setColor(Color.BLACK);


                for (Rectangle rect : nivel1Hitboxes) {
                    g.fillRect(rect.x, rect.y, rect.width, rect.height);
                }
            }
        };

        JPanel hitboxPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(Color.RED);
                for(Rectangle r : nivel1Hitboxes) {
                    g2d.fillRect(r.x, r.y, r.width, r.height);
                }
            }
        };
        contentPane.add(hitboxPanel, BorderLayout.CENTER);
        contentPane.add(nivel1, BorderLayout.CENTER);

        Rectangle meta = new Rectangle(60, 270, 60, 60);


        JButton jugador = new JButton();
        jugador.setBackground(Color.GREEN);
        jugador.setPreferredSize(new Dimension(10, 10));
        jugador.setBounds(45, 45, 10, 10);

        nivel1.add(jugador);
        contentPane.add(nivel1);
        contentPane.add(nivel1, BorderLayout.CENTER);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(0, 255, 0));
        contentPane.add(panel_1, BorderLayout.SOUTH);

        JButton btnNewButton = new JButton("Reiniciar");
        panel_1.add(btnNewButton);

        jugador.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("keyTyped");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("keyPressed");
                System.out.println(e.getKeyCode());
                System.out.println(e.getKeyChar());
                if (e.getKeyCode() == KeyEvent.VK_A) {

                    Rectangle contacto = new Rectangle(jugador.getX() - 10, jugador.getY(), jugador.getWidth(), jugador.getHeight());
                    boolean puedemoverse = true;
                    for (Rectangle rect : nivel1Hitboxes) {
                        if (rect.intersects(contacto)) {
                            puedemoverse = false;
                            break;
                        }

                    }
                    if (puedemoverse) {
                        jugador.setLocation(jugador.getX() - 10, jugador.getY());
                        repaint();
                    }
                }

                if (e.getKeyCode() == KeyEvent.VK_D) {
                    Rectangle contacto = new Rectangle(jugador.getX() + 10, jugador.getY(), jugador.getWidth(), jugador.getHeight());
                    boolean puedemoverse = true;
                    for (Rectangle rect : nivel1Hitboxes) {
                        if (rect.intersects(contacto)) {
                            puedemoverse = false;
                            break;
                        }
                    }
                    if (puedemoverse) {
                        jugador.setLocation(jugador.getX() + 10, jugador.getY());
                        repaint();
                    }
                }

                if (e.getKeyCode() == KeyEvent.VK_W) {
                    Rectangle contacto = new Rectangle(jugador.getX(), jugador.getY() - 10, jugador.getWidth(), jugador.getHeight());
                    boolean puedemoverse = true;
                    for (Rectangle rect : nivel1Hitboxes) {
                        if (rect.intersects(contacto)) {
                            puedemoverse = false;
                            break;
                        }
                    }
                    if (puedemoverse) {
                        jugador.setLocation(jugador.getX(), jugador.getY() - 10);
                        repaint();
                    }
                }

                if (e.getKeyCode() == KeyEvent.VK_S) {
                    Rectangle contacto = new Rectangle(jugador.getX(), jugador.getY() + 10, jugador.getWidth(), jugador.getHeight());
                    boolean puedemoverse = true;
                    for (Rectangle rect : nivel1Hitboxes) {
                        if (rect.intersects(contacto)) {
                            puedemoverse = false;
                            break;
                        }
                    }
                    if (puedemoverse) {
                        jugador.setLocation(jugador.getX(), jugador.getY() + 10);
                        repaint();
                    }
                }
                //cambio de nivel
                if (meta.intersects(jugador.getBounds())) {
                    contentPane.remove(nivel1);
                    contentPane.add(nivel2, BorderLayout.CENTER);
                    contentPane.revalidate();
                    contentPane.repaint();

                    nivel2.add(jugador);

                    nivel1Hitboxes.clear();




                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("keyReleased");
            }

        });

        jugador.setFocusable(true);
    }
}
