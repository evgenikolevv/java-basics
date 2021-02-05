package nested_loops_lab;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int freeSeats = 0;
        int totalTickets = 0;
        int countStandard = 0;
        int countStudent = 0;
        int countKid = 0;
        double percent = 0;
        int count = 0;
        double moviePercentage = 0;

        while(true){
           count = 0;
           String movie = console.nextLine();
            if(movie.equals("Finish")){
                break;
            }
            freeSeats = Integer.parseInt(console.nextLine());
            percent = 100.0/freeSeats;

            for (int i = 0; i <freeSeats;i++){
                String ticketType = console.nextLine();
                if(ticketType.equals("End")){
                   break;
                }
                if(ticketType.equals("standard")){
                    countStandard++;
                }else if(ticketType.equals("student")){
                    countStudent++;
                }else if (ticketType.equals("kid")){
                    countKid++;
                }
                count++;
            }

            moviePercentage = percent * count;
            System.out.printf("%s - %.2f%% full.\n",movie,moviePercentage);
        }
            totalTickets = countKid + countStandard + countStudent;
            System.out.printf("Total tickets: %d\n",totalTickets);
            double percentageOfTicket = 100.0/totalTickets;
            System.out.printf("%.2f%% student tickets.\n",((double)countStudent * percentageOfTicket));
            System.out.printf("%.2f%% standard tickets.\n",((double)countStandard * percentageOfTicket));
            System.out.printf("%.2f%% kids tickets.\n",((double)countKid * percentageOfTicket));
    }
}
