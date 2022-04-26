import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.*;

public class Dashboard implements ActionListener {
    JButton student, teacher;
    JPanel panel;
    JLabel dashboard, question;
    JFrame frame;

    Dashboard(){
        
        frame = new JFrame("Dashbaord");

        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.DARK_GRAY);
        panel.setBounds(0,0, 500, 500);

        dashboard = new JLabel("Dashboard");
        dashboard.setForeground(Color.WHITE);
        dashboard.setFont(new Font(null, Font.BOLD, 30));
        dashboard.setBounds(150, 90, 200, 30);

        question = new JLabel("I am a: ");
        question.setBounds(100, 230, 200, 30);
        question.setFont(new Font(null, Font.PLAIN, 20));
        question.setForeground(Color.WHITE);

        student = new JButton("Student");
        student.setBounds(230, 190, 100, 30);
        student.addActionListener(this);

        teacher = new JButton("Teacher");
        teacher.setBounds(230, 270, 100, 30);




        panel.add(dashboard);
        panel.add(question);
        panel.add(student);
        panel.add(teacher);
        frame.add(panel);                

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        if(e.getSource() == student){
        StudnetRegistration studentreg = new StudnetRegistration();
        frame.dispose();

        }
        
    }    
}
