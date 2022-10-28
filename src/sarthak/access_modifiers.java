package sarthak;

// access specifiers
// Public, Private, Protected and Default

class Student{
    private int id;
    private String name;

    public void setName(String s)
    {
        this.name=s;
    }

    public void setId(int x)
    {
        this.id=x;
    }
    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }

}
public class access_modifiers {
    public static void main(String[] args) {

        Student st=new Student();
        st.setId(8);
        st.setName("sarthak");
        System.out.println("My name is: "+st.getName());
        System.out.println("and my ID is: "+st.getId());
    }
}
