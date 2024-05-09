import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacMoe {
    int boardwidth=600;
    int boardheight=660;

    JFrame frame=new JFrame(); //creates a frame

    TicTacMoe(){
        frame.setVisible(true); //make fram visible
        frame.setSize(boardwidth, boardheight); // sets the x-dimension and y-dimension
        frame.setTitle("Tictackmoe"); //sets title name
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close when press x
        frame.setResizable(false); // prevent the panel from resizing

        frame.setIconImage(null);
        frame.getContentPane().setBackground(Color.green);
    }
    
}