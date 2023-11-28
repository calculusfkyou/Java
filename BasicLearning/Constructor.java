package BasicLearning;

public class Constructor {
    String name;
    Constructor(String name){
        this();
        this.name=name;
    }
    Constructor(){}

    public static void main(String[] args){
        Constructor test = new Constructor();
        System.out.println(test.name);
    }
}
