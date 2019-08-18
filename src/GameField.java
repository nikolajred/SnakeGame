import javax.swing.*;
import java.awt.*;

public class GameField extends JPanel {
    private final int SIZE = 320;
    private final int DOT_SIZE = 16;
    private final int ALL_DOTS = 400;
    private Image dot;
    private Image apple;
    private Image appleX;
    private Image getAppleY;
    private int [] x = new int[ALL_DOTS];
    private int [] y = new int[ALL_DOTS];
    private int dots;
    private Timer timer;
    private boolean left = false;
    private boolean right = true;
    private boolean up = false;
    private boolean down = false;
    private boolean inGame = true;
    public GameField(){
        setBackground(Color.blue);
        loadImages();
    }
    public void loadImages(){
        ImageIcon iia = new ImageIcon("aplle.png");
        apple = iia.getImage();
        ImageIcon iid = new ImageIcon("dot.png");
        dot = iid.getImage();
    }
}
