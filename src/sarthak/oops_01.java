package sarthak;

// create your custom class

class Employee1{
    int id;
    String name;
    float salary;
    public void printdetails()
    {
        System.out.println("My id is: "+id);
        System.out.println("and my name is :"+name);
    }
    public float getSalary()
    {
        return salary;
    }
}
public class oops_01 {
    public static void main(String[] args) {
        Employee1 sarthak=new Employee1();
        sarthak.id=8;
        sarthak.name="Sarthak";
        sarthak.salary=4.5f;
        sarthak.printdetails();
        System.out.print("My salary is: ");
        System.out.print(sarthak.getSalary());

    }
}
