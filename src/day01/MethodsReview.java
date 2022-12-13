package day01;

public class MethodsReview {


    public static void main(String[] args) {

        MethodsReview obj = new MethodsReview();

        String str1 = "Cydeo";
        printEach(str1);

        System.out.println("------------------------------------");

        String str2 = "Java";
        printEach(str2);


        System.out.println("------------------------------------");
        String str3 = "WoodenSpoon";
        printEach(str3);

        System.out.println("------------------------------------");

        int[] numbers = {10, 20, 30, 40};

        printEach(numbers);


    }

    public static void printEach(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }


    private static void printEach(int[] arr){
        for (int each : arr) {
            System.out.println(each);
        }
    }

    public static void printEach(double[] arr){
        for (double each : arr) {
            System.out.println(each);
        }
    }

    public static void printEach(String[] arr){
        for (String each : arr) {
            System.out.println(each);
        }
    }

    public int printEach(char[] arr){
        for (char each : arr) {
            System.out.println(each);
        }
        return 0;
    }



}
