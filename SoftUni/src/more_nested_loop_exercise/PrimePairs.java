package more_nested_loop_exercise;

import java.util.Scanner;

public class PrimePairs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int startOfFirstPair = Integer.parseInt(console.nextLine());
        int startOfSecondPair = Integer.parseInt(console.nextLine());
        int diffFirstPair = Integer.parseInt(console.nextLine());
        int diffSecondPair = Integer.parseInt(console.nextLine());
        boolean isPrime = true;

        for (int firstPair = startOfFirstPair; firstPair <= startOfFirstPair + diffFirstPair; firstPair++){

            isPrime = true;

            for(int number = 2; number < firstPair/2; number++){
                int remainder = firstPair % number;
                if (remainder == 0){
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                for (int secondPair = startOfSecondPair; secondPair <= startOfSecondPair + diffSecondPair; secondPair++){
                    isPrime = true;
                    for(int number = 2; number < secondPair/2; number++){
                        int remainder = secondPair % number;
                        if (remainder == 0){
                            isPrime = false;
                            break;
                        }
                    }

                    if(isPrime){
                        System.out.printf("%d%d\n", firstPair, secondPair);
                    }
            }
            }

        }
    }
}
