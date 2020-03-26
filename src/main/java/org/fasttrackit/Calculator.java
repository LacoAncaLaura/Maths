package org.fasttrackit;


// "is-a" relationship / inheritance
public class Calculator {

    //has-a relationship/Aggregation
    Battery battery;
    
    int number;
    double decimals;
    int anotherNumber;
    double anotherDecimals;
    int total;
    double total1;
    int result;
    double result1;

    public int count(int anotherNumber){
        System.out.println("The result of the count after overloading is: " + count( 25 ,  153));
        return count(anotherNumber , 153);
    }
    public int count(int number,int  anotherNumber){
        total = number + anotherNumber;
        System.out.println("Counting: " + total);
        return total;
    }
    public int decrease( int number){
        System.out.println("The result of the decrease after overloading is: " + decrease(252 , 150));
        return decrease( number , 150);
    }
    public int decrease(int number , int anotherNumber){
        int result = number - anotherNumber;
        System.out.println("The result is: "+ result);
        return result;
    }
    public double counting(int decimals){
        System.out.println("The result of the counting after overloading is: " + counting(654.6 , 15.3 * 2));
        return counting(decimals , 15.3 * 2);
    }

    public double counting(double decimals , double anotherDecimals) {
        total1 = decimals + anotherDecimals;
        System.out.println("And we are also counting: " + total1);
        return total1;
    }
    public double decreasing(double decimals){
        System.out.println("The result of our decreasing after overloading is: " + decreasing( 364.3 , 3.2));
        return decreasing(decimals , 3.2);
    }
    public double decreasing(double anotherDecimals , double decimals){
       double result1 = anotherDecimals - decimals ;
        System.out.println("And this result would be: " + result1);
        return result1;
    }
    public void summing(int number ,Calculator calculator){
        System.out.println("The result of our summing after overloading is: " + number);
        number+=62;
    }
    public void summing(Calculator calculator,int number){
        System.out.println("See number before summing: " + number);
        number ++;
        System.out.println("And now,let`s see the result: " + number);
    }
    public  int multiplying(int number , int anotherNumber){
        System.out.println("The result of our multiplying after overloading is: " + multiplying(365 * 2));
        return multiplying(365 * 2);
    }
    public int multiplying(int number){
        int result2 = number * 5;
        System.out.println("The result of our multiplying is: " + result2);
        return result2;
    }
    public void divide(double anotherDecimals){
        System.out.println( "The result of the divide after overloading is: " + anotherDecimals);
        anotherDecimals/=3;

    }
    public void divide(Calculator calculator , double anotherDecimals){
        System.out.println("See number before divide: " + anotherDecimals);
        anotherDecimals/=5;
        System.out.println("See the result of the divide:" + anotherDecimals);
    }



    }



