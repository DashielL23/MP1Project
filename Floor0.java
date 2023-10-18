public class Floor0 {
    //instantiaze vars
    private String[] floorMap = {"", ""}; //creates an Array Map 1x2 (0-1)
    
    private int x = 0; // start position for player x

    private boolean sentCommand = false;
    private boolean floor0 = true;
    private boolean hasKeys = false;
    private boolean usedKeys = false;
    private String storedPreviousCommand = "";
    private final String beginOutput = "\n" + "----------" + "\n";
    private final String endOutput = "\n" + "----------" + "\n" + "\n";

    //main void
    public void introductionLevel(windowlayout a){
        printLocationInformation();
        a.textArea.append(beginOutput + "  The date is October 31st, 1982. While you aren't the" + "\n" + "  superstitious type, today is different." + "\n" + "\n" + "  For 60 years, rumors of students at Brooklyn Tech being" + "\n" + "  sacrificed to please ancient dieties have been spread. While you" + "\n" + "  first thought this was all an urban legend, tonight changed" + "\n" + "  your opinion. As you checked your grade with your guidance" + "\n" + "  counselor, it would seem that your GPA had shifted from" + "\n" + "  an A+ to a meager A-. You thought it was" + "\n" + "  impossible! You'd aced all your exams, crushed projects, and studied" + "\n" + "  hard." + "\n" + "\n" + "  This must have been the work of the rumoured Dark" + "\n" + "  Lord Newman, an evil being that has been lurking since" + "\n" + "  Brooklyn Tech opened. As the rumor says, first your grade" + "\n" + "  goes down mysteriously, then you wind up dead before the" + "\n" + "  year's end." + "\n" + "\n" + "  The only way to stop the curse is to find" + "\n" + "  Dark Lord Newman's Lair, rumored to be on the mystical" + "\n" + "  9th floor, and use his eldritch computer to turn your" + "\n" + "  GPA back to an A+ before November, otherwise it's too" + "\n" + "  late." + "\n" + "\n" + "  While fighting against the forces of a Dark lord may" + "\n" + "  be scary, nothing is scarier than the disaproving look of" + "\n" + "  your parents during report card day..." + "\n" + "\n" + "  Thus, you prepare for the infiltration of Brooklyn Tech." + endOutput);
        a.textArea.append(floorMap[x]);

        while(floor0){
            System.out.println(a.playerStringForObjects);
            commandCheck(a);
            if(sentCommand == true){
                //set command to what you previously set it to
                storedPreviousCommand = a.playerStringForObjects;
                //movement check
                moveEast(a);
                //item check
                getKeys(a);
                useKeys(a);
                //unknown Command check
                if(!(a.playerStringForObjects.equalsIgnoreCase(""))){
                    a.textArea.append(beginOutput + "  Unknown Command!" + endOutput);
                }
            }
        }
    }

    //Array information
    public void printLocationInformation()
    {
        floorMap[0] = beginOutput + "  It isn't much, but it is definitely a New York" + "\n" + "  City apartment. You can hear the hustle and bustle of" + "\n" + "  the city outside your window. The last thing you need" + "\n" + "  to do is get your KEYS before you leave." + "\n" + "\n" + "  To your east is the subway. What do you do?" + endOutput;
        floorMap[1] = "  Cannot Enter";
    }

    //getting / using item voids
    public void getKeys(windowlayout a){
        if(floorMap[x] == floorMap[0] && a.playerStringForObjects.equalsIgnoreCase("get keys")){
            hasKeys = true;
            a.textArea.append(beginOutput + "  Obtained KEYS" + endOutput);
            floorMap[0] = beginOutput + "  It isn't much, but it is definitely a New York" + "\n" + "  City apartment. You can hear the hustle and bustle of" + "\n" + "  the city outside your window. The last thing you need" + "\n" + "  to do is lock your door with a RECENT ITEM" + "\n" + "  before you leave." + "\n" + "\n" + "  To your east is the subway. What do you do?" + endOutput;
            a.playerStringForObjects = "";
        }
        if(hasKeys == true && a.playerStringForObjects.equalsIgnoreCase("get keys")){
            a.textArea.append(beginOutput + "  You already have the KEYS" + endOutput);
            a.playerStringForObjects = "";
        }
    }

    public void useKeys(windowlayout a){
        
        if((floorMap[x] == floorMap[0] && a.playerStringForObjects.equalsIgnoreCase("use keys") && usedKeys == true)){
            a.textArea.append(beginOutput + "  You have already used your keys." + endOutput);
            a.playerStringForObjects = "";
        }
        if((floorMap[x] == floorMap[0] && a.playerStringForObjects.equalsIgnoreCase("use keys") && hasKeys == true)){
            a.textArea.append(beginOutput + "  You lock your doors. Now you can proceed to the subways." + endOutput);
            floorMap[1] = beginOutput + "  You enter the Subway station and you wait for a" + "\n" + "  subway." + endOutput;
            usedKeys = true;
            a.playerStringForObjects = "";
        }
    }
    //movement voids
    public void moveEast(windowlayout a){
        if(a.playerStringForObjects.equalsIgnoreCase("go east")){
            if(usedKeys == true){
                invalidAreaInArrayx(a);
                x++;
                a.textArea.append(floorMap[1]);
                a.playerStringForObjects = "";
                floor0 = false;
            }
        }
        else{
            if(usedKeys == false && a.playerStringForObjects.equalsIgnoreCase("go east")){
                a.textArea.append(floorMap[1]);
                a.playerStringForObjects = "";
            }
        }
    }

    public void invalidAreaInArrayx(windowlayout a)
    {
        if( x > 1 || x < 0)
        {
            a.textArea.append(beginOutput + "  Invalid movement!" + endOutput);
            x--;
        }
        if(floorMap[x] == "  Cannot Enter"){
            a.textArea.append(beginOutput + "  Can't go here!" + endOutput);
            x--;
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