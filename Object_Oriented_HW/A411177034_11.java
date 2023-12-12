package Object_Oriented_HW;

import java.util.*;

public class A411177034_11 { // 這個程式的主要功能是輸入學生的交換信息後，將原本的位置和想去的位置分開儲存並排序，再判斷兩陣列內容是否相同，輸出對應所求
    // v1
    public static void main(String[] args) { // 主程式
        Scanner sc = new Scanner(System.in); // 輸入

        while (true) { // 持續輸入
            int student = sc.nextInt(); // 輸入學生數量

            if (student == 0) // 若為0，程式結束
                break;

            int[] from = new int[student], to = new int[student]; // 宣告兩個陣列，分別儲存原本的位置和想去的位置

            for (int i = 0; i < student; i++) { // 輸入每個學生的交換信息
                from[i] = sc.nextInt(); // 每列第一個，原本的位置
                to[i] = sc.nextInt(); // 每列第二個，想去的位置
            }

            Arrays.sort(from); // 原本的位置陣列排序
            Arrays.sort(to); // 想去的位置陣列排序

            if (Arrays.equals(from, to)) // 判斷兩個陣列是否一樣，若一樣就代表屬於交換計畫，否則不是，輸出對應所求
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        sc.close(); // 關閉輸入
    }
    // v2
//    public static void main(String[] args) { // 主程式
//        Scanner sc = new Scanner(System.in); // 輸入
//
//        while (true) { // 持續輸入
//            int student = sc.nextInt(); // 輸入學生數量
//
//            if (student == 0) { // 學生數量為0，程式結束
//                break;
//            }
//
//            ArrayList<int[]> changeInformation = new ArrayList<>(); // 宣告一個陣列紀錄交換信息
//
//            for (int i = 0; i < student; i++) { // 每次輸入加入一個整數陣列，包含 2 個整數，分別代表學生的原本的位置和想去的位置
//                int from = sc.nextInt(); // 原本的位置
//                int to = sc.nextInt(); // 想去的位置
//                changeInformation.add(new int[]{from, to}); // 加入整數陣列
//            }
//
//            boolean check = true; // 表示是否屬於交換計畫
//
//            while (!changeInformation.isEmpty()) { // 迴圈直到陣列長度為0，為0時代表屬於交換計畫
//                int[] reverse = new int[]{changeInformation.get(0)[1], changeInformation.get(0)[0]}; // 交換夥伴為當前學生的相反位置，每次都判斷第0個
//                int tempLength = changeInformation.size(); // 宣告一個暫時的長度，會用在確認陣列是否更動過
//
//                for (int i = 1; i < changeInformation.size(); i++) { // 因為是判斷第0個適合的交換夥伴，所以從第1個開始找，遇到相反的就移除 // 本來用contains判斷是否存在，但好像判斷一維陣列會出問題
//
//                    if (Arrays.equals(reverse, changeInformation.get(i))) { // 如果往後有陣列符合相反位置，代表找到交換夥伴
//                        changeInformation.remove(i); // 將交換夥伴移除陣列
//                        changeInformation.remove(0); // 將第0個移除陣列
//                        break; // 第0個找到交換夥伴了，跳出迴圈
//                    }
//
//                }
//
//                if (changeInformation.size() == tempLength) { // 如果長度仍然相同，代表沒找到交換夥伴，不屬於交換計畫，跳出此while迴圈
//                    check = false; // 不屬於交換計畫
//                    break; // 跳出while迴圈
//                }
//            }
//
//            if (check) // 屬於交換計畫
//                System.out.println("YES"); // 輸出YES
//            else // 不屬於交換計畫
//                System.out.println("NO"); // 輸出NO
//
//        }
//
//        sc.close(); // 關閉輸入
//    }
}