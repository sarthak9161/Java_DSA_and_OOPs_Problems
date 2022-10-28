package sarthak;

public class methods_or_functions {
    // create method
    // method is similar to functions
    // method 01 : by creating the object for function calling
    int sum(int a, int b)
    {
        return a+b;
    }

    void greet()
    {
        System.out.println("Good morning Guys !!");
    }

    // method 02: use static type of the function which similar to the static main type of
    static int percentage(int addition, int total )
    {
        int ans=(addition*100)/total;
        return ans;
    }
    public static void main(String[] args) {

        // method 01: function / method calling
        System.out.println("method calling by creating the object of the class:");
        methods_or_functions obj=new methods_or_functions();
        int ans=obj.sum(10,40);
        System.out.println("addition is:"+" "+ans);
        obj.greet();

        // method 2: function / method calling
        System.out.println("method calling without creating the object of the class:");
        int score=percentage(300,500);
        System.out.println("score is:"+" "+score);


    }
}
