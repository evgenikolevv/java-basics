package more_nested_loop_exercise;

import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numberOfOneLev = Integer.parseInt(console.nextLine());
        int numberOfTwoLev = Integer.parseInt(console.nextLine());
        int numberOfFiveLev = Integer.parseInt(console.nextLine());
        int money = Integer.parseInt(console.nextLine());

          for(int i = 0; i <= numberOfOneLev; i++){
              for (int j = 0; j <= numberOfTwoLev; j++){
                  for (int k = 0; k <= numberOfFiveLev; k++){
                      if (i * 1 +  j * 2 + k * 5 == money){
                          System.out.printf("%d * %d lv. + %d * %d lv. + %d * %d lv. = %d lv.\n",
                                  i,1,j,2,k,5,money);
                      }
                  }
              }
          }
    }
}
