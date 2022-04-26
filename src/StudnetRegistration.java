import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.*;
import java.awt.*;

public class StudnetRegistration implements ActionListener {
    JFrame frame;
    JLabel title;
    JLabel firstname, lastname, gender, studnetID, phone, address, level;
    JTextField firstnameTF, lastnameTF, phoneTF, studentIdTF, addresTF;
    JComboBox genderPick, levelPick;

    JPanel panelButtons, form;

    JButton save, edit, reset, close;


    StudnetRegistration(){
        frame = new JFrame("Student Registration");
        frame.setSize(650, 650);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        title = new JLabel("Student Registration");
        title.setBounds(200, 40, 200, 50);
        title.setFont(new Font(null, Font.BOLD, 20));

         //form with panel
        form = new JPanel();
        form.setLayout(null);
        form.setSize(500, 340);
        form.setBackground(Color.LIGHT_GRAY);
        form.setBounds(70, 100, 500, 340);

        firstname = new JLabel("First Name:");
        firstname.setBounds(25, 20, 100, 40);
        firstname.setFont(new Font(null, Font.PLAIN, 15));
        
        firstnameTF = new JTextField();
        firstnameTF.setBounds(120, 27, 120, 25);
        firstnameTF.setFont(new Font(null, Font.PLAIN, 15));        

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

        form.add(firstname);
        form.add(firstnameTF);
        form.add(lastname);
        form.add(lastnameTF);
        form.add(phone);
        form.add(phoneTF);
        form.add(address);
        form.add(addresTF);
        form.add(gender);
        form.add(genderPick);
        form.add(studnetID);
        form.add(studentIdTF);
        form.add(level);
        form.add(levelPick);

       


        //footer panel with Buttons

        panelButtons = new JPanel();
        panelButtons.setLayout(null);
        panelButtons.setSize(200, 200);
        panelButtons.setBackground(Color.LIGHT_GRAY);
        panelButtons.setBounds(130, 470, 400, 70);

        save = new JButton("Save");
        save.setBackground(Color.GREEN);
        save.setForeground(Color.WHITE);
        save.setBounds(15, 20, 70, 25);


        edit = new JButton("Edit");
        edit.setBounds(110, 20, 70, 25);

        reset = new JButton("Reset");
        reset.setBounds(220, 20, 70, 25);


        close = new JButton("Close");
        close.setBounds(310, 20, 70, 25);
        close.setBackground(Color.RED);
        close.setForeground(Color.WHITE);

        panelButtons.add(save);
        panelButtons.add(edit);
        panelButtons.add(reset);
        panelButtons.add(close);

        frame.add(title);
        frame.add(panelButtons);
        frame.add(form);

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
