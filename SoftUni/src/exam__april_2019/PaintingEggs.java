package exam__april_2019;

import java.util.Scanner;

public class PaintingEggs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String size = console.nextLine();
        String color = console.nextLine();
        int numberOfPartidi = Integer.parseInt(console.nextLine());
        double price = 0;
        switch (size){
            case "Large":
                switch (color){
                    case "Red":
                        price = 16;
                        break;
                    case "Green":
                        price = 12;
                        break;
                    case "Yellow":
                        price = 9;
                        break;
                }
                break;
            case "Medium":
                switch (color){
                    case "Red":
                        price = 13;
                        break;
                    case "Green":
                        price = 9;
                        break;
                    case "Yellow":
                        price = 7;
                        break;
                }
                break;
            case "Small":
                switch (color){
                    case "Red":
                        price = 9;
                        break;
                    case "Green":
                        price = 8;
                        break;
                    case "Yellow":
                        price = 5;
                        break;
                }
                break;
        }
        double cost = price * numberOfPartidi;
        double expenses = cost * 0.35;
        cost -= expenses;
        System.out.printf("%.2f leva.",cost);
    }
}
