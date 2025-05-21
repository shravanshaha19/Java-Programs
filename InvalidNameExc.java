import javax.naming.InvalidNameException;
import java.util.Scanner;
class InvalidNameEx extends Exception{
    public InvalidNameEx(String message){
        super(message);
    }
}
public class InvalidNameExc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name:");
        String name=sc.nextLine();
        sc.close();
        try {
            validateName(name);
            System.out.println("Employee name="+name);
        }catch (InvalidNameException e){
            System.out.println(e.getMessage());
        }
    }

    public static void validateName(String name) throws InvalidNameException{
        for (int i=0;i<name.length();i++)
        {
            char ch=name.charAt(i);
            if (!Character.isLetter(ch))
            {
                throw new InvalidNameException("Name is Invalid");
            }
        }
    }
}
