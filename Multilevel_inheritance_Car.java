import java.util.Scanner;

public class Multilevel_inheritance_Car {
    public  String name,vehicletype;
    Scanner sc=new Scanner(System.in);

    public void get1()
    {
        System.out.println("Enter Car Name:");
        name=sc.next();
        System.out.println("Enter Vehicle Type:");
        vehicletype= sc.next();
    }
    public void display1()
    {
        System.out.println("Enter Car Name:"+name);
        System.out.println("Enter Vehicle Type:"+vehicletype);
    }
};
