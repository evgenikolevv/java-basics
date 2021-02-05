package while_loop_exercise;

import java.math.BigDecimal;
import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        BigDecimal money = BigDecimal.valueOf(Double.parseDouble(console.nextLine()));
        int countCoins = 0;

        while(money.compareTo(BigDecimal.valueOf(0.00))== 1){
            if(money.compareTo(BigDecimal.valueOf(2.00)) >= 0){
                money = money.subtract(BigDecimal.valueOf(2.00));
                countCoins++;
            }else if (money.compareTo(BigDecimal.valueOf(1.00)) >= 0){
                money = money.subtract(BigDecimal.valueOf(1.00));
                countCoins++;
            }else if (money.compareTo(BigDecimal.valueOf(0.50)) >= 0){
                money = money.subtract(BigDecimal.valueOf(0.50));
                countCoins++;
            }else if (money.compareTo(BigDecimal.valueOf(0.20)) >= 0){
                money = money.subtract(BigDecimal.valueOf(0.20));
                countCoins++;
            }else if (money.compareTo(BigDecimal.valueOf(0.10)) >= 0){
                money = money.subtract(BigDecimal.valueOf(0.10));
                countCoins++;
            }else if (money.compareTo(BigDecimal.valueOf(0.05)) >= 0){
                money = money.subtract(BigDecimal.valueOf(0.05));
                countCoins++;
            }else if (money.compareTo(BigDecimal.valueOf(0.02)) >= 0){
                money = money.subtract(BigDecimal.valueOf(0.02));
                countCoins++;
            }else if (money.compareTo(BigDecimal.valueOf(0.01)) >= 0){
                money = money.subtract(BigDecimal.valueOf(0.01));
                countCoins++;
            }
        }
        System.out.println(countCoins);
    }
}
