package BasicLearning;
public class string {
    public static void main(String[] args){
        String x = "Hello";
        System.out.println(x);
        String y = "World!";
        String z = x + " " +y;
        System.out.println(z);
        
        //用 printf, format 格式化輸出
        // %d ：格式化為整數
        // %f ：格式化為浮點數
        // %s ：格式化為字串
        String a = "Corgi";
        System.out.printf("I love the %s\n",a);//不會自動換行

        int b=87;
        String data=String.format("你是%d",b);
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
    }
}
