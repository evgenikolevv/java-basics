package exam_june_2019;

import java.util.Scanner;

public class FilmPremiere {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String movie = console.nextLine();
        String food = console.nextLine();
        int tickets = Integer.parseInt(console.nextLine());

        double cost = 0;
        if (movie.equals("John Wick")) {
            switch (food) {
                case "Drink":
                    cost = 12;
                    break;
                case "Popcorn":
                    cost = 15;
                    break;
                case "Menu":
                    cost = 19;
                    break;
            }

        } else if (movie.equals("Star Wars")) {
            switch (food) {
                case "Drink":
                    cost = 18;
                    break;
                case "Popcorn":
                    cost = 25;
                    break;
                case "Menu":
                    cost = 30;
                    break;
            }

        } else if (movie.equals("Jumanji")) {
            switch (food) {
                case "Drink":
                    cost = 9;
                    break;
                case "Popcorn":
                    cost = 11;
                    break;
                case "Menu":
                    cost = 14;
                    break;
            }
        }

        cost *= tickets;
        if (tickets >= 4 && movie.equals("Star Wars")){
            double discount = cost * 0.30;
            cost -= discount;
        }else if (tickets == 2 && movie.equals("Jumanji")){
            double discount = cost * 0.15;
            cost -= discount;
        }

        System.out.printf("Your bill is %.2f leva.",cost);
    }
}
