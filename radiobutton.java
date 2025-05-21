import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class radiobutton {
    public static void main(String[] args) {
        JFrame j1=new JFrame("Radio button");
        JLabel l1=new JLabel("**Select Your Gender**");
        l1.setBounds(30,30,150,30);
        JRadioButton jr1=new JRadioButton("Male");
        jr1.setBounds(30,70,105,30);
        JRadioButton jr2=new JRadioButton("Female");
        jr2.setBounds(30,120,105,30);
        JButton jb1=new JButton("Click");
        jb1.setBounds(30,150,105,30);
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(jr1.isSelected())
                {
                    JOptionPane.showMessageDialog(jb1,"You are Male");
                }
                else if(jr2.isSelected())
                {
                    JOptionPane.showMessageDialog(jb1,"You are Female");
                }
                else
                {
                    JOptionPane.showMessageDialog(jb1,"You could not select Option");
                }
            }
        });
        JLabel l=new JLabel("");
        j1.add(l1);
        j1.add(jr1);
        j1.add(jr2);
        j1.add(jb1);
        j1.add(l);
        j1.setVisible(true);
        j1.setSize(400,600);
        j1.setLayout(null);
    }
}
