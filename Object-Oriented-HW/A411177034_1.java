//UVA10041

import java.util.Scanner;
import java.util.Arrays;

public class A411177034_1 { // 這個程式的主要功能是計算一系列街區的中位數（median）與每個街區到中位數的距離總和
    public static void main(String[] args) { // 主程式
        Scanner scanner = new Scanner(System.in); // 輸入
        int testCase = scanner.nextInt(); // 題目輸入，有幾筆測資
        for (int i = 0; i < testCase; i++) {
            int relatives = scanner.nextInt(); // 第一個數表示後面有幾個親戚
            int[] streetNumber = new int[relatives]; // 宣告已知大小的整數陣列
            for (int j = 0; j < relatives; j++) {
                streetNumber[j] = scanner.nextInt(); // 輸入親戚家的 street number
            }
            Arrays.sort(streetNumber); // 將此陣列排序
            int medianDistance = 0;
            if (relatives % 2 == 0) { // 取此陣列的中位數，變數 relatives 已知為陣列長度，故直接使用
                medianDistance = (streetNumber[relatives / 2] + streetNumber[relatives / 2 - 1]) / 2;
                // 陣列長度為偶數，中位數為中間兩個相加除 2
            } else {
                medianDistance = streetNumber[relatives / 2]; // 陣列長度為奇數，中位數為中間那一個數
            }
            int sumOfDistance = 0;
            for (int j = 0; j < relatives; j++) { // 遍歷此陣列，算出中位數和每一個親戚家距離的總和
                sumOfDistance += Math.abs(medianDistance - streetNumber[j]);
            }
            System.out.println(sumOfDistance); // 輸出總和即為題目所求
        }
        scanner.close(); // 關閉輸入
    }
}