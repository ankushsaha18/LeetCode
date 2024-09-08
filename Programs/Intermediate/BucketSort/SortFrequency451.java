package Intermediate.BucketSort;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortFrequency451 {
    public static void main(String[] args) {
        String s = "Aabb";
        System.out.println(frequencySort(s));
    }
    public static String frequencySort(String s) {
        int[] arr = new int[125];
        for (char ch : s.toCharArray()){
            arr[ch]++;
        }
        LinkedList<Pair> list = new LinkedList<>();
        for(int i = 48 ; i <= 122 ; i++){
            if(arr[i] > 0){
                list.add(new Pair(arr[i],(char) i));
            }
        }
        Collections.sort(list, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o2.count - o1.count;
            }
        });
        StringBuilder sb = new StringBuilder();
        for(Pair p : list){
            while (p.count > 0){
                sb.append(p.element);
                p.count--;
            }
        }
        return sb.toString();
    }
}
class Pair{
    int count;
    char element;
    public Pair(int count,char element){
        this.count = count;
        this.element = element;
    }
}
