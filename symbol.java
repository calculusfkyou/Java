public class symbol {
    public static void main(String[] args){
        int a = 10;
        int b = 2;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);  
        System.out.println(a%b);

        String s1 = "Hello ";
        String s2 = "world";
        System.out.println(s1+s2);

        //instanceof 
        //用來判斷是否同一個特定類別
        String s3 = "Hello World";
        System.out.println(s3 instanceof String);
    }
}
