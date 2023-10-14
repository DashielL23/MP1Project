public class MP1project{
  public static void main(String args[])
  {
    Floor0 introduction = new Floor0();
    Intermission intermission = new Intermission();
    Floor1 firstFloor = new Floor1();

    windowlayout window = new windowlayout();
    window.mainWindow();

    introduction.introductionLevel(window);
    intermission.intermissionFloor0(window);
    firstFloor.firstFloorLevel(window);
    intermission.intermissionFloor1(window);
  }
}