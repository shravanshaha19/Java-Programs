import java.util.Scanner;

public class Multilevel_inher_Hero extends Multilevel_inher_Maruti{
    public String name,vehicletype,colour;
    int price,speed;
    Scanner sc=new Scanner(System.in);
    public void get3()
    {
        System.out.println("Enter Bike Name:");
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
    public void display3()
    {
        System.out.println("Enter Bike Name:"+name);

        System.out.println("Enter Vehicle Type:"+vehicletype);

        System.out.println("Enter Colour:"+colour);

        System.out.println("Enter Price:"+price);

        System.out.println("Enter Speed:"+speed);
    }

    public static void main(String[] args)
    {
        Multilevel_inher_Hero h1=new Multilevel_inher_Hero();
        h1.get1();
        h1.get2();
        h1.get3();
        h1.display1();
        h1.display2();
        h1.display3();
    }
}
