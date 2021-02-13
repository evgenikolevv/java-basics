package exam_july_2020;

import java.util.Scanner;

public class AluminiumJoinery {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numberOfJoinery = Integer.parseInt(console.nextLine());
        String type = console.nextLine();
        String delivery = console.nextLine();
        double singlePrice = 0;
        double price = 0;
        if (numberOfJoinery < 10) {
            System.out.println("Invalid order");
            return;
        }

        if (type.equals("90X130")) {
            singlePrice = 110;
            price = singlePrice * numberOfJoinery;
            if (numberOfJoinery > 60) {
                price -= price * 0.08;
            } else if (numberOfJoinery > 30) {
                price -= price * 0.05;
            }
        } else if (type.equals("100X150")) {
            singlePrice = 140;
            price = singlePrice * numberOfJoinery;

            if (numberOfJoinery > 80) {
                price -= price * 0.1;
            } else if (numberOfJoinery > 40) {
                price -= price * 0.06;
            }
        } else if (type.equals("130X180")) {
            singlePrice = 190;
            price = singlePrice * numberOfJoinery;
            if (numberOfJoinery > 50) {
                price -= price * 0.12;
            } else if (numberOfJoinery > 20) {
                price -= price * 0.07;
            }
        } else if (type.equals("200X300")) {
            singlePrice = 250;
            price = singlePrice * numberOfJoinery;
            if (numberOfJoinery > 50) {
                price -= price * 0.14;
            } else if (numberOfJoinery > 25) {
                price -= price * 0.09;
            }
        }

        if (delivery.equals("With delivery")) {
            price += 60.00;
        }

        if (numberOfJoinery > 99) {
            price -= price * 0.04;
        }

        System.out.printf("%.2f BGN", price);
    }
}
