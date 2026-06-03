import java.util.Scanner;

public class Employee {
    int basicSalary;

    void calculateSalary() {
        int bonus = 5000;
        int totalSalary = basicSalary + bonus;

        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e = new Employee();

        System.out.print("Enter Basic Salary: ");
        e.basicSalary = sc.nextInt();

        e.calculateSalary();

        sc.close();
    }
}