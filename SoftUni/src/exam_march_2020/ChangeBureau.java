package exam_march_2020;
import java.util.Scanner;
public class ChangeBureau {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int bitcoins = Integer.parseInt(console.nextLine())* 1168;
        double johanCoins = (Double.parseDouble(console.nextLine()) * 0.15) *1.76;
        double commision = Double.parseDouble(console.nextLine())/100;
        double sum = 0;
        sum += bitcoins;
        sum += johanCoins;
        sum /= 1.95;
        System.out.printf("%.2f",sum-=commision*=sum);
    }
}
