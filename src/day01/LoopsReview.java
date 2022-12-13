package day01;

import java.util.Scanner;

public class LoopsReview {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            /*
            if(i == 3){
                break;
            }
             */
            System.out.println("EU09 "+i);
        }

        System.out.println("--------------------------------------");
        Scanner scan = new Scanner(System.in);
        int num = 0;

        while(num < 100){
            System.out.println("Enter a number:");
            num = scan.nextInt();
            System.out.println("You entered: "+num);
        }





    }

}
