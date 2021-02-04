package condition_statemets_advanced_lab;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String dayOfTheWeek = console.nextLine();
        int ticket = 0;
        if (dayOfTheWeek.equals("Monday")){
            ticket = 12;
        }else if (dayOfTheWeek.equals("Tuesday")){
            ticket = 12;
        }else if (dayOfTheWeek.equals("Wednesday")){
            ticket = 14;
        }else if (dayOfTheWeek.equals("Thursday")){
            ticket = 14;
        }else if (dayOfTheWeek.equals("Friday")){
            ticket = 12;
        }else if (dayOfTheWeek.equals("Saturday")){
            ticket = 16;
        }else if (dayOfTheWeek.equals("Sunday")){
            ticket = 16;
        }

        System.out.println(ticket);
    }
}
