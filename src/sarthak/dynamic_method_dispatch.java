package sarthak;


// dynamic method dispatch is also known as run time polymorphism.
// Upcasting :
//It is a technique in which a superclass reference variable refers to the object of the subclass

class Phone{
    public void greet(){
        System.out.println("hellow from phone !!");
    }
    public void msg(){
        System.out.println("I am simple phone");
    }
}

class SmartPhone extends Phone{
    @Override
    public void msg(){
        System.out.println("I am smart phone");
    }
    public void ring(){
        System.out.println("turung turung ...!!");
    }
    public void displayTime(){
        System.out.println("ata vajle ahe 2pm");
    }
}
public class dynamic_method_dispatch {
    public static void main(String[] args) {

        Phone ph= new SmartPhone();     // yes, it is allowed
        // here we have created the object of Smart phone but had taken the reference of Phone

        //SmartPhone sp=new Phone();  // it is not allowed

        // we can only call the methods which are present in super class
        ph.greet();     // allowed
        ph.msg();      // allowed
        //ph.displayTime();   // not allowed
    }
}
