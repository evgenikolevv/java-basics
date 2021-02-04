package for_loop_exercise;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int size = Integer.parseInt(console.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        for (int i = 0; i < size; i++){
            double number = Double.parseDouble(console.nextLine());
            if (number < 200){
                p1++;
            }else if (number >= 200 && number <= 399){
                p2++;
            }else if (number >= 400 && number <= 599){
                p3++;
            }else if (number >= 600 && number <= 799){
                p4++;
            }else if (number >= 800){
                p5++;
            }

        }

        String percent = "%";
        System.out.printf("%.2f%s\n",100 * p1 / size,percent);
        System.out.printf("%.2f%s\n",100 * p2 / size,percent);
        System.out.printf("%.2f%s\n",100 * p3 / size,percent);
        System.out.printf("%.2f%s\n",100 * p4 / size,percent);
        System.out.printf("%.2f%s",100 * p5 / size,percent);
    }
}
