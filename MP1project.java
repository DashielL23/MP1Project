public class MP1project{
  public static void main(String args[])
  {
    Intermission intermission = new Intermission();
    Floor0 introduction = new Floor0();
    Floor1 firstFloor = new Floor1();
    Floor2 secondFloor = new Floor2();

    windowlayout window = new windowlayout();
    window.mainWindow();

    // introduction.introductionLevel(window);
    // intermission.intermissionFloor0(window);
    // firstFloor.firstFloorLevel(window);
    // intermission.intermissionFloor1(window);
    secondFloor.secondFloorLevel(window);
    
  }
}