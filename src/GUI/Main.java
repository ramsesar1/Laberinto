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
    int x = -1000, y = -1000;

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
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawLine(0, 0, getWidth(), getHeight());
            }








        };
        contentPane.add(panel, BorderLayout.CENTER);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(0, 255, 0));
        contentPane.add(panel_1, BorderLayout.SOUTH);

        JButton btnNewButton = new JButton("Reiniciar");
        panel_1.add(btnNewButton);





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


                if (e.getKeyCode() == 87) {
                    panel.setLocation(x,y=y-1);
                    repaint();

                }

                if (e.getKeyCode() == 83) {
                    panel.setLocation(x,y=y+1);
                    repaint();
                }

                if (e.getKeyCode() == 65) {
                    panel.setLocation(x=x-1,y);
                    repaint();
                }
                if (e.getKeyCode() == 68) {
                    panel.setLocation(x=x+1,y);
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
