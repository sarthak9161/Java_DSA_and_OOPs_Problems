package sarthak;

public class arrays {
    public static void main(String[] args) {

        // create array

        // method 01
        int[] arr=new int[5];

        // method 02
//        int[] arr;
//        arr=new int[5];
//
        arr[0]=100;
        arr[1]=200;
        arr[2]=300;
        arr[3]=400;
        arr[4]=500;
//        System.out.println(arr[4]);

        // method 03
//        int[] marks={23,45,64,21};
//        System.out.println(marks[0]);

        // find length of array
//        System.out.println("length of given array is:");
//        System.out.println(arr.length);

        // array traversal
        /*
        System.out.println("array traversal:");
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("array traversal in reversed:");
        for (int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }

        // using for each loop
        System.out.println("using for each loop:");
        for (int element: arr)
        {
            System.out.println(element);
        }
        */
        // multi-dimensional arrays

        int[][] myarr=new int[2][2];      // matrix of size 2X2
        myarr[0][0]=10;
        myarr[0][1]=20;
        myarr[1][0]=30;
        myarr[1][1]=40;
        for (int i=0;i<myarr.length;i++)
        {
            for (int j=0;j<myarr[i].length;j++)
            {
                System.out.print(myarr[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
