package exam_june_2019;

import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int seasons = Integer.parseInt(console.nextLine());
        int episodesPerSeason = Integer.parseInt(console.nextLine());
        double durationOfEpisode = Double.parseDouble(console.nextLine());
        double add = durationOfEpisode * 0.20;
        durationOfEpisode += add;
        double specialEpisodes = seasons * 10;
        double total = durationOfEpisode * episodesPerSeason * seasons + specialEpisodes;
        System.out.printf("Total time needed to watch the %s series is %d minutes.",name,(int)total);
    }
}
