public class declare{
    public static void main(String[] args){
        int i;
        i = 100;
        int j = 66;
        //可以透過 println 列印語法，將存放在 i 和 j 箱子裡面的資料印出來
        System.out.println("i: " + i);
        System.out.println("j: " + j);

        // final 型態不能重覆塞值
        //錯誤範例：
        final int I = 99;
        // I = 100;
        final int J = 100;
        System.out.println(I+J);
    }
}