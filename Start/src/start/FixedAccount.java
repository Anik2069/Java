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
public class FixedAccount extends Account{
    private double interestYear;

    public double getInterestYear() {
        return interestYear;
    }

    public void setInterestYear(double interestYear) {
        this.interestYear = interestYear;
    }

    @Override
    void showInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
