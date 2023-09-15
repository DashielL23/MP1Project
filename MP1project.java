import java.awt.*;
import javax.swing.*;
   class gui{
      public static void main(String args[])
      {
        mainWindow();
      }
     public static void mainWindow()
     {
       JFrame frame = new JFrame("Tech Quest"); // creates window named Tech Quest in this instance
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes window when you click X
       frame.setSize(1000,1000); // Sets the size of the window
       frame.getContentPane().setBackground(Color.BLACK); //Sets color to Black in the window
       frame.setVisible(true);
     }
}