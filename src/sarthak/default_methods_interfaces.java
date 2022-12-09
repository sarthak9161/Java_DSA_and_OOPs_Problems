package sarthak;

// default methods can directly implemented inside the interface body
// instead of inside the class who is implementing the interface
// they can also override

interface call{
    void callme();
    void msgme();

    default void greet(){
        System.out.println("Good morning baby...");
    }

    String[] available_network();
}
class MyCellPhone{
    void gamePlay(){
        System.out.println("me saanp wala game khel rha hu...");
    }


}

class MySmartPhone extends MyCellPhone implements call{
    public void callme(){
        System.out.println("muze call kr bhai...");
    }
    public void msgme(){
        System.out.println("muze message kr bhai...");
    }

    public String[] available_network(){
        System.out.println("Available networks are...");
        String[] myNetworks={"sarthak", "sunny", "jaya", "giri", "baghi", "chaitya", "akki"};
        return myNetworks;
    }
}

public class default_methods_interfaces {
    public static void main(String[] args) {
        MySmartPhone apple=new MySmartPhone();
        apple.greet();
        apple.callme();
        apple.msgme();
        apple.gamePlay();


        String[] arr=apple.available_network();
        for (String item:arr) {
            System.out.println(item);
        }

    }
}
