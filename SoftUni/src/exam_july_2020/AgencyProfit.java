package exam_july_2020;

import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int ticketsForAdults = Integer.parseInt(console.nextLine());
        int ticketsForKids = Integer.parseInt(console.nextLine());
        double priceForAdultTicket = Double.parseDouble(console.nextLine());
        double tax = Double.parseDouble(console.nextLine());

        double priceForKidTicket = (priceForAdultTicket - (priceForAdultTicket * 0.70)) + tax;
        priceForAdultTicket += tax;
        double totalAdultTickets = (priceForAdultTicket * ticketsForAdults);
        double totalKidTickets = (priceForKidTicket * ticketsForKids);
        double totalMoney = totalAdultTickets + totalKidTickets;
        double income = totalMoney * 0.20;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.",name,income);
    }
}
