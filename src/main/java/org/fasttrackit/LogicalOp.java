package org.fasttrackit;

public class LogicalOp {
    public static void ascendingNumbers(int number) {
        System.out.println("The following numbers are: ");
        number= 35;
        for (int i =35 ;i < 100 ; i++){
            System.out.println((i + 1));
        }
    } public static void descendingNumbers(int number) {
        System.out.println("The following numbers are: ");
        number= 4;
        for (int i =4 ; i > -100; i--){
            System.out.println((i - 1));
        }
    }
    public static void running(){
        System.out.println("The following numbers are: ");
        int x = 12;
        int y = 30;
        for (int i = x ; i < y ; i++){
            System.out.println(i + 1);
        }}

        public static void jumping(){
         System.out.println("The following numbers are: ");
         int x = 18;
         int y = 9;
         for (int i = y ; x > i; i++){
             if (y > i){
             System.out.println("No!"); }
             else
             {
                 System.out.println( i + 1);
         }}}
         public static void juggling(){
            System.out.println("The following numbers are: ");
        for(int i = 1 ; i < 100; i+=2)
            System.out.println( i +1);
           }
           public static void tasting(){
            System.out.println("The following numbers are: ");
        for (int i = 0; i < 100 ; i+=2)
            System.out.println( i +1);  }

            public static int countNumbers(int number) {
             number = 38;
                System.out.println("The following numbers are: ");
                for (int i = 38; i < 100; i += i)
                    i+=i;
                return (38);

            }}









