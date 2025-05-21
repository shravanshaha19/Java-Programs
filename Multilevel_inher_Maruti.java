import java.util.Scanner;

public class Multilevel_inher_Maruti extends Multilevel_inheritance_Car{
    public String name,vehicletype,colour;
    int price,speed;
    Scanner sc=new Scanner(System.in);
    public void get2()
    {
        System.out.println("Enter Car Name:");
        name= sc.next();

        System.out.println("Enter Vehicle Type:");
        vehicletype= sc.next();

        System.out.println("Enter Colour:");
        colour= sc.next();

        System.out.println("Enter Price:");
        price= sc.nextInt();

        System.out.println("Enter Speed:");
        speed= sc.nextInt();
    }
    public void display2()
    {
        System.out.println("Enter Car Name:"+name);

        System.out.println("Enter Vehicle Type:"+vehicletype);

        System.out.println("Enter Colour:"+colour);

        System.out.println("Enter Price:"+price);

        System.out.println("Enter Speed:"+speed);
    }
}
