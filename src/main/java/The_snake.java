package game;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class The_snake extends JFrame
{
    public The_snake()
    {
        initGame();
    }

    private void initGame()
    {

        add(new game.Board());

        setResizable(false);
        pack();

        setTitle("Snake");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame tmp = new The_snake();
                tmp.setVisible(true);
            }
        });
    }
}