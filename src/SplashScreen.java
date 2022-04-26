import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

public class SplashScreen implements MouseListener {
    JFrame frame;
    JPanel panel;
    JLabel nameofBusiness, ProgressStatus;
    JProgressBar progress;

    SplashScreen(){
        frame = new JFrame("Welcome");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setSize(700, 700);
        panel.setBackground(Color.DARK_GRAY);
        panel.setForeground(Color.WHITE);



        nameofBusiness = new JLabel("Ade's Group of Schools");
        nameofBusiness.setBounds(130, 200, 400, 50);
        nameofBusiness.setForeground(Color.WHITE);
        nameofBusiness.setFont(new Font(null, Font.BOLD, 30));
        nameofBusiness.addMouseListener(this);

        ProgressStatus = new JLabel("% Loading");
        ProgressStatus.setBounds(230, 480, 200, 30);
        ProgressStatus.setForeground(Color.WHITE);
        ProgressStatus.setFont(new Font(null, Font.BOLD, 20));

        progress = new JProgressBar();
        progress.setBounds(0, 530, 600, 30);


        panel.add(nameofBusiness, JLabel.CENTER);
        panel.add(ProgressStatus);
        panel.add(progress);

        frame.add(panel);
        frame.setVisible(true);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        // if(e.getSource() == nameofBusiness){
        //     Dashboard dashboard = new Dashboard();
        //     frame.dispose();
        // }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    
    
}
