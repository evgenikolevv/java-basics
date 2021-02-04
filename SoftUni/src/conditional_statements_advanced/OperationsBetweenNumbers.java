package conditional_statements_advanced;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numberOne = console.nextInt();
        int numberTwo = console.nextInt();
        String operation = console.next();
        double result = 0;
        String evenOrOdd = "";

            switch(operation){
                case "+":
                    result = numberOne + numberTwo;
                    if(result % 2 == 0){
                        evenOrOdd = "even";
                    }else{
                        evenOrOdd = "odd";
                    }
                    System.out.printf("%d %s %d = %d - %s",numberOne,operation,numberTwo,(int)result,evenOrOdd);
                    break;
                case "-":
                    result = numberOne - numberTwo;
                    if(result % 2 == 0){
                        evenOrOdd = "even";
                    }else{
                        evenOrOdd = "odd";
                    }
                    System.out.printf("%d %s %d = %d - %s",numberOne,operation,numberTwo,(int)result,evenOrOdd);
                    break;
                case "*":
                    result = numberOne * numberTwo;
                    if(result % 2 == 0){
                        evenOrOdd = "even";
                    }else{
                        evenOrOdd = "odd";
                    }
                    System.out.printf("%d %s %d = %d - %s",numberOne,operation,numberTwo,(int)result,evenOrOdd);
                    break;
                case "/":
                    if (numberTwo  == 0){
                        System.out.printf("Cannot divide %d by zero",numberOne);
                    }else {
                        result = (double) numberOne / (double) numberTwo;
                        System.out.printf("%d %s %d = %.2f", numberOne, operation, numberTwo, result);
                    }
                    break;
                case "%":
                    if (numberTwo  == 0){
                        System.out.printf("Cannot divide %d by zero",numberOne);
                    }else {
                        result = (double)numberOne % (double)numberTwo;
                        System.out.printf("%d %s %d = %.0f",numberOne,operation,numberTwo,result);
                    }
                    break;
            }
        }
}
