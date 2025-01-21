import java.util.Arrays;
public class ReverseArray{
    public static void reverseArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        }
        public static void main(String[] args){
            int[] examplearray={1,2,3,4,5,6,7};
            System.out.println("Original array is:"+Arrays.toString(examplearray));
            reverseArray(examplearray);
            System.out.println("reversed array is:"+Arrays.toString(examplearray));
            
        }
}