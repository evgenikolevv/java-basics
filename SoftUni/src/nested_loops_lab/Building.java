package nested_loops_lab;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int floor = Integer.parseInt(console.nextLine());
        int rooms = Integer.parseInt(console.nextLine());

        for(int i = floor; i > 0; i--){
            if (i == floor){
                for(int j = 0; j < rooms; j++){
                    System.out.printf("L%d%d ",i,j);
                }
            }else if (i % 2 == 0){
                for(int j = 0; j < rooms; j++){
                    System.out.printf("O%d%d ",i,j);
                }
            }else{
                for(int j = 0; j < rooms; j++) {
                    System.out.printf("A%d%d ", i, j);
                }
            }
            System.out.println();
        }
    }
}
