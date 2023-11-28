package Object_Oriented_HW;

import java.util.Scanner;

public class A411177034_8 { // 這個程式的主要功能是遞迴實現merge sort並計算交換次數，主要通過拆分陣列、遞迴排序左右兩部分以及合併排序的過程來完成排序並計算交換次數。
    static int count = 0; // 紀錄排序次數

    public static void main(String[] args) { // 主程式
        Scanner scanner = new Scanner(System.in); // 輸入

        while (true) { // 持續輸入
            int arraySize = scanner.nextInt(); // 輸入為多少整數，意即接下來陣列會多大

            if (arraySize == 0) // 等於0則輸入結束
                break;

            int[] array = new int[arraySize]; // 宣告一個足夠大小的陣列

            for (int i = 0; i < arraySize; i++) { // 讀取陣列元素
                array[i] = scanner.nextInt();
            }

            mergeSort(array, 0, arraySize - 1); // 進入副程式
            System.out.println(count); // 輸出排序次數
            count = 0; // 重置計算次數
        }

        scanner.close(); // 關閉輸入
    }

    public static void mergeSort(int[] array, int left, int right) { // 副程式，合併排序
        if (left >= right) // 終止條件
            return;

        int middle = left + (right - left) / 2; // 計算中間索引
        mergeSort(array, left, middle); // 遞歸排序左半部分
        mergeSort(array, middle + 1, right); // 遞歸排序右半部分
        merge(array, left, middle, right); // 合併排序結果
    }

    public static void merge(int[] array, int left, int middle, int right) { // 副程式，合併兩個有序陣列
        int[] leftArray = new int[middle - left + 1]; // 創建左半部分陣列
        int[] rightArray = new int[right - middle]; // 創建右半部分陣列

        // 複製數據到左半部分陣列
        for (int i = 0; i < leftArray.length; i++)
            leftArray[i] = array[left + i];

        // 複製數據到右半部分陣列
        for (int j = 0; j < rightArray.length; j++)
            rightArray[j] = array[middle + 1 + j];

        int i = 0, j = 0, k = left; // 初始化，i 用於表示左半陣列的索引，j 則表示右半陣列，k 表示原陣列

        // 合併左右兩部分數組，左小右大
        while (i < leftArray.length && j < rightArray.length) {

            if (leftArray[i] <= rightArray[j]) { // 如果左邊的元素小於或等於右邊的元素，就將左邊的元素放入原陣列中，並將左陣列的索引 i 和原陣列的索引 k 同時增加 1
                array[k++] = leftArray[i++];
            } else { // 如果左邊的元素大於右邊的元素，將右邊的元素放入原陣列，同時將右陣列的索引 j 和原陣列的索引 k 同時增加 1，交換次數增加
                array[k++] = rightArray[j++];
                count += leftArray.length - i; // 統計交換次數
            }

        }

        // 將剩餘元素複製到原數組
        while (i < leftArray.length)
            array[k++] = leftArray[i++]; // 左陣列中還有元素未處理，就將這些元素複製到原陣列中，同時更新原陣列和左陣列的索引 k 和 i

        while (j < rightArray.length)
            array[k++] = rightArray[j++]; // 右陣列中還有元素未處理，就將這些元素複製到原陣列中，同時更新原陣列和左陣列的索引 k 和 j
    }
}
