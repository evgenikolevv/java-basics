package more_nested_loop_exercise;

import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N = Integer.parseInt(console.nextLine());

        for(int i = 1; i <=9 ; i++){
            for (int j = 1; j <= 9; j++){
                for (int k = 1; k <= 9; k++){
                    for (int l = 1; l <= 9; l++){
                        if(i + j == k + l && (N % (i + j) == 0)){
                                System.out.printf("%d%d%d%d ",i,j,k,l);
                        }
                    }
                }
            }
        }
    }
}