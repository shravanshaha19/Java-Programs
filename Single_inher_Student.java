import java.util.Scanner;

public class Single_inher_Student extends single_inheritance_Department {
    String name,department;
    int rollno,branchcode;
    long mobno;
    Scanner sc=new Scanner(System.in);

    public void get2()
    {
        System.out.println("Enter Name:");
        name=sc.next();

        System.out.println("Enter Roll no:");
        rollno= sc.nextInt();

        System.out.println("Enter Branchcode:");
        branchcode= sc.nextInt();

        System.out.println("Enter Mobile no:");
        mobno= sc.nextLong();
    }
        public void disp2()
        {
            System.out.println("Enter Student Name:"+name);

            System.out.println("Enter Roll no:"+rollno);

            System.out.println("Enter Branchcode:"+branchcode);

            System.out.println("Enter Mobile no:"+mobno);
        }

    public static void main(String[] args) {
        Single_inher_Student s1=new Single_inher_Student();
        s1.get1();
        s1.disp1();
        s1.get2();
        s1.disp2();
    }
}
