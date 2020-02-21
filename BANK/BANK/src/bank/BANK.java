/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author Anik
 */
public class BANK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic herint
       //User Debit account
       DebitAccount user1 = new DebitAccount("Anik","24-20-1925","Rasel",10000) ;
       DebitAccount user2 = new DebitAccount("Rasel","24-20-1925","Anik",20000) ;
       user1.deposit(50000);
       user1.print();
       user2.deposit(30000);
       user2.print();
       user1.deposit(50000);
       user1.print();
       user2.print();

        
        
    }
    
}
 class IDGENARATOR{
     public  static int serialNo;
}
 abstract class account{
 
  public  String name;
  public  String date;
  public  String Nominee;
   public double balance;

    public account(String name, String date, String Nominee, double balance) {
        this.name = name;
        this.date = date;
        this.Nominee = Nominee;
        this.balance = balance;
        }
    
    public abstract boolean deposit(double amount);
     public abstract boolean withdraw(double amount);
      public abstract void print();
     
    
}
 class DebitAccount extends account{

    public DebitAccount(String name, String date, String Nominee, double balance) {
        
        super(name, date, Nominee, balance);
    }

    @Override
    public boolean deposit(double amount) {
        if (amount <=100000){
            balance = balance+amount;
            return true;        
            
        }
        else {
            return false;
        }
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount<= 20000){
            balance = balance-amount;

            return true;
            
        }
          else {
            return false;
        }


    }

    @Override
    public void print() {
        System.out.println("Account Name:"+name);
        System.out.println("Account balance Name:"+balance);
        System.out.println("Account Nominee Name:"+Nominee);      
    }
     
    
}

class Credit extends account{

    public Credit(String name, String date, String Nominee, double balance) {
        super(name, date, Nominee, balance);
    }
   

public boolean deposit(double amount) {
       
            balance = balance+amount;
            return true;        
            
      
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount<= 20000 && amount<= (balance*0.5)){
            balance = balance-amount;

            return true;
            
        }
          else {
            return false;
        }


    }

    @Override
    public void print() {
        System.out.println("Account Name:"+name);
        System.out.println("Account balance Name:"+balance);
        System.out.println("Account Nominee Name:"+Nominee);      
    }
     
    
    
}
class saving extends account{

    public saving(String name, String date, String Nominee, double balance) {
        super(name, date, Nominee, balance);
    }
   

public boolean deposit(double amount) {
       
            balance = balance+amount;
            return true;        
            
      
    }

    @Override
    public boolean withdraw(double amount) {
    
            balance = balance-amount;

            return true;
            
     

    }

    @Override
    public void print() {
        System.out.println("Account Name:"+name);
        System.out.println("Account balance Name:"+balance);
        System.out.println("Account Nominee Name:"+Nominee);      
    }
     
    
    
}
