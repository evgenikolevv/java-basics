package exam_march_2020;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int groups = Integer.parseInt(console.nextLine());
        int firstGroup = 0;
        int secondGroup = 0;
        int thirdGroup = 0;
        int fourthGroup = 0;
        int fifthGroup = 0;
        double total = 0;

        for (int i = 1; i <= groups; i++) {
            int sizeOfGroup = Integer.parseInt(console.nextLine());
            if(sizeOfGroup < 6){
                firstGroup += sizeOfGroup;
            }else if (sizeOfGroup < 13){
                //Monblan
                secondGroup += sizeOfGroup;
            }else if (sizeOfGroup < 26){
                //Kilimandjaro
                thirdGroup += sizeOfGroup;
            }else if (sizeOfGroup < 41){
                //K2
                fourthGroup += sizeOfGroup;
            }else{
                //Everest
                fifthGroup += sizeOfGroup;
            }
        }
        total = firstGroup + secondGroup + thirdGroup + fourthGroup + fifthGroup;
        System.out.printf("%.2f%%\n",((firstGroup * 100) / total));
        System.out.printf("%.2f%%\n",((secondGroup * 100) / total));
        System.out.printf("%.2f%%\n",((thirdGroup * 100) / total));
        System.out.printf("%.2f%%\n",((fourthGroup * 100) / total));
        System.out.printf("%.2f%%\n",((fifthGroup * 100) / total));
    }
}
