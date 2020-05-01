/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

/**
 *
 * @author Rasel Ahmed
 */
public abstract  class Account implements ITransactions{
    int accountNumber;
    double balance;
  
    abstract void setAccountNumber(int accountNumber);
    abstract void setBalance(double balance);
    abstract int getAccountNumber();
    abstract double getBalance();
    Account(){
    System.out.println("Defalt constractor");
    }
    Account(int accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void deposit(double amount)
        {
        balance=balance+amount;
        System.out.println("BDT"+amount+"Deposit Sussessfully!!\n total balance "+balance);
        }
	public void withdraw(double amount)
        {
        balance=balance-amount;
        System.out.println("BDT"+amount+"Withdraw Sussessfully!!\n total balance "+balance);
        }
	public void transfer(Account a, double amount)
        {
            if(balance>=0){
                a.balance=a.balance+amount;
                balance=balance-amount;
                System.out.println("Transfer your Balance");
            }
}
       public void showInfo( )
        {
        System.out.println("Account Number:"+accountNumber);
        System.out.println("Account Balance:"+balance);
        }

}
