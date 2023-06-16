package Programme_1_calculate;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaring a scanner object
        Scanner s =new Scanner((System.in));
        String answer;
do {
        System.out.println("Please enter first number :"); //input wizard
        int a=s.nextInt();
        System.out.println("Please enter the second number :");
        int b=s.nextInt();
        System.out.println("Please enter the symbol +,-,/,* : ");
        char symbol= s.next().charAt(0);
        Calculator calculator=new Calculator();
        calculator.calculateResult(a,b,symbol);
        System.out.println ("Would you like to do more calculation Please enter Y or N  : ");
         answer =s.next().toLowerCase(Locale.ROOT);
    }
    while (answer.startsWith("Y"));
    //Closing a scanner object
    s.close();
}
}
