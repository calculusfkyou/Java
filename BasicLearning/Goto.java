package BasicLearning;
public class Goto {
    public static void main(String[] args){
        // break
        int [] intArr = {1, 2, 3, 4, 5};
        for(int i : intArr ){
            if(i == 3){
                break;
            }
//            System.out.println(i);
        }

        // 標籤式 break
        loop : for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(i==2){
                    break loop;
                }
//                System.out.println(i+j);
            }
        }

        // continue
        //當程式執行到 continue，則會被強迫直接跳到下一次循環，原本 continue 若下方還有程式則會全部略過。
        int [] intArr2 = {1, 2, 3, 4, 5};
        for(int i : intArr2 ){
            if(i == 3){
                continue;
            }
//            System.out.println(i);
        }

        // 標籤式 continue
        outerLoop:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i==1 || i==3) {
                    continue outerLoop;
                }
                System.out.println(i);
            }
        }
    }

    //return
    //當程式執行到 return 跳轉語句，該區塊下方的程式將不會被執行，return 通常用在呼叫方法，當特定條間成立，返回原呼叫點。
    // public static void main(String[] args) {
    //     int[] intArr1 = null;
    //     printData(intArr1);
    //     int[] intArr2 = {1, 2, 3, 4, 5};
    //     printData(intArr2);
    // }

    // private static void printData(int[] intArr) {
    //     if (intArr == null) {
    //         System.out.println("資料異常");
    //         return;
    //     }
    //     for (int i : intArr) {
    //         System.out.println(i);
    //     }
    // }
}
