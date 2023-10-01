import javax.swing.*;
public class testFrame {
    public static void main(String[] args){
        JFrame myframe = new JFrame("視窗");
        JButton mybutton = new JButton("check", null);
        myframe.getContentPane().add(mybutton);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setSize(320,240);
        myframe.setVisible(true);
    }
}
