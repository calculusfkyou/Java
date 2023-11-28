package Object_Oriented_HW;

import java.util.*;

public class A411177034_9 { // 這個程式的主要功能是先處理好迷宮陣列，利用DFS走迷宮，右下左上四個方向去走，遇到死路則回頭找，最後判斷是否有路徑，有責輸出所有路徑，無則輸出(0,0)
    static boolean[][] visited; // 宣告一個全域陣列確認是否已走訪過
    static ArrayList<int[]> path = new ArrayList<>(); // 宣告一個全域陣列儲存走過點的座標

    public static boolean dfs(int[][] maze, int x, int y, int size) { // 副程式，DFS走迷宮

        if (x == size - 1 || y == size - 1) { // 若目前走到的點的x或y座標為最後一列或最後一行，表示到達終點，有路徑，加入這個點座標
            path.add(new int[]{x, y}); // 加入點座標
            return true; // 回傳true
        }

        // 判斷目前的點是否為0、有無越界、有無拜訪過，若為0、無越界、無拜訪過，則進入判斷式
        if (x >= 0 && x < size && y >= 0 && y < size && maze[x][y] == 0 && !visited[x][y]) {
            visited[x][y] = true; // 標示true表示已拜訪過
            path.add(new int[]{x, y}); // 路徑陣列加入目前的點座標

            if (dfs(maze, x, y + 1, size)) // 向右走
                return true; // 回傳true

            if (dfs(maze, x + 1, y, size)) // 向下走
                return true; // 回傳true

            if (dfs(maze, x, y - 1, size)) // 向左走
                return true; // 回傳true

            if (dfs(maze, x - 1, y, size)) // 向上走
                return true; // 回傳true

            // 若四個方向都走不通，回溯並移除目前加入的點座標
            path.remove(path.size() - 1);
            return false; // 回傳false
        }

        return false; // 沒路回傳false
    }

    public static void main(String[] args) { // 主程式
        Scanner sc = new Scanner(System.in); // 輸入
        int size = sc.nextInt(); // 輸入一正整數，代表迷宮的尺寸和一列有多少個數字輸入
        int[][] maze = new int[size][size]; // 宣告迷宮陣列
        visited = new boolean[size][size]; // 宣告一個全域陣列確認是否已走訪過

        for (int i = 0; i < size; i++) { // 處理輸入總共有size*size個數字

            for (int j = 0; j < size; j++) {
                maze[i][j] = sc.nextInt(); // 讀取輸入到指定陣列位置
            }

        }

        if (dfs(maze, 0, 0, size)) { // 判斷DFS走迷宮是否有路徑

            for (int[] arr : path) { // 印出路徑陣列中的所有路徑
                System.out.println("(" + (arr[0] + 1) + "," + (arr[1] + 1) + ")"); // 按照格式輸出
            }

        } else { // 若無路徑，輸出(0,0)
            System.out.println("(0, 0)");
        }

        sc.close(); // 關閉輸入
    }
}