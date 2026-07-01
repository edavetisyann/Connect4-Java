import javax.swing.*;
import java.awt.*;


public class Connect4Frame extends JFrame {


    private Board board;


    public Connect4Frame() {


        setTitle("Connect 4");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setResizable(false);



        board = new Board();



        JButton restartButton = new JButton("Restart");



        restartButton.addActionListener(e -> {

            board.resetGame();

        });



        JPanel mainPanel = new JPanel(new BorderLayout());


        mainPanel.add(
                board,
                BorderLayout.CENTER
        );


        mainPanel.add(
                restartButton,
                BorderLayout.SOUTH
        );



        add(mainPanel);



        pack();


        setLocationRelativeTo(null);


        setVisible(true);

    }

}
