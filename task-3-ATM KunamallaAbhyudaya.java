import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(5000);

        int choice = 0;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next();
                continue;
            }

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.printf("Current Balance: ₹%.2f%n",
                            account.getBalance());
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ₹");
                    if (sc.hasNextDouble()) {
                        account.deposit(sc.nextDouble());
                    } else {
                        System.out.println("Invalid amount.");
                        sc.next();
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ₹");
                    if (sc.hasNextDouble()) {
                        account.withdraw(sc.nextDouble());
                    } else {
                        System.out.println("Invalid amount.");
                        sc.next();
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}