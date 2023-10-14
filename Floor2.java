public class Floor2 {
    //instantiaze vars
    private String[][] floorMap = new String[4][4]; //creates an Array Map 4x4 (0-3)

    private int x = 1; // start position for player x
    private int y = 2; // start position for player y

    private boolean sentCommand = false;
    private boolean floor2 = true;

    private String storedPreviousCommand = "";
    private final String beginOutput = "\n" + "----------" + "\n";
    private final String endOutput = "\n" + "----------" + "\n" + "\n";

    public void secondFloorLevel(windowlayout a)
    {
    storedPreviousCommand = a.playerStringForObjects;
    //send first message
    a.textArea.append(floorMap[x][y]);
    //main loop
    while(floor2){
        System.out.println(a.playerStringForObjects);

        commandCheck(a);
        if(sentCommand == true){
            //set command sent to the previous command you just
            storedPreviousCommand = a.playerStringForObjects;
            //moving commands
            moveNorth(a);
            moveSouth(a);
            moveEast(a);
            moveWest(a); 
            //Getting Items or Using them
            if(!(a.playerStringForObjects.equalsIgnoreCase(""))){
                a.textArea.append(beginOutput + "  Unknown Command!" + endOutput);
            }
        }
        
    }
    }

    public void floorMapSpotsUnenterable(){
        floorMap[0][0] = floorMap[1][0] = floorMap[3][0] = floorMap[2][0] = floorMap[0][3] = floorMap[2][3] = "  Cannot Enter"; // Can't enter
    }

    public void floorMapSpotsEnterable(){
        floorMap[1][3] = beginOutput + "  As you enter the North West halls of the second floor, you can almost hear your own heartbeat by how quiet it is." + "\n" + "\n" + "  To your north is a room labled: 2N2 - AP PREP " + "\n" + "\n" + "  To your south are the South West halls." + "  To your east are the North East halls." + "\n" + "\n" + "  What will you do?";
    }
    //movement voids
    public void moveEast(windowlayout a){
        if(a.playerStringForObjects.equalsIgnoreCase("go east")){
        x++;
        invalidAreaInArrayx(a);
        a.textArea.append(floorMap[x][y]);
        a.playerStringForObjects = "";
        }
    }

    public void moveWest(windowlayout a){
        if(a.playerStringForObjects.equalsIgnoreCase("go west")){
        x--;
        invalidAreaInArrayx(a);
        a.textArea.append(floorMap[x][y]);
        a.playerStringForObjects = "";
        }
    }

    public void moveNorth(windowlayout a){
        if(a.playerStringForObjects.equalsIgnoreCase("go north")){
        y++;
        invalidAreaInArrayY(a);
        a.textArea.append(floorMap[x][y]);
        a.playerStringForObjects = "";
        }
    }

    public void moveSouth(windowlayout a){
        if(a.playerStringForObjects.equalsIgnoreCase("go south")) {
            y--;
            invalidAreaInArrayY(a);
            a.textArea.append(floorMap[x][y]);
            a.playerStringForObjects = "";
        }
    }

    //voids for testing if array is out of bounds    
    public void invalidAreaInArrayx(windowlayout a)
    {
        if( x > 3 || x < 0)
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
        if(y > 3 || y < 0)
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
    public void commandCheck(windowlayout a){
        if(storedPreviousCommand == a.playerStringForObjects){
            sentCommand = false;
        }
        if(!(storedPreviousCommand == a.playerStringForObjects)){
            sentCommand = true;
        }
    }
}
