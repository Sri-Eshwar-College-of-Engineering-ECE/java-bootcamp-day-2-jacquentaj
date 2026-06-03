import java.util.Scanner;

public class Student {
    String name;
    int rollNo;

    void display() {
        String college = "Sri Eshwar College of engineering";

        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("College: " + college);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter Name: ");
        s.name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        s.rollNo = sc.nextInt();

        s.display();
        
        sc.close();
    }
}