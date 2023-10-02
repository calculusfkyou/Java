package BasicLearning;
public class Method {
    public static void main(String[] args) {
        initData();
        initData2(100, 10);
        initData2(3.14, 2.9);
    }

    //就是函式
    public static void initData() {
        int x = 100;
        int y = 10;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    //方法傳遞參數
    //整數，資料類型
    public static void initData2(int x, int y) {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    //方法重載  //同樣的方法名稱，但參數不同
    //浮點數，資料類型
    private static void initData2(double x, double y) {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
