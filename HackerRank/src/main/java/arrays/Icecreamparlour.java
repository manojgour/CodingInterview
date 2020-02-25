package arrays;

public class Icecreamparlour {

    static int[] icecreamParlor(int m, int[] arr) {
        int len = arr.length;
        int[] result = new int[2];
        for(int i = 0; i < len; i++){
            int bal = m - arr[i];
            if(bal > 0){
                for(int j = i+1; j < len; j++){
                    if(bal == arr[j]){
                        result[0] = i+1;
                        result[1] = j+1;
                        return result;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        int m = 4;
        int[] arr = new int[]{1,4,5,3,2};

        int[] result = icecreamParlor(m, arr);
        System.out.println(result[0]+" "+result[1]);

    }

}
