import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1;
        arr1=new int[5];
        int[] arr4 ={1,2,3,4,5,6};
        int[] arr5 ={0,9,8,7,6,5,42,1};
        System.out.println(arr1.length);
        arr1=new int[100];
        System.out.println(arr1.length);
        System.out.println("-----------------------------------");
        int[] [] arr={
                {1,2},
                {22,33,33,44,88},
                {56,34,78,211},
                {}
        };
        System.out.println(arr.length);
        System.out.println(arr[1].length);
        System.out.println("-----------------------------------");

        Arrays.sort(arr5);
        System.out.println(arr5);
        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.binarySearch(arr5,42));
        System.out.println(Arrays.equals(arr5,arr4));
        System.out.println("-----------------------------------");


    }
}
