/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Anik
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        basiccalculator b1 = new basiccalculator();
        System.out.println("Basic Calculator");

        System.out.println("Sum Of two Numbers is :" + b1.sum(12, 40));
        System.out.println("Sub Of two Numbers is :" + b1.sub(50, 40));
        System.out.println("Multiplication Of two Numbers is :" + b1.mutli(12, 40));
        System.out.println("Division Of two Numbers is :" + b1.division(40, 5));
        System.out.println("Scientific Calculator");
        sci b11 = new sci();

        System.out.println("XtoY Of two Numbers is :" + b11.XtoY(6, 3));
        System.out.println("Root Of a Number is :" + b11.root(50));
    }

}

class basiccalculator implements BasicCal {

    public int sum(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public int sub(int x, int y) {
        int sum = x - y;
        return sum;
    }

    public int mutli(int x, int y) {
        int sum = x * y;
        return sum;
    }

    public int division(int x, int y) {
        int sum = x / y;
        return sum;
    }
}

class sci implements BasicCal, Scientific {

    public int sum(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public int sub(int x, int y) {
        int sum = x - y;
        return sum;
    }

    public int mutli(int x, int y) {
        int sum = x * y;
        return sum;
    }

    public int division(int x, int y) {
        int sum = x / y;
        return sum;
    }

    public double root(double x) {
        double s = (double) Math.sqrt(x);
        return s;
    }

    public int XtoY(int x, int y) {
        int s = (int) Math.pow(x, y);
        return s;
    }

}
