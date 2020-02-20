package stringmanipulation;

import java.util.Scanner;

public class StairCase {

    static void staircase(int n) {

        for (int i = 0; i < n; i++) {
            StringBuilder stringBuilder =  new StringBuilder();
            int count = n-i-1; //2
            for (int j = 0; j < count; j++) {
                stringBuilder.append(" ");
            }
            while(count<n){
                stringBuilder.append("#");
                count++;
            }

            System.out.println(stringBuilder.toString());
        }


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(6);

        scanner.close();
    }
}
