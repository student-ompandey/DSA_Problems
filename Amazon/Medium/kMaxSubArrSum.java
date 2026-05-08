public class kMaxSubArrSum {

    static int kSubArraySum(int arr[], int k){
        int n = arr.length;
        int windowSum = 0;
        int maxSum = 0;

        for(int i = 0;i<k;i++){
            windowSum += arr[i];
        }
        maxSum = windowSum;

        for(int i=k;i<n;i++){
            windowSum += arr[i] - arr[i-k];
            maxSum = Math.max(windowSum, maxSum);
        }
        return maxSum;
    }
    public static void main(String [] args){
        int arr [] = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(kSubArraySum(arr, k));
    }
}
