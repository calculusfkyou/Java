package Object_Oriented_HW;

import java.util.*;

// 這個程式的主要功能是用divide and conquer算平面上最近的兩點距離。
// Divide 步驟:找到中點，分割點陣列為左右兩部分，遞迴計算左右兩部分的最近點對距離。
// Conquer 步驟:合併左右兩部分的結果，取最小的距離。
// Combine 步驟:創建 strip 陣列，儲存橫跨左右兩部分的點，將 strip 陣列按 y 座標升序排序，在垂直方向上檢查最小距離，更新最小距離。
public class A411177034_13 {
    // 定義二維平面上的點類別
    static class Point {
        double x, y; // x 和 y 座標

        // Point 類別的建構子，初始化 x 和 y 座標
        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    // 按 x 座標升序排列的比較器類別
    static class XComparator implements Comparator<Point> {
        // 用於比較兩個點的 x 座標，以升序排列
        public int compare(Point p1, Point p2) {
            return Double.compare(p1.x, p2.x);
        }
    }

    // 按 y 座標升序排列的比較器類別
    static class YComparator implements Comparator<Point> {
        // 用於比較兩個點的 y 座標，以升序排列
        public int compare(Point p1, Point p2) {
            return Double.compare(p1.y, p2.y);
        }
    }

    // 計算最近點對的距離
    public static double closestPair(Point[] points, int n) {
        // base case: 如果點的數量小於等於 1，返回正無限大，因為沒有點或只有一個點，無法構成點對。
        if (n <= 1)
            return Double.POSITIVE_INFINITY;

        // 找到中點
        int mid = n / 2;
        Point midPoint = points[mid];

        // divide 步驟：將全部點分為左右兩部分
        Point[] left = Arrays.copyOfRange(points, 0, mid); // Arrays.copyOfRange：複製陣列
        Point[] right = Arrays.copyOfRange(points, mid, n);

        // 遞迴計算左右兩部分的最近點對距離
        double leftDistance = closestPair(left, mid);
        double rightDistance = closestPair(right, n - mid);

        // conquer 步驟：合併左右兩部分的結果
        double minDistance = Math.min(leftDistance, rightDistance);

        Point[] strip = new Point[n]; // strip 陣列用來儲存在 midPoint 左右兩部分中，橫跨兩部分的點。
        int j = 0; // j 用於追蹤 strip 陣列的大小

        // 遍歷所有點，找到橫跨左右兩部分的點，條件是該點的 x 坐標與 midPoint 的 x 坐標的差的絕對值小於 minDistance
        for (int i = 0; i < n; i++) {

            if (Math.abs(points[i].x - midPoint.x) < minDistance) {
                strip[j] = points[i];
                j++;
            }

        }

        Arrays.sort(strip, 0, j, new YComparator()); // 按 y 坐標升序排序

        // 垂直方向檢查跨越左右兩部分的點的最小距離
        for (int i = 0; i < j - 1; i++) {

            for (int k = i + 1; k < j && (strip[k].y - strip[i].y) < minDistance; k++) {
                minDistance = Math.min(minDistance, distance(strip[i], strip[k]));
            }

        }

        return minDistance; // 返回最小距離
    }

    // 計算兩點之間的距離，x, y 座標相減的平方相加開根號
    static double distance(Point a, Point b) {
        return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
    }

    public static void main(String[] args) { // 主程式
        Scanner sc = new Scanner(System.in); // 輸入
        int amount = sc.nextInt(); // 讀取點的數量

        while (amount != 0) { // 輸入數量不等於0，則繼續
            Point[] points = new Point[amount]; // 宣告一個足夠大的陣列儲存輸入的點

            // 處理輸入
            for (int i = 0; i < amount; i++) {
                points[i] = new Point(sc.nextDouble(), sc.nextDouble());
            }

            Arrays.sort(points, new XComparator()); // 將點按 x 坐標升序排序
            double answer = closestPair(points, amount); // 計算最近點對距離

            // 輸出結果，如果最近點對距離大於等於10000，則輸出INFINITY
            if (answer >= 10000)
                System.out.println("INFINITY");
            else
                System.out.printf("%.4f%n", answer);

            amount = sc.nextInt(); // 讀取下一組點的數量
        }

        sc.close(); // 關閉輸入
    }
}

//3
//0 0
//10000 10000
//20000 20000

//5
//0 2
//6 67
//43 71
//39 107
//189 140