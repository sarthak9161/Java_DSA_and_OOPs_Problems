package sarthak;

// varargs== when we want to pass multiple arguments into the function then we use varargs
public class varargs {
    static int sum(int...arr)
    {
        // it will store the arguments in the form of the array
        // i.e arr={arg1, arg2, ....}
        int ans=0;
        for(int element: arr)
        {
            ans+=element;
        }
        return ans;
    }

    // you can also mentioned that there should be atleast one argument
    // here x
    static int sum2(int x, int...arr)
    {
        // it will store the arguments in the form of the array
        // i.e arr={arg1, arg2, ....}
        int ans=x;
        for(int element: arr)
        {
            ans+=element;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("without any fixed value:");
        System.out.println(sum(1,2,3,4));
        System.out.println(sum(3,55,22,22));
        System.out.println("with atleast one fixed argument:"+" "+sum2(5,2,3));
    }
}
