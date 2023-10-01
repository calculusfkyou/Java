import java.util.*;

// class Test{
//     public int x;
//     Test(int val){ x = val;}
//     void show(){
//         System.out.println(x);
//     }
// }
public class test {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int z;
        // for(int i=0;i<5;i++){
        // z=sc.nextInt();
        // System.out.println(z);
        // }

        String s1 = 123 + "abc";
        String s2 = String.valueOf(3);
        System.out.println(s1 + s2);

        int temp = 3;
        switch (temp) {
            case 4:
                System.out.println("動力套件");
            case 3:
                System.out.println("天窗");
            case 2:
                System.out.println("DVD");
            case 1:
                System.out.println("自排 冷氣");
        }
    }
}