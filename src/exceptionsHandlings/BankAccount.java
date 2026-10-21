package exceptionsHandlings;

import javax.naming.InsufficientResourcesException;

public class BankAccount {
    private double balance;

    public void withdraw(double amount) throws InsufficientResourcesException {
        if(amount > balance){
            throw new InsufficientResourcesException("Withdraw amount exceeds Balance!");
        }
        balance -= amount;

    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        try{
            bankAccount.withdraw(100);
        }catch (InsufficientResourcesException e){
            System.out.println("Error" + e.getMessage());
        }finally {
            System.out.println("Transaction complete!");
        }
    }

    class InsufficientResourcesException extends Exception{
        public InsufficientResourcesException(String message){
            super(message);
        }
    }

}
