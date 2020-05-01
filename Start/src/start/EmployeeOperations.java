/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

/**
 *
 * @author Anik
 */
public interface EmployeeOperations {
     void insertEmployee(Employee e);
	void removeEmployee(Employee e);
	Employee getEmployee(int empId);
	void showAllEmployees( ); 
}
