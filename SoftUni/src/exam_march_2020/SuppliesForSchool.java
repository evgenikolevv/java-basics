package exam_march_2020;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double pens = Integer.parseInt(console.nextLine()) * 5.80;
        double markers = Integer.parseInt(console.nextLine()) * 7.20;
        double preparat = Double.parseDouble(console.nextLine()) * 1.20;
        double discount = Double.parseDouble(console.nextLine());
        double sum = pens + markers + preparat;
        discount = (sum * discount) / 100;
        sum -= discount;
        System.out.printf("%.3f",sum);
    }
}
