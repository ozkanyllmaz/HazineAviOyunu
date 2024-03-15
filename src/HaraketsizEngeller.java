import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class HaraketsizEngeller extends Engel {
    static int row = 30;
    static int col = 30;
    static GameFrame frame = new GameFrame(); // GameFrame nesnesi oluşturuyoruz

    public static void duvar() {
        Random random = new Random();
        ImageIcon icon = new ImageIcon("C:\\intellij_myProject\\My2DGame\\HazineAviOyunu\\src\\source\\Duvar.png");

        // İkon boyutunu al
        int iconWidth = icon.getIconWidth();
        int iconHeight = icon.getIconHeight();

        // İkon boyutları sıfırdan büyükse devam et
        if (iconWidth <= 0 || iconHeight <= 0) {
            System.out.println("Hata: İkon boyutları geçersiz.");
            return;
        }

        // GameFrame içeriğine erişim
        Container contentPane = frame.getContentPane();

        // Rastgele konumlar seç ve ikonları yerleştir
        for (int i = 0; i < 1; i++) { // Toplamda 6 ikon yerleştirilecek (2x2 = 4)
            int randRow;
            int randCol;

            randRow = random.nextInt(row - 1); // Satır indeksi

            do {
                randCol = random.nextInt(col - 1); // Sütun indeksi
            } while (randCol > col - 10);


            int index = randRow * col + randCol;

            // 10x1'lik kare için 4 farklı JLabel bileşenine erişim
            JLabel label1 = (JLabel) contentPane.getComponent(index);
            JLabel label2 = (JLabel) contentPane.getComponent(index + 1);
            JLabel label3 = (JLabel) contentPane.getComponent(index + 2);
            JLabel label4 = (JLabel) contentPane.getComponent(index + 3);
            JLabel label5 = (JLabel) contentPane.getComponent(index + 4);
            JLabel label6 = (JLabel) contentPane.getComponent(index + 5);
            JLabel label7 = (JLabel) contentPane.getComponent(index + 6);
            JLabel label8 = (JLabel) contentPane.getComponent(index + 7);
            JLabel label9 = (JLabel) contentPane.getComponent(index + 8);
            JLabel label10 = (JLabel) contentPane.getComponent(index + 9);

            // İkon boyutunu label boyutuna uyacak şekilde ayarla
            ImageIcon scaledIcon = new ImageIcon(icon.getImage().getScaledInstance(label1.getWidth(), label1.getHeight(), Image.SCALE_SMOOTH));

            // Her bir JLabel bileşenine ikonu yerleştir
            label1.setIcon(scaledIcon);
            label2.setIcon(scaledIcon);
            label3.setIcon(scaledIcon);
            label4.setIcon(scaledIcon);
            label5.setIcon(scaledIcon);
            label6.setIcon(scaledIcon);
            label7.setIcon(scaledIcon);
            label8.setIcon(scaledIcon);
            label9.setIcon(scaledIcon);
            label10.setIcon(scaledIcon);


            // Label'ların içeriğini temizleme işlemi opsiyoneldir
            // label1.setText("");
            // label2.setText("");
            // label3.setText("");
            // label4.setText("");
        }
    }

    public static void kaya() {
        Random random = new Random();
        ImageIcon icon = new ImageIcon("C:\\intellij_myProject\\My2DGame\\HazineAviOyunu\\src\\source\\Kaya.png");

        // İkon boyutunu al
        int iconWidth = icon.getIconWidth();
        int iconHeight = icon.getIconHeight();

        // İkon boyutları sıfırdan büyükse devam et
        if (iconWidth <= 0 || iconHeight <= 0) {
            System.out.println("Hata: İkon boyutları geçersiz.");
            return;
        }

        // GameFrame içeriğine erişim
        Container contentPane = frame.getContentPane();

        // Rastgele konumlar seç ve ikonları yerleştir
        for (int i = 0; i < 1; i++) { // Toplamda 6 ikon yerleştirilecek (2x2 = 4)
            int randRow;
            int randCol;

            randRow = random.nextInt(row - 1); // Satır indeksi

            randCol = random.nextInt(col - 1); // Sütun indeksi


            // 2x2'lik kare için 4 farklı JLabel bileşenine erişim
            JLabel label1 = (JLabel) contentPane.getComponent((randRow * col) + randCol);
            JLabel label2 = (JLabel) contentPane.getComponent((randRow * col) + randCol + 1);
            JLabel label3 = (JLabel) contentPane.getComponent((randRow + 1) * col + randCol);
            JLabel label4 = (JLabel) contentPane.getComponent((randRow + 1) * col + randCol + 1);


            // İkon boyutunu label boyutuna uyacak şekilde ayarla
            ImageIcon scaledIcon = new ImageIcon(icon.getImage().getScaledInstance(label1.getWidth(), label1.getHeight(), Image.SCALE_SMOOTH));

            // Her bir JLabel bileşenine ikonu yerleştir
            label1.setIcon(scaledIcon);
            label2.setIcon(scaledIcon);
            label3.setIcon(scaledIcon);
            label4.setIcon(scaledIcon);


            // Label'ların içeriğini temizleme işlemi opsiyoneldir
            // label1.setText("");
            // label2.setText("");
            // label3.setText("");
            // label4.setText("");
        }
    }

    public static void dag() {
        Random random = new Random();
        ImageIcon icon = new ImageIcon("C:\\intellij_myProject\\My2DGame\\HazineAviOyunu\\src\\source\\DagAna.png");
        ImageIcon icon1 = new ImageIcon("C:\\intellij_myProject\\My2DGame\\HazineAviOyunu\\src\\source\\Hava.png");

        // GameFrame içeriğine erişim
        Container contentPane = frame.getContentPane();

        // Rastgele bir başlangıç noktası seç

        int randRow = random.nextInt(4,row - 8); // 8 satır boyunca piramidi çizebilmek için
        int randCol = random.nextInt(8,col - 15); // 15 sütun boyunca piramidi çizebilmek için

        // Piramidin üst kısmını çiz
        for (int satir = 0; satir < 8; satir++) {
            for (int sutun = 0; sutun < satir * 2 + 1; sutun++) {
                JLabel label = (JLabel) contentPane.getComponent((randRow + satir) * col + randCol + satir - sutun);
                ImageIcon scaledIcon = new ImageIcon(icon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
                label.setIcon(scaledIcon);
            }
        }

        // Piramidin sol ve sağ kenarlarını çiz
       /* for (int satir = 0; satir < 8; satir++) {
            JLabel labelSol = (JLabel) contentPane.getComponent((randRow + satir) * col + randCol);
            JLabel labelSag = (JLabel) contentPane.getComponent((randRow + satir) * col + randCol + satir * 2);
            ImageIcon scaledIconSol = new ImageIcon(icon1.getImage().getScaledInstance(labelSol.getWidth(), labelSol.getHeight(), Image.SCALE_SMOOTH));
            ImageIcon scaledIconSag = new ImageIcon(icon1.getImage().getScaledInstance(labelSag.getWidth(), labelSag.getHeight(), Image.SCALE_SMOOTH));
            labelSol.setIcon(scaledIconSol);
            labelSag.setIcon(scaledIconSag);
        }*/
    }
}
