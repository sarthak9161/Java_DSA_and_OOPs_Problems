package sarthak;

// abstract class= jaisa marzi chaho waisa implement kro
// we can not create the object of abstract class
// abstract class se dusre classes bhi banaye ja sakte hai

abstract class Parent2
{
    public Parent2(){
        System.out.println("me abstract class ka constructor hu");
    }

    abstract public void greet();

}
class Child2 extends Parent2
{
    @Override
    public void greet(){
        System.out.println("Good morning bhai !");
    }
}

abstract class Child3 extends Parent2
{
    public Child3(){
        System.out.println("me child3 abstract class ka constructor hu");
    }
    public void greet(){
        System.out.println("Good morning from child abstract class");
    }
}

class Child4 extends Child3{
    public Child4()
    {
        System.out.println("me child 4 class ka constructor hu");
    }
}

public class abstract_classes_methods {
    public static void main(String[] args) {
//        Child2 ch= new Child2();
//        ch.greet();

        Child4 ch= new Child4();
        ch.greet();
    }
}
