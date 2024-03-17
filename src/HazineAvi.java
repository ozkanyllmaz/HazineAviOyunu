import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HazineAvi {

    public static void main(String[] args) {
        // deneme


        JFrame frame = new JFrame("First Frame");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Butonları oluşturma
        JButton button1 = new JButton("Yeni Harita Oluştur");
        JButton button2 = new JButton("Başla");

        // Butonları panele ekleme
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(button1);
        panel.add(button2);

        // Paneli frame'e ekleme
        frame.add(panel);

        // Butonlara action listener ekleme
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Buton 1'e tıklandığında yapılacak işlem
                JOptionPane.showMessageDialog(frame, "Yeni Harita Oluşturuldu!");


                HaraketsizEngeller.duvar();
                HaraketsizEngeller.duvar();
                HaraketsizEngeller.duvar();
                HaraketsizEngeller.kaya();
                HaraketsizEngeller.kaya();
                HaraketsizEngeller.kaya();
                HaraketsizEngeller.kaya();
                HaraketsizEngeller.dag();
                HaraketsizEngeller.dag();

            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Buton 2'ye tıklandığında yapılacak işlem
                JOptionPane.showMessageDialog(frame, "Başlandı");
            }
        });

        // Frame'i görünür yapma
        frame.setVisible(true);





    }
}
