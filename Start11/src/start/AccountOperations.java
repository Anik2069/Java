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
public interface AccountOperations {
        void insertAccount(Account a);
	void removeAccount(Account a);
	Account getAccount(int accountNumber);
	void showAllAccounts( ); 
}
