package exam_june_2019;

import java.util.Scanner;

public class FavoriteMovie {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = "";
        String movie = "";
        double score = 0;
        double maxScore = 0;
        int count = 0;
        String bestMovie = "";
        while (true) {
            input = console.nextLine();
            if (input.equals("STOP")) {
                System.out.printf("The best movie for you is %s with %d ASCII sum.", bestMovie, (int) maxScore);
                break;
            }
            movie = input;
            score = 0;
            for (int j = 0; j < movie.length(); j++) {
                if (movie.charAt(j) >= 'A' && movie.charAt(j) <= 'Z') {
                    score += movie.charAt(j) - movie.length();
                } else if (movie.charAt(j) >= 'a' && movie.charAt(j) <= 'z') {
                    score += movie.charAt(j) - (movie.length() * 2);
                } else {
                    score += movie.charAt(j);
                }

            }

            count++;
            if (score > maxScore) {
                maxScore = score;
                bestMovie = movie;
            }
            if (count == 7) {
                System.out.printf("The limit is reached.\nThe best movie for you is %s with %d ASCII sum.", bestMovie, (int) maxScore);
                break;
            }
        }
    }
}
