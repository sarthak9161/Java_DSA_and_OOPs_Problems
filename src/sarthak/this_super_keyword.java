package sarthak;

// this : when we have to refer the object of the class which is being created then we use this keyword
class ekclass{
    int a;

    public int getA() {
        return a;
    }

    ekclass(int v)
    {
        this.a=v;
    }
}

// super : it is used to refer the immediate parent class object
// used to invoke any methods of the parent class
// used to invoke any constructor of the parent class
// by default it will invoke default constru bt if custom constru is need to invoke then use super keyword

class doclass extends ekclass{
    doclass(int c)
    {
        super(c);   // this will call the constructor of the parent class
        // i.e muze aise constructor ko called krna hai parent class me se jo int value leta hai
        System.out.println("me ek constructor hu !");
    }

}
public class this_super_keyword {
    public static void main(String[] args) {

        //ekclass e=new ekclass(20);
       // System.out.println("the value is:"+e.getA());

        doclass d=new doclass(200);
        System.out.println(d.getA());



    }
}
