import java.util.Scanner;

public class rectangle {
    int length;
    int breadth;

    void findArea() {
        int area = length * breadth;

        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Area = " + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        rectangle r = new rectangle();

        System.out.print("Enter Length: ");
        r.length = sc.nextInt();

        System.out.print("Enter Breadth: ");
        r.breadth = sc.nextInt();

        r.findArea();

        sc.close();
    }
}