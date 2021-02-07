package nested_loop_exercise;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int primeSum = 0;
        int nonPrimeSum = 0;

        while(true){
            String  input = console.nextLine();
            if(input.equals("stop")){
                break;
            }
            boolean isPrime = true;
            int number = Integer.parseInt(input);
            if(number < 0){
                System.out.println("Number is negative.");
                continue;
            }


            for(int i = 2; i <= number / 2; i++){
                if(number % i == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                primeSum += number;
            }else{
                nonPrimeSum += number;
            }
        }

        System.out.printf("Sum of all prime numbers is: %d\n",primeSum);
        System.out.printf("Sum of all non prime numbers is: %d\n",nonPrimeSum);
    }
}
