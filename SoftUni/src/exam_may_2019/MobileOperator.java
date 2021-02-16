package exam_may_2019;

import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String deadline = console.nextLine();
        String type = console.nextLine();
        String addedInternet = console.nextLine();
        int months = Integer.parseInt(console.nextLine());
        double tax = 0;
        if (deadline.equals("one")){
            switch (type){
                case "Small":
                    tax = 9.98;
                    break;
                case "Middle":
                    tax = 18.99;
                    break;
                case "Large":
                    tax = 25.98;
                    break;
                case "ExtraLarge":
                    tax = 35.99;
                    break;
            }

        }else if (deadline.equals("two")){
            switch (type){
                case "Small":
                    tax = 8.58;
                    break;
                case "Middle":
                    tax = 17.09;
                    break;
                case "Large":
                    tax = 23.59;
                    break;
                case "ExtraLarge":
                    tax = 31.79;
                    break;
            }
        }

        double internet = 0;
        if(addedInternet.equals("yes")){
            if (tax <= 10){
                internet = 5.50;
            }else if (tax <= 30){
                internet = 4.35;
            }else if (tax > 30){
                internet = 3.85;
            }
        }
            tax += internet;
            tax *= months;
        if (deadline.equals("two")){
            double discount = (tax * 3.75) / 100;
            tax -= discount;
        }

        System.out.printf("%.2f lv.",tax);
    }
}
