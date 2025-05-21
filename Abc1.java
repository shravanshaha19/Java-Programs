import javax.swing.*;

public class Abc1
{
    public static void main(String[] args)
    {
        JFrame j1=new JFrame("BANK RECEIPT");
        JLabel l1=new JLabel("Reference Number: ");
        l1.setBounds(40, 30, 200, 20);
        JTextField t1 = new JTextField();
        t1.setBounds(160, 30, 100, 20);
        JLabel l2=new JLabel("TRANSFER TO : ");
        l2.setBounds(40,60,300,20);
        JTextField t2=new JTextField();
        t2.setBounds(160,60,150,20);
        JLabel l3=new JLabel("ACCOUNT TYPE: ");
        l3.setBounds(40,90,400,20);
        JTextField t3=new JTextField();
        t3.setBounds(160,90,200,20);
        JLabel l4=new JLabel("Account NO: ");
        l4.setBounds(40,120,500,20);
        JTextField t4=new JTextField();
        t4.setBounds(160,120,250,20);
        JLabel l5=new JLabel("ACCOUNT NAME: ");
        l5.setBounds(40,150,600,20);
        JTextField t5=new JTextField();
        t5.setBounds(160,150,300,20);
        JLabel l6=new JLabel("TRANSFER FROM: ");
        l6.setBounds(40,180,700,20);
        JTextField t6=new JTextField();
        t6.setBounds(160,180,350,20);
        JLabel l7=new JLabel("AMOUNT: ");
        l7.setBounds(40,210,800,20);
        JTextField t7=new JTextField();
        t7.setBounds(160,210,400,20);
        JLabel l8=new JLabel("TRANSFER WHEN: ");
        l8.setBounds(40,240,900,20);
        JTextField t8=new JTextField();
        t8.setBounds(160,240,450,20);
        JLabel l9=new JLabel("PURPOSE: ");
        l9.setBounds(40,270,1000,20);
        JTextField t9=new JTextField();
        t9.setBounds(160,270,500,20);
        JLabel l=new JLabel("");
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
        j1.add(l6);
        j1.add(t6);
        j1.add(l7);
        j1.add(t7);
        j1.add(l8);
        j1.add(t8);
        j1.add(l9);
        j1.add(t9);
        j1.add(l);
        j1.setVisible(true);
        j1.setSize(400,600);
        j1.setLayout(null);
    }
}