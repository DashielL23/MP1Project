import java.util.Timer;

public class Floor2 {
    private String[][] floorMap = new String[3][3]; //creates an Array Map 3x3 (0-2)

    private int x = 1; // start position for player x
    private int y = 1; // start position for player y

    private Timer timerForFinish = new Timer();

    private String storedPreviousCommand = "";
    private String stringForCommands = ""; //also for while loop to assure playerstringforobjects is initialized
    private final String beginOutput = "\n" + "----------" + "\n";
    private final String endOutput = "\n" + "----------" + "\n" + "\n";
    
    private boolean sentCommand = false;

    //movement voids
    public void moveEast(windowlayout a){
        if(stringForCommands.equalsIgnoreCase("go east")){
        x++;
        invalidAreaInArrayx(a);
        a.textArea.append(floorMap[x][y]);
        a.playerStringForObjects = "";
        }
    }

    public void moveWest(windowlayout a){
        if(stringForCommands.equalsIgnoreCase("go west")){
        x--;
        invalidAreaInArrayx(a);
        a.textArea.append(floorMap[x][y]);
        a.playerStringForObjects = "";
        }
    }
    
    public void moveNorth(windowlayout a){
        if(stringForCommands.equalsIgnoreCase("go north")){
        y++;
        invalidAreaInArrayY(a);
        a.textArea.append(floorMap[x][y]);
        a.playerStringForObjects = "";
        }
    }

    public void moveSouth(windowlayout a){
        if(stringForCommands.equalsIgnoreCase("go south")) {
            y--;
            invalidAreaInArrayY(a);
            a.textArea.append(floorMap[x][y]);
            a.playerStringForObjects = "";
        }
    }

    //voids for testing if array is out of bounds    
    public void invalidAreaInArrayx(windowlayout a)
    {
        if( x > 2 || x < 0)
        {
            a.textArea.append(beginOutput + "  Invalid movement!" + endOutput);
            x--;
        }
        if(floorMap[x][y] == "  Cannot Enter"){
            a.textArea.append(beginOutput + "  Can't go here!" + endOutput);
            x--;
        }
    }

    public void invalidAreaInArrayY(windowlayout a)
    {
        if(y > 2 || y < 0)
        {
            a.textArea.append(beginOutput + "  Invalid movement!" + endOutput);
            y--;
        }
        if(floorMap[x][y] == "  Cannot Enter"){
            a.textArea.append(beginOutput + "  Can't go here!" + endOutput);
            y--;
        }
    }

    //Misc voids
    public void commandCheck(){
        if(storedPreviousCommand == stringForCommands){
            sentCommand = false;
        }
        if(!(storedPreviousCommand == stringForCommands)){
            sentCommand = true;
        }
    }
}
