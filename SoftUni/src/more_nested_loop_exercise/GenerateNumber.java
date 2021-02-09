package more_nested_loop_exercise;

import java.util.Scanner;

public class GenerateNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int start = Integer.parseInt(console.nextLine());
        int finish = Integer.parseInt(console.nextLine());

        for(int i = start; i <= finish; i++){
            for(int j = start; j <= finish; j++){
                for (int k = start; k <= finish; k++){
                    for(int l = start; l <= finish; l++){
                        if(i > l && (j + k) % 2 == 0){
                            if(i % 2 == 0 && l % 2 != 0 || i % 2 != 0 && l % 2 == 0){
                                System.out.printf("%d%d%d%d ",i,j,k,l);
                        }
                        }
                    }
                }
            }
        }
    }
}
