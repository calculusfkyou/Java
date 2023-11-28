package BasicLearning;

public class overload {
    public static void main(String[] args) {
        short c = 10, d = 20;
        System.out.println(add(c, d));
    }

    static int add(int a, int b) {
        return a + b;
    }

    static long add(long a, long b) {
        return a + b + 200;
    }

    static double add(double a, double b) {
        return a + b + 100;
    }
}
