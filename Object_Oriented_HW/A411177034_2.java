package Object_Oriented_HW;// UVA299

import java.util.Scanner;

public class A411177034_2 { // 這個程式的主要功能是計算出對於每一筆測試資料，進行排序所需的最小交換次數。程式使用氣泡排序法來模擬排序過程，然後輸出結果。
    public static int bubbleSort(int[] subCarriages) { // 氣泡排序法，左小右大，由左往右排
        int count = 0; // 宣告一個變數紀錄交換了幾次
        for (int a = 0; a < subCarriages.length - 1; a++) { // 遍歷陣列元素，所有元素都會檢查一次
            for (int b = 0; b < subCarriages.length - 1; b++) {
                if (subCarriages[b] > subCarriages[b + 1]) { // 和右邊的元素比較，若原數字較大，則交換陣列元素並紀錄一次交換
                    int temp = subCarriages[b];
                    subCarriages[b] = subCarriages[b + 1];
                    subCarriages[b + 1] = temp;
                    count++;
                }
            }
        }
        return count; // 回傳紀錄的交換次數
    }

    public static void main(String[] args) { // 主程式
        Scanner scanner = new Scanner(System.in); // 輸入
        int testCase = scanner.nextInt(); // 題目輸入，有幾筆測資
        for (int i = 0; i < testCase; i++) {
            int length = scanner.nextInt(); // 第一個數表示火車有幾個車廂
            int[] carriages = new int[length]; // 宣告已知大小的整數陣列
            for (int j = 0; j < length; j++) {
                carriages[j] = scanner.nextInt(); // 輸入車廂編號的排序
            }
            int count = bubbleSort(carriages); // 宣告一個變數紀錄函式結果
            System.out.println("Optimal train swapping takes " + count + " swaps."); // 輸出題目所求的格式、交換次數
        }
        scanner.close(); // 關閉輸入
    }
}