package Object_Oriented_HW;// UVA572

import java.util.*;

// 這個程式主要功能是使用DFS計算oil deposit的數量，因為一個點擴展出去的八個點若有相同則不重複計算，將訪問過的點變回'*'，持續擴展並搜尋且紀錄數量，最後輸出數量。
public class A411177034_5 {
    static int[][] directions = {{1, 0}, {1, 1}, {0, 1}, {-1, 1}, {-1, 0}, {-1, -1}, {0, -1}, {1, -1}}; // 定義8個方向

    // 副程式，dfs，深度優先搜尋，會從一個點擴展出去，若在遍歷的過程中有符合條件的點，會再以這個點往後搜尋，直到沒有符合條件的點，再回到前一個做DFS，循環往復，直到搜尋完成。
    public static int dfs(int i, int j, char[][] graph, int row, int column) {

        if (i < 0 || i >= row || j < 0 || j >= column) // 越界返回0
            return 0;

        if (graph[i][j] == '*') // 遇到已訪問過的點返回0
            return 0;

        graph[i][j] = '*'; // 標記為已訪問

        for (int[] d : directions) { // dfs搜索八個方向
            dfs(i + d[0], j + d[1], graph, row, column); // 遞迴搜索
        }

        return 1; // 找到一個連通塊返回1
    }

    public static void main(String[] args) { // 主程式
        Scanner scanner = new Scanner(System.in); // 輸入

        while (true) { // 持續輸入
            int row = scanner.nextInt(); // 輸入幾列
            int column = scanner.nextInt(); // 輸入幾行

            if (row == 0 && column == 0) // 如果每次輸入的前兩數等於0，就停止輸入，結束程式
                break;

            char[][] graph = new char[row][column]; //宣告一個足夠大小的二維陣列，用於儲存輸入的地

            for (int i = 0; i < row; i++) { // 一列一列輸入
                String s = scanner.next();

                for (int j = 0; j < column; j++) { // 一個一個將這列的元素取出存入相對應的graph位置
                    graph[i][j] = s.charAt(j); // 放入相對應的位置
                }

            }

            int count = 0; // 用於計算oil deposit的數量

            for (int i = 0; i < row; i++) { // 一列一列判斷

                for (int j = 0; j < column; j++) {

                    if (graph[i][j] == '@') { // 如果這一小塊地是@，就進入副程式
                        dfs(i, j, graph, row, column); // 進入副程式
                        count++; // 數量加一
                    }

                }

            }

            System.out.println(count); // 輸出oil deposit的數量
        }

        scanner.close(); // 關閉輸入
    }
}