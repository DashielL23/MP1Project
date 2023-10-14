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
        floorMap[0][0] = floorMap[1][0] = floorMap[3][0]  = floorMap[0][2] = floorMap[2][3] = "  Cannot Enter"; // Can't enter
    }

    public void floorMapSpotsEnterable(){
        floorMap[1][2] = beginOutput + "  As you enter the North West halls of the second floor, you can almost hear your own heartbeat by how quiet it is." + "\n" + "\n" + "  To your north is a room labled: 2N2 - AP EXAM PREP " + "\n" + "\n" + "  To your south are the South West halls." + "  To your east are the North East halls." + "\n" + "\n" + "  What will you do?" + endOutput;
        floorMap[1][1] = beginOutput + "  As you enter the South West halls of the second floor, you can hear the ticking of a keypad that seems to have been taped onto the stairwell door." + "\n" + "\n" + "  To your east are the South East halls" + "\n" + "\n" + "  To your north are the North East halls" + "\n" + "\n" + "  To your west is the stairwell." + "\n" + "\n" + "  What will you do?" + endOutput;
        floorMap[2][1] = beginOutput + "  As you enter the South East halls of the second floor, you can see a sign that reads: \" Please refrain from using vocal cords while students are studying for exams. \"" + "\n" + "\n" + "  To your south is a classroom labled: 2S6 - SAT PREP" + "\n" + "\n" + "  To your east is the bathroom." + "\n" + "\n" + "  To your north are the North East halls." + "\n" + "\n" + "  What will you do?" + endOutput;
        floorMap[2][2] = beginOutput + "  As you enter the North East halls of the second floor, you can feel something sticky on your shoes... It's a sticky note that a student must have been studying off of." + "\n" + "\n" + "  To your east is a room labled: 2E17 - Presentation Practice" + "\n" + "\n" + "  To your west are the North West halls" + "\n" + "\n" + "  To your south are the South East halls" + endOutput; 
        floorMap[0][1] = beginOutput + "  As you walk toward the stairwell, you see a KEYPAD taped onto the door that reads: \" Input Password \"" + "\n" + "\n" + "  To your east are the South West halls" + "\n" + "\n" + "  What will you do?" + endOutput;
        floorMap[1][3] = beginOutput + "  As you enter 2N2, you notice that no one seems to realize you've entered. You can hear scribbles coming from students doing practice exams. On the whiteboard, there are countless engravings that say \" Gotta get a 5, before Newman takes our lives!\"." + "\n" + "\n" + "  To your east is a Closet labled - 2N2 B" + "\n" + "\n" + "  To your south are the North West halls." + endOutput;
        floorMap[0][3] = beginOutput + "  As you enter 2N2 B, a musty smell infiltrates your nose, and you can see dusty boxes of various school supplies. in the corner, you can see a POSTER about fire drill safety, though it seems to be slightly discolored? " + "\n" + "\n" + "  To your east is 2N2, the AP Prep room" + "\n" + "\n" + "  What will you do?";
        floorMap[3][2] = beginOutput + "  As you enter 2E17, you notice that no one acknowledges";
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
