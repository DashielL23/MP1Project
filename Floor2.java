public class Floor2 {
    //instantiaze vars
    private String[][] floorMap = new String[4][4]; //creates an Array Map 4x4 (0-3)

    private int x = 1; // start position for player x
    private int y = 2; // start position for player y

    private boolean sentCommand = false;
    private boolean floor2 = true;
    private boolean usingKeypad = false;

    private int codeA,codeB,codeC,codeD;

    private String storedPreviousCommand = "";
    private final String beginOutput = "\n" + "----------" + "\n";
    private final String endOutput = "\n" + "----------" + "\n" + "\n";
    private String fullCode = "";

    private String calculateCode(int a, int b, int c, int d, String e){
        a = (int)(Math.random() * 10);
        b = (int)(Math.random() * 10);
        c = (int)(Math.random() * 10);
        d = (int)(Math.random() * 10);
        fullCode = String.valueOf(a) + String.valueOf(b) + String.valueOf(c) + String.valueOf(d);
        return fullCode;
    }

    public void secondFloorLevel(windowlayout a)
    {
        //initialize arrays
        floorMapSpotsEnterable();
        floorMapSpotsUnenterable();
        //initialize commands in game
        storedPreviousCommand = a.playerStringForObjects;
        //send first message
        a.textArea.append(floorMap[x][y]);
        //creates code
        calculateCode(codeA,codeB,codeC,codeD, fullCode);
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
                useKeypad(a);
                //Getting Items or Using them
                while(usingKeypad){
                    commandCheck(a);
                    if(sentCommand == true){
                        if(a.playerStringForObjects.equalsIgnoreCase(fullCode)){
                        floor2 = false;
                        a.playerStringForObjects = "";
                        }
                        else if (!(a.playerStringForObjects.equalsIgnoreCase(fullCode))){
                            a.textArea.append(beginOutput + "  Incorrect code!" + endOutput);
                            a.playerStringForObjects = "";
                            usingKeypad = false;
                        }
                }
                }
                if(!(a.playerStringForObjects.equalsIgnoreCase(""))){
                    a.textArea.append(beginOutput + "  Unknown Command!" + endOutput);
                }
        }
        
    }
    }

    //getting or using item voids
    public void useKeypad(windowlayout a){
        if(a.playerStringForObjects.equalsIgnoreCase("use keypad") && floorMap[x][y] == floorMap[0][1]){
            a.textArea.append(beginOutput + "  What is the code?" + endOutput);
            usingKeypad = true;
        }
    }
    public void getPoster(windowlayout a){
        if(a.playerStringForObjects.equalsIgnoreCase("get Poster") && floorMap[x][y] == floorMap[0][3]){

        }
    }
    
    
    
    //initialize area information and stuff
    public void floorMapSpotsUnenterable(){
        floorMap[0][0] = floorMap[1][0] = floorMap[3][0]  = floorMap[0][2] = floorMap[2][3] = "  Cannot Enter"; // Can't enter
    }

    public void floorMapSpotsEnterable(){
        floorMap[1][2] = beginOutput + "  As you enter the North West halls of the second" + "\n" + "  floor, you can almost hear your own heartbeat by how" + "\n" + "  quiet it is." + "\n" + "\n" + "  To your north is a room labled: 2N2 - AP EXAM" + "\n" + "  PREP " + "\n" + "\n" + "  To your south are the South West halls." + "\n" + "\n" + "  To your east are the North East halls." + "\n" + "\n" + "  What will you do?" + endOutput;
        floorMap[1][1] = beginOutput + "  As you enter the South West halls of the second" + "\n" + "  floor, you can hear the ticking of a keypad that" + "\n" + "  seems to have been taped onto the stairwell door." + "\n" + "\n" + "  To your east are the South East halls" + "\n" + "\n" + "  To your north are the North East halls" + "\n" + "\n" + "  To your west is the stairwell." + "\n" + "\n" + "  What will you do?" + endOutput;
        floorMap[2][1] = beginOutput + "  As you enter the South East halls of the second" + "\n" + "  floor, you can see a sign that reads:" + "\n" + "  \" Please refrain from using vocal cords while students are studying for exams. \"" + "\n" + "\n" + "  To your south is a classroom labled: 2S6 - SAT PREP" + "\n" + "\n" + "  To your east is the bathroom." + "\n" + "\n" + "  To your north are the North East halls." + "\n" + "\n" + "  What will you do?" + endOutput;
        floorMap[2][2] = beginOutput + "  As you enter the North East halls of the second" + "\n" + "  floor, you can feel something sticky on your shoes... It's" + "\n" + "  a sticky note that a student must have been studying" + "\n" + "  off of." + "\n" + "\n" + "  To your east is a room labled: 2E17 - Presentation Practice" + "\n" + "\n" + "  To your west are the North West halls" + "\n" + "\n" + "  To your south are the South East halls" + "  What will you do?" + endOutput; 
        floorMap[0][1] = beginOutput + "  As you walk toward the stairwell, you see a KEYPAD" + "\n" + "  taped onto the door that reads:" + "\n" + "  \" Input Password \"" + "\n" + "\n" + "  To your east are the South West halls" + "\n" + "\n" + "  What will you do?" + endOutput;
        floorMap[1][3] = beginOutput + "  As you enter 2N2, you notice that no one seems" + "\n" + "  to realize you've entered. You can hear scribbles coming from" + "\n" + "  students doing practice exams. On the whiteboard, there are countless" + "\n" + "  engravings that say:" + "\n" + "  \"Gotta get a 5, before Newman takes our lives!\"." + "\n" + "\n" + "  To your east is a closet labled - 2N2 B" + "\n" + "\n" + "  To your south are the North West halls." + "  What will you do?" + endOutput;
        floorMap[0][3] = beginOutput + "  As you enter " + 2 + "N2" + " B, a musty smell infiltrates your" + "\n" + "  nose, and you can see dusty boxes of various school" + "\n" + "  supplies. in the corner, you can see a POSTER about" + "\n" + "  fire drill safety, though it seems to be slightly discolored? " + "\n" + "\n" + "  To your east is 2N2, the AP Prep room" + "\n" + "\n" + "  What will you do?" + endOutput;
        floorMap[3][2] = beginOutput + "  As you enter 2E17, you hear several students giving a" + "\n" + "  presentation about some controversial current event and how their proposed" + "\n" + "  solutions could solve it. They don't seem to notice you" + "\n" + "  entering. On the teacher's desk there is a NOTE that" + "\n" + "  stands out to you." + "\n" + "\n" + "  To your north is a closet labled: 2E17 B" + "  To your west are the North East halls." + "\n" + "\n" + "  What will you do?" + endOutput;
        floorMap[3][1] = beginOutput + "  As you enter the bathroom, a strange smoky, yet fruity" + "\n" + "  smell fills your nose. You notice that someone has left" + "\n" + "  the SINK on." + "\n" + "\n" + "  To your west are the South East halls." + "\n" + "\n" + "  What will you do?" + endOutput;
        floorMap[3][0] = beginOutput + "  As you walk into the SAT prep room, you're met" + "\n" + "  with a poster depicting a hooded man and a senior" + "\n" + "  citizen with \"NON PROFIT\" written on their shirt, flailing money" + "\n" + "  around. A caption reads: \"BFFS!\". In the clasroom, several students" + "\n" + "  are mindlessly answering questions on their computer. it appears one" + "\n" + "  MONITOR is displaying a strange message." + "\n" + "\n" + "  To your north are the South East halls." + "  What will you do?" + endOutput;
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
            if(floorMap[x][y] == floorMap[3][1]){
                a.textArea.append(beginOutput + "  Invalid movement!" + endOutput);
                return;
            }
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
        if(storedPreviousCommand.equals(a.playerStringForObjects)){
            sentCommand = false;
        }
        if(!(storedPreviousCommand.equals(a.playerStringForObjects))){
            sentCommand = true;
        }
    }
}