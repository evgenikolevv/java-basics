package exam_march_2019;

import java.util.Scanner;

public class GameNumberWars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String playerOne = console.nextLine();
        String playerTwo = console.nextLine();

        int pointsPlayerOne = 0;
        int pointsPlayerTwo = 0;

        String input = console.nextLine();
        while (!"End of game".equals(input)) {
            int firstCard = Integer.parseInt(input);
            int secondCard = Integer.parseInt(console.nextLine());

            if (firstCard > secondCard) {
                pointsPlayerOne += firstCard - secondCard;
            } else if (firstCard < secondCard) {
                pointsPlayerTwo += secondCard - firstCard;
            } else {
                while (true) {
                    firstCard = Integer.parseInt(console.nextLine());
                    secondCard = Integer.parseInt(console.nextLine());
                    if (firstCard > secondCard) {
                        System.out.printf("Number wars!%n%s is winner with %d points%n", playerOne, pointsPlayerOne);
                        break;
                    } else if (firstCard < secondCard) {
                        System.out.printf("Number wars!%n%s is winner with %d points%n", playerTwo, pointsPlayerTwo);
                        break;
                    }
                }
                break;
            }
            input = console.nextLine();
        }
        if ("End of game".equals(input)) {
            System.out.printf("%s has %d points%n%s has %d points%n", playerOne, pointsPlayerOne, playerTwo, pointsPlayerTwo);
        }
    }
}
