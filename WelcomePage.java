import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class WelcomePage implements ActionListener {

    public static void main(String[] args) {

        JFrame tempFrm = new JFrame();
        tempFrm.setLayout(null);
        tempFrm.setLocation(120, 70);
        tempFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon("images/White and Brown Minimalist Lesson Video Youtube Thumbnail.png");
        JLabel label = new JLabel(icon);
        label.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight()); // set size and position

        tempFrm.setSize(icon.getIconWidth() + 10, icon.getIconHeight() + 35);
        tempFrm.add(label);
        tempFrm.setVisible(true);

        try {
            Thread.sleep(2000);// image will show till 2 seconds
        } catch (Exception e) {
            System.out.println(e);
        }
        tempFrm.setVisible(false); // after 2 seconds, the image will be hidden
        new WelcomePage(); // then welcome page will be shown
    }

    JFrame frame;
    JTextField textField;
    JButton start, rules, exit;

    WelcomePage() {
        frame = new JFrame();
        frame.setLayout(null);
        frame.setLocation(220, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon img = new ImageIcon("images/Colorful Book Store Education Free Logo.png");
        JLabel imgLabel = new JLabel(img);
        imgLabel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight()); // set size and position

        JLabel welcome = new JLabel("Welcome!!");
        welcome.setFont(new Font("MV Boli", Font.BOLD, 35));
        welcome.setBounds(710, 25, 180, 70);

        JLabel name = new JLabel("Enter Your Name:");
        name.setBounds(510, 130, 300, 50);
        name.setFont(new Font("Times New Roman", Font.ITALIC, 24));

        textField = new JTextField();
        textField.setBounds(690, 137, 350, 33);
        textField.setFont(new Font("Times New Roman", Font.ITALIC, 25));

        start = new JButton("Start");
        start.setBounds(630, 230, 80, 30);
        start.setFocusable(false);// to remove the focus from the button
        start.addActionListener(this);

        rules = new JButton("See Rules");
        rules.setBounds(730, 230, 110, 30);
        rules.setFocusable(false);
        rules.addActionListener(this);

        exit = new JButton("Exit");
        exit.setBounds(860, 230, 80, 30);
        exit.setFocusable(false);
        exit.addActionListener(this);

        JLabel quote = new JLabel("\"The more you know, the more you grow.\"");
        quote.setBounds(580, 330, 500, 50);
        quote.setFont(new Font("Times New Roman", Font.ITALIC, 24));

        frame.add(imgLabel);
        frame.add(welcome);
        frame.add(name);
        frame.add(textField);
        frame.add(start);
        frame.add(rules);
        frame.add(exit);
        frame.add(quote);
        frame.setSize(1100, img.getIconHeight());
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start) {
            // Check if the text field is empty
            // If it is empty, show an error message
            if (textField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please enter your name first.", null, JOptionPane.ERROR_MESSAGE);
            }
            // If it is not empty, proceed to the next screen
            // and pass the name to the Quiz class
            else {
                frame.setVisible(false);
                new Quiz(textField.getText());
            }

        }
        // If the user clicks on the "See Rules" button, show the rules
        else if (e.getSource() == rules) {
            frame.setVisible(false);
            new Rules();
        } else if (e.getSource() == exit) {
            System.exit(0);
        }
    }
}