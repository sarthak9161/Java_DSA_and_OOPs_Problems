package sarthak;

public class conditionals_break_continue {
    public static void main(String[] args) {

//        int n=50;
//
//        if(n>=18){
//            System.out.println("yes");
//        }
//        else {
//            System.out.println("no");
//        }

        // break and continue statement
//        for(int i=1;i<=5;i++)
//        {
////            if(i==3){
////                break;
////            }
//
//            if(i==3){
//                continue;
//            }
//            System.out.println(i);
//        }

        // switch statement

        int n=21;
        switch (n){
            case 18:
                System.out.println("less than 21");
                break;
            case 25:
                System.out.println("greater than 21");
                break;
            case 21:
                System.out.println("equals to 21");
                break;
            default:
                System.out.println("enter valid cese");
                break;
        }
    }
}
