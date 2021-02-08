package more_nested_loop_exercise;

import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstNumber = Integer.parseInt(console.nextLine());
        int secondNumber = Integer.parseInt(console.nextLine());
        int thirdNumber = Integer.parseInt(console.nextLine());

        for(int i = 2; i <= firstNumber; i+=2){
            for(int j = 2; j <= secondNumber; j++){
                for(int k = 2; k <=thirdNumber; k+=2){
                        if(j == 2 || j == 3 || j == 5 || j == 7){
                                System.out.printf("%d %d %d\n",i,j,k);
                        }
                }
            }
        }
    }
}