abstract class Account {
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    abstract double getBalance();
}

class SavingsAccount extends Account {
    private double balance;

    SavingsAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "円を入金しました。");
        } else {
            System.out.println("入金額は正の数である必要があります。");
        }
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + "円を出金しました。");
        } else {
            System.out.println("残高不足または不正な金額です。");
        }
    }

    @Override
    double getBalance() {
        return balance;
    }
}

public class Q9 {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(0);
        account.deposit(1000); 
        account.withdraw(500); 
        System.out.println("現在の残高: " + account.getBalance() + "円");
    }
}

