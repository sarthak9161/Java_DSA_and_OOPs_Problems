package sarthak;

public class variables {
    public static void main(String[] args) {
        int age=21;
        float cgpa=9.45F;
        long phn=1234567890L;
        System.out.println(phn);
        short iq=100;
        char x='a';
        double d=4.44;

        String name="sarthak";

        // string methods
        System.out.println("length of string is:");
        System.out.println(name.length());
        System.out.println("char at index 2 is:");
        System.out.println(name.charAt(2));
        System.out.println("substring(from index 0 to 4 ) of string is:");
        // it will skip 5th char
        System.out.println(name.substring(0,5));



    }
}
