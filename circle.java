import java.util.Scanner;

public class circle {
    int radius;

    void calculateArea() {
        double pi = 3.14;
        double area = pi * radius * radius;

        System.out.println("Radius = " + radius);
        System.out.println("Area = " + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        circle c = new circle();

        System.out.print("Enter Radius: ");
        c.radius = sc.nextInt();

        c.calculateArea();

        sc.close();
    }
}