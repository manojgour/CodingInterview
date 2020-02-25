package BinaryManipulation;

import com.sun.xml.internal.rngom.binary.SchemaPatternBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BitShiftOperator {

    public static void main(String[] args){
        int val = 'c' - 'a';

        System.out.println("Original Decimal: "+ val);
//        System.out.println("Binary format of "+size+" is "+Integer.toBinaryString(size));
//        System.out.print("Right shift of "+size+" is "); System.out.println(size >> 1);
//        System.out.println(Integer.toBinaryString(size >> 1));
        System.out.print("Left shift of "+val+" is "); System.out.println(1 << val);
        System.out.println(Integer.toBinaryString(1 << val ));
        System.out.println(1 & (1<<val));
        if((1 & (1 << val)) > 0){
            System.out.println("true");
        }

//        Map<String, Integer> hashMap = new HashMap<>();
    }
}
