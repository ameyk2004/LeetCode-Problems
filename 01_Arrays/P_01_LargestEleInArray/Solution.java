import java.util.Arrays;

public class Solution {

    public static int findLargestNumber(int arr[]){

        Arrays.sort(arr);

        return arr[arr.length-1];

    }

    public static void main(String[] args) {

        int arr[] = {10, 6, 5, 3, 2, 102};

        System.out.println("Largest Number is : " + findLargestNumber(arr));
    }

}