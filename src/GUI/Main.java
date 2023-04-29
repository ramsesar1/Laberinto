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
    //  int x = 0, y = 0;

    private JPanel contentPane;

    /**
     * Launch the application.
     */
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

    /**
     * Create the frame.
     */
    public Main() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        JPanel nivel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLACK);
             //   g.fillRect(30, 0, 550, 15);
                g.fillRect(30, 30, 15, 280);
                g.fillRect(560, 0, 15, 280);

                //filas
                g.fillRect(30, 30, 520, 15);

                g.fillRect(60, 60, 550, 15);

                g.fillRect(30, 90, 520, 15);

                g.fillRect(60, 120, 550, 15);

                g.fillRect(30, 150, 520, 15);

                g.fillRect(60, 180, 550, 15);

                g.fillRect(30, 210, 520, 15);

                g.fillRect(30, 240, 520, 15);

                g.fillRect(60, 270, 520, 15);

                g.fillRect(30, 300, 550, 15);

                g.setColor(Color.RED);
                g.fillRect(550, 285, 30, 15);

                //columnas
                // g.fillRect(90, 30, 15, 30);
            }
        };


        ArrayList<Rectangle> hitbox = new ArrayList<>();
        hitbox.add(new Rectangle(30, 30, 10, 280));
        hitbox.add(new Rectangle(570, 0, 10, 280));
        hitbox.add(new Rectangle(30, 30, 520, 10));
        hitbox.add(new Rectangle(60, 60, 550, 10));
        hitbox.add(new Rectangle(30, 90, 520, 10));
        hitbox.add(new Rectangle(60, 120, 550, 10));
        hitbox.add(new Rectangle(30, 150, 520, 10));
        hitbox.add(new Rectangle(60, 180, 550, 10));
        hitbox.add(new Rectangle(30, 210, 520, 10));
        hitbox.add(new Rectangle(30, 240, 520, 10));
        hitbox.add(new Rectangle(60, 270, 520, 10));

        JButton jugador = new JButton();
        jugador.setBackground(Color.GREEN);
        jugador.setPreferredSize(new Dimension(10, 10));
        jugador.setBounds(45, 45, 10, 10);
        nivel1.add(jugador);

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
                    for (Rectangle rect : hitbox) {
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
                    for (Rectangle rect : hitbox) {
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
                    for (Rectangle rect : hitbox) {
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
                    for (Rectangle rect : hitbox) {
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
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("keyReleased");
            }

        });

    }
}
