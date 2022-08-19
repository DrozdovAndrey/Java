import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    private static GameWindow game_window;
    public static void main(String[] args) {
        game_window = new GameWindow();
        game_window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game_window.setLocation(200, 100);
        game_window.setSize(906, 478);
        game_window.setResizable(false);
        GameField gameField = new GameField();
        game_window.add(gameField);
        game_window.setVisible(true);

    }
    private static void onRepaint(Graphics g){
        g.drawLine(10, 10 , 250, 30);
    }

    private static class GameField extends JPanel{
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            onRepaint(g);
        }
    }
}