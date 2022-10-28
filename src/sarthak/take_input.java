package sarthak;
import java.util.Scanner;

public class take_input {
    public static void main(String[] args) {

        // in scanner class of java there is method present
        // for taking the input

        // create object of class
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int x=sc.nextInt();     // to take the input
        System.out.println("enter the second number:");
        int y=sc.nextInt();

        System.out.println("the first num is"+" "+x+" "+"and the second num is"+" "+y);

        int sum=x+y;
        System.out.println("the sum of these numbers is"+" "+sum);
    }
}
