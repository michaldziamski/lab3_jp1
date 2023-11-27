import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Kordy extends JFrame {
    private JTextField textField;
    private KordyPanel kordyPanel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Kordy().setVisible(true);
        });
    }
    public Kordy() {
        setTitle("Kordy kliknięcia");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.CENTER);

        kordyPanel = new KordyPanel();

        add(textField, BorderLayout.SOUTH);
        add(kordyPanel, BorderLayout.CENTER);


        kordyPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                textField.setText("Koordynaty kliknięcia: " + x + ", " + y);
            }
        });

        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    textField.setText("");
                }
            }
        });

        setSize(500,500);
        setLocationRelativeTo(null); // Wyśrodkowanie okna
    }


    private class KordyPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

        }
    }
}
