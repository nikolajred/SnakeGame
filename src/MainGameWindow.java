import javax.swing.*;
import java.awt.*;

public class MainGameWindow extends JFrame {
    public MainGameWindow(){
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320, 345);
        setLocation(500, 200);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainGameWindow mw = new MainGameWindow();
    }
}