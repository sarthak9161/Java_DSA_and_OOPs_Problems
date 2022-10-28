package sarthak;

// recursion== when method calls itself is called...
public class recursion {
    static int factorial(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        else {
            return n*factorial(n-1);    // recursive call
        }
    }

    static int fibo(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[] args) {
        System.out.println("factorial is:");
        System.out.println(factorial(5));

        System.out.println("nth fibo number is: "+fibo(9));
    }
}
