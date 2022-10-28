package sarthak;

public class sorting_using_arr {
    public static void main(String[] args) {

        //implement sselection sort
        int[] arr={27,182,33,5,8,39};

        System.out.println("array before sorting:");
        for (int i: arr)
        {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("");
        for(int i=0;i<arr.length-1;i++)
        {
            for (int j=i;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("array after sorting:");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}
