/**
 *
 * This problem can be solved with brute force approach but will lead to O(n*m) times
 * it can be solved in linear time using prefix sum algorithm in O(n+m) times
 *
 * **/

package arrays;

public class ArrayManipulation {

    static long arrayManipulation(int n, int[][] queries) {
        long[] arr = new long[n+2];

        for(int i=0; i<queries.length; i++){
            int startIndex = queries[i][0];
            int endIndex = queries[i][1];
            long valToAdd = queries[i][2];

            arr[startIndex] += valToAdd;
            arr[endIndex+1] -= valToAdd;
        }
        long max = findMax(arr);
        return max;
    }

    private static long findMax(long[] arr){
        long max = Long.MIN_VALUE;
        long sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            max = Math.max(sum, max);
        }
        return max;
    }

    public static void main(String[] args)  {

        int n = 10;
        int m = 4;
        int[][] queries = {
                            {2,6,8},
                            {3,5,7},
                            {1,8,1},
                            {5,9,15}
                         };

        long result = arrayManipulation(n, queries);
        System.out.println(result);
    }

}
