package for_loop_exercise;

import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int size = Integer.parseInt(console.nextLine());
        double oddMin = Integer.MAX_VALUE;
        double oddMax = Integer.MIN_VALUE;
        double oddSum = 0;
        double evenMin = Integer.MAX_VALUE;
        double evenMax = Integer.MIN_VALUE;
        double evenSum = 0;


        for (int i = 1; i <= size; i++){
            double number = Double.parseDouble(console.nextLine());
            if (i % 2 == 0){
                if (number > evenMax){
                    evenMax = number;
                }
                if (number < evenMin){
                    evenMin = number;
                }
                evenSum += number;
            }else{
                if (number > oddMax){
                    oddMax = number;
                }
                if (number < oddMin){
                    oddMin = number;
                }
                oddSum += number;
            }
        }

        String notExist = "No";
        System.out.printf("OddSum=%.2f,\n",oddSum);

        if(oddMin == Integer.MAX_VALUE){
            System.out.printf("OddMin=%s,\n",notExist);
        }else{
            System.out.printf("OddMin=%.2f,\n",oddMin);
        }

        if(oddMax == Integer.MIN_VALUE){
            System.out.printf("OddMax=%s,\n",notExist);
        }else{
            System.out.printf("OddMax=%.2f,\n",oddMax);
        }

        System.out.printf("EvenSum=%.2f,\n",evenSum);

        if (evenMin == Integer.MAX_VALUE){
            System.out.printf("EvenMin=%s,\n",notExist);
        }else{
            System.out.printf("EvenMin=%.2f,\n",evenMin);
        }

        if (evenMax == Integer.MIN_VALUE){
            System.out.printf("EvenMax=%s\n",notExist);
        }else{
            System.out.printf("EvenMax=%.2f\n",evenMax);
        }
    }
}
