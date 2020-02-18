package arrays;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();

    }

    private static void plusMinus(int[] arr) {

        String[] result = new String[3];
        int len = arr.length;
        int countZero=0, countpos=0, countneg=0;

        DecimalFormat df = new DecimalFormat("#.######");
        df.setRoundingMode(RoundingMode.HALF_EVEN);

        for (int value : arr) {
            if (value == 0) {
                countZero++;
            } else if (value > 0) {
                countpos++;
            } else {
                countneg++;
            }
        }
        result[0] = String.valueOf(df.format((double)countpos / len));
        result[1] = String.valueOf(df.format((double)countneg / len));
        result[2] = String.valueOf(df.format((double)countZero / len));

        for (int i = 0; i < 3; i++) {
            if(!result[i].equals("0") && result[i].contains(".")){
                String decimalPart = result[i].substring(result[i].indexOf("."));
                if(decimalPart.length() < 7){
                    int diff = 7 - decimalPart.length()+1;
                    result[i] = String.valueOf(String.format("%."+diff+"f", Double.parseDouble(result[i])));
                }
            }else if(Integer.parseInt(result[i]) > 0){
                result[i] = result[i] + ".000000";
            }else{
                result[i] = "0.000000";
            }
            System.out.println(result[i]);
        }
    }
}
