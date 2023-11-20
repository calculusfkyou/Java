package Object_Oriented_HW;

import java.util.Scanner;

// 這個程式的主要功能是先讀取字串和欲輸出字串的長度，然後進入副程式，判斷長度是否為所求長度，遍歷字串中的每個字符，固定字符並遞迴加入當前組合，重複固定不同字符遞迴,直到生成符合所求長度的組合，最後輸出。
public class A411177034_7 {
    public static void main(String[] args) { // 主程式
        Scanner sc = new Scanner(System.in); // 建立Scanner物件以讀取使用者輸入
        String inputString = sc.next(); // 讀取使用者輸入的字串
        int length = sc.nextInt(); // 讀取使用者輸入的子字串長度
        subsetHelper(inputString, "", length); // 進入副程式，印出所求的組合
    }

    public static void subsetHelper(String string, String current, int length) { // 副程式，子字串生成，遞迴生成組合的函數。傳入剩餘字符串、當前組合和所求長度

        if (current.length() == length) { // 如果當前組合 current 的長度等於 length，代表找到一個要求長度的組合
            System.out.println(current); // 將該組合印出
            return; // 終止當前遞迴分支
        }

        for (int i = 0; i < string.length(); i++) { // 遍歷字串中的每個字符
            String remaining = string.substring(i + 1); // 得到剩餘的待選部分
            subsetHelper(remaining, current + string.charAt(i), length); // 遞迴,使當前字符加入組合，並繼續傳入剩餘部分的字串生成組合
        }

    }
}