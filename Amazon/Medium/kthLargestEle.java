import java.util.*;
public class kthLargestEle {
    static int kLargest(int arr[], int k){
        PriorityQueue<Integer> ans = new PriorityQueue<>();
        for(int x : arr){
            ans.add(x);
            if(ans.size()>k){
                ans.poll();
            }

        }
        return ans.peek();
    }
    public static void main(String[] args){
        int arr [] = {3, 2, 1, 5, 6, 4};
        System.out.println(kLargest(arr, 2));
    }
}
