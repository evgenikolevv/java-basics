package exam_march_2019;

import java.util.Scanner;

public class FitnessCenter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int people = Integer.parseInt(console.nextLine());
        double percent = 100.0 / people;
        int countWorkout = 0;
        int countProtein = 0;
        int countBack = 0;
        int countChest = 0;
        int countLegs = 0;
        int countAbs = 0;
        int countProteinShake = 0;
        int countProteinBar = 0;
        String input = "";
        for (int i = 1; i <= people ; i++) {
                input = console.nextLine();
                switch (input){
                    case "Back":
                        countBack++;
                        countWorkout++;
                        break;
                    case "Chest":
                        countChest++;
                        countWorkout++;
                        break;
                    case "Legs":
                        countLegs++;
                        countWorkout++;
                        break;
                    case "Abs":
                        countAbs++;
                        countWorkout++;
                        break;
                    case "Protein shake":
                        countProteinShake++;
                        countProtein++;
                        break;
                    case "Protein bar":
                        countProteinBar++;
                        countProtein++;
                        break;
                }
        }

        System.out.printf("%d - back\n",countBack);
        System.out.printf("%d - chest\n",countChest);
        System.out.printf("%d - legs\n",countLegs);
        System.out.printf("%d - abs\n",countAbs);
        System.out.printf("%d - protein shake\n",countProteinShake);
        System.out.printf("%d - protein bar\n",countProteinBar);
        System.out.printf("%.2f%% - work out\n",(countWorkout * percent));
        System.out.printf("%.2f%% - protein\n",(countProtein * percent));
    }
}
