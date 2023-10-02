package BasicLearning;
import java.util.Scanner;

public class loop {
    public static void main(String[] args){
        //迴圈語法和C++一樣
        // for 迴圈
        for(int i=0 ; i<10 ; i++){
            System.out.println("i : " + i );
       }

        // for each 迴圈
        int [] intArr = {10, 20, 5, 3, 100};
        for(int i : intArr ){
            System.out.println(i);
        }

        // while 迴圈
        int intVal = 0;
        while(intVal<=10){
            System.out.println("intval: " + intVal);
            intVal++;
        }
        
        // do...while 迴圈
        try (
        Scanner scanner = new Scanner(System.in)) {
            String input;
            do {
                System.out.print("是否離開系統？");
                input = scanner.next();
            } while (!input.equals("y"));
        }
        System.out.println("已經離開系統囉!!!");
    }
}
