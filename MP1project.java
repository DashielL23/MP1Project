public class MP1project{
  // ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀             ⡴⠖⠋⠻⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
  // ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡶⠋⠀⠀⠀⣠⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
  // ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡼⠋⠀⠀⡄⠀⢠⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
  // ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠟⠁⠀⠀⠀⠁⢠⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
  // ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⡏⠀⠀⢀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
  // ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣶⣿⡇⠀⣾⣿⣄⡀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
  // ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣟⠀⠀⣀⣈⡘⠛⠁⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
  // ⢀⡤⢤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡼⠋⢀⠀⢻⣞⡉⠈⠹⣆⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
  // ⢸⠁⠀⠉⠳⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠁⣀⣾⡷⠏⢀⣤⡄⠀⢹⠀⠀⢸⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⡴⠖⢲⡆
  // ⠸⣧⠀⠀⠀⠀⠙⢦⣀⠀⠀⠀⠀⠀⠀⢻⡀⠉⠹⠳⡄⠘⠛⠉⢁⡟⠀⠀⠈⣿⠀⠀⠀⠀⠀⠀⠀⢀⡴⠞⠋⠁⠀⠀⢠⡏
  // ⠀⠹⡆⠀⠀⠀⠀⠀⠉⠳⣄⠀⠀⠀⠀⣸⠳⠤⠤⠾⠳⣄⣀⣠⠞⣀⡀⠀⠀⢻⠀⠀⠀⠀⢀⣤⠞⠉⠀⠀⠀⠀⠀⢀⡟⠁
  // ⠀⠀⢻⡄⠀⠀⠀⠈⠂⠀⠈⠙⢦⡄⣰⢇⣄⠀⠀⠀⠀⠀⢀⣠⣤⣿⡟⠒⠀⠘⡇⠀⣠⡴⠋⠀⠀⠀⠀⠀⠀⠀⣰⠟⠀⠀
  // ⠀⠀⠀⠻⣄⠀⠀⠀⠀⠀⠀⠀⠀⣸⠏⠀⠈⣿⣿⣶⣾⣿⣿⣿⣿⣿⠃⠀⠀⠀⣿⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⡴⠋⠀⠀⠀
  // ⠀⠀⠀⠀⠹⣄⠀⠀⠀⠀⠀⠀⣴⠏⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⣰⠟⠁⠀⠀⠀⠀⠀⠠⠄⠀⣠⡾⠁⠀⠀⠀⠀
  // ⠀⠀⠀⠀⠀⠙⣦⠀⠀⠀⢀⣼⠋⠀⠳⣾⣿⠟⠉⠀⠋⣁⡴⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡴⠋⠀⠀⠀⠀⠀⠀
  // ⠀⠀⠀⠀⠀⠀⠈⢦⡀⢀⡾⠃⠀⠀⠀⠈⠉⠉⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡞⠁⠀⠀⠀⠀⠀⠀⠀
  // ⠀⠀⠀⠀⠀⠀⠀⠈⣻⠟⠀⠀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀
  // ⠀⠀⠀⠀⠀⠀⠀⣴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠾⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
  // ⠀⠀⠀⠀⠀⠀⢰⡇⠀⠰⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠋⠀⢻⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀
  // ⠀⠀⠀⠀⠀⢀⣼⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢈⡇ 
  private static int levelCounter = 0;

  public int floorNumForLevelScreen(){
    return levelCounter;
  }

  public static void main(String args[])
  {
    Floor0 introduction = new Floor0();
    Floor1 firstFloor = new Floor1();
    Floor2 secondFloor = new Floor2();
    Floor3 thirdFloor = new Floor3();

    windowlayout window = new windowlayout();
    window.mainWindow();

    Intermission intermissionObj = new Intermission(0);
    
    //intro level
    introduction.introductionLevel(window);
    //intermission for level 1
    intermissionObj = new Intermission(1);
    levelCounter++;
    intermissionObj.floorChecks(window);
    //first level
    firstFloor.firstFloorLevel(window);
    //intermission for level 2
    intermissionObj = new Intermission(2);
    levelCounter++;
    intermissionObj.floorChecks(window);
    //second level
    secondFloor.secondFloorLevel(window);
    //intermission for level 3 
    levelCounter++;
    intermissionObj = new Intermission(3);
    intermissionObj.floorChecks(window);
    //third level
    thirdFloor.thirdFloorLevel(window);
  }

  
}