package GUI;

import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;

public class Main extends JFrame {
    int x = 0, y = 0;

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
                g.drawLine(0, 0, getWidth(), getHeight());
                g.drawLine(0,100,getWidth(),getHeight());
            }









        };

        JPanel nivel2 = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawLine(0, 0, getWidth(), getHeight());
                g.drawLine(0,100,getWidth(),getHeight());
            }
        };





        contentPane.add(nivel1, BorderLayout.CENTER);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(0, 255, 0));
        contentPane.add(panel_1, BorderLayout.SOUTH);

        JButton btnNewButton = new JButton("Reiniciar");
        panel_1.add(btnNewButton);




//controles
        this.addKeyListener(new KeyListener() {
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
                    nivel1.setLocation(x -= 3, y);
                    repaint();
                }

                if (e.getKeyCode() == KeyEvent.VK_D) {
                    nivel1.setLocation(x += 3, y);
                    repaint();
                }

                if (e.getKeyCode() == KeyEvent.VK_W) {
                    nivel1.setLocation(x, y -= 3);
                    repaint();
                }

                if (e.getKeyCode() == KeyEvent.VK_S) {
                    nivel1.setLocation(x, y += 3);
                    repaint();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("keyReleased");
                System.out.println(e.getKeyCode());
                System.out.println(e.getKeyChar());
            }
        });

















    }











}
