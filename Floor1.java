
public class Floor1 {
    //instantiaze vars
    private String[][] floorMap = new String[3][3]; //creates an Array Map 3x3 (0-2)

    private int x = 1; // start position for player x
    private int y = 1; // start position for player y

    private boolean floor1 = true; // for while loop
    private boolean hasChickenTenders = false;
    private boolean luredAuditorium = false;

    private String stringForCommands = ""; //also for while loop to assure playerstringforobjects is initialized
    private String beginOutput = "\n" + "----------" + "\n";
    private String endOutput = "\n" + "----------" + "\n" + "\n";
    //main void that runs in the main file
    public void firstFloorLevel(windowlayout a)
    {
        //initialize arrays
        floorMapSpotsUnenterable();
        printLocationInformation();
        a.textArea.append(floorMap[x][y]);
        //main loop
        while(floor1){
            System.out.println(a.playerStringForObjects); //for some reason my code only works with this line. Not sure why???
            stringForCommands = a.playerStringForObjects;

            //moving commands
            moveNorth(a);
            moveSouth(a);
            moveEast(a);
            moveWest(a);
            checkPerimeter(a);  
            //Getting Items
            oldTenders(a); 
            
            
        }
    }

    //voids for unenterable areas / enterable areas
    public void floorMapSpotsUnenterable(){
        floorMap[0][0] = floorMap[0][2] = floorMap[1][2] = floorMap[2][0] = floorMap[2][2] = "  Cannot Enter"; // Can't enter
    }

    public void printLocationInformation()
    {
        floorMap[0][1] = beginOutput + "  As you enter the Main Office, the stench coming from" + "\n" + "  the room becomes harder to bear, and you have difficulty" + "\n" + "  breathing. After investigating the smell, you find that it was" + "\n" + "  an expired serving of Chicken Tenders, fully complete with chunky" + "\n" + "  chwocolate milk." + "\n" + "\n" + "  To your East is the hallways you've came from, though" + "\n" + "  it may be in your best interest to rid the " + "\n" + "  main office of the rancid smell." + endOutput;
        floorMap[1][1] = beginOutput + "  As you enter the hallways of the first floor, you" + "\n" + "  hear the groans of lost souls who ended up in" + "\n" + "  BTHS orientation day coming from the Auditorium. The stairs are" + "\n" + "  blocked, the only way from here will be the elevator." + "\n" + "\n" + "  To your east is the Elevator, which requires a key." + "\n" + "\n" + "  To your west is the Main Office, with a rancid" + "\n" + "  smell seeping out from the inside. " + "\n" + "\n" + "  To your south is the Auditorium where Orientation is occuring" + "\n" + "\n" + "  To your north is the door you entered from, although" + "\n" + "  it seems to have locked as you entered. Doesn't look" + "\n" + "  like you won't be leaving through here..." + "\n" + "\n" + "  What will you do?" + endOutput;
        floorMap[2][1] = beginOutput + "  As you approach the elevator, you realize you need a key to access it." + "\n" + "\n" + "  To your west is the hall you've came from." + "\n" + "  What will you do?" + endOutput;
        floorMap[1][0] = beginOutput + "  Before you entered the Auditorium, you think better of it," + "\n" + "  realizing you'd quickly be caught be Dark Lord Newman's servants" + "\n" + "  if you walked in carelessly. You'll need to lure away" + "\n" + "  the orientation members with something." + endOutput;
    }

    //void for the items you can obtain
    public void oldTenders(windowlayout a)
    {
        if(floorMap[x][y] == floorMap[0][1]){
            if(hasChickenTenders == true && a.playerStringForObjects.equalsIgnoreCase("get Chicken Tenders")){
                a.textArea.append(beginOutput + "You already have the tenders" + endOutput);
                a.playerStringForObjects = "";
                
            }
            if(a.playerStringForObjects.equalsIgnoreCase("get Chicken Tenders")){
                hasChickenTenders = true;
                a.textArea.append(beginOutput + "Obtained Chicken Tenders" + endOutput);
                floorMap[0][1] = beginOutput + "  As you enter the Main Office, you realize the stench " + "\n" + "  coming from the room has disappeared. " + "\n" + "\n" + "  To your East is the hallways you've came from." + endOutput;
                floorMap[1][1] = beginOutput + "  As you enter the hallways of the first floor, you" + "\n" + "  hear the groans of lost souls who ended up in" + "\n" + "  BTHS orientation day coming from the Auditorium. The stairs are" + "\n" + "  blocked, the only way from here will be the elevator." + "\n" + "\n" + "  To your east is the Elevator, which requires a key." + "\n" + "\n" + "  To your West is the Main Office" + "\n" + "\n" + "  To your south is the Auditorium where Orientation is occuring" + "\n" + "\n" + "  To your north is the door you entered from, although" + "\n" + "  it seems to have locked as you entered. Doesn't look" + "\n" + "  like you won't be leaving through here..." + "\n" + "\n" + "  What will you do?" + endOutput;
                a.playerStringForObjects = "";
                
            }
        }
    }


    //checks if player outside array perimiter
    public void checkPerimeter(windowlayout window)
    {
        if( x > 2 || x < 0)
        {
            window.textArea.append(beginOutput + "  Invalid movement!" + endOutput);
            x--;
        }
        if(y > 2 || y < 0)
        {
            window.textArea.append(beginOutput + "  Invalid movement!" + endOutput);
            y--;
        }
    }

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
    public void invalidAreaInArrayx(windowlayout window)
    {
        if(floorMap[x][y].equals("  Cannot Enter")){
            x--;
            window.textArea.append(beginOutput + "  Invalid movement!" + endOutput);
        }
    }

    public void invalidAreaInArrayY(windowlayout window)
    {
        if(floorMap[x][y].equals("  Cannot Enter")){
            y--;
            window.textArea.append(beginOutput + "  Invalid movement!" + endOutput);
        }
    }
}
