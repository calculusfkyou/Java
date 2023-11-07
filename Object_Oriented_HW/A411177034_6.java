package Object_Oriented_HW;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A411177034_6 { // 這個程式主要功能，先讀取使用者輸入的字串，利用遞迴產生該字串的所有排列組合，判斷是否已在集合內，若無則印出並加入集合，目的是不重複印出
    public static void getPermutations(String string, String current, Set<String> used) { // 副程式，取得輸入字串所有的排列組合，利用遞迴生成並輸出

        if (string.isEmpty()) { // 如果待排列的字串已空，表示已經生成一個排列組合

            if (!used.contains(current)) { // 如果此排列組合未在集合中，表示未輸出過
                used.add(current); // 輸出過了，加入集合
                System.out.println(current); // 輸出其中一種
            }

        } else {

            for (int i = 0; i < string.length(); i++) { // 遍歷字串，利用索引值取出需排列的子字串
                String remaining = string.substring(0, i) + string.substring(i + 1); // 獲取待排列部分
                getPermutations(remaining, current + string.charAt(i), used); // 遞迴,固定當前字符, 生成剩餘部分的排列組合
            }

        }

    }

    public static void main(String[] args) { // 主程式
        Scanner scanner = new Scanner(System.in); // 輸入
        String inputString = scanner.next(); // 輸入為一字串
        Set<String> used = new HashSet<>(); // 建立一個集合，用來判斷是否已輸出過
        getPermutations(inputString, "", used); // 進入副程式
        scanner.close(); // 關閉輸入
    }
}
