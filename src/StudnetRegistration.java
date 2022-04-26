import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.*;

public class StudnetRegistration implements ActionListener {
    JFrame frame;
    JLabel title;
    JLabel firstname, lastname, gender, studnetID, phone, address, level;
    JTextField firstnameTF, lastnameTF, phoneTF, studentIdTF, addresTF;
    JComboBox genderPick, levelPick;

    JButton save, edit, reset, close;


    StudnetRegistration(){
        frame = new JFrame("Student Registration");
        frame.setSize(650, 650);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        title = new JLabel("Student Registration");
        title.setBounds(200, 50, 200, 50);
        title.setFont(new Font(null, Font.BOLD, 20));

        firstname = new JLabel("First Name:");
        firstnameTF = new JTextField();

        lastname = new JLabel("Last Name: ");
        lastnameTF = new JTextField();

        studnetID = new JLabel("Student ID:");
        studentIdTF = new JTextField();

        phone = new JLabel("Phone No: ");
        phoneTF = new JTextField();

        address = new JLabel("Address:");
        addresTF = new JTextField();

        gender = new JLabel("Gender: ");
        genderPick = new JComboBox<>(new Object[] {"Male", "Gender"});

        level = new JLabel("Level: ");
        levelPick = new JComboBox<>(new Object[] {"Part 1", "Part 2", "Part 3", "Part 4", "Part 5"});



        frame.add(title);

        frame.setVisible(true);
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == close){
            frame.dispose();
        }

        if(e.getSource() == save){
            JOptionPane.showMessageDialog(null, "Student Registered");
        }

        if(e.getSource() == reset){
            JOptionPane.showConfirmDialog(null, "Are you sure?");
        }
        
    }
    
}
