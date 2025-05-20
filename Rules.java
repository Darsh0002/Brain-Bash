import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Rules {

    Rules(){
        JFrame frm = new JFrame("BrainBash Quiz App - Rules");
        frm.setLocation(475, 100);
        frm.setLayout(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create text area with rules
        JTextArea rules = new JTextArea();
        rules.setText(
                "1. Read Carefully\n" +
                        "You will be provided total 10 questions.\n"+
                        "Each question has one correct answer.\n" +
                        "Take your time to read all the options before answering.\n\n" +
                        "2. Time Limit\n" +
                        "You have 15 seconds to answer each question.\n\n" +
                        "3. No Going Back\n" +
                        "Once you submit an answer, you cannot return to previous questions.\n\n" +
                        "4. One Attempt Only\n" +
                        "You get only one chance per quiz session. Choose wisely!\n\n" +
                        "5. Scoring System\n" +
                        "Correct answer: +1 point\n" +
                        "Wrong answer or timeout: 0 points\n" +
                        "No negative marking\n\n" +
                        "6. 50-50 Lifeline\n" +
                        "You can use the 50-50 Lifeline only once throughout the quiz.\n" +
                        "It will eliminate two wrong options, leaving one correct and one incorrect choice.\n" +
                        "Use it strategically!\n\n" +
                        "7. Instant Result\n" +
                        "You will get result after completing the quiz\n\n" +
                        "8. Fair Play\n" +
                        "No cheating! The goal is to challenge your own knowledge."
        );
        rules.setEditable(false);
        rules.setBounds(10, 10, 570, 555);
        rules.setLineWrap(true);// to wrap text
        rules.setFont(new Font("Arial", Font.PLAIN, 16));
        rules.setBackground(Color.LIGHT_GRAY);
        rules.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));


        JButton backBtn = new JButton("Back");
        backBtn.setBounds(230, 580, 100, 40);
        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frm.setVisible(false);
                new WelcomePage();
            }
        });

        frm.add(rules);
        frm.add(backBtn);
        frm.setSize(605, 670);
        frm.setVisible(true);
    }
    public static void main(String[] args) {
        new Rules();
    }
}
