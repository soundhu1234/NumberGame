import java.util.Scanner;

class ATM {
    private Scanner scanner;
    private double balance;

    public ATM() {
        scanner = new Scanner(System.in);
        balance = 0.0; // Initialize balance to zero
    }

    public void displayOptions() {
        System.out.println("\nATM Menu");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void start() {
        int choice;
        do {
            displayOptions();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    withdraw();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 4);
    }

    private void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful");
        }
    }

    private void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else {
            balance += amount;
            System.out.println("Deposit successful");
        }
    }

    private void checkBalance() {
        System.out.println("Your balance is: $" + balance);
    }
}

public class SimpleATM {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.start();
    }
}

