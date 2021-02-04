package conditional_statements_advanced;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String typeOfYear = console.next();
        double p = console.nextDouble();
        int h = console.nextInt();

        int weekends = 48;
        double weekendsInSofia = weekends - h;
        double gamesInSofia = weekendsInSofia * 3/4;
        double gamesInHomeCity = h;
        double holidaysInSofia = p * 2/3;
        double result = gamesInSofia + gamesInHomeCity + holidaysInSofia;

        if (typeOfYear.equals("leap")){
            result += result * 0.15;
            System.out.printf("%.0f",Math.floor(result));
        }else{
            System.out.printf("%.0f",Math.floor(result));
        }
    }
}
