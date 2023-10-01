import java.util.Arrays;

public class array {
    public static void main(String[] args){
        // 兩行定義方式：
        // 資料型態[] 陣列名稱;
        // 陣列名稱 = new 資料型態[陣列大小]; 

        // 一行定義方式：
        // 資料型態[] 陣列名稱 = new 資料型態[陣列大小]; 

        // 陣列初始化
        int[] intArray = new int[3];
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 99;
        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);

        // 陣列定義資料值
        int[] intArray2 = { 10 , 20 , 99 };
        System.out.println(intArray2[0]);
        System.out.println(intArray2[1]);
        System.out.println(intArray2[2]);
        // 事後可以再更改陣列中存放的資料值
        intArray2[0] = 0;
        intArray2[1] = 66;
        intArray2[2] = 50;
        System.out.println(intArray2[0]);
        System.out.println(intArray2[1]);
        System.out.println(intArray2[2]);

        // 獲取陣列長度 .length
        // 字串則是用   .length()
        int[] intArr = { 100 , 300 , 666};
        System.out.println(intArr.length);

        // 陣列排序 Arrays.sort(arr)
        int[] intArr2 = { 1000 , 1 , 10};
        System.out.println(Arrays.toString(intArr2));
        Arrays.sort(intArr2);
        System.out.println(Arrays.toString(intArr2));

        // 陣列反轉，沒有函式，乖乖寫反轉ㄏ
        /* 
        public class Main {
            public static void main(String[] args) {
                int[] arr = {1, 2, 3, 4, 5};
        
                int left = 0;
                int right = arr.length - 1;
        
                while (left < right) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
        
                    left++;
                    right--;
                }
        
                System.out.println("原始数组：" + Arrays.toString(arr));
            }
        }*/
        
        // 常用函式：
        // fill ： 填滿陣列元素

        // equals ： 比較兩個陣列元素是否相同
        // Arrays.equals(arr1,arr2)
        int[] arr1 = { 1 , 2 , 3};
        int[] arr2 = { 2 , 1 , 3};
        int[] arr3 = { 1 , 2 , 3};
        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println(Arrays.equals(arr1,arr3));

        // binarySearch ： 搜尋陣列元素 (index值)
        // Arrays.binarySearch(arr,value)
        System.out.println(Arrays.binarySearch(arr1,2));

        // sort : 排序
        int[] nums = {2,1,3};
        Arrays.sort(nums);
        for(int i : nums){
            System.out.println(i);
        }

        // 二維陣列
        // 二維陣列 2*2 宣告方式：
        int[][] aArray = new int[2][2];
        // 事後定義資料值
        aArray[0][0] = 300; 
        aArray[0][1] = 20;
        aArray[1][0] = 100;
        aArray[1][1] = 20;  

        // 陣列定義時初始資料值
        int[][] bArray = { {300,20} , {100,20} };
        System.out.println(bArray[0][1]); 
        // 多維陣列宣告依此類推
    }
}
