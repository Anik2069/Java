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
public class FixedAccount extends Account{
    int tenureYear; 
    int accountNumber;
    double balance;
   
    FixedAccount(){
    System.out.println("Defalt Constractor");
    }
    public FixedAccount( int accountNumber, double balance){
        super.accountNumber=accountNumber;
        super.balance=balance;
        this.tenureYear=tenureYear;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    void setTenureYear(int tenureYear)
    {
    this.tenureYear=tenureYear;
    }
    int getTenureYear()
    {
    return tenureYear;
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
        System.out.println("Account Number:"+accountNumber);
        System.out.println("Tenure Year:"+tenureYear);
        System.out.println("Account Balance:"+balance);
        }
}
