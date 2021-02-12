package feb_2020_exam;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double record = Double.parseDouble(console.nextLine());
        double distance = Double.parseDouble(console.nextLine());
        double seconds = Double.parseDouble(console.nextLine());
        double sum = distance * seconds;
        double slowed = Math.floor((distance / 50)) * 30;
        sum += Math.ceil(slowed);

        if (sum >= record) {
            System.out.printf("No! He was %.2f seconds slower.", sum - record);
        } else {
            System.out.printf("Yes! The new record is %.2f seconds.", sum);
        }

    }
}
