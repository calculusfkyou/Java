package Object_Oriented_HW;

import java.util.*;

public class A411177034_12 { // 這段城市的主要功能是使用動態規劃計算湊出指定金額的硬幣組合數。先輸入不同面額的硬幣，然後輸入目標金額。通過動態規劃的方法計算出湊出目標金額的不同硬幣組合數，最終輸出結果。
    public static void main(String[] args) { // 主程式
        Scanner sc = new Scanner(System.in); // 輸入
        String[] values = sc.nextLine().split(" "); // 讀取不同面額的硬幣，並將其儲存在一個字符串數組中
        int[] coins = new int[values.length]; // 宣告一個整數陣列，用於儲存硬幣面額


        for (int i = 0; i < coins.length; i++) { // 遍歷字串陣列的硬幣輸入
            coins[i] = Integer.parseInt(values[i]); // 將面額輸入轉成整數
        }

        int amount = sc.nextInt(); // 讀取要湊出的金額
        int[] coinCombination = new int[amount + 1]; // 創建一個數組 coinCombination 用於儲存硬幣組合，coinCombination[i] 代表湊出金額 i 有幾種硬幣組合
        coinCombination[0] = 1; // 初始化，湊出金額為 0 的組合只有一種，即不選擇任何硬幣

        for (int denomination : coins) { // 遍歷每一種硬幣面額

            // 從硬幣的面額開始遍歷到要湊出的金額
            for (int j = denomination; j <= amount; j++) {
                coinCombination[j] += coinCombination[j - denomination]; // 更新 coinCombination[j]，表示湊出金額 j 的硬幣組合數，加上湊出金額 (j - denomination) 的硬幣組合數
            }

        }

        System.out.println(coinCombination[amount]); // 輸出湊出指定金額的硬幣組合數
        sc.close(); // 關閉輸入
    }
}