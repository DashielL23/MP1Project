import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class windowlayout {

private JButton button = new JButton("Submit");
private TextField player = new TextField(); 
JTextArea textArea = new JTextArea();
private JScrollPane scrollPane = new JScrollPane(textArea);
String playerStringForObjects = "";
private int scrollPaneMaxValue;

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
  
  //auto scroll down
  scrollPaneMaxValue = scrollPane.getVerticalScrollBar().getMaximum();
  scrollPane.getVerticalScrollBar().addAdjustmentListener(e -> { // -> Separates a parameter from a body with a lamda, usually for methods not native to java? Might need more info on this
    if(!(scrollPaneMaxValue - e.getAdjustable().getMaximum() == 0)){ //checks if NOT last max value of scrollpane - the current max value = 0
      e.getAdjustable().setValue(e.getAdjustable().getMaximum()); //gets max value of scrollbar, and sets e to the value of the max value
      scrollPaneMaxValue = scrollPane.getVerticalScrollBar().getMaximum(); //sets last max value to current max value
    }
    }
   );

  button.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
          String submission = player.getText();
          textArea.append("> " + submission + "\n"); // Append new text
          player.setText(""); // Clear the input field
          playerStringForObjects = submission;
      }
  }
});

  scrollPane.setPreferredSize(new Dimension(200, 700));
  textArea.setBackground(Color.BLACK);
  textArea.setForeground(Color.GREEN);
  textArea.setFont(textAreaFont);
  textArea.setEditable(false);

  bottomPanel.add(player, BorderLayout.CENTER);
  bottomPanel.add(button, BorderLayout.EAST);

  frame.add(bottomPanel, BorderLayout.SOUTH); // Adds player field to frame 
  frame.add(scrollPane, BorderLayout.CENTER); // Adds button to frame 
}

}