package Fundamental.String;
import java.util.Arrays;

public class ReverseString244 {
    public static void main(String[] args) {
        char[] arr = {'h','e','l','l','o'};
        reverseString(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverseString(char[] s) {
        int start = 0,end = s.length - 1;
        while(start<end){
            swap(s,start,end);
            start ++;
            end --;
        }
    }
    public static void swap(char[] arr,int a,int b){
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
