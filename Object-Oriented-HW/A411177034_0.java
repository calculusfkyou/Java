// UVA11461

import java.util.Scanner;

public class A411177034_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                int beginNumber = scanner.nextInt(), endNumber = scanner.nextInt(); // 題目輸入
                if (beginNumber == 0 && endNumber == 0) // 若兩數皆等於0，則終止輸入
                    break;
                int countSquareNumbers = 0;
                for (int i = beginNumber; i <= endNumber; i++) { // 遍歷 beginNumber ~ endNumber 之間的整數
                    double square = Math.sqrt(i); // 判斷是否為完全平方數
                    if (square - (int) square == 0)
                        countSquareNumbers += 1; // 符合條件者 countSquareNumbers 加1
                }
                System.out.println(countSquareNumbers); // 輸出答案
            } catch (Exception e) { // 例外處理
                break;
            }
        }
        scanner.close(); // 關閉輸入
    }
}