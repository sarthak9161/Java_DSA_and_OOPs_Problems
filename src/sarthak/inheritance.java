package sarthak;

import java.util.Scanner;

class School{
    public int X;

    public int getX() {
        return X;
    }

    public void setX(int x) {
        System.out.println("now I am in base class");
        X = x;
    }
}

class Student2 extends School{
   public int Y;
    public void setY(int y) {
        System.out.println("now I'm in derived class");
        this.Y = y;
    }

    public int getY() {

        return Y;
    }
}
public class inheritance {
    public static void main(String[] args) {

        Student2 st=new Student2();
        st.setX(10);
        System.out.println(st.getX());

        st.setY(100);
        System.out.println(st.getY());
    }
}
