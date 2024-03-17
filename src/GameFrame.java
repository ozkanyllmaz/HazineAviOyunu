import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    public JLabel label;
    int row = 50;
    int col = 50;

    public GameFrame() {
        setLayout(new GridLayout(row, col));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        for (int i = 0; i < row * col; i++) {
            label = new JLabel();
            label.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            label.setOpaque(true);
            add(label);
        }

        setLocationRelativeTo(null);
        setSize(1920, 1080);
        setVisible(true);
    }
}
