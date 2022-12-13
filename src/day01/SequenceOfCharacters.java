package day01;

public class SequenceOfCharacters {

    public static void main(String[] args) {

        String str1 = "cydeo";
        String str2 = "cydeo";

        String str3 = new String("cydeo");
        String str4 = new String("cydeo");

        String str5 = str1.toUpperCase(); // "CYDEO"

        System.out.println(str5);

        str2 = str2.concat("School");

        System.out.println(str2);


       // StringBuilder stringBuilder = "cydeo";
      //  StringBuffer stringBuffer = "cydeo";

        StringBuffer stringBuffer = new StringBuffer("Cydeo");

        stringBuffer.append(" School");

        System.out.println(stringBuffer);


        StringBuilder stringBuilder = new StringBuilder("Cydeo");

        stringBuilder.append(" School");

        System.out.println(stringBuilder);




    }

}
