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
public class SavingsAccount extends Account{
        double interestRate;
       
        SavingsAccount(){
        System.out.println("Defalt Constractor Called");
        }

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccount(double interestRate, int accountNumber, double balance) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
       
        void setInterestRate(double interestRate)
        {
        this.interestRate=interestRate;
        }
        double getInterestRate( ) 
        {
        return interestRate;
        }
        
	void setAccountNumber(int accountNumber)
        {
        this.accountNumber=accountNumber;
        }
	void setBalance(double balance)
        {
        this.balance=balance;
        }
	int getAccountNumber( )
        {
        return accountNumber;
        }
	double getBalance( )
        {
        return balance;
        }
	
       
        public void showInfo( )
        {
         System.out.println("Tenure Year:"+interestRate);
         System.out.println("Account Number:"+accountNumber);
         System.out.println("Account Balance:"+balance);
        }
}
