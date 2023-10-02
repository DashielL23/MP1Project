import java.awt.*;
import java.awt.event.ActionEvent;
public class MP1project{
  public static void main(String args[])
  {
    Floor1 firstFloor = new Floor1();
    windowlayout window = new windowlayout();
    window.mainWindow();
    firstFloor.firstFloorLevel(window);
  }
}