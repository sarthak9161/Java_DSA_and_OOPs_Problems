package sarthak;

interface Mycycle{
    void applyBreak();
    void speedBadha();
}

interface MyBike{
    void myTopspeed();
}

class HeroCycle implements Mycycle, MyBike{
    public void applyBreak()
    {
        System.out.println("break laga bhai");
    }
    public void speedBadha(){
        System.out.println("speed badha bhai");
    }

    public void myTopspeed(){
        System.out.println("me 2nd interface ko implement krra hu");
        System.out.println("my top speed is 1000km per hr");
    }
}
public class java_interfaces {
    public static void main(String[] args) {
        HeroCycle h=new HeroCycle();
        h.applyBreak();
        h.myTopspeed();
    }
}
