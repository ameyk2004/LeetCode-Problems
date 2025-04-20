public class Solution {
    
    public static void main(String[] args) {
        
        int arr[] = {-1,10,20,30,1000,23,56};

        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int num : arr){

            if(num < smallest){
                second_smallest = smallest;
                smallest = num;
            }

            if(num > largest){
                second_largest = largest;
                largest = num;
            }

            if(num > second_largest && num!=largest){
                second_largest = num;
            }

            if(num < second_smallest && num!=smallest){
                System.out.println(num);
                System.out.println(second_smallest);
                second_smallest = num;
            }

        }

        System.out.println("Largest : "+largest);
        System.out.println("Second Largest : "+second_largest);
        System.out.println("Smallest : "+smallest);
        System.out.println("Second Smallest : "+second_smallest);
    }
}
