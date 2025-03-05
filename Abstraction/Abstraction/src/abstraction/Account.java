package abstraction;

public abstract class Account {
    private String accountHolderName;
    private double balance;

    public abstract void AccountNumber();

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void detail(){
        System.out.println("Account Holder Name:"+this.accountHolderName);
        System.out.println("Balance in your account is:"+this.balance);
    }
}
