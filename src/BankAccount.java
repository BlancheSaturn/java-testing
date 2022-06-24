public class BankAccount {

    private String nameOfAccount;
    private double balance;

    public BankAccount(String nameOfAccount, double balance) {
        this.nameOfAccount = nameOfAccount;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "nameOfAccount='" + nameOfAccount + '\'' +
                ", balance=" + balance +
                '}';
    }

    public String getNameOfAccount() {
        return nameOfAccount;
    }

    public double getBalance() {
        return balance;
    }

    // withdraw method
    public void withdraw(double amount) {
        if(amount > this.balance) {
           // System.out.println("Insufficient Funds");
            throw new IllegalArgumentException("Illegal Instruction - you cannot withdraw funds in excess of your balance");
        } else if (amount < 0.0) {
//            System.out.println("Cannot withdraw negative amount");
        } else {
            this.balance -= amount;
        }
    }

    // deposit method
    public void deposit(double amount) {
        if (amount < 0.0) {
//            System.out.println("Cannot deposit negative amounts");
        } else {
            this.balance += amount;
        }
    }
}
