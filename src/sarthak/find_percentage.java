package sarthak;
import java.util.Scanner;

// program to find percentage of student

public class find_percentage {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int total=300;

        System.out.println("enter marks in science:");
        int sci=sc.nextInt();

        System.out.println("enter marks in maths:");
        int math=sc.nextInt();

        System.out.println("enter marks in english:");
        int eng=sc.nextInt();

        int sum=sci+math+eng;
        int score=(sum*100)/total;

        System.out.println("Percentage are"+" "+score);

    }
}
