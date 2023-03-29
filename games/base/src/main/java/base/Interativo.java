package base;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Interativo extends JFrame {
    private JPanel tela;
    private int px;
    private int py;
    private boolean jogando = true;
    private final int FPS = 1000 / 20;

    public void inicia() {
        long prxAtualizacao = 0;
        while (jogando) {
            if (System.currentTimeMillis() >= prxAtualizacao) {
                tela.repaint();
                prxAtualizacao = System.currentTimeMillis() + FPS;
            }
        }
    }

    public Interativo() {
        super.addKeyListener(new KeyListener() {
//          Evento para tela apertada
            @Override
            public void keyTyped(KeyEvent e) {

            }

//          Evento para tecla apertada
            @Override
            public void keyPressed(KeyEvent e) {

            }

//          Evento para tecla liberada
            @Override
            public void keyReleased(KeyEvent e) {
                int tecla = e.getKeyCode();

                switch (tecla) {
                    case KeyEvent.VK_ESCAPE:
                        jogando = false;
                        dispose();
                        break;
                    case KeyEvent.VK_UP:
                        py--;
                        break;
                    case KeyEvent.VK_DOWN:
                        py++;
                        break;
                    case KeyEvent.VK_LEFT:
                        px--;
                        break;
                    case KeyEvent.VK_RIGHT:
                        px++;
                        break;
                }

                tela = new JPanel() {
                    @Override
                    public void paintComponent(Graphics g) {
                        g.setColor(Color.WHITE);
                        g.fillRect(0, 0,
                                tela.getWidth(), tela.getHeight());

                        int x = tela.getWidth() / 2 - 20 + px;
                        int y = tela.getHeight() / 2 - 20 + py;

                        g.setColor(Color.BLUE);
                        g.fillRect(x, y, 40, 40);
                        g.drawString("Agora eu estou em " + x + "x " + y + "y ", 5,10);
                    }
                };

                getContentPane().add(tela);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setSize(640,480);
                setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        Interativo jogo = new Interativo();
        jogo.inicia();
    }
}
