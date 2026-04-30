public class Arrays {

    // car pooling problem 
    static boolean carpooling(int[][] trips, int cap){
        int m[] = new int [1001];
        for(int a[] : trips){
            m[a[1]] += a[0];
            m[a[2]] -= a[0];
        }

        for(int i=0; i<1001 && cap>=0;i++){
            cap -= m[i];
        }
        return cap >=0;
    }
    public static void main(String args[]){
        int trips[][] = {{2, 1, 5}, {3, 3, 7}};
        System.out.println(carpooling(trips, 5));
    }
}
