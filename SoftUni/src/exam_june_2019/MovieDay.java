package exam_june_2019;

import java.util.Scanner;

public class MovieDay {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int timeForPhotos = Integer.parseInt(console.nextLine());
        int numberOfFrames = Integer.parseInt(console.nextLine());
        int timestamp = Integer.parseInt(console.nextLine());
        double preparation = timeForPhotos * 0.15;
        double timeForFrames = numberOfFrames * timestamp + preparation;

        if (timeForFrames > timeForPhotos){
            double minutes = Math.ceil(timeForFrames - timeForPhotos);
            System.out.printf("Time is up! To complete the movie you need %d minutes.",(int)minutes);
        }else{
            double minutes = Math.ceil(Math.abs(timeForFrames - timeForPhotos));
            System.out.printf("You managed to finish the movie on time! You have %d minutes left!",(int)minutes);
        }
    }
}
