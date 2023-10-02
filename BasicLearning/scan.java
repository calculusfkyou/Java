package BasicLearning;
import java.util.Scanner;

public class scan{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();         // 讀整行
        String[] names = name.split(",");       // JAVA 輸入有分隔符號需要這樣取
        // String a = input.next();             // 不讀空格，換行
        int num = input.nextInt();              // 讀入整數
        float n2 = input.nextFloat();           // 讀入小數
        boolean b1 = input.nextBoolean();       // 讀入布林值
        
        System.out.println(name);
        System.out.println(names[0]);
        // System.out.println(a);   
        System.out.println(num);
        System.out.println(n2);
        System.out.println(b1);
        
        input.close();
    }
}