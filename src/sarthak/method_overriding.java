package sarthak;


// method overridng: when child class already contains the methods of parent class then child overides parent

class A{
    public void meth1()
    {
        System.out.println("me class A ki method 1 hu");
    }
    public void meth2()
    {
        System.out.println("me class A ki method 2 hu");
    }
}
class B extends A{
    @Override
    // here overridng occurs
    // this notation is not mandatory but recommended to see whether overriding occured or not
    public void meth1()
    {
        System.out.println("me class B ki method 1 hu");
    }
    public void meth3()
    {
        System.out.println("me class B ki method 3 hu");
    }
}
public class method_overriding {
    public static void main(String[] args) {
        A a=new A();
        a.meth1();

        B b=new B();
        b.meth1();

    }
}
