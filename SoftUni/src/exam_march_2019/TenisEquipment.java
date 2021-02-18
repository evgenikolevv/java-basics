package exam_march_2019;

import java.util.Scanner;

public class TenisEquipment {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double pricePriceOfTenisRocket = Double.parseDouble(console.nextLine());
        int numberOfRockets = Integer.parseInt(console.nextLine());
        int numberOfShoes = Integer.parseInt(console.nextLine());


        double totalRockets = pricePriceOfTenisRocket * numberOfRockets;
        double priceOfShoes = (pricePriceOfTenisRocket / 6 ) * numberOfShoes;
        double cost = totalRockets + priceOfShoes;
        double leftEquipment  = cost * 0.20;
        cost += leftEquipment;
        double priceForSponsors =  Math.ceil(((cost * 7) / 8));
        double priceForDjoko = Math.floor( (cost / 8));
        System.out.printf("Price to be paid by Djokovic %.0f\n",priceForDjoko);
        System.out.printf("Price to be paid by sponsors %.0f\n",priceForSponsors);
    }
}
