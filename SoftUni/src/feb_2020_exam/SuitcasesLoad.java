package feb_2020_exam;

import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double capacity = Double.parseDouble(console.nextLine());
        String input = "";
        int count = 0;
        while (true) {

            input = console.nextLine();
            if (input.equals("End")) {
                break;
            }

            double suitcase = Double.parseDouble(input);
            if ((count +1) % 3 == 0) {
                double big = suitcase * 0.10;
                suitcase += big;
            }
            capacity -= suitcase;
            if (capacity <= 0) {
                break;
            }
            count++;
        }

        if (input.equals("End")) {
            System.out.printf("Congratulations! All suitcases are loaded!\nStatistic: %d suitcases loaded.", count);
        } else {
            System.out.printf("No more space!\nStatistic: %d suitcases loaded.", count);
        }
    }
}
