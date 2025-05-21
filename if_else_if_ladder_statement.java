import java.util.Scanner;

public class if_else_if_ladder_statement {
    public static void main(String[] args) {
        int pass,upi;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lock screen password:");
        pass=sc.nextInt();
        if (pass==2005)
        {
            System.out.println("Enter the upi:");
            upi = sc.nextInt();
            if (upi==1925)
            {
                System.out.println("Transaction succesfully");
            }
            else
            {
                System.out.println("Incorrect upi");
            }
        }
        else
        {
            System.out.println("Invalid password please enter valid password");
        }
    }
}
