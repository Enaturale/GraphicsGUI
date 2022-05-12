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
        firstnameTF.setBounds(105, 27, 120, 25);
        firstnameTF.setFont(new Font(null, Font.PLAIN, 15));        

        lastname = new JLabel("Last Name: ");
        lastname.setBounds(270, 20, 100, 40);
        lastname.setFont(new Font(null, Font.PLAIN, 15));

        lastnameTF = new JTextField();
        lastnameTF.setBounds(350, 27, 120, 25);
        lastnameTF.setFont(new Font(null, Font.PLAIN, 15));

        studnetID = new JLabel("Student ID:");
        studnetID.setBounds(25, 90, 100, 40);
        studnetID.setFont(new Font(null, Font.PLAIN, 15));        

        studentIdTF = new JTextField();
        studentIdTF.setBounds(105, 98, 120, 25);
        studentIdTF.setFont(new Font(null, Font.PLAIN, 15)); 

        phone = new JLabel("Phone No: ");
        phone.setBounds(25, 160, 100, 40);
        phone.setFont(new Font(null, Font.PLAIN, 15));  
        

        phoneTF = new JTextField();
        phoneTF.setBounds(105, 168, 120, 25);
        phoneTF.setFont(new Font(null, Font.PLAIN, 15)); 

        address = new JLabel("Address:");
        address.setBounds(25, 230, 100, 40);
        address.setFont(new Font(null, Font.PLAIN, 15));   

        addresTF = new JTextField();
        addresTF.setBounds(105, 238, 120, 25);
        addresTF.setFont(new Font(null, Font.PLAIN, 15)); 

        gender = new JLabel("Gender: ");
        gender.setBounds(270, 90, 100, 40);
        gender.setFont(new Font(null, Font.PLAIN, 15));


        genderPick = new JComboBox<>(new Object[] {"Male", "Female"});
        genderPick.setBounds(350, 98, 120, 30);
        genderPick.setFont(new Font(null, Font.PLAIN, 15));

        level = new JLabel("Level: ");
        level.setBounds(270, 160, 100, 40);
        level.setFont(new Font(null, Font.PLAIN, 15));

        levelPick = new JComboBox<>(new Object[] {"Part 1", "Part 2", "Part 3", "Part 4", "Part 5"});
        levelPick.setBounds(350, 168, 120, 30);
        levelPick.setFont(new Font(null, Font.PLAIN, 15));

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
