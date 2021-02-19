package exam_june_2019;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int durationOfEpisode = Integer.parseInt(console.nextLine());
        int durationOfBreak = Integer.parseInt(console.nextLine());
        double lunchBreak = durationOfBreak / 8.0;
        double gasp = durationOfBreak / 4.0;
        double timeleft = durationOfBreak - lunchBreak - gasp;
        if (timeleft >= durationOfEpisode){
            double diff = Math.ceil(timeleft - durationOfEpisode);
            System.out.printf("You have enough time to watch %s and left with %d minutes free time.",name,(int)diff);
        }else{
            double diff = Math.ceil(durationOfEpisode - timeleft);
            System.out.printf("You don't have enough time to watch %s, you need %d more minutes.",name,(int)diff);
        }
    }
}
