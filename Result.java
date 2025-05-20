import java.awt.*;
import javax.swing.*;

public class Result {

    JProgressBar bar; // to show progress
    JLabel showScore;
    Result(int score, String name) {
        JFrame frm = new JFrame("Result");
        frm.setLayout(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLocation(420, 80);

        ImageIcon img = new ImageIcon("images/1599537743phpJGzss4.jpeg");
        JLabel imgLabel = new JLabel(img);
        imgLabel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());

        frm.setSize(img.getIconWidth() + 40, 200 + img.getIconHeight());
        frm.getContentPane().setBackground(Color.WHITE);

        bar = new JProgressBar();
        bar.setBounds(100,350,460,50);
        bar.setValue(0);
        bar.setString("Calculating Score...");
        bar.setStringPainted(true);
        bar.setFont(new Font("Tahoma", Font.BOLD,23));
        bar.setBackground(Color.LIGHT_GRAY);
        bar.setForeground(new Color(16,125,172));

        frm.add(bar);

        showScore = new JLabel("Your Score: " + score + " / 10");
        showScore.setFont(new Font("Californian FB", Font.BOLD,35));
        showScore.setBounds(190,350,700,35);
        showScore.setForeground(new Color(16,125,172));
        showScore.setVisible(false);

        JLabel thanks = new JLabel("Thank you! " + name + " for playing Brain Bash");
        thanks.setBounds(35,450,700,35);
        thanks.setFont(new Font("Californian FB", Font.BOLD,35));

        frm.add(showScore);
        frm.add(thanks);
        frm.add(imgLabel);
        frm.setVisible(true);
        fill();
    }

    public void fill() {
        Timer timer = new Timer(25, null); // 25 ms delay
        final int[] i = {0};

        timer.addActionListener(e -> {
            bar.setValue(i[0]++);
            if (i[0] > 100) {
                timer.stop();
                bar.setVisible(false);
                showScore.setVisible(true);
            }
        });

        timer.start();
    }


    public static void main(String[] args) {
        new Result(7, "User");
    }
}
