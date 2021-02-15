package exam__april_2019;

import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double easterCakes = Integer.parseInt(console.nextLine()) * 3.20;
        double eggs = Integer.parseInt(console.nextLine());
        double priceForEggs = eggs * 4.35;
        eggs = (eggs * 12) * 0.15;
        double cookies = Integer.parseInt(console.nextLine()) * 5.40;
        double sum = easterCakes + eggs + priceForEggs + cookies;
        System.out.printf("%.2f",sum);
    }
}
