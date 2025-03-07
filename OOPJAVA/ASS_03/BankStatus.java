import java.util.Scanner;

class BankAccount {
    double balance = 0; // Stores account balance

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount < balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Not enough balance!");
        }
    }

    void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}

// Main Class
public class BankStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount myAccount = new BankAccount();

        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        myAccount.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        myAccount.withdraw(withdrawAmount);

        myAccount.checkBalance(); // Check remaining balance

    }
}



// import java.util.Scanner;

// // BankAccount class
// class BankAccount {
//     private double balance = 0; // Stores account balance

//     void deposit(double amount) {
//         balance += amount;
//         System.out.println("Deposited: " + amount);
//     }

//     void withdraw(double amount) {
//         if (amount <= balance) {
//             balance -= amount;
//             System.out.println("Withdrawn: " + amount);
//         } else {
//             System.out.println(" Insufficient balance!");
//         }
//     }

//     void checkBalance() {
//         System.out.println(" Current balance: " + balance);
//     }
// }

// // Main Class with Menu
// public class BankStatus {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         BankAccount myAccount = new BankAccount();
//         int choice;

//         do {
//             System.out.println("=====  Bank Menu =====");
//             System.out.println("1. Deposit");
//             System.out.println("2. Withdraw");
//             System.out.println("3. Check Balance");
//             System.out.println("0. Exit");
//             System.out.print("Enter choice: ");
//             choice = sc.nextInt();

//             switch (choice) {
//                 case 1:
//                     System.out.print("Enter deposit amount: ");
//                     myAccount.deposit(sc.nextDouble());
//                     break;
//                 case 2:
//                     System.out.print("Enter withdrawal amount: ");
//                     myAccount.withdraw(sc.nextDouble());
//                     break;
//                 case 3:
//                     myAccount.checkBalance();
//                     break;
//                 case 0:
//                     System.out.println("Exiting... Thank you!");
//                     break;
//                 default:
//                     System.out.println(" Invalid choice! Try again.");
//             }
//         } while (choice != 0);

//         sc.close(); // Close Scanner
//     }
// }
