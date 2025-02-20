import java.util.Scanner;

public class MobileBudgeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = 0, totalExpenses = 0;

        while (true) {
            System.out.println("\nMobile Budgeting App");
            System.out.println("1. Set Budget");
            System.out.println("2. Add Expense");
            System.out.println("3. View Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter your total budget: ₹");
                    budget = scanner.nextDouble();
                    totalExpenses = 0; // Reset expenses when budget is set
                    System.out.println("Budget set successfully!");
                    break;
                case 2:
                    System.out.print("Enter expense amount: ₹");
                    double expense = scanner.nextDouble();
                    if (expense <= (budget - totalExpenses)) {
                        totalExpenses += expense;
                        System.out.println("Expense of ₹" + expense + " added!");
                    } else {
                        System.out.println("Not enough balance!");
                    }
                    break;
                case 3:
                    double remainingBalance = budget - totalExpenses;
                    System.out.println("\n Budget: ₹" + budget);
                    System.out.println(" Total Expenses: ₹" + totalExpenses);
                    System.out.println(" Remaining Balance: ₹" + remainingBalance);
                    break;
                case 4:
                    System.out.println(" Exiting. Have a great day!");
                    scanner.close();
                    return;
                default:
                    System.out.println(" Invalid choice! Try again.");
            }
        }
    }
}
