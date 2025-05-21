import javax.swing.*;

public class railwayregistrationform {
    public static void main(String[] args) {
        JFrame j1=new JFrame("-:Registration From:-");
        JLabel l1=new JLabel("User ID-");
        JLabel l2=new JLabel("Name-");
        JLabel l3=new JLabel("Mail-");
        JLabel l4=new JLabel("Mobile no-");
        JLabel l5=new JLabel("Address-");

        JTextField t1=new JTextField();
        JTextField t2=new JTextField();
        JTextField t3=new JTextField();
        JTextField t4=new JTextField();
        JTextField t5=new JTextField();

        JCheckBox c1=new JCheckBox("I agree");
        JButton jb1=new JButton("Submit");
        JButton jb2=new JButton("Reset");

        l1.setBounds(20,40,50,20);
        l2.setBounds(20,60,50,20);
        l3.setBounds(20,80,80,20);
        l4.setBounds(20,120,50,20);
        l5.setBounds(20,160,100,20);

        t1.setBounds(90,40,70,20);
        t2.setBounds(90,60,80,20);
        t3.setBounds(90,90,100,20);
        t4.setBounds(90,120,120,20);
        t5.setBounds(90,160,150,20);

        c1.setBounds(90,190,150,50);
        jb1.setBounds(120,250,90,20);
        jb2.setBounds(120,350,90,20);

        j1.add(l1);
        j1.add(t1);
        j1.add(l2);
        j1.add(t2);
        j1.add(l3);
        j1.add(t3);
        j1.add(l4);
        j1.add(t4);
        j1.add(l5);
        j1.add(t5);
        j1.add(c1);
        j1.add(jb1);
        j1.add(jb2);
        j1.setSize(400,800);
        j1.setLayout(null);
        j1.setVisible(true);
    }
}
