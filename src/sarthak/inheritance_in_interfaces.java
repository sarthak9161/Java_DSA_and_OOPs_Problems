package sarthak;


interface car1{
    void meth1();
    void meth2();
}

interface car2 extends car1{
    void meth3();
    void meth4();
}

class MyVehicles implements car1, car2{
    public void meth1(){
        System.out.println("this is meth1");
    }
    public void meth2(){
        System.out.println("this is meth2");
    }
    public void meth3(){
        System.out.println("this is meth3");
    }
    public void meth4(){
        System.out.println("this is meth4");
    }
}
public class inheritance_in_interfaces {
    public static void main(String[] args) {
        MyVehicles thar=new MyVehicles();
        thar.meth1();
        thar.meth2();
        thar.meth3();
        thar.meth4();
    }
}
