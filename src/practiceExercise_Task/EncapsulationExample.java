package practiceExercise_Task;

//Encapsulation is the process of hiding the internal implementation details of a class and only exposing a controlled interface. It is achieved by using private variables and public getter/setter methods.
class BankAccount {
    private double balance; // Private variable

    // Constructor
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Getter method
    public double getBalance() {
        return balance;
    }

    // Setter method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(5000);
        myAccount.deposit(1500);
        myAccount.deposit(2000);
        System.out.println("Current Balance: " + myAccount.getBalance());
    }
}
