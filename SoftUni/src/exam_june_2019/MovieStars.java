package exam_june_2019;

import java.util.Scanner;

public class MovieStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double budget = Double.parseDouble(console.nextLine());
        String input = "";
        while (true) {
            input = console.nextLine();
            if (input.equals("ACTION")) {
                System.out.printf("We are left with %.2f leva.", budget);
                break;
            }
            String name = input;
            if (name.length() > 15) {
                double leftBudget = budget * 0.20;
                budget -= leftBudget;
            } else {
                double salary = Double.parseDouble(console.nextLine());
                budget -= salary;
            }
            if (budget <= 0) {
                System.out.printf("We need %.2f leva for our actors.", Math.abs(budget));
                break;
            }
        }
    }
}
