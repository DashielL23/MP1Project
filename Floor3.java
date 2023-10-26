public class Floor3 {
    //instantiaze vars
    private Integer optionsToChoose = 3;

    private boolean sentCommand = false;
    private boolean floor3 = true;
    private boolean response = false;

    private String storedPreviousCommand = "";
    private final String beginOutput = "\n" + "----------" + "\n";
    private final String endOutput = "\n" + "----------" + "\n" + "\n";

    public void thirdFloorLevel(windowlayout a){
        storedPreviousCommand = a.playerStringForObjects;
        a.textArea.append(beginOutput + "  As you enter the halls of the third floor, the" + "\n" + "  walls around you begin to morph and close in around" + "\n" + "  you. Before the walls can crush you, a hooded figure" + "\n" + "  enters through a door." + endOutput);
        a.textArea.append(beginOutput + "  \"Ah, you must be the one traversing these accursed halls" + "\n" + "  to stop Lord Newman's sacrificial ritual. He has sent me" + "\n" + "  to make sure you don't disturb him. I could probably" + "\n" + "  kill you instantly, but what fun would that be? So" + "\n" + "  instead, I have a game prepared! How about it?\" ");
        while(floor3){
            System.out.println(a.playerStringForObjects);
            commandCheck(a);
            if(sentCommand == true){
                //special commands for movement
                movement(a);
                //player commands
                if(response == false){
                    checkResponses(a);
                }
                else if(optionsToChoose == 3){

                }
            }

        }
    }

    public void checkResponses(windowlayout a){
        a.textArea.append(beginOutput + "  \"Great for you! I don't really care though so let's" + "\n" + "  begin! I present to you ... 2 doors.\"" + "\n" + "\n" + "  To the door on your left... is the immediate entrance" + "  to the 4th floor. To the door on your right..." + "  a special prize(?) awaits! Now, what will you choose? (LEFT / RIGHT) " + endOutput);
        response = false;
    }

    public void firstChoice(windowlayout a){
        if(a.playerStringForObjects.equalsIgnoreCase("Left")){
            a.textArea.append(beginOutput + "  \"Hehehe... very well. You may proceed, don't blame me for missing out...\"" + endOutput);
            floor3 = false;
        }
        else if(a.playerStringForObjects.equalsIgnoreCase("Right")){
            a.textArea.append(beginOutput + "  \"Fantastic news! You receive... 1 Bathroom pass! Well, that's all I had on me... but, worry not! I have more prizes(?) to come! Would you like");
        }
    }

    public void movement(windowlayout a){
        if((a.playerStringForObjects.equalsIgnoreCase("go east") || a.playerStringForObjects.equalsIgnoreCase("go west")) || (a.playerStringForObjects.equalsIgnoreCase("go north") || (a.playerStringForObjects.equalsIgnoreCase("go south")))){
            a.textArea.append(beginOutput + "  You can't go here!" + endOutput);
            a.playerStringForObjects = "";
    }
    }

    public void commandCheck(windowlayout a){
        if(storedPreviousCommand.equals(a.playerStringForObjects)){
            sentCommand = false;
        }
        if(!(storedPreviousCommand.equals(a.playerStringForObjects))){
            sentCommand = true;
        }
}
}
