import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class GameFrame extends JFrame {
    public JLabel label;

    Scanner scan = new Scanner(System.in);
    int col,row;


    public GameFrame() {
        System.out.println("Row: ");
        row = scan.nextInt();
        System.out.println("Col: ");
        col = scan.nextInt();

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
