package sarthak;

// it is similar to dynamic method dispatch

interface cat{
    void meow();
}
interface dog{
    void bhu_bhu();
}
class pet_animals{
    void greet(){
        System.out.println("welcome to pet show...");
    }
}

class all_animals extends pet_animals implements cat, dog{
    void animal_show(){
        System.out.println("I am kingdom animalia...");
    }
    public void meow(){
        System.out.println("meow meow...");
    }
    public void bhu_bhu(){
        System.out.println("bhu-bhu...");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        cat c=new all_animals();    // allowed
        c.meow();

        dog d=new all_animals();
        d.bhu_bhu();

        all_animals a=new all_animals();
        a.greet();
        a.animal_show();

       // all_animals a=new dog();  // not allowed
       // a.animal_show();
    }
}
