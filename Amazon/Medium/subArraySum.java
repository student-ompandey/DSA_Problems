public class subArraySum {
    public static int printSubarrays(int[] arr){
        int n = arr.length;
        int sum = 0;
        // Pick starting point
        for (int i = 0; i < n; i++) {
            // Pick ending point
            int minV = arr[i];
            int maxV = arr[i];
            for (int j = i; j < n; j++) {
                // Print subarray from current starting and ending points
               minV = Math.min(minV, arr[j]);
               maxV = Math.max(maxV, arr[j]);
               sum += maxV - minV;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(printSubarrays(arr));

    }
}
