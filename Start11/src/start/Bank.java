/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

import java.util.Arrays;

/**
 *
 * @author Rasel Ahmed
 */
public class Bank implements CustomerOperations, EmployeeOperations {

    Customer customers[];
    Employee employees[];

    public Bank(Customer[] customers, Employee[] employees) {
        this.customers = customers;
        this.employees = employees;
    }

    public void insertCustomer(Customer a) {
        int num = customers.length;
        int counter = 0;
        for (int i = 0; i < num; i++) {
            if (customers[i] != null) {
                counter++;
            }

        }

        customers[counter] = a;

    }

    public void removeCustomer(Customer a) {
        int num = customers.length;
        //System.out.println("Number:"+num);
        int counter = 0;

        for (int i = 0; i < num; i++) {
            if (customers[i] != null) {
                counter++;
            }
        }

        int x = counter - 1;
        Customer[] anotherArray = new Customer[10];
        for (int i = 0, k = 0; i < counter; i++) {

            // if the index is 
            // the removal element index 
            if (customers[i].nid == a.nid) {
                continue;
            }

            // if the index is not 
            // the removal element index 
            anotherArray[k++] = customers[i];
        }

        customers = anotherArray;
        System.out.println("Customer Remove");
    }

    public Customer getCustomer(int nid) {
        Customer bcd = customers[-1];
        for (int i = 1; i <= customers.length; i++) {
            if (nid == customers[i].nid) {
                bcd = customers[i];

            } else {
                bcd = customers[-1];
            }

        }
        return bcd;
    }

    public void showAllCustomers() {
        int num = customers.length;
        int counter = 0;
        for (int i = 0; i < num; i++) {
            if (customers[i] != null) {
                counter++;
            }

        }

        for (int i = 0; i < counter; i++) {
            System.out.println("Customer Name:" + customers[i].name);
            System.out.println("Customer NID:" + customers[i].nid);
            // System.out.println("Salary :"+employees[i].salary);
        }

    }

    public void insertEmployee(Employee a) {
        int num = employees.length;
        //System.out.println("Number:"+num);
        int counter = 0;
        for (int i = 0; i < num; i++) {
            if (employees[i] != null) {
                counter++;
            }

        }

        employees[counter] = a;

    }

    public void removeEmployee(Employee a) {
        int num = employees.length;
        //System.out.println("Number:"+num);
        int counter = 0;

        for (int i = 0; i < num; i++) {
            if (employees[i] != null) {
                counter++;
            }
        }

        int x = counter - 1;
        Employee[] anotherArray = new Employee[10];
        for (int i = 0, k = 0; i < counter; i++) {

            // if the index is 
            // the removal element index 
            if (employees[i].empId.equals(a.empId) ) {
                continue;
            }

            // if the index is not 
            // the removal element index 
            anotherArray[k++] = employees[i];
        }

        employees = anotherArray;
        System.out.println("Employee Remove");
    }

    public Employee getEmployee(int empId) {
        int num = employees.length;
        //System.out.println("Number:"+num);
        int counter = 0;
        for (int i = 0; i < num; i++) {
            if (employees[i] != null) {
                counter++;
            }

        }

        String empId1 = Integer.toString(empId);//int convat string
        Employee bcd = employees[-1];
        for (int i = 1; i <= employees.length; i++) {
            if (empId1.equals(employees[i].empId)) {
                bcd = employees[i];

            } else {
                bcd = employees[-1];
            }

        }
        return bcd;
    }

    public void showAllEmployees() {
        int num = employees.length;
        //System.out.println("Number:"+num);
        int counter = 0;
        for (int i = 0; i < num; i++) {
            if (employees[i] != null) {
                counter++;
            }

        }

        for (int i = 0; i < counter; i++) {
            System.out.println("Employee Name:" + employees[i].name);
            System.out.println("Employee Id:" + employees[i].empId);
            System.out.println("Salary :" + employees[i].salary);
        }

    }

}
