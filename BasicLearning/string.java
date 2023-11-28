package BasicLearning;

public class string {
    public static void main(String[] args) {
        String x = "Hello";
        System.out.println(x);
        String y = "World!";
        String z = x + " " + y;
        System.out.println(z);

        //用 printf, format 格式化輸出
        // %d ：格式化為整數
        // %f ：格式化為浮點數
        // %s ：格式化為字串
        String a = "Corgi";
        System.out.printf("I love the %s\n", a);//不會自動換行

        int b = 87;
        String data = String.format("你是%d", b);
        System.out.println(data);

        String name = "傻子";
        System.out.printf("你是%s，也是%d\n", name, b);

        //length 方法，獲取字串長度大小
        String bear = "小熊";
        System.out.println(bear.length());

        //equals 方法，判斷兩個字串是否相等
        String name1 = "me";
        String name2 = "you";
        String name3 = "you";
        System.out.println(name1.equals(name2));
        System.out.println(name2.equals(name3));

        //reverse 字串反轉
        //用 StringBuilder
        String str = "abc";
        StringBuilder re = new StringBuilder(str).reverse();
        System.out.println(re);

        // 字串和整數的特性
        String s1 = 123 + "abc";
        String s2 = String.valueOf(3);
        System.out.println(s1 + s2);
        int c = 25;
        String ss = "56";
        System.out.println(c + ss);

        // str1和str2指向字符串池中的相同對象，而str3指向堆內存中的新對象。
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");//創建一個新的字符串對象，並將其存儲在堆內存中。str3引用這個新創建的對象。
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        // 使用==運算符來比較str1和str2時，它們引用的是相同的字符串對象，因此比較結果是true。但當比較str1和str3時，它們引用不同的對象，因此比較結果是false。
    }
}
