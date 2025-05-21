import java.util.Scanner;

public class single_inheritance_Department {
    public String dept;
    int branchcode;
    Scanner sc=new Scanner(System.in);
    public void get1()
    {
        System.out.println("Enter Department:");
        dept= sc.next();
        System.out.println("Enter Branch Code:");
        branchcode= sc.nextInt();
    }
    public void disp1()
    {
        System.out.println("Enter Department:"+dept);
        System.out.println("Enter Branchcode:"+branchcode);
    }
};
