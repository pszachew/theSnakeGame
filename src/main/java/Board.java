package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board extends JPanel implements ActionListener
{
    private final int BOARD_WIDTH = 600;
    private final int BOARD_HEIGTH = 600;
    private final int DOT_SIZE = 10;
    private final int MAX_DOTS_AMOUNT = (BOARD_WIDTH*BOARD_HEIGTH)/(DOT_SIZE*DOT_SIZE);
    private final int RAND_POS = BOARD_WIDTH/DOT_SIZE;
    private final int DELAY = 140;
    private final int x[] = new int[MAX_DOTS_AMOUNT];
    private final int y[] = new int[MAX_DOTS_AMOUNT];
    private int appleXY[] = new int[2]; //(x,y)
    private boolean direction[] = new boolean[4]; //(left,right, up, down);
    private int curr_dots;
    private boolean inGameFlag=true;

    private Image head,dot,apple;
    private Timer timer;

    public Board()
    {
        setBackground(Color.black);
        setFocusable(true);
        setPreferredSize(new Dimension(BOARD_WIDTH,BOARD_HEIGTH));

        ImageIcon tmp1 = new ImageIcon(getClass().getResource("/images/dot.png"));
        dot = tmp1.getImage();

        ImageIcon tmp2 = new ImageIcon(getClass().getResource("/images/apple1.png"));
        apple = tmp2.getImage();

        ImageIcon tmp3 = new ImageIcon(getClass().getResource("/images/head.png"));
        head = tmp3.getImage();

        curr_dots=3;
        for (int z = 0; z < curr_dots; z++)
        {
            x[z] = 50 - z * 10;
            y[z] = 50;
        }
        timer = new Timer(DELAY, this);
        timer.start();
    }

    private void setAppleLocation()
    {
        appleXY[0]=((int)((Math.random()*RAND_POS)))*DOT_SIZE;
        appleXY[1]=((int)((Math.random()*RAND_POS)))*DOT_SIZE;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

    }
}
