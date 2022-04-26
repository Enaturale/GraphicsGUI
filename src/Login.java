import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Login implements ActionListener{    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel email = new JLabel("Email: ");
        email.setBounds(40, 20, 100, 100);
        email.setFont(new Font(null, Font.BOLD, 20));

        JTextField emailText = new JTextField(); 
        emailText.setBounds(200, 53, 200, 30);
        emailText.setFont(new Font(null, Font.ITALIC, 20));

        JLabel password = new JLabel("Password: ");
        password.setBounds(40, 70, 170, 100);
        password.setFont(new Font(null, Font.BOLD, 20));

        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(200, 103, 200, 30);
        passwordText.setFont(new Font(null, Font.ITALIC, 20));


        JButton login = new JButton("Login");
        login.setBounds(200, 170, 100, 30);
        login.setForeground(Color.WHITE);
        login.setBackground(Color.GREEN);
        login.setFont(new Font(null, Font.BOLD, 20));
        login.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                JOptionPane.showMessageDialog(null, "Login  Successful"); 
                frame.dispose();
                Dashboard dashboard = new Dashboard();
            }

        });




        frame.add(email);
        frame.add(password);
        frame.add(emailText);
        frame.add(passwordText);
        frame.add(login);



        frame.setVisible(true);
        
        

        
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
