import javax.swing.*;
import java.awt.*;


public class Board extends JPanel {


    private int rows = 6;

    private int cols = 7;


    private int[][] board;



    public Board(){


        board = new int[rows][cols];


        setPreferredSize(
                new Dimension(
                        560,
                        480
                )
        );

    }




    @Override
    protected void paintComponent(Graphics g){


        super.paintComponent(g);



        g.setColor(Color.BLUE);


        g.fillRect(
                0,
                0,
                560,
                480
        );



        g.setColor(Color.WHITE);



        for(int r = 0; r < rows; r++){


            for(int c = 0; c < cols; c++){


                g.fillOval(
                        c * 80 + 10,
                        r * 80 + 10,
                        60,
                        60
                );

            }

        }

    }

}
