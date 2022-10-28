package sarthak;


// constructors in java

public class constructors {

    private int id;
    private String name;
   public constructors(String myName, int myId)     // parameterised constructor
   {
       name=myName;
       id=myId;
   }

   // we can also overload the constructor similar to the methods
    public constructors()
    {
        name="schiku";
        id=7227;
    }
   int getId()
   {
       return id;
   }
   String getName()
   {
       return name;
   }
    public static void main(String[] args) {
//        constructors sarthak=new constructors("Sarthak", 8);
//        System.out.println("My id is: "+sarthak.getId());
//        System.out.println("and my name is: "+sarthak.getName());

        // default-constructor
        constructors sarthak= new constructors();
        System.out.println("My id is: "+sarthak.getId());
        System.out.println("and my name is: "+sarthak.getName());
    }
}
