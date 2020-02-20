package stringmanipulation;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SherlockStringValidation {


    public static void main(String[] args) throws IOException {
        File file = FileUtils.getFile("src/main/resource/input.txt");
        String s = FileUtils.readFileToString(file, Charset.defaultCharset());
        System.out.println(isValidSherlockString(s));
    }

    private static String isValidSherlockString(String s) {
        boolean sherlockStrValid = false;
        int[] charFreq = new int[26];
        for(int i=0;i<s.length();i++){
            charFreq[s.charAt(i) - 'a']++;
        }

        Map<Integer, Integer> charFreqMap = new HashMap<>();
        for (int i : charFreq) {
            if (i == 0) {
                continue;
            } else if (charFreqMap.containsKey(i)) {
                charFreqMap.put(i, charFreqMap.get(i) + 1);
            } else {
                charFreqMap.put(i, 1);
            }
        }

        List<Integer> keyList = new ArrayList<>();

        if (charFreqMap.size() == 1){
            return "YES";
        }else if(charFreqMap.size() == 2){
            for(Map.Entry<Integer, Integer> entry : charFreqMap.entrySet()){
                if(entry.getKey() == 1 && entry.getValue() == 1){
                    return "YES";
                }else if(entry.getKey() == 1 && entry.getValue() >= 1){
                    return "NO";
                }else{
                    sherlockStrValid = true;
                }
                keyList.add(entry.getKey());

            }
        }else if(charFreqMap.size() > 2){
            return "NO";
        }

        if(sherlockStrValid){
            if(Math.abs(keyList.get(0) - keyList.get(1)) == 1){
                return "YES";
            }else {
                return "NO";
            }
        }

        return null;
    }
}
