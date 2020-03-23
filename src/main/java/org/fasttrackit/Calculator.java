package org.fasttrackit;

public class Calculator {
    //instance variable
    int number;
    double decimals;
    int anotherNumber;
    double anotherDecimals;
    int total;
    double total1;
    int result;
    double result1;
    int result2;


    public int count(int number,int  anotherNumber){
        total = number + anotherNumber;
        System.out.println("Counting: " + total);
        return total;
    }
    public int decrease(int number , int anotherNumber){
        int result = number - anotherNumber;
        System.out.println("The result is: "+ result);
        return result;
    }
    public double counting(double decimals , double anotherDecimals) {
        total1 = decimals + anotherDecimals;
        System.out.println("And we are also counting: " + total1);
        return total1;
    }
    public double decreasing(double anotherDecimals , double decimals){
       double result1 = anotherDecimals - decimals ;
        System.out.println("And this result would be: " + result1);
        return result1;
    }
    public void summing(Calculator calculator,int number){
        System.out.println("See number before summing: " + number);
        number ++;
        System.out.println("And now,let`s see the result: " + number);
    }
    public int multiplying(int number){
        int result2 = number * 5;
        System.out.println("The result of our multiplying is: " + result2);
        return result2;
    }
    public void divide(Calculator calculator , double anotherDecimals){
        System.out.println("See number before divide: " + anotherDecimals);
        anotherDecimals/=5;
        System.out.println("See the result of the divide:" + anotherDecimals);
    }



    }



