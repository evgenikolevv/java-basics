package exam_june_2019;

import java.util.Scanner;

public class MovieProfit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int days = Integer.parseInt(console.nextLine());
        int tickets = Integer.parseInt(console.nextLine());
        double priceOfTicket = Double.parseDouble(console.nextLine());
        int percent = Integer.parseInt(console.nextLine());
        double dailyTickets = priceOfTicket * tickets;
        double income = dailyTickets * days;
        income -= (income * percent) / 100;
        System.out.printf("The profit from the movie %s is %.2f lv.",name,income);
    }
}
