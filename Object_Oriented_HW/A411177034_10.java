package Object_Oriented_HW;

import java.util.*;

// 這個程式的主要功能是先由小到大排序區域高度，然後從小的高度開始計算是否有超過下一個高度，將降雨量平均分配到目前數量的區域，判斷目前淹水高度有無大於目前高度，若無，代表淹水到此高度而已，輸出所求，若有，繼續往下一區域判斷，直到結束
public class A411177034_10 {
    public static void main(String[] args) { // 主程式
        Scanner sc = new Scanner(System.in); // 輸入
        int caseCount = 0; // 紀錄第幾組輸出資料

        while (true) { // 持續輸入
            int row = sc.nextInt(), column = sc.nextInt(); // 輸入

            if (row == 0 & column == 0) // 若這兩個整數輸入為0，跳出迴圈
                break;

            caseCount += 1; // 計算第幾組輸出資料
            int[] field = new int[row * column]; // 建立一個足夠大小的陣列，存放各區域的高度

            for (int i = 0; i < field.length; i++) { // 輸入高度
                field[i] = sc.nextInt();
            }

            Arrays.sort(field); // 將區域高度排序
            double rainFall = sc.nextDouble() / 100.0; // 輸入雨量
            double floodHeight = 0, lowestHeight = 0; // 宣告兩個變數，分別記錄淹水高度、最低高度(目前高度往前高度的總和)

            for (int i = 0; i < field.length; i++) { // 遍歷陣列
                floodHeight = (lowestHeight + rainFall + field[i]) / (i + 1); // 淹水高度為 最低高度+降雨量+目前高度 除以 i+1(有多少區域)

                if (floodHeight <= field[i + 1]) { // 如果淹水高度小於等於目前區域的高度，代表水只會淹到這個高度，輸出所求
                    System.out.println("Region " + caseCount); // 輸出資料編號
                    System.out.printf("Water level is %.2f meters.\n", Math.round(floodHeight * 100.0) / 100.0); // 輸出淹水高度，乘100是四捨五入到小數點第二位
                    System.out.printf("%.2f percent of the region is under water.\n", Math.round((i + 1) * 100.0 / (row * column) * 100.0) / 100.0); // 輸出淹水面積占總面積的百分比率，乘100是四捨五入到小數點第二位
                    break; // 達到所求，跳出迴圈
                }

                lowestHeight += field[i]; // 若小於，最低高度加上目前高度
            }

            if (floodHeight > field[field.length - 1]) { // 水淹過最高的地區，也代表這塊土地全被淹沒
                System.out.println("Region " + caseCount); // 輸出資料編號
                System.out.printf("Water level is %.2f meters.\n", Math.round(floodHeight * 100.0) / 100.0); // 輸出淹水高度，乘100是四捨五入到小數點第二位
                System.out.println("100 percent of the region is under water."); // 輸出淹水面積占總面積的百分比率，乘100是四捨五入到小數點第二位
            }

        }

        sc.close(); // 關閉輸入
    }
}
