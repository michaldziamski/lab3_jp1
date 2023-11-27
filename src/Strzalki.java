import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Strzalki extends JPanel implements KeyListener {
    private int x = 150;
    private int y = 150;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ruch strzalkami");
        Strzalki drawingPanel = new Strzalki();

        frame.add(drawingPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
    public Strzalki() {
        setFocusable(true);
        addKeyListener(this);
        setPreferredSize(new Dimension(500, 500));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.green);
        g.fillOval(x, y, 100, 100);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        switch (keyCode) {
            case KeyEvent.VK_UP:
                y -= 10; // Przesunięcie w górę
                break;
            case KeyEvent.VK_DOWN:
                y += 10; // Przesunięcie w dół
                break;
            case KeyEvent.VK_LEFT:
                x -= 10; // Przesunięcie w lewo
                break;
            case KeyEvent.VK_RIGHT:
                x += 10; // Przesunięcie w prawo
                break;
        }

        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}


