package sarthak;

interface cycle{
    void blowHorn();
    void applyBreak();

    int speed=100;
}

// you can create more than 1 interface and can implement it
interface bike{
    void myAvg();
}

class Hero implements cycle, bike{

    public void blowHorn(){
        System.out.println("pi pi");
    }

    public void applyBreak(){
        System.out.println("break laga le bhai");
    }
    public void myAvg(){
        System.out.println("My average is 50km in 1 litre");
    }
}
public class interfaces {
    public static void main(String[] args) {
        Hero h= new Hero();
        h.blowHorn();
        h.applyBreak();

        System.out.println(h.speed);
        // you can't modify the methods or values that are defined inside interface
        // bcz they are final
       // h.speed=200;
       // System.out.println(h.speed);

        h.myAvg();
    }
}
