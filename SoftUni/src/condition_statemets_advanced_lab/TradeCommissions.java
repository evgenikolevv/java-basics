package condition_statemets_advanced_lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String city = console.nextLine();
        double sales = Double.parseDouble(console.nextLine());
        boolean exist = true;

        if (sales >= 0 && sales <= 500){
            if(city.equals("Sofia")){
                sales *= 0.05;
            }else if(city.equals("Varna")){
                sales *= 0.045;
            }else if (city.equals("Plovdiv")){
                sales *= 0.055;
            }else{
                System.out.println("error");
                exist = false;
            }

        }else if (sales > 500 && sales <= 1000){

            if(city.equals("Sofia")){
                sales *= 0.07;
            }else if(city.equals("Varna")){
                sales *= 0.075;
            }else if (city.equals("Plovdiv")){
                sales *= 0.08;
            }else{
                System.out.println("error");
                exist = false;
            }
        }else if (sales > 1000 && sales <= 10000){
            if(city.equals("Sofia")){
                sales *= 0.08;
            }else if(city.equals("Varna")){
                sales *= 0.10;
            }else if (city.equals("Plovdiv")){
                sales *= 0.12;
            }else{
                System.out.println("error");
                exist = false;
            }
        }else if (sales > 10000){
            if(city.equals("Sofia")){
                sales *= 0.12;
            }else if(city.equals("Varna")){
                sales *= 0.13;
            }else if (city.equals("Plovdiv")){
                sales *= 0.145;
            }else{
                System.out.println("error");
                exist = false;
            }
        }

        if(exist == true){
            if (sales < 0){
                System.out.println("error");
            }else{
                System.out.printf("%.2f",sales);
            }
        }
    }
}
