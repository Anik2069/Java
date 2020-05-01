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
public class FixedAccount {
    int tenureYear; 
    int accountNumber;
    double balance;
    void setTenureYear(int tenureYear)
    {
    this.tenureYear=tenureYear;
    }
    int getTenureYear( )
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
       
        void showInfo( )
        {
        System.out.println("Tenure Year:"+tenureYear);
        System.out.println("Account Number:"+accountNumber);
        System.out.println("Account Balance:"+balance);
        }
}
