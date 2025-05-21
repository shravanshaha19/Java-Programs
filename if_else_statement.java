import java.util.Scanner;

public class if_else_statement {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();
        if (num>0)
        {
            System.out.println("Given number is positive");
        }
        else
        {
            System.out.println("The given number is negative");
        }
    }
}
