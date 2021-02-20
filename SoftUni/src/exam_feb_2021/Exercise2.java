package exam_feb_2021;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int proccessors = Integer.parseInt(console.nextLine());
        int workers = Integer.parseInt(console.nextLine());
        int workingDays = Integer.parseInt(console.nextLine());

        int totalHours = workers * workingDays * 8;
        int madeProcessors = (int)Math.floor(totalHours /3);


        if (madeProcessors < proccessors){
            double losses = Math.abs(madeProcessors - proccessors);
            losses *= 110.10;
            System.out.printf("Losses: -> %.2f BGN",losses);
        }else {
            double profit = Math.abs(madeProcessors - proccessors);
            profit *= 110.10;
            System.out.printf("Profit: -> %.2f BGN",profit);
        }
    }
}
