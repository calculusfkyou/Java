// UVA105
package Object_Oriented_HW;

import java.util.Scanner;

public class A411177034_3 { // 這個程式的主要功能是將測資存入陣列並且在每次輸入就更新一次給定範圍的最高高度，即為題目所述的skyline，最後印出所要求的格式 (高度有變化即會輸出一次索引值和高度)
    public static void main(String[] args) { //主程式
        Scanner scanner = new Scanner(System.in); // 輸入
        int rightest = 0; // 宣告一個變數，為了記錄最右邊的值
        int[] skylines = new int[10005]; // 宣告一個足夠大的陣列以儲存建築物的空中輪廓

        while (true) { // 用 try...catch 處理EOF的輸入問題，輸入每行有3個整數
            try {
                int left = scanner.nextInt(); // 儲存左邊位置
                int height = scanner.nextInt(); // 儲存建築物高度
                int right = scanner.nextInt(); // 儲存右邊位置

                if (right > rightest) { // 持續更新最右邊位置的數值
                    rightest = right;
                }

                for (int i = left; i < right; i++) { // 每輸入一次就遍歷左邊位置到右邊位置

                    if (height > skylines[i]) { // 如果高度有變更高，則更新現在高度
                        skylines[i] = height;
                    }

                }

            } catch (Exception e) {
                break;
            }
        }

        int now = 0; // 宣告一個變數儲存現在高度

        for (int i = 0; i < rightest; i++) { // 遍歷陣列，直到最右邊的位置

            if (skylines[i] != now) { // 處理輸出，按照題目所要求的輪廓印出
                System.out.printf("%d %d ", i, skylines[i]); // 印出索引值和高度
                now = skylines[i]; // 更換變數 now 的現在數值，因為沒有要重複印同樣高度
            }

        }

        System.out.println(rightest + " 0"); // 最後兩個數印出最右邊的位置和 0
        scanner.close(); // 關閉輸入
    }
}