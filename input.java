// import java.util.ArrayList;
// import java.util.Scanner;
import java.util.*;
public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                String input = scanner.nextLine();
                String[] numbers = input.split(" ");
                ArrayList<Integer> n = new ArrayList<>();
                
                for (String num : numbers) {
                    n.add(Integer.parseInt(num));
                }
                
                System.out.println("你输入的整数列表是：" + n);
            } catch (Exception e) {
                break;
            }
        }
    }
}
