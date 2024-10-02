package Advanced.Heap_PriorityQueue;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargest215 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        System.out.println(kthLargestElement(arr,k));
    }
    public static int kthLargestElement(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : nums){
            pq.add(i);
        }
        for(int i = 1 ; i < k ; i++){
            pq.poll();
        }
        return pq.peek();
    }
}
