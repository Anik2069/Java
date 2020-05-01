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
public interface ITransactionsInterface {
        void deposit(double amount);
	void withdraw(double amount);
	void transfer(Account a, double amount);
}
