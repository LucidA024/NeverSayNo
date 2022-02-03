import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

class ActionEventDemo implements ActionListener {
    JFrame root = new JFrame();
    JButton buttyes = new JButton("Yes");
    JButton buttno = new JButton("No");
    ActionEventDemo(){
        prepareGUI();
        buttonyes();
        buttonno();
    }
    public void prepareGUI(){
        root.setTitle("Try To Say No!");
        root.setSize(500, 500);
        root.setLocation(700,300);
        root.setVisible(true);
        root.setLayout(null);
        root.setResizable(false);
        root.getContentPane().setBackground(Color.black);
    }
    public void buttonyes(){
        buttyes.setBounds(100,100,95,30);
        buttyes.setBackground(Color.green);
        buttyes.addActionListener(e -> IWonAndImOut());
        root.add(buttyes);
    }
    public void buttonno(){
        buttno.setBounds(300,100,95,30);
        buttno.setBackground(Color.red);
        buttno.addActionListener(this);
        root.add(buttno);
    }
    public void IWonAndImOut(){
        JOptionPane.showMessageDialog(null, "I Won!");
        System.exit(0);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int min = 0;
        int max = 410;
        int x_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        int y_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        buttno.setBounds(x_int,y_int,95,30);
    }
}
public class TryToChooseNo {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "If You Choose Yes, I Win");
        new ActionEventDemo();
    }
}
