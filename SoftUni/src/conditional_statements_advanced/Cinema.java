package conditional_statements_advanced;

import java.util.Scanner;

public class Cinema {



    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double premiere = 12.00; //Premiere 12.00
        double normal = 7.50; //Normal 7.50
        double discount = 5.00; //Discount 5.00
        double income = 0;

        String typeOfProjection =  console.next();
        int rows = console.nextInt();
        int columns = console.nextInt();

        if(typeOfProjection.equals("Premiere")){
            income = rows * columns * 12;
        }else if (typeOfProjection.equals("Normal")){
            income = rows * columns * 7.50;
        }else if (typeOfProjection.equals("Discount")){
            income = rows * columns * 5.00;
        }

        System.out.printf("%.2f leva",income);
    }
}
