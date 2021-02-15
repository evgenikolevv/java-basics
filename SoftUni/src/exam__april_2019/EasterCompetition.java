package exam__april_2019;

import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numberOfEasterCakes = Integer.parseInt(console.nextLine());
        String name = "";
        String input = "";
        int points = 0;
        int maxPoints = 0;
        String nameOfTheWinner = "";
        for (int i = 0; i < numberOfEasterCakes ; i++) {
            points = 0;
            name = console.nextLine();
            while(true){
                input = console.nextLine();
                if (input.equals("Stop")){
                    System.out.printf("%s has %d points.\n",name,points);
                    if (maxPoints < points){
                        maxPoints = points;
                        nameOfTheWinner = name;
                        System.out.printf("%s is the new number 1!\n",name);
                    }
                    break;
                }
                points += Integer.parseInt(input);
            }
        }

        System.out.printf("%s won competition with %d points!",nameOfTheWinner,maxPoints);
    }
}
