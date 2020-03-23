package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Let`s do some maths" );
        Calculator calculator = new Calculator();
        calculator.number = 2542;
        calculator.decimals = 654.26;
        calculator.anotherNumber = 3153;
        calculator.anotherDecimals=52525.352;

        int total = calculator.count(2542 , 3153);
        double total1 = calculator.counting(654.26 , 52525.352);
        int result = calculator.decrease(2542, 3153);
        double result1 = calculator.decreasing(52525.352 , 654.26);
        calculator.summing(calculator , 2542);
        int result2 = calculator.multiplying(2542);
        calculator.divide(calculator,52525.352);


    }



}
