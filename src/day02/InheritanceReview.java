package day02;

class A{
   public A(){
       System.out.println("A");
   }

   public int a;

   public static int b =100;

  public void methodA(){
       System.out.println("Method A");
   }

}

class B extends A{

    @Override
    public void methodA(){
        System.out.println("Method AA");
    }

    public B(){
        System.out.println("B");
    }

    public void methodB(){
        System.out.println("Method B");
    }

}


public class InheritanceReview {


    public static void main(String[] args) {

        B obj =  new B();
        obj.methodA();

    }

}
