package day01;

class Person{

    public String name;

    public static int number_of_head;

    static{
        number_of_head = 1;
    }


    public Person(String name) {
        this.name = name;
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

}


public class CustomClass {

    public static void main(String[] args) {

        Person person1 = new Person("Cydeo");
       // person1.name = "Cydeo";

        Person person2 = new Person("Java");
      //  person2.name = "Java";

        Person person3 = new Person("Selenium");
    //    person3.name = "Selenium";


      //  System.out.println(person1.name);
     //   System.out.println(person2.name);
      //  System.out.println(person3.name);


        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

      //  System.out.println(Person.name);
        System.out.println(person3.name);

        System.out.println(Person.number_of_head);
      //  System.out.println(person1.number_of_head);


    }

}
