package exam_may_2019;

import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int days = Integer.parseInt(console.nextLine());
        int hours = Integer.parseInt(console.nextLine());
        double cost = 0;
        double total = 0;
        for (int i = 1; i <= days; i++) {
            cost = 0;
            for (int j = 1; j <= hours ; j++) {
                if (i % 2 == 0  && j % 2 != 0){
                    cost +=2.50;
                }
                else if (i % 2 != 0 && j % 2 == 0){
                    cost += 1.25;
                }else{
                        cost += 1;
                }
            }
            System.out.printf("Day: %d - %.2f leva\n",i,cost);
            total += cost;
        }
        System.out.printf("Total: %.2f leva",total);
    }
}
