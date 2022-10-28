package sarthak;

// method overloading== same method/function name with different working
public class method_overloading {
    static int sum(int a, int b)
    {
        return a+b;
    }
    static int sum(int a, int b, int c)
    {
        return (a+b)*c;
    }
    static int sum(int a, int b, int c, int d)
    {
        return (a+b)*c-d;
    }

    public static void main(String[] args) {
        System.out.println("method overloading:");
        System.out.println(sum(2,3));
        System.out.println(sum(2,3,5));
        System.out.println(sum(2,3,5, 8));

    }

}
