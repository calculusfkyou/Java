package BasicLearning;
public class condition {
    public static void main(String[] args){
        //if
        //if...else
        //if...else if...else
        //switch...case
        //以上四種判斷式語法都和C++一樣

        int intScore = 5;
        switch(intScore)
        {
            case 5:
                System.out.println("恭喜！獲得滿分五顆星") ;
                break;
            case 4:
                System.out.println("讚！讚！讚！獲得四顆榮耀星") ;
                break;
            case 3:
                System.out.println("可惜！再加油～～～") ;
                break;
            case 2:
                System.out.println("喔喔！相信自己可以的，多多努力") ;
                break;
            case 1:
                System.out.println("不敢相信你的分數只有一顆星") ;
                break;
            case 0:
                System.out.println("你真的有認真準備嗎？") ;
                break;
            default :
                System.out.println("資料異常！！！") ;
        }
    }
}
