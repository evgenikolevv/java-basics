package more_nested_loop_exercise;

import java.util.Scanner;

public class HappyCatParking {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int days = Integer.parseInt(console.nextLine());
        int hours = Integer.parseInt(console.nextLine());
        double sum = 0;
        for(int i = 1; i <= days ; i++){
            if(i % 2 == 0){
                double daySum = 0;
                for (int j = 1; j <= hours; j++){
                    if (j % 2 != 0){
                        sum += 2.50;
                        daySum += 2.50;
                    }else{
                        sum += 1;
                        daySum += 1;
                    }
                }
                System.out.printf("Day: %d - %.2f leva\n",i,daySum);
            }else{
                double daySum = 0;
                for (int j = 1; j <= hours; j++){
                    if (j % 2 == 0){
                        sum += 1.25;
                        daySum += 1.25;
                    }else{
                        sum += 1;
                        daySum += 1;
                    }
                }
                System.out.printf("Day: %d - %.2f leva\n",i,daySum);
            }
        }
        System.out.printf("Total: %.2f leva",sum);
    }
}
