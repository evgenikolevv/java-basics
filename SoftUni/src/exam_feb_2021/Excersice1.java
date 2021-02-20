package exam_feb_2021;

import java.util.Scanner;

public class Excersice1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numberOfBoxesWithPaint = Integer.parseInt(console.nextLine());
        int numberOfRolki = Integer.parseInt(console.nextLine());
        double priceOfgloves = Double.parseDouble(console.nextLine());
        double priceOfBrush = Double.parseDouble(console.nextLine());

        double totalPaint = 21.50 * numberOfBoxesWithPaint;
        double totalTapeti = 5.20 * numberOfRolki;
        double neededGloves = Math.ceil(numberOfRolki * 0.35);
        double neededBrushes = Math.floor(numberOfBoxesWithPaint * 0.48);
        double totalPriceForGloves = neededGloves * priceOfgloves;
        double totalPriceForBrushes = neededBrushes * priceOfBrush;
        double totalCost = totalPaint + totalTapeti + totalPriceForGloves + totalPriceForBrushes;
        double delivery = totalCost / 15;
        System.out.printf("This delivery will cost %.2f lv.",delivery);
    }

}
