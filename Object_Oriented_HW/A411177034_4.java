// UVA118
package Object_Oriented_HW;

import java.util.Scanner;

public class A411177034_4 { // 這個程式主要功能是遍歷輸入的指令，紀錄目前位置和面對的方位，再判斷是否已超出邊界，最後依照check的值按照題目要求輸出。
    public static String direction(String instruction, String side) { // 這個函式傳入當前指令和當前面對的方位，回傳轉向後面對的方位

        switch (side) {
            case "E": { // 如果面對東方

                if (instruction.equals("R")) // 指令為R
                    return "S"; // 回傳南方
                else if (instruction.equals("L")) // 指令為L
                    return "N"; // 回傳北方

            }

            case "W": {

                if (instruction.equals("R")) // 指令為R
                    return "N"; // 回傳北方
                else if (instruction.equals("L")) // 指令為L
                    return "S"; // 回傳南方

            }

            case "N": {

                if (instruction.equals("R")) // 指令為R
                    return "E"; // 回傳東方
                else if (instruction.equals("L")) // 指令為L
                    return "W"; // 回傳西方

            }

            case "S": {

                if (instruction.equals("R")) // 指令為R
                    return "W"; // 回傳西方
                else if (instruction.equals("L")) // 指令為L
                    return "E"; // 回傳東方

            }
        }

        return side;
    }

    public static void main(String[] args) { // 主程式
        Scanner scanner = new Scanner(System.in); // 輸入
        int xAxis = scanner.nextInt(), yAxis = scanner.nextInt(); // 兩個整數代表這個世界右上角的頂點的(x,y)值，也就是最大的x軸和y軸的數值
        int[][] world = new int[yAxis + 1][xAxis + 1]; // 宣告一個二維陣列代表這個世界，+1是因為第一行和第一列都從0開始算

        for (int i = 0; i <= yAxis; i++) { // 將這個世界每個位置都填上1

            for (int j = 0; j <= xAxis; j++) {
                world[i][j] = 1;
            }

        }

        while (true) { // 用 try...catch 處理EOF的輸入問題，一次輸入有兩行，第一列為初始位置，第二列為指令
            try {
                int initialX = scanner.nextInt(); // 象限初始位置(X座標)
                int initialY = scanner.nextInt(); // 象限初始位置(Y座標)
                String side = scanner.next(); // 初始面對的方位
                String instructions = scanner.next(); // 儲存輸入的一串指令

                int subX = 0, subY = 0, check = 0; // subX, subY將用於儲存機器人目前位置，
                String subSide = ""; // 將用於儲存目前面對的方位

                for (int i = 0; i < instructions.length(); i++) { // 遍歷輸入的那串指令
                    char instruction = instructions.charAt(i); // 依序儲存指令
                    subSide = side; // 用於儲存目前面對的方位
                    subX = initialX; // 用於儲存機器人目前位置(X座標)
                    subY = initialY; // 用於儲存機器人目前位置(Y座標)

                    if (instruction == 'R' || instruction == 'L') // 若目前指令為R或L，更改面對的方位
                        side = direction(Character.toString(instruction), side); // 從上面定義的函式更新目前面對的方位
                    else { // 指令為F時，從面對的方位往前一步

                        if (side.equals("E")) // 面對東方
                            initialX += 1; // X座標+1
                        else if (side.equals("W")) // 面對西方
                            initialX -= 1; // X座標-1
                        else if (side.equals("N")) // 面對北方
                            initialY += 1; // Y座標+1
                        else if (side.equals("S")) // 面對南方
                            initialY -= 1; // Y座標-1

                    }

                    // 判斷是否位置已超出邊界，有超過則會進入判斷式
                    if (initialX > xAxis || initialX < 0 || initialY > yAxis || initialY < 0) {

                        // 如果掉下去之前那點不等於0，也就是1，就代表那點尚未被標記 (這就是為什麼需要subX, subY, subSide)
                        if (world[subY][subX] != 0) {
                            world[subY][subX] = 0; // 將這點標記(從1變0)
                            check = 1; // 紀錄是否已掉落，已掉落就將check變1
                            break; // 已掉落，不管指令是否執行完指令，接跳出
                        } else { // 已超出邊界，掉下去之前那點也被標記過了，機器人將會忽略此掉下去的指令，故位置恢復至前一點
                            initialX = subX; // 恢復原x座標
                            initialY = subY; // 恢復原y座標
                        }

                    }

                }

                if (check == 1) // 如果紀錄表示已掉落
                    System.out.println(subX + " " + subY + " " + subSide + " LOST"); // 輸出前一位置和前一面對的方位加上LOST
                else
                    System.out.println(initialX + " " + initialY + " " + side); // 輸出目前位置和面對的方位

            } catch (Exception e) {
                break;
            }
        }

        scanner.close(); // 關閉輸入
    }
}
