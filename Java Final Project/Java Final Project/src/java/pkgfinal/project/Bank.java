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
public class Bank implements EmployeeOperationsInterface, CustomerOperationsInterface
{
    Customer customers[ ];
    Employee employees[ ];
public void insertCustomer(Customer a)
       {
        int num=customers.length;
        customers[num+1]=a;
       }
   public void removeCustomer(Customer a)
       {
       for(int i=1; i<=customers.length; i++){
           if(a.nid==customers[i].nid){
            for(int j=i; j<=customers.length; j++){
                customers[j]=customers[j+1];
            }
           }
       }
       System.out.println("Customer Remove");
       }
    public Customer getCustomer(int nid)
       {
           Customer bcd=customers[-1];
        for(int i=1; i<=customers.length; i++){
           if(nid==customers[i].nid){
               bcd = customers[i];
             
           }
           else{
              bcd = customers[-1];
           }
           
        }
        return bcd;
       }
    public void showAllCustomers( )
       {
        for(int i=1; i<=customers.length; i++){
           System.out.println("Customer Nid:"+customers[i].nid);
           System.out.println("Customer Name:"+customers[i].name);
           
           
             
           }

}
    public void insertEmployee(Employee a)
       {
        int num=employees.length;
        employees[num+1]=a;
       }
   public void removeEmployee(Employee a)
       {
       for(int i=1; i<=employees.length; i++){
           if(a.empId==employees[i].empId){
            for(int j=i; j<=employees.length; j++){
                employees[j]=employees[j+1];
            }
           }
       }
       System.out.println("Employee Remove");
       }
    public Employee getEmployee(int empId)
       {
           String empId1=Integer.toString(empId);//int convat string
           Employee bcd=employees[-1];
        for(int i=1; i<=employees.length; i++){
           if(empId1.equals(employees[i].empId)){
               bcd = employees[i];
             
           }
           else{
              bcd = employees[-1];
           }
           
        }
        return bcd;
       }
    public void showAllEmployees( )
       {
        for(int i=1; i<=employees.length; i++){
           System.out.println("Employee Id:"+employees[i].empId);
           System.out.println("Employee Name:"+employees[i].name);
           
           
             
           }

}
}
