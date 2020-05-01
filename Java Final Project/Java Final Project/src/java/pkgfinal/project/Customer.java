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
public class Customer implements AccountOperationsInterface{
    String name;
    int nid;
    Account accounts[ ];
    void setName(String name)
        {
         this.name=name;
        }
    void setNid(int nid)
        {
         this.nid=nid;
        }
    String getName()
        {
        return name;
        }
    int getNid()
        {
        return nid;
        }
    public void insertAccount(Account a)
       {
        int num=accounts.length;
        accounts[num+1]=a;
       }
   public void removeAccount(Account a)
       {
       for(int i=1; i<=accounts.length; i++){
           if(a.accountNumber==accounts[i].accountNumber){
            for(int j=i; j<=accounts.length; j++){
                accounts[j]=accounts[j+1];
            }
           }
       }
       System.out.println("Account Remove");
       }
    public Account getAccount(int accountNumber)
       {
           Account bcd=accounts[-1];
        for(int i=1; i<=accounts.length; i++){
           if(accountNumber==accounts[i].accountNumber){
               bcd = accounts[i];
             
           }
           else{
              bcd = accounts[-1];
           }
           
        }
        return bcd;
       }
    public void showAllAccounts( )
       {
        for(int i=1; i<=accounts.length; i++){
           System.out.println("Account Number:"+accounts[i].accountNumber);
           System.out.println("Account Number:");
           
           
             
           }

}
}
