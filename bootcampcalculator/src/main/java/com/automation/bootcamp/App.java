package com.automation.bootcamp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App myApp = new App();
        double mySum = myApp.sum(10.5, 9.5);
        double mySub = myApp.sub(10.5, 9.5);
        System.out.println("Sum is: " + mySum);
        System.out.println("Substraction is: " + mySub);
    }

    public double sum(double firstNum, double secondNum){
        double result;
        result = firstNum + secondNum;
        return result;
    }

    public double sub(double firstNum, double secondNum){
        double result;
        result = firstNum - secondNum;
        return result;
    }
}
