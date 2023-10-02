package BasicLearning;
import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args){
        //宣告動態陣列
        ArrayList<String> Students = new ArrayList<String>();

        // add	在 ArrayList 最後加一筆元素
        Students.add("1");

        // clear	移除 ArrayList 所有元素
        Students.clear();

        // contains	如果 ArrayList 含有指定的元素回傳 true，否為 false
        boolean contain = Students.contains("1");
        System.out.println(contain);

        Students.add("1");
        Students.add("2");
        Students.add("3");
        // get	傳回位於指定索引值的元素
        String get = Students.get(0);
        System.out.println(get);
        
        // indexof	傳回指定元素在 ArrayList 第一次出現的索引值
        int index = Students.indexOf("1");
        System.out.println(index);

        // remove	會移除第一次出現指定值的元素，或是指定索引值的元素
        Students.remove("1");   //移除陣列中的"1"，若無則回傳一個布林值
        Students.remove(0);     //移除第0個元素

        // size	傳回 ArrayList 中儲存元素的數量
        int size = Students.size();
        System.out.println(size);

        // isEmpty 會回傳一布林值，如為動態陣列為空即回傳true，反之亦然
        boolean empty = Students.isEmpty();
        System.out.println(empty);

        // set vu. 修改資料，第一個參數為索引值，索引值是從0開始算，而第二個參數就是要修改的物件
        Students.set(0,"4");

        // trimToSize	將 ArrayList 容量縮減至目前元素數量
    }    
}
