package stringmanipulation;

public class CommonChild {

    public static void main(String[] args){

        String s1 = "OUDFRMYMAW";
        String s2 = "AWHYFCCMQX";

        System.out.println(lcsDynamic(s1.toCharArray(), s2.toCharArray()));

    }

    private static int commonChild(String s1, String s2) {

        if (s1.length() != s2.length()){
            return 0;
        }

        int len1 = s1.length();
        int len2 = s2.length();
        int maxCount = 0;
        for (int i = 0; i < len1; i++) {
            int maxItr = 0, savedIndexS1 = 0, savedIndexS2 = 0;
            for (int j = 0; j < len2; j++) {
                if (s1.charAt(i) == s2.charAt(j)){
                    maxItr++; savedIndexS1 = i; savedIndexS2 = j;
                    for (int k = savedIndexS1+1; k < len1; k++) {
                        for (int l = savedIndexS2+1; l < len2; l++) {
                            if (s1.charAt(k) == s2.charAt(l)){
                                maxItr++; break;
                            }
                        }
                    }
                    break;
                }
            }
            if (maxCount < maxItr){ // 1
                maxCount = maxItr;
            }
        }
        return maxCount;
    }

    public static int lcsDynamic(char str1[],char str2[]){

        int temp[][] = new int[str1.length + 1][str2.length + 1];
        int max = 0;
        for(int i=1; i < temp.length; i++){
            for(int j=1; j < temp[i].length; j++){
                if(str1[i-1] == str2[j-1]) {
                    temp[i][j] = temp[i - 1][j - 1] + 1;
                }
                else
                {
                    temp[i][j] = Math.max(temp[i][j-1],temp[i-1][j]);
                }
                if(temp[i][j] > max){
                    max = temp[i][j];
                }
            }
        }
        return max;

    }
}
