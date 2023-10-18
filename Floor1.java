public class Floor1 {
    //instantiaze vars
    private String[][] floorMap = new String[3][3]; //creates an Array Map 3x3 (0-2)

    private int x = 1; // start position for player x
    private int y = 1; // start position for player y


    private boolean floor1 = true; // for while loop
    private boolean hasChickenTenders = false;
    private boolean luredAuditorium = false;
    private boolean hasKeyCard = false;
    private boolean sentCommand = false;

    private String storedPreviousCommand = "";
    private final String beginOutput = "\n" + "----------" + "\n";
    private final String endOutput = "\n" + "----------" + "\n" + "\n";
    //main void that runs in the main file
    public void firstFloorLevel(windowlayout a)
    {
        //initialize arrays / vars
        floorMapSpotsUnenterable();
        floorMapSpotsEnterable();
        storedPreviousCommand = a.playerStringForObjects;
        //send first message
        a.textArea.append(floorMap[x][y]);
        //main loop
        while(floor1){
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
                oldTenders(a); 
                useTenders(a);
                elevatorKeyCard(a);
                useKeyCard(a);
                if(!(a.playerStringForObjects.equalsIgnoreCase(""))){
                    a.textArea.append(beginOutput + "  Unknown Command!" + endOutput);
                }
            }
            
        }
    }

    //voids for unenterable areas / enterable areas
    public void floorMapSpotsUnenterable(){
        floorMap[0][0] = floorMap[0][2] = floorMap[1][2] = floorMap[2][0] = floorMap[2][2] = "  Cannot Enter"; // Can't enter
    }

    public void floorMapSpotsEnterable()
    {
        floorMap[0][1] = beginOutput + "  As you enter the Main Office, the stench coming from" + "\n" + "  the room becomes harder to bear, and you have difficulty" + "\n" + "  breathing. After investigating the smell, you find that it was" + "\n" + "  an expired serving of CHICKEN TENDERS, fully complete with chunky" + "\n" + "  chwocolate milk." + "\n" + "\n" + "  To your east is the hallways you've came from, though" + "\n" + "  it may be in your best interest to rid the " + "\n" + "  main office of the rancid smell." + endOutput;
        floorMap[1][1] = beginOutput + "  As you enter the hallways of the first floor, you" + "\n" + "  hear the groans of lost souls who ended up in" + "\n" + "  BTHS orientation day coming from the Auditorium. The stairs are" + "\n" + "  blocked, the only way from here will be the elevator." + "\n" + "\n" + "  To your east is the Elevator, which requires a key." + "\n" + "\n" + "  To your west is the Main Office, with a rancid" + "\n" + "  smell seeping out from the inside. " + "\n" + "\n" + "  To your south is the Auditorium where Orientation is occuring" + "\n" + "\n" + "  To your north is the door you entered from, although" + "\n" + "  it seems to have locked as you entered. Doesn't look" + "\n" + "  like you won't be leaving through here..." + "\n" + "\n" + "  What will you do?" + endOutput;
        floorMap[2][1] = beginOutput + "  As you approach the elevator, you realize you need a key to access it." + "\n" + "\n" + "  To your west is the hall you've came from." + "\n" + "\n" + "  What will you do?" + endOutput;
        floorMap[1][0] = beginOutput + "  Before you entered the Auditorium, you think better of it," + "\n" + "  realizing you'd quickly be caught be Dark Lord Newman's servants" + "\n" + "  if you walked in carelessly. You'll need to lure away" + "\n" + "  the orientation members with something." + endOutput;
    }

    //void for the items you can obtain or actions that effect the map
    public void oldTenders(windowlayout a)
    {
        if(floorMap[x][y] == floorMap[0][1]){
            if(hasChickenTenders == true && a.playerStringForObjects.equalsIgnoreCase("get CHICKEN TENDERS")){
                a.textArea.append(beginOutput + "  You already have the tenders" + endOutput);
                a.playerStringForObjects = "";
                
            }
            if(a.playerStringForObjects.equalsIgnoreCase("get CHICKEN TENDERS")){
                hasChickenTenders = true;
                a.textArea.append(beginOutput + "  Obtained CHICKEN TENDERS" + endOutput);
                floorMap[0][1] = beginOutput + "  As you enter the Main Office, you realize the stench " + "\n" + "  coming from the room has disappeared. " + "\n" + "\n" + "  To your east is the hallways you've came from." + endOutput;
                floorMap[1][1] = beginOutput + "  As you enter the hallways of the first floor, you" + "\n" + "  hear the groans of lost souls who ended up in" + "\n" + "  BTHS orientation day coming from the Auditorium. The stairs are" + "\n" + "  blocked, the only way from here will be the elevator." + "\n" + "\n" + "  To your east is the Elevator, which requires a key." + "\n" + "\n" + "  To your west is the Main Office" + "\n" + "\n" + "  To your south is the Auditorium where Orientation is occuring" + "\n" + "\n" + "  To your north is the door you entered from, although" + "\n" + "  it seems to have locked as you entered. Doesn't look" + "\n" + "  like you won't be leaving through here..." + "\n" + "\n" + "  What will you do?" + endOutput;
                floorMap[1][0] = beginOutput + "  Before you entered the Auditorium, you think better of it," + "\n" + "  realizing you'd quickly be caught be Dark Lord Newman's servants" + "\n" + "  if you walked in carelessly. You'll need to lure away" + "\n" + "  the orientation members with something. Maybe use a RECENT ITEM?" + endOutput;
                a.playerStringForObjects = "";
                
            }
        }
    }

    public void useTenders(windowlayout a){
        if(floorMap[x][y] == floorMap[1][0]){
            if(luredAuditorium == true && a.playerStringForObjects.equalsIgnoreCase("use Chicken Tenders")){
                a.textArea.append(beginOutput + "  You already used CHICKEN TENDERS.");
                a.playerStringForObjects = "";
            }
            if((a.playerStringForObjects.equalsIgnoreCase("use Chicken Tenders")) && hasChickenTenders){
                luredAuditorium = true;
                a.textArea.append(beginOutput + "  You place the CHICKEN TENDERS on the ground near the" + "\n" + "  Auditorium door. All of a sudden, you hear a 'BANG," + "\n" + "  BANG, BANG'. You quickly hide behind a pillar as tens" + "\n" + "  of orientation members rush out from the Auditorium and scramble" + "\n" + "  to eat the CHICKEN TENDERS placed outside. You can no" + "\n" + " longer use CHICKEN TENDERS. As you walk inside the Auditorium" + "\n" + "  and find a ELEVATOR KEYCARD that must have been dropped" + "\n" + "  during the commotion." + "\n" + "\n" + "  To your north are the hallways you've came from. What" + "\n" + "\n" + "  do you do?" + endOutput);
                floorMap[1][1] = beginOutput + "  As you enter the hallways of the first floor, you" + "\n" + "  hear the groans of lost souls who ended up in" + "\n" + "  BTHS orientation day coming from the Auditorium. The stairs are" + "\n" + "  blocked, the only way from here will be the elevator." + "\n" + "\n" + "  To your east is the Elevator, which requires a key." + "\n" + "\n" + "  To your west is the Main Office" + "\n" + "\n" + "  To your south is the Auditorium where Orientation is paused" + "\n" + "\n" + "  To your north is the door you entered from, although" + "\n" + "  it seems to have locked as you entered. Doesn't look" + "\n" + "  like you won't be leaving through here..." + "\n" + "\n" + "  What will you do?" + endOutput;
                floorMap[1][0] = beginOutput + "  You walk in the empty auditorium, hearing the orientation members still feasting outside on the chicken tenders." + "\n" + "  On the ground lies an ELEVATOR KEYCARD." + "\n" + "\n" + "  To your north are the halls you've came from"  + endOutput;
                a.playerStringForObjects = "";
            }
            
        }
    }

    public void elevatorKeyCard(windowlayout a){
        if(floorMap[x][y] == floorMap[1][0]){
            if(hasKeyCard == true && a.playerStringForObjects.equalsIgnoreCase("get elevator keycard")){
                a.textArea.append(beginOutput + "  You already have the ELEVATOR KEYCARD");
                a.playerStringForObjects = "";
            }
            if(luredAuditorium == true && a.playerStringForObjects.equalsIgnoreCase("get elevator keycard")){
                hasKeyCard = true;
                a.textArea.append(beginOutput + "  You take the ELEVATOR KEYCARD. Now you can use the" + "\n" + "  elevator." + endOutput);
                floorMap[1][0] = beginOutput + "  You enter the Auditorium, narrowly avoiding the crowd still eating" + "\n" + "  the old Chicken Tenders. There doesn't seem to be anything" + "\n" + "  you can do here." + "\n" + "\n" + "  To your north are the halls you came from. What" + "  do you do?" + endOutput;
                floorMap[2][1] = beginOutput + "  As you approach the elevator, you realize you need a" + "\n" + "  key to access it. Maybe you can use a RECENT " + "\n" + "  ITEM?" + "\n" + "\n" + "  To your west is the hall you've came from." + "\n" + "  What will you do?" + endOutput;
                a.playerStringForObjects = "";
            }
        }
    }

    public void useKeyCard(windowlayout a){
        if((floorMap[x][y] == floorMap[2][1] && hasKeyCard == true) && a.playerStringForObjects.equalsIgnoreCase("use elevator keycard")){
            a.playerStringForObjects = "";
            floor1 = false;
            }
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
        if( x > 2 || x < 0)
        {
            a.textArea.append(beginOutput + "  Invalid movement!" + endOutput);
            if(x < 0) x++;
            else x--;
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
            if(y < 0) y++;
            else y--;
        }
        if(floorMap[x][y] == "  Cannot Enter"){
            a.textArea.append(beginOutput + "  Can't go here!" + endOutput);
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