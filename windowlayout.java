import javax.swing.*;
import java.awt.*;

public class windowlayout {
    public static void mainWindow()
     {
       Font playerFont = new Font("Arial", Font.BOLD, 70);
       Font buttonFont = new Font("Arial", Font.BOLD, 40);

       

       JFrame frame = new JFrame("Tech Quest"); // creates window named Tech Quest in this instance
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes window when you click X
       frame.setSize(1000,1000); // Sets the size of the window
       frame.getContentPane().setBackground(Color.BLACK); //Sets color to Black in the window
       frame.setVisible(true); //sets window to being visible
       frame.setLocationRelativeTo(null); // makes it so we can specify areas of text thingys
       frame.setLayout(null); // makes it so we can also specify areas of text thingys
       

       TextField player = new TextField(); // Creates text area for player to typ
       player.setBounds(200, 850, 764, 100); // Defines area for Text Fields
       player.setFont(playerFont); // Sets Text parameters to defined Font playerFont

       JButton button = new JButton("Submit"); // Creates Button
       button.setBounds(0, 850, 200, 100); // Sets where Button is
       button.setFont(buttonFont); // Defines stuff for font

       JScrollBar scrollBar = new JScrollBar();
       scrollBar.setBounds(965, 0, 35, 1000);

       frame.add(player); // Adds player field to frame 
       frame.add(button); // Adds button to frame
       frame.add(scrollBar);
     }
     
}
