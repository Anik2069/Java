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
public class Customer implements AccountOperations {

    String name;
    int nid;
    Account accounts[] = new Account[5];

    Customer() {
        System.out.println("Defolt Constractor Called");
    }

    public Customer(String name, int nid) {
        this.name = name;
        this.nid = nid;
    }

    void setName(String name) {
        this.name = name;
    }

    void setNid(int nid) {
        this.nid = nid;
    }

    String getName() {
        return name;
    }

    int getNid() {
        return nid;
    }

    public void insertAccount(Account a) {
        int num = accounts.length;
        //System.out.println("Number:"+num);
        int counter = 0;
        for (int i = 0; i < num; i++) {
            if (accounts[i] != null) {
                counter++;
            }

        }

        accounts[counter] = a;

    }

    public void removeAccount(Account a) {
        int num = accounts.length;
        //System.out.println("Number:"+num);
        int counter = 0;

        for (int i = 0; i < num; i++) {
            if (accounts[i] != null) {
                counter++;
            }
        }

        int x = counter - 1;
        Account[] anotherArray = new Account[5];
        for (int i = 0, k = 0; i < counter; i++) {

            // if the index is 
            // the removal element index 
            if (accounts[i].accountNumber == a.accountNumber) {
                continue;
            }

            // if the index is not 
            // the removal element index 
            anotherArray[k++] = accounts[i];
        }

        accounts = anotherArray;

    }

    public Account getAccount(int accountNumber) {
        Account bcd = accounts[-1];
        for (int i = 1; i <= accounts.length; i++) {
            if (accountNumber == accounts[i].accountNumber) {
                bcd = accounts[i];

            } else {
                bcd = accounts[-1];
            }

        }
        return bcd;
    }

    public void showAllAccounts() {
        int num = accounts.length;
        int counter = 0;
        for (int i = 0; i < num; i++) {
            if (accounts[i] != null) {
                counter++;
            }

        }
        for (int i = 0; i < counter; i++) {
            System.out.println("Account Number:" + accounts[i].accountNumber);
            // System.out.println("Name"+name);
            //System.out.println("Name"+nid);
            // System.out.println("Name"+);

            System.out.println("Account Number:" + accounts[i].balance);

        }

    }

    public int check(int n) {
        int num = accounts.length;
        //System.out.println("Number:"+num);
        int counter = 0;

        for (int i = 0; i < num; i++) {
            if (accounts[i] != null) {
                counter++;
            }
        }

        int x = counter - 1;
        for (int i = 0, k = 0; i < counter; i++) {

            // if the index is 
            // the removal element index 
            if (accounts[i].accountNumber == n) {
                return n;
            }

            // if the index is not 
            // the removal element index 
        }
        return 0;

    }

    public Account check1(int n) {
        int num = accounts.length;
        //System.out.println("Number:"+num);
        int counter = 0;

        for (int i = 0; i < num; i++) {
            if (accounts[i] != null) {
                counter++;
            }
        }

        int x = counter - 1;
        for (int i = 0, k = 0; i < counter; i++) {

            // if the index is 
            // the removal element index 
            if (accounts[i].accountNumber == n) {
                return accounts[i];
            }

            // if the index is not 
            // the removal element index 
        }
        return null;

    }

    void Account(FixedAccount f1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
