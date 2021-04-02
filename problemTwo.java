import java.util.Scanner;

public class problemTwo {

    static void area(float side){
        System.out.println("Area of Square : " + ( side * side ) );
    }

    static void area(float length,float breath){
        System.out.println("Area of Rectangle : " + ( length * breath ) );
    }

    static void area(double radius){
        System.out.println("Area of Circle : " + ( 3.13 * radius * radius ) );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length Of Square : ");
        float side = sc.nextFloat();
        System.out.print("Length and Breath Of Rectangle : ");
        float length = sc.nextFloat();
        float breath = sc.nextFloat();
        System.out.print("Radius Of Circle : ");
        double radius = sc.nextDouble();
        area(side);
        area(length,breath);
        area(radius);
    }
}
