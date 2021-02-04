package condition_statemets_advanced_lab;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int days = Integer.parseInt(console.nextLine()) -1;
        String typeOfPlace = console.nextLine();
        String feedback = console.nextLine();
        double discount = 0;
        double tip = 0;
        double result = 0;

        double priceOfSingleRoom = 0;
        double priceOfApartment = 0;
        double priceOfPresidentApartment = 0;

        if (typeOfPlace.equals("room for one person")){
            priceOfSingleRoom = 18.00;
            result = priceOfSingleRoom * days;
            if (feedback.equals("positive")){
                tip = result * 0.25;
                result += tip;
            }else if (feedback.equals("negative")){
                discount = result * 0.10;
                result -= discount;
            }

        }else if (typeOfPlace.equals("apartment")){
            priceOfApartment = 25.00;
            result = priceOfApartment * days;
            if(days < 10){
                // 30%
                discount = result * 0.30;
                result -= discount;
                if(feedback.equals("positive")){
                    tip = result * 0.25;
                    result += tip;
                }else if (feedback.equals("negative")){
                    discount = 0;
                    discount = result * 0.10;
                    result -= discount;
                }

            }else if(days >= 10 && days <=15){
                //35%
                discount = result * 0.35;
                result -= discount;
                if(feedback.equals("positive")){
                    tip = result * 0.25;
                    result += tip;
                }else if (feedback.equals("negative")){
                    discount = 0;
                    discount = result * 0.10;
                    result -= discount;
                }

            }else if (days >15){
                //50%
                discount = result * 0.50;
                result -= discount;
                if(feedback.equals("positive")){
                    tip = result * 0.25;
                    result += tip;
                }else if (feedback.equals("negative")){
                    discount = 0;
                    discount = result * 0.10;
                    result -= discount;
                }
            }

        }else if (typeOfPlace.equals("president apartment")){
            priceOfPresidentApartment = 35.00;
            result = priceOfPresidentApartment * days;
            if(days < 10){
                // 10%
                discount = result * 0.10;
                result -= discount;
                if(feedback.equals("positive")){
                    tip = result * 0.25;
                    result += tip;
                }else if (feedback.equals("negative")){
                    discount = 0;
                    discount = result * 0.10;
                    result -= discount;
                }

            }else if(days >= 10 && days <=15){
                //15%
                discount = result * 0.15;
                result -= discount;
                if(feedback.equals("positive")){
                    tip = result * 0.25;
                    result += tip;
                }else if (feedback.equals("negative")){
                    discount = 0;
                    discount = result * 0.10;
                    result -= discount;
                }

            }else if (days >15){
                //20%
                discount = result * 0.20;
                result -= discount;
                if(feedback.equals("positive")){
                    tip = result * 0.25;
                    result += tip;
                }else if (feedback.equals("negative")){
                    discount = 0;
                    discount = result * 0.10;
                    result -= discount;
                }
            }
        }

        System.out.printf("%.2f",result);
    }
}
