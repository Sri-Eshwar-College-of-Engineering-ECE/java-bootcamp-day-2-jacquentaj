import java.util.Scanner;

public class bankaccount{
    int balance;

    void deposit() {
        Scanner scanner = new Scanner(System.in);

        int depositAmount;

        System.out.print("Enter Deposit Amount: ");
        depositAmount = scanner.nextInt();

        System.out.println("Current Balance: " + balance);

        balance = balance + depositAmount;

        System.out.println("Updated Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        bankaccount b = new bankaccount();

        System.out.print("Enter Current Balance: ");
        b.balance = scanner.nextInt();

        b.deposit();

        scanner.close();
    }
}