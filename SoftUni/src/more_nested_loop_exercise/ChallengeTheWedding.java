package more_nested_loop_exercise;

import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int males = Integer.parseInt(console.nextLine());
        int females = Integer.parseInt(console.nextLine());
        int tables = Integer.parseInt(console.nextLine());
        int count = 0;

            for (int j = 1; j <= males; j++){
                for (int k = 1; k <= females; k++){
                    if(count == tables){
                        break;
                    }
                    System.out.printf("(%d <-> %d) ",j,k);
                    count++;
                }
            }
    }
}
