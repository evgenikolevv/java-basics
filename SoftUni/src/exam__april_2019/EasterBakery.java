package exam__april_2019;

import java.util.Scanner;

public class EasterBakery {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double priceForDough = Double.parseDouble(console.nextLine());
        double kilogramsDough = Double.parseDouble(console.nextLine()) * priceForDough;
        double kilogramsSugar = Double.parseDouble(console.nextLine()) * (priceForDough * 0.75);
        double packagesOfEggs = Integer.parseInt(console.nextLine()) * (priceForDough  * 1.1);
        double packagesOfMaya = Integer.parseInt(console.nextLine()) * (priceForDough * 0.75) * 0.2;
        double sum = kilogramsDough + kilogramsSugar + packagesOfEggs + packagesOfMaya;
        System.out.printf("%.2f",sum);

    }
}
