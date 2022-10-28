package sarthak;


public class array_practice_set {
    // Problem 01: linear search
    boolean find(int[] arr, int key)
    {
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return true;
            }
        }
        return false;
    }

    // Problem 02 : check whether given array is sorted or not
    static boolean check_sorted(int[] arr)
    {
        boolean flag=true;
        for (int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                flag=false;
                break;
            }
        }
        return flag;
    }

    // Problem 03: addition of 2 matrices
    void add(int[][] arr1, int[][] arr2)
    {
        int[][] res=new int[10][10];

        for(int i=0;i<arr1.length;i++)
        {
            for (int j=0;j<arr2.length;j++)
            {
                res[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(res[i][j]+" ");
            }
            System.out.println("");
        }
    }

    // Problem 04: find maximum number from array
    int maxNum(int[] arr)
    {
        int mx=0;
        for(int element: arr)
        {
            if(mx<element)
            {
                mx=element;
            }
        }
        return mx;
    }
    public static void main(String[] args) {
        array_practice_set obj=new array_practice_set();
//        int[] arr={1,2,3,4,5};
//        System.out.println(obj.find(arr, 5));
//
//        System.out.println("Given array sorted or not: "+check_sorted(arr));

//        int[][] arr1={{1,3,4},{2,4,3},{3,4,5}};
//        int[][] arr2={{1,3,4},{2,4,3},{1,2,4}};
//        obj.add(arr1, arr2);

        int[] nums={23,45,21,88,36,96};
        System.out.println("maximum number from given array is: "+ obj.maxNum(nums));
    }
}
