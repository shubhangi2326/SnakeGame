
package snakegame;

import javax.swing.*;

public class SnakeGame extends JFrame
   {
  SnakeGame()
       {
           super("Snake Game");
           add(new Board());
           pack();
           
           
           setLocationRelativeTo(null);
           setResizable(false);
           setLocation(100,100);
          
        }
    public static void main(String [] args)
    {
      new SnakeGame().setVisible(true);
    }
}

