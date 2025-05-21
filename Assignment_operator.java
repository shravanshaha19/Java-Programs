import java.util.Scanner;

public class Assignment_operator {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a two number:");
        a=sc.nextInt();
        b=sc.nextInt();
        a+=b;
        System.out.println("(a+=b)="+a);
        a-=b;
        System.out.println("(a-=b)="+a);
        a*=b;
        System.out.println("(a*=b)="+a);
        a/=b;
        System.out.println("(a/=b)="+a);
        a%=b;
        System.out.println("(a%=b)="+a);
    }
}
