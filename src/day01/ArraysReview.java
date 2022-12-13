package day01;

import java.util.Arrays;

public class ArraysReview {

    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, 50}; // arrays literal: if we know how many elements and what those elements are
        nums[3] = 400;

        int[] numbers = new int[5]; // new keyword: if we know how many elements need to be in the array
        numbers[2] = 25;

        System.out.println(Arrays.toString(nums) );
        System.out.println(Arrays.toString(numbers));

        System.out.println("---------------------------------------------");

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F"};

        String[][] arr = { arr1, arr2};

        System.out.println("---------------------------------------------");

        char[] characters = {'A', 'B', 'C', 'D', 'E'};

        /*
        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i]);
        }

         */

        for (char each : characters) {
            System.out.println(each);
        }





    }

}
