package BinaryManipulation;

public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
//        System.out.println(Integer.toBinaryString(a));
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);
    }
}
