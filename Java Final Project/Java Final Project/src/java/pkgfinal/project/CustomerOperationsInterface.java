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
public interface CustomerOperationsInterface {
        void insertCustomer(Customer c);
	void removeCustomer(Customer c);
	Customer getCustomer(int nid);
	void showAllCustomers( ); 
}
