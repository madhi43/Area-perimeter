import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of length :");
        double l=Double.parseDouble(sc.nextLine());
        System.out.println("Enter the value of breadth :");
        double b=Double.parseDouble(sc.nextLine());
        rectangle r1=new rectangle(l,b);
        System.out.println("Area of rectangle :");
        System.out.println(r1.calculateArea());
        System.out.println("Perimeter of rectangle :");
        System.out.println(r1.calculateperimeter());
    }
}
class rectangle{
    double length,breadth;
    public rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    double calculateArea(){
        return (length*breadth);
    }
    double calculateperimeter(){
        return (2*(length+breadth));
    }
}