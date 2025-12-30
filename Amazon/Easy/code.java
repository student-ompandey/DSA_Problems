
public class code {
    public static void main(String[] args){
        // Question - 1 
        // int arr[] = {0, 1, 1, 1, 2, 2, 3};
        // System.out.println(mergeSortedArray(arr));

        // Question - 2
        // int num1[] = {1, 2, 3, 0, 0, 0};
        // int num2[] = {2, 5, 6};
        // int m = num1.length - num2.length;
        // int n = num2.length;
        // merge(num1, num2, m, n);

        // for(int i=0;i<6;i++){
        //     System.out.println(num1[i] + " ");
        // }

        // Question - 3 pascal triangle
        // int n = 5; 
        // printPascalTringle(n);

        //  missing numner in the array
        int arr[] = new int[3];
        arr[0] = 3;
        arr[1] = 0;
        arr[2] = 1;
        System.out.println(missingNumber(arr));
    }


    // Question - 1
    // public static int mergeSortedArray(int arr[]){
    //     if(arr.length == 0 ) return 0;
    //     int i =0;
    //     for(int j=1;j<arr.length;j++){
    //         if (arr[i]<arr[j]){
    //             int temp = arr[i+1];
    //             arr[i+1] = arr[j];
    //             arr[j] = temp;
    //             i++;
    //         }
    //     }
    //     return i+1;
    // }

    // Question - 2

    // public static void merge(int nums1[], int nums2[], int m, int n){
    //     int i = m-1;
    //     int j = n-1;
    //     int k = m+n-1;
    //     while(i>=0 && j>=0){
    //         if(nums1[i]>nums2[j]){
    //             nums1[k] = nums1[i];
    //             i--;
    //             k--;
    //         } else {
    //             nums1[k] = nums2[j];
    //             j--;
    //             k--;
    //         }
    //     }

    //     while (j>=0){
    //         nums1[k] = nums2[j];
    //             j--;
    //             k--;
    //     }


    // pascal tringle function 
    // public static void printPascalTringle(int n){
    //     int arr [][] = new int [n][n];
    //     // arr[0][0] = 1;
    //     // arr[0][1] = 1; 
    //     // arr[1][0] = 1;

    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<=i;j++){
    //             if(j==0 || j==i){
    //                 arr[i][j] = 1;

    //             } else {
    //                 arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
    //             }
    //             System.out.print(arr[i][j] + " ");

    //         }
    //         System.out.println();
    //     }
    // }

    public static int missingNumber(int arr[]){
        int n_xor = arr.length;
        for(int i=0;i<arr.length;i++){
            n_xor ^= i;
            n_xor ^= arr[i];
        }
        return n_xor;
    }
}
