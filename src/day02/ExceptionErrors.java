package day02;

import day02.abstraction_review.Audi;
import day02.abstraction_review.Car;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class ExceptionErrors {

    public static void main(String[] args) throws Throwable {

        // new ExceptionErrors().finalize();

        /*
        List<Car> cars = new ArrayList<>();

        while(true){
            cars.add( new Audi() );
        }

         */



      //  System.out.println("Completed");

        //readFile();


    }


    public static void methodWithRuntimeException() throws RuntimeException{
        throw new RuntimeException("This is exception");
    }

    public static void readFile() throws Exception{
        new FileInputStream("");
    }


}
