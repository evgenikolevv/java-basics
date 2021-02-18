package exam_march_2019;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int tax = Integer.parseInt(console.nextLine());
        double shoes = tax - (tax * 0.40);
        double ekip = shoes - (shoes * 0.20);
        double ball = ekip  / 4;
        double accessoars = ball  / 5;
        double cost = tax + shoes + ekip + ball + accessoars;
        System.out.printf("%.2f",cost);
    }
}
