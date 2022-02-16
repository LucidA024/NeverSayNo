import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
class MyFrame extends JFrame implements ActionListener{
    JLabel Mess;JButton buttonYes,  buttonNo;
    MyFrame(){
        this.setTitle("Try To Say No!");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setSize(500,500);
        this.setLocation(700,300);
        this.setLayout(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.black);
        buttonYes = new JButton("Yes");
        buttonYes.setFocusable(false);
        buttonYes.setBackground(Color.green);
        buttonYes.setBounds(100,100,95,30);
        buttonYes.addActionListener(this);
        buttonNo = new JButton("No");
        buttonNo.setFocusable(false);
        buttonNo.setBackground(Color.red);
        buttonNo.setBounds(300,100,95,30);
        buttonNo.addActionListener(this);
        this.add(buttonYes);
        this.add(buttonNo);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buttonNo){
            int min = 0;
            int max = 410;
            int x_int = (int)Math.floor(Math.random()*(max-min+1)+min);
            int y_int = (int)Math.floor(Math.random()*(max-min+1)+min);
            buttonNo.setBounds(x_int,y_int,95,30);
        }
        else if(e.getSource()==buttonYes){
            JOptionPane.showMessageDialog(null, "I Won!");
            System.exit(0);
        }
    }
}
public class TryToChooseNo {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "If You Choose Yes, I Win");
        new MyFrame();
    }
}
