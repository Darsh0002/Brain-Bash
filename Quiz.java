import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz implements ActionListener {
    public static void main(String[] args) {
        new Quiz("User");
    }

    JFrame frm;
    String name;
    String[][] questions = new String[11][5];
    String[][] answers = new String[11][1];
    int score = 0, currQue = 1, countLifeline = 0;
    JLabel que, timeRemaining;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup grp;
    JButton lifeline, next, submit;
    Timer timer;
    int timeLeft = 15; // seconds

    Quiz(String name) {
        this.name = name;
        frm = new JFrame();
        frm.setLayout(null);
        frm.setLocation(180, 70);
        frm.setSize(1115, 600);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon img = new ImageIcon("images/Yellow_Purple_Bright_Cute_Study_Blog_YouTube_Banner_1_optimized.png");

        JLabel label = new JLabel(img);
        label.setBounds(0, 0, 1100, img.getIconHeight()); // set size and position

        questions[1][0] = "Who is the current President of the United States?";
        questions[1][1] = "Joe Biden";
        questions[1][2] = "Donald Trump";
        questions[1][3] = "Barack Obama";
        questions[1][4] = "Danny Morisson";

        questions[2][0] = "Who wrote the national anthem of India?";
        questions[2][1] = "Gandhiji";
        questions[2][2] = "Rabindranath Tagore";
        questions[2][3] = "Sarojini Naidu";
        questions[2][4] = "Subhas Chandra Bose";

        questions[3][0] = "Which is the longest river in the world?";
        questions[3][1] = "Amazon";
        questions[3][2] = "Ganga";
        questions[3][3] = "Nile";
        questions[3][4] = "Mississippi";

        questions[4][0] = "Who was the first indian to step on the Moon?";
        questions[4][1] = "Sunita Williams";
        questions[4][2] = "Neil Armstrong";
        questions[4][3] = "Rakesh Sharma";
        questions[4][4] = "Kalpana Chavla";

        questions[5][0] = "Which of the following is a marker interface in java?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Readable interface";
        questions[5][3] = "Remote interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "How many players are there in a cricket team (on-field) ??";
        questions[6][1] = "9";
        questions[6][2] = "11";
        questions[6][3] = "12";
        questions[6][4] = "10";

        questions[7][0] = "Which Indian is known as the Missile Man of India?";
        questions[7][1] = "Homi Bhabha";
        questions[7][2] = "Vikram Sarabhai";
        questions[7][3] = "A.P.J. Abdul Kalam";
        questions[7][4] = "Ratan Tata";

        questions[8][0] = "In which year did India gain independence?";
        questions[8][1] = "1948";
        questions[8][2] = "1947";
        questions[8][3] = "1946";
        questions[8][4] = "1950";

        questions[9][0] = "Which Indian state is known as the “Land of Five Rivers”?";
        questions[9][1] = "Rajasthan";
        questions[9][2] = "Haryana";
        questions[9][3] = "Punjab";
        questions[9][4] = "Gujarat";

        questions[10][0] = "What is the capital of India?";
        questions[10][1] = "Gujarat";
        questions[10][2] = "Mumbai";
        questions[10][3] = "Delhi";
        questions[10][4] = "Banglore";

        answers[1][0] = "Donald Trump";
        answers[2][0] = "Rabindranath Tagore";
        answers[3][0] = "Nile";
        answers[4][0] = "Rakesh Sharma";
        answers[5][0] = "Remote interface";
        answers[6][0] = "11";
        answers[7][0] = "A.P.J. Abdul Kalam";
        answers[8][0] = "1947";
        answers[9][0] = "Punjab";
        answers[10][0] = "Delhi";

        Font queFont = new Font("Bookman old style", Font.BOLD, 22);

        que = new JLabel();
        que.setFont(queFont);
        que.setBounds(25, 370, 750, 40);
        que.setBackground(Color.LIGHT_GRAY);
        que.setOpaque(true);

        Font optFont = new Font("Bookman old style", Font.PLAIN, 22);

        opt1 = new JRadioButton();
        opt1.setBounds(40, 420, 300, 30);
        opt1.setFont(optFont);
        opt1.setFocusable(false);

        opt2 = new JRadioButton();
        opt2.setBounds(40, 455, 300, 30);
        opt2.setFont(optFont);
        opt2.setFocusable(false);

        opt3 = new JRadioButton();
        opt3.setBounds(40, 490, 300, 30);
        opt3.setFont(optFont);
        opt3.setFocusable(false);

        opt4 = new JRadioButton();
        opt4.setBounds(40, 525, 300, 30);
        opt4.setFont(optFont);
        opt4.setFocusable(false);

        grp = new ButtonGroup();
        grp.add(opt1);
        grp.add(opt2);
        grp.add(opt3);
        grp.add(opt4);

        timeRemaining = new JLabel();
        timeRemaining.setFont(new Font("Bookman old style", Font.BOLD, 24));
        timeRemaining.setForeground(Color.red);
        timeRemaining.setBounds(475, 525, 300, 30);

        lifeline = new JButton("50-50 Lifeline");
        lifeline.setFont(optFont);
        lifeline.setBackground(new Color(16, 125, 172));
        lifeline.setForeground(Color.white);
        lifeline.setFocusable(false);
        lifeline.setBounds(835, 430, 200, 35);
        lifeline.addActionListener(this);

        next = new JButton("Next");
        next.setFocusable(false);
        next.setFont(queFont);
        next.setBackground(new Color(16, 125, 172));
        next.setForeground(Color.white);
        next.setBounds(835, 480, 200, 35);
        next.addActionListener(this);

        submit = new JButton("Submit");
        submit.setFocusable(false);
        submit.setFont(queFont);
        submit.setBackground(new Color(16, 125, 172));
        submit.setForeground(Color.white);
        submit.setBounds(835, 480, 200, 35);
        submit.addActionListener(this);

        printQue();

        frm.add(que);
        frm.add(opt1);
        frm.add(opt2);
        frm.add(opt3);
        frm.add(opt4);
        frm.add(timeRemaining);
        frm.add(lifeline);
        frm.add(next);
        frm.add(submit);
        submit.setVisible(false);
        frm.add(label);

        frm.setVisible(true);
    }

    public void printQue() {
        // if previous question was answered, reset the timer
        // and start a new one
        if (timer != null) {
            timer.stop();
        }
        startTimer();
        que.setText(currQue + ". " + questions[currQue][0]);// set question

        // set options
        opt1.setText(questions[currQue][1]);    
        opt2.setText(questions[currQue][2]);
        opt3.setText(questions[currQue][3]);
        opt4.setText(questions[currQue][4]);

        // if last question, show submit button
        // and hide next button
        if (currQue == 10) {
            next.setVisible(false);
            submit.setVisible(true);
        }
    }

    public void startTimer() {
        timeLeft = 14; // reset each time
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timeRemaining.setText("Time Remaining: " + timeLeft + " sec");
                timeLeft--;
                if (timeLeft < 0) {
                    timer.stop();
                    timeRemaining.setText("Time Limit Exceeded!!");
                    next.doClick();// auto move to next question or handle timeout
                }
            }
        });
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == lifeline) {
            // 50-50 lifeline
            // remove two wrong options
            // if not already used
            if (countLifeline == 0) {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
                countLifeline++;
            }
            // if already used, show message
            else {
                JOptionPane.showMessageDialog(frm, "You have already used the 50-50 Lifeline!\nCannot use now!!", "Lifeline Used", JOptionPane.WARNING_MESSAGE);
            }

        } else if (e.getSource() == next) {

            evaluateAnswer();// evaluate answer
            currQue++;
            grp.clearSelection();// clear previous selection

            // set all options enabled
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            printQue();

        } else if (e.getSource() == submit) {
            evaluateAnswer();// evaluate answer
            // show result
            frm.setVisible(false);
            new Result(score, name);
        }
    }

    public void evaluateAnswer() {
        String userSelection = null;
        if (opt1.isSelected()) userSelection = opt1.getText();
        else if (opt2.isSelected()) userSelection = opt2.getText();
        else if (opt3.isSelected()) userSelection = opt3.getText();
        else if (opt4.isSelected()) userSelection = opt4.getText();

        if (userSelection != null && userSelection.equals(answers[currQue][0])) {
            System.out.println(userSelection);
            score++;
        }
    }
}
