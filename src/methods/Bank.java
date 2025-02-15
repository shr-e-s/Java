package methods;

public class Bank {

    static int currentBalance = 1000;

    public static void greetCustomer(){
        System.out.println("Hello !, Welcome to Online Banking");
    }

    public void depositAmount(int amount){
        currentBalance += amount;
        System.out.println(amount+" Deposited successfully");


    }
    public static void withdrawalAmount(int amount){
        currentBalance -= amount;
        System.out.println(amount+" Withdrawal successful");
    }
    public int getCurrentbalance(){
        return currentBalance;
    }

    public static void main(String[] args) {
        greetCustomer();
        Bank bank = new Bank();
        System.out.println("Current Balance is :"+bank.getCurrentbalance());
        bank.depositAmount(500);
        System.out.println("Current Balance is :"+bank.getCurrentbalance());
        withdrawalAmount(500);
        System.out.println("Current Balance is :"+bank.getCurrentbalance());
    }
}
