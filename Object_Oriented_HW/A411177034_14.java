package Object_Oriented_HW;

import java.util.PriorityQueue;
import java.util.Scanner;

// 這個程式使用 Dijkstra 演算法找到迷宮中從左上角到右下角的最短路徑。
// 在 Dijkstra 演算法中，使用優先佇列（PriorityQueue）儲存待處理的節點，同時使用陣列來記錄最短路徑的數值。
// 程式碼中的 Triple 類別用來封裝數值和座標，以便放入優先佇列。
// 會超時
public class A411177034_14 {

    // 定義 Triple 類別，用於保存數值和對應的座標，實作 Comparable 用於 PriorityQueue 排序
    static class Triple implements Comparable<Triple> {
        int value, x, y; // 數值和對應的座標

        // Triple 類別的建構子，初始化數值和座標
        public Triple(int value, int x, int y) {
            this.value = value;
            this.x = x;
            this.y = y;
        }

        // 實現 compareTo 方法，用於 PriorityQueue 排序
        @Override
        public int compareTo(Triple other) {
            return Integer.compare(this.value, other.value);
        }
    }

    static int row, column; // 儲存迷宮的行數和列數
    static int[][] map; // 儲存迷宮數值的二維陣列
    static int[][] values; // 儲存最短路徑數值的二維陣列
    static boolean[][] visited; // 儲存是否訪問過的二維陣列
    static int[][] d = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // 定義四個方向的偏移量
    static PriorityQueue<Triple> priorityQueue; // 用於 Dijkstra 演算法的優先佇列

    // Dijkstra演算法計算最短路徑
    static void dijkstra() {
        values[0][0] = map[0][0]; // 起點的最短路徑代價為起點的數值
        priorityQueue.add(new Triple(map[0][0], 0, 0)); // 將起點加入優先佇列

        // 持續做到佇列為空
        while (!priorityQueue.isEmpty()) {
            Triple triple = priorityQueue.poll(); // 從優先佇列中取出最小元素
            int value = triple.value;
            int x = triple.x;
            int y = triple.y;
            visited[x][y] = true; // 標記該點為已訪問

            // 遍歷四個方向
            for (int i = 0; i < 4; ++i) {
                int nowX = x + d[i][0];
                int nowY = y + d[i][1];

                // 確認新的位置是合法的
                if (nowX >= 0 && nowX < row && nowY >= 0 && nowY < column && !visited[nowX][nowY]) {
                    int temp = value + map[nowX][nowY];

                    // 如果新的路徑數值更小，則更新路徑數值並將該節點加入優先佇列
                    if (values[nowX][nowY] == -1 || values[nowX][nowY] > temp) {
                        values[nowX][nowY] = temp; // 更新路徑數值
                        priorityQueue.add(new Triple(temp, nowX, nowY)); // 將該節點加入優先佇列
                    }
                }
            }
        }

        System.out.println(values[row - 1][column - 1]); // 輸出最終結果
    }

    public static void main(String[] args) { // 主程式
        Scanner scanner = new Scanner(System.in); // 輸入
        int testCase = scanner.nextInt(); // 讀取測資數量

        while (testCase-- > 0) {
            row = scanner.nextInt(); // 讀取迷宮的列數
            column = scanner.nextInt(); // 讀取迷宮的行數

            map = new int[row][column]; // 初始化迷宮數值的二維陣列
            visited = new boolean[row][column]; // 初始化是否訪問過的二維陣列
            values = new int[row][column]; // 初始化最短路徑數值的二維陣列

            // 輸入迷宮數值並初始化最短路徑
            for (int i = 0; i < row; ++i) {

                for (int j = 0; j < column; ++j) {
                    map[i][j] = scanner.nextInt();
                    values[i][j] = -1; // 初始化最短路徑為-1
                }
            }

            priorityQueue = new PriorityQueue<>(); // 初始化優先佇列
            dijkstra(); // 使用Dijkstra演算法計算最短路徑
        }

        scanner.close(); // 關閉輸入
    }
}

// 不會超時
//import java.io.*;
//import java.util.*;
//
//public class Main {
//    static int[] xx = {1, 0, 0, -1};
//    static int[] yy = {0, 1, -1, 0};
//    static int n, m, oo = (int) 1e9;
//    static int[][] arr;
//
//    public static int dijkstra() {
//        PriorityQueue<Node> q = new PriorityQueue<Node>();
//        int[][] dist = new int[n][m];
//        for (int i = 0; i < dist.length; i++)
//            Arrays.fill(dist[i], oo);
//        dist[0][0] = arr[0][0];
//        q.add(new Node(0, 0, dist[0][0]));
//        while (!q.isEmpty()) {
//            Node cur = q.poll();
//            for (int i = 0; i < xx.length; i++) {
//                int x = cur.x + xx[i];
//                int y = cur.y + yy[i];
//                if (isValid(x, y)) {
//                    int newCost = cur.dist + arr[x][y];
//                    if (newCost < dist[x][y]) {
//                        dist[x][y] = newCost;
//                        q.add(new Node(x, y, newCost));
//                    }
//                }
//            }
//        }
//        return dist[n - 1][m - 1];
//    }
//
//    public static boolean isValid(int i, int j) {
//        return i >= 0 && j >= 0 && i < n && j < m;
//    }
//
//    public static void main(String[] args) throws Throwable {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter out = new PrintWriter(System.out);
//        int t = Integer.parseInt(br.readLine().trim());
//        while (t-- > 0) {
//            n = Integer.parseInt(br.readLine().trim());
//            m = Integer.parseInt(br.readLine().trim());
//            arr = new int[n][m];
//            for (int i = 0; i < n; i++) {
//                StringTokenizer st = new StringTokenizer(br.readLine());
//                for (int j = 0; j < m; j++) {
//                    arr[i][j] = Integer.parseInt(st.nextToken());
//                }
//            }
//            out.append(dijkstra() + "\n");
//        }
//        out.flush();
//    }
//
//    static class Node implements Comparable<Node> {
//        int x, y, dist;
//
//        public Node(int i, int j, int d) {
//            x = i;
//            y = j;
//            dist = d;
//        }
//
//        public int compareTo(Node o) {
//            return dist - o.dist;
//        }
//    }
//}



//2
//4
//5
//0 3 1 2 9
//7 3 4 9 9
//1 7 5 5 3
//2 3 4 2 5
//1
//6
//0 1 2 3 4 5