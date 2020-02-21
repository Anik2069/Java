/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank2;

/**
 *
 * @author Anik
 */
public class Bank2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        account abc=new account("Anik", "123456789", 10000);
        abc.display();
        abc.deposit(5000);
        abc.withdrawn(300);
        abc.display();
        account abc1=new account("Rasel", "123456789", 10000);
        abc.transaction(abc1, 100);
        
        
    }
    
}
class account{
   private String accNameString;
   private String accid;
   private int balance;

    public account(String accNameString, String accid, int balance) {
        this.accNameString = accNameString;
        this.accid = accid;
        this.balance = balance;
    }
    void deposit(int amount){
        balance = balance+amount;
        System.out.println("BDT "+amount+" Tk ,Deposit Successfully!!!!!!!!!!!!!\n Happy Transaction");
        
    }
     void withdrawn(int amount){
        balance = balance-amount;
        System.out.println("BDT "+amount+" Tk ,Withdrawn Successfully!!!!!!!!!!!!!\n Happy Transaction");
        
    }
    void transaction(account abc, int amount){
        int preamount= abc.getBalance();
        preamount=preamount+amount;
        balance=balance-amount;
        abc.setBalance(preamount);
        System.out.println("BDT "+amount+" tk Trancsation completed!!!!!!!!!!! \n Happy Transaction");   
        abc.display();
        display();
    }

    public String getAccNameString() {
        return accNameString;
    }

    public void setAccNameString(String accNameString) {
        this.accNameString = accNameString;
    }

    public String getAccid() {
        return accid;
    }

    public void setAccid(String accid) {
        this.accid = accid;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public void display(){
        System.out.println("Name of Account:"+accNameString);
        System.out.println("Name of Account:"+accid);
        System.out.println("Name of Account:"+balance);
            
    }
    

   
    
    

    
}