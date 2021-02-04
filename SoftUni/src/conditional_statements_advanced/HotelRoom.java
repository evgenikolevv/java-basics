package conditional_statements_advanced;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String month = console.next();
        int days = console.nextInt();
        double priceOfStudio = 0;
        double priceOfApartment = 0;
        double discountForStudio = 0;
        double discountForApartment = 0;
        double costForStudio = 0;
        double costForApartment = 0;



        if (days > 14){
            if (month.equals("May") || month.equals("October")){
                priceOfStudio = 50;
                priceOfApartment = 65;
                discountForApartment = priceOfApartment * 0.10;
                priceOfApartment -=discountForApartment;
                costForApartment = priceOfApartment * days;

                discountForStudio = priceOfStudio * 0.30;
                priceOfStudio -= discountForStudio;
                costForStudio = priceOfStudio * days;
            }else if (month.equals("June") || month.equals("September")){
                priceOfStudio = 75.20;
                priceOfApartment = 68.70;

                discountForApartment = priceOfApartment * 0.10;
                priceOfApartment -= discountForApartment;
                costForApartment = priceOfApartment * days;

                discountForStudio = priceOfStudio * 0.20;
                priceOfStudio -= discountForStudio;
                costForStudio = priceOfStudio * days;
            }else if (month.equals("July") || month.equals("August")){
                priceOfStudio = 76;
                priceOfApartment = 77;
                discountForApartment = priceOfApartment * 0.10;
                priceOfApartment -= discountForApartment;
                costForStudio = priceOfStudio * days;
                costForApartment = priceOfApartment * days;
            }



        }else if (days > 7 && days <=14){
            if (month.equals("May") || month.equals("October")){
                priceOfStudio = 50;
                priceOfApartment = 65;
                discountForStudio = priceOfStudio * 0.05;
                priceOfStudio -= discountForStudio;
                costForStudio = priceOfStudio * days;
                costForApartment = priceOfApartment * days;
            }else if (month.equals("June") || month.equals("September")){
                priceOfStudio = 75.20;
                priceOfApartment = 68.70;

                costForStudio = priceOfStudio * days;
                costForApartment = priceOfApartment * days;
            }else if (month.equals("July") || month.equals("August")){
                priceOfStudio = 76;
                priceOfApartment = 77;

                costForStudio = priceOfStudio * days;
                costForApartment = priceOfApartment * days;
            }
        }else{
            if (month.equals("May") || month.equals("October")){
                priceOfStudio = 50;
                priceOfApartment = 65;

                costForStudio = priceOfStudio * days;
                costForApartment = priceOfApartment * days;
            }else if (month.equals("June") || month.equals("September")){
                priceOfStudio = 75.20;
                priceOfApartment = 68.70;

                costForStudio = priceOfStudio * days;
                costForApartment = priceOfApartment * days;
            }else if (month.equals("July") || month.equals("August")){
                priceOfStudio = 76;
                priceOfApartment = 77;

                costForStudio = priceOfStudio * days;
                costForApartment = priceOfApartment * days;
            }
        }
        System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.",costForApartment,costForStudio);
    }
}
