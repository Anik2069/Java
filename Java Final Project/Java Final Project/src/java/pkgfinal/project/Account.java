/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.pkgfinal.project;

/**
 *
 * @author Rasel Ahmed
 */
public abstract class Account implements ITransactionsInterface {
        int accountNumber;
	double balance;
   
	abstract void setAccountNumber(int accountNumber);
	abstract void setBalance(double balance);
	abstract int getAccountNumber( );
	abstract double getBalance( );
	abstract void showInfo( ); 
        public void deposit(double amount)
        {
        balance=balance+amount;
        System.out.println("BDT"+amount+"Deposit Sussessfully!!");
        }
	public void withdraw(double amount)
        {
        balance=balance-amount;
        System.out.println("BDT"+amount+"Withdraw Sussessfully!!");
        }
	public void transfer(Account a, double amount)
        {
            if(balance>=0){
                a.balance=a.balance+amount;
                balance=balance-amount;
                System.out.println("Transfer your Balance");
            }
        
        } 
}
