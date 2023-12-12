import java.util.*;

public class A411177034_11 { // 這個程式的主要功能是輸入學生的交換信息後，將原本的位置和想去的位置分開儲存並排序，再判斷兩陣列內容是否相同，輸出對應所求
    public static void main(String[] args) { // 主程式
        Scanner sc = new Scanner(System.in); // 輸入

        while (true) { // 持續輸入
            int student = sc.nextInt(); // 輸入學生數量

            if (student == 0) // 若為0，程式結束
                break;

            int[] from = new int[student], to = new int[student]; // 宣告兩個陣列，分別儲存原本的位置和想去的位置

            for (int i = 0; i < student; i++) { // 輸入每個學生的交換信息
                from[i] = sc.nextInt(); // 每列第一個，原本的位置
                to[i] = sc.nextInt(); // 每列第二個，想去的位置
            }

            Arrays.sort(from); // 原本的位置陣列排序
            Arrays.sort(to); // 想去的位置陣列排序

            if (Arrays.equals(from, to)) // 判斷兩個陣列是否一樣，若一樣就代表屬於交換計畫，否則不是，輸出對應所求
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        sc.close(); // 關閉輸入
    }
}