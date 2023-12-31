package BasicLearning;

public class StatusChange {
    public static void main(String[] args) {
        // 容量：小 -> 大
        // byte —> short —> char —> int —> long—> float —> double
        byte a = 100;
        int b = a;
//        System.out.println(b);

        int c = 100;
        byte d = (byte) c;
//        System.out.println(d);

        // 強制轉型
        double PI = 3.14;
//        System.out.println((int) PI);

        // 轉不同進位
        int i = 127;
        int i1 = 0127;
        int i2 = 0x127;
        System.out.println(i);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(Integer.toHexString(i));
        System.out.println(Integer.toOctalString(i));
        System.out.println(Integer.toBinaryString(i));

        // 整數轉字串
        // Integer.toString()
        int intValue = 100;
        String stringValue = Integer.toString(intValue);
//        System.out.println(stringValue);

        // 字串轉整數
        // Integer.parseInt()
        String stringValue2 = "100";
        int intValue2 = Integer.parseInt(stringValue2);
//        System.out.println(intValue2);

        String stringValue3 = "3.14";
        double doubleValue2 = Double.parseDouble(stringValue3);
//        System.out.println(doubleValue2);

        String temp = String.valueOf(doubleValue2);
//        System.out.println(temp);

        Integer t = 10;
        int tt = t.intValue();
//        System.out.println(t);
//        System.out.println(tt);
//        System.out.println(t + tt);
    }
}
