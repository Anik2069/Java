/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

import java.util.Scanner;

/**
 *
 * @author Rasel Ahmed
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void Employee(Bank b1) {
        System.out.println("1. Insert New Employee");
        System.out.println("2.  Remove Existing Employee");
        System.out.println("3.  Show All Employees ");
        System.out.println("Enter your choice");
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        if (n == 1) {
            System.out.println("Name:");
            String a = s.next();
            System.out.println("ID:");
            String b = s.next();
            System.out.println("Salary:");
            double c = s.nextDouble();
            Employee e1 = new Employee(a, b, c);

            b1.insertEmployee(e1);
            Employee(b1);

        } else if (n == 2) {
            System.out.println("Name:");
            String a = s.next();
            System.out.println("ID:");
            String b = s.next();
            System.out.println("Salary:");
            double c = s.nextDouble();
            Employee e1 = new Employee(a, b, c);

            b1.removeEmployee(e1);
            Employee(b1);

        } else if (n == 3) {
            b1.showAllEmployees();
            Employee(b1);
        }
    }

    public static void Customer(Bank b1) {

        System.out.println("1. Insert New Customer");
        System.out.println("2.  Remove Existing Customer");
        System.out.println("3.  Show All Customer ");
        System.out.println("Enter your choice");
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        if (n == 1) {
            System.out.println("Name:");
            String a = s.next();
            System.out.println("ID:");
            int b = s.nextInt();
            Customer c1 = new Customer(a, b);
            b1.insertCustomer(c1);
            Customer(b1);
        } else if (n == 2) {
            System.out.println("Name:");
            String a = s.next();
            System.out.println("ID:");
            int b = s.nextInt();
            Customer c1 = new Customer(a, b);
            b1.removeCustomer(c1);
            Customer(b1);
        } else if (n == 3) {
            b1.showAllCustomers();
            Customer(b1);
        }
    }

    public static void Account(Customer c1) {
        System.out.println("1. Insert New Account");
        System.out.println("2. Remove Existing Account");
        System.out.println("3. Show All Account");
         System.out.println("4. Back");
        System.out.println("Enter your choice");
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        if (n == 1) {
            System.out.println("Account Number:");
            int a = s.nextInt();
            System.out.println("Account Balance:");
            double b = s.nextDouble();
            FixedAccount f1 = new FixedAccount(a, b);
            c1.insertAccount(f1);
            Account(c1);
        } else if (n == 2) {
            System.out.println("Account Number:");
            int a = s.nextInt();
            System.out.println("Account Balance:");
            double b = s.nextDouble();
            FixedAccount f1 = new FixedAccount(a, b);
            c1.removeAccount(f1);
            Account(c1);

        } else if (n == 3) {
            c1.showAllAccounts();
            Account(c1);
        }
        else if(n==4){
            starting_game(b1,c1);
        }

    }

    /* ////////////////////////////////////////////////
    public static void Transactions(Customer c1){
        System.out.println("1. Deposit Money");
        System.out.println("2.  Withdraw Money");
        System.out.println("3.  Transfer Money");
        System.out.println("Enter your choice");       
        Scanner s = new Scanner(System.in);
        int n;
        n=s.nextInt();
        if(n==1){
        System.out.println("Balance:");
        double c=s.nextDouble();
      // Account a1=new Account(c1);
     
        //c1.deposit();
        //c1.AshowInfo();
    
        }
        else if(n==2){
        System.out.println("Balance:");
        double c=s.nextDouble();
        //Account a1=new Account(c);
        //a1.withdraw();
       
        
    }
         else if(n==3){
             System.out.println("Balance:");
             double c=s.nextDouble();
             //Account a1=new Account(c);
            //a1.withdraw();
    }
   }*/
     static Bank b1;
    public static void main(String[] args) {
        // TODO code application logic here
        Customer[] customers = new Customer[10];
        Employee[] employees = new Employee[10];
         b1 = new Bank(customers, employees);
        // FixedAccount a1=new FixedAccount();
              Customer c1 = new Customer();

        starting_game(b1,c1);
    }

    public static void starting_game(Bank b1Bank,Customer c1) {

        System.out.println("1. Employee Managemnet");
        System.out.println("2. Customer Management");
        System.out.println("3. Customer Account Management");
        System.out.println("4. Account Transactions");
        System.out.println("5. Exit");
        int n;
        System.out.println("Enter your choice");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        if (n == 1) {
            Employee(b1);

        } else if (n == 2) {
            Customer(b1);

        } else if (n == 3) {
            Account(c1);
        } else if (n == 4) {
            tt(c1);
        } else if (n == 5) {
            System.out.println("Thank You");
        } else {
            System.out.println("Invilide Input ");
        }

    }

    public static void tt(Customer c1) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Account Number");
        int n = s.nextInt();
        Account a;
        System.out.println(c1.check(n));
        if (c1.check(n) == n) {
            System.out.println("1.Diposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Transfer");
            System.out.println("Enter ur choice");
            int na = s.nextInt();
            if (na == 1) {
                a = c1.check1(n);
                System.out.println("Enter Amount:");
                double bbb = s.nextDouble();
                a.deposit(bbb);
            } else if (na == 2) {
                a = c1.check1(n);
                System.out.println("Enter Amount:");
                double bbb = s.nextDouble();
                a.withdraw(bbb);
            } else if (na == 3) {
                a = c1.check1(n);
                System.out.println("Enter Account Number:");
                int acc = s.nextInt();

                System.out.println("Enter Amount:");
                double bbb = s.nextDouble();
                Account ccAccount = c1.check1(acc);
                a.transfer(ccAccount, bbb);
            } else {
                System.out.println("Invilide Input ");
            }

        } else {
            System.err.println("Wrong Account Number!!!!");
        }
    }

}
