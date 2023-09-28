import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class windowlayout {

  JButton button = new JButton("Submit");
  TextField player = new TextField(); 
  JTextArea textArea = new JTextArea();
  JScrollPane scrollPane = new JScrollPane(textArea);
  int x; 

  public void mainWindow(){
       Font playerFont = new Font("Arial", Font.BOLD, 70);
       Font buttonFont = new Font("Arial", Font.BOLD, 40);
       Font textAreaFont = new Font("Arial", Font.BOLD, 35);

       JFrame frame = new JFrame("Tech Quest"); // creates window named Tech Quest in this instance
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes window when you click X
       frame.setSize(1000,1000); // Sets the size of the window
       frame.getContentPane().setBackground(Color.BLACK); //Sets color to Black in the window
       frame.setVisible(true); //sets window to being visible
       frame.setLocationRelativeTo(null); // makes it so we can specify areas of text thingys
       frame.setLayout(new BorderLayout()); // makes it so we can also specify areas of text thingys
      
       JPanel bottomPanel = new JPanel();
       bottomPanel.setLayout(new BorderLayout());
       
       player.setPreferredSize(new Dimension(764, 100)); // Defines area for Text Fields
       player.setFont(playerFont); // Sets Text parameters to defined Font playerFont
       // Sets where Button is
       button.setFont(buttonFont); // Defines stuff for font
       

       button.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {
                String submission = player.getText();
                textArea.append("> " + submission + "\n"); // Append new text
                player.setText(""); // Clear the input field
                x+=1;
            }
        }
      });

       scrollPane.setPreferredSize(new Dimension(200, 700));
       textArea.setBackground(Color.BLACK);
       textArea.setForeground(Color.WHITE);
       textArea.setFont(textAreaFont);

       bottomPanel.add(player, BorderLayout.CENTER);
       bottomPanel.add(button, BorderLayout.EAST);

       frame.add(bottomPanel, BorderLayout.SOUTH); // Adds player field to frame 
       frame.add(scrollPane, BorderLayout.CENTER); // Adds button to frame 
     }
    
    }