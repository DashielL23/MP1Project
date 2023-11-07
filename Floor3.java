public class Floor3 {
    //instantiaze vars
    private Integer optionsToChoose = 3;
    
    private boolean death = false;
    private boolean sentCommand = false;
    private boolean floor3 = true;
    private boolean response = false;
    private boolean secondResponse = false;
    private boolean thirdResponse = false;
    private double doorNumber = (Integer.MAX_VALUE + Integer.MIN_VALUE) * 10 + 3.1415 + (Math.random()*5);
    
    private String storedPreviousCommand = "";
    private final String beginOutput = "\n" + "----------" + "\n";
    private final String endOutput = "\n" + "----------" + "\n" + "\n";

    public void thirdFloorLevel(windowlayout a){
        System.out.println(a.playerStringForObjects);
        a.textArea.append(beginOutput + "  As you enter the halls of the third floor, the" + "\n" + "  walls around you begin to morph and close in around" + "\n" + "  you. Before the walls can crush you, a hooded figure" + "\n" + "  enters through a door." + endOutput);
        a.textArea.append(beginOutput + "  \"Ah, you must be the one traversing these accursed halls" + "\n" + "  to stop Lord Newman's sacrificial ritual. He has sent me" + "\n" + "  to make sure you don't disturb him. I could probably" + "\n" + "  kill you instantly, but what fun would that be? So" + "\n" + "  instead, I have a game prepared! How about it?\" " + endOutput);
        while(floor3){
            System.out.println(a.playerStringForObjects);
            commandCheck(a);
            if(sentCommand == true){
                //special commands for movement
                movement(a);
                //player commands
                if(!response && !(a.playerStringForObjects.equalsIgnoreCase(""))){
                    guysFirstResponse(a);
                }
                else if(optionsToChoose == 3 && !(a.playerStringForObjects.equalsIgnoreCase(""))){
                    firstChoice(a);
                }
                else if(!secondResponse && !(a.playerStringForObjects.equalsIgnoreCase(""))){
                    guysSecondResponse(a);
                }
                else if(optionsToChoose == 4 && !(a.playerStringForObjects.equalsIgnoreCase(""))){
                    secondChoice(a);
                }
                else if (!thirdResponse && !(a.playerStringForObjects.equalsIgnoreCase(""))){
                    guysThirdResponse(a);
                }
                else if(optionsToChoose == 5 & !(a.playerStringForObjects.equalsIgnoreCase(""))){
                    thirdChoice(a);
                }
                storedPreviousCommand = a.playerStringForObjects;
            }
        }

        while(death){
            boolean v = false;
            if(!v){
            a.textArea.append("So, you died on the Third floor, and Newman was" + "\n" + "  able to sacrifice several teens to keep his good graces" + "\n" + "  with Highschool Ranking Systems. Maybe next time don't gamble?" + "\n" + "\n" + "  GAME OVER! RESTART TO PLAY AGAIN");
            v = true;
            }
        }
    }

    public void guysFirstResponse(windowlayout a){
        a.textArea.append(beginOutput + "  \"Great for you! I don't really care though so let's" + "\n" + "  begin! I present to you ... 2 doors.\"" + "\n" + "\n" + "  To the door on your left... is the immediate entrance" + "\n" + "  to the 4th floor. To the door on your right..." + "\n" + "  a special prize(?) awaits! Now, what will you choose? (LEFT / RIGHT) " + endOutput);
        a.playerStringForObjects = "";
        response = true;
    }

    public void guysSecondResponse(windowlayout a){
        a.textArea.append(beginOutput + "  \"Ok, next question!\" As the figure says this, another door " + "\n" + "  seems to appear out of nowhere. \"Now there are 3" + "\n" + "  doors. To the door on your left... is the immediate" + "\n" + "  entrance to the 4th floor! To the other doors... lie" + "\n" + "  mystery prizes(?????!!!!) Now pick quickly!\" (LEFT / CENTER / RIGHT)" + endOutput);
        a.playerStringForObjects = "";
        secondResponse = true;
    }

    public void guysThirdResponse(windowlayout a){
        a.textArea.append(beginOutput + "  \"Ok! Final Question!! I have 4 doors here... The door" + "\n" + "  on the left, the door on the right, the door" + "\n" + "  in the center, and door number " + doorNumber + "!!! (LEFT / RIGHT / CENTER" + "\n" + "  / THE OTHER ONE)" + endOutput);
        a.playerStringForObjects = "";
        thirdResponse = true;
    }

    public void firstChoice(windowlayout a){
        if(a.playerStringForObjects.equalsIgnoreCase("Left")){
            a.textArea.append(beginOutput + "  \"Hehehe... very well. You may proceed, don't blame me for missing out...\"" + endOutput);
            a.playerStringForObjects = "";
            floor3 = false;
        }
        else if(a.playerStringForObjects.equalsIgnoreCase("Right")){
            a.textArea.append(beginOutput + "  \"Fantastic news! You receive... 1 Bathroom pass! Well, that's all" + "\n" + "  I had on me... but, worry not! I have more" + "\n" + "  prizes(?) to come!\"" + endOutput);
            a.playerStringForObjects = "";
            optionsToChoose++;
        }
        else if(!(a.playerStringForObjects.equalsIgnoreCase("right")) || !(a.playerStringForObjects.equalsIgnoreCase("left")) || !(a.playerStringForObjects.equalsIgnoreCase(""))){
            a.textArea.append(beginOutput + "  \"That's not a valid input...\"" + endOutput);
            a.playerStringForObjects = "";
        }
    }

    public void secondChoice(windowlayout a){
        if(a.playerStringForObjects.equalsIgnoreCase("Left")){
            a.textArea.append(beginOutput + "  \"Hehehe... very well. You may proceed, don't blame me for missing out...\"" + endOutput);
            a.playerStringForObjects = "";
            floor3 = false;
        }
        else if(a.playerStringForObjects.equalsIgnoreCase("Right")){
            a.textArea.append(beginOutput + "  \"Fantastic news! You receive... 13 cents! Ahem," + "\n" + " that's all the change I had on me... but, worry not! I have more" + "\n" + "  prizes(???!?!?!?) to come!\"" + endOutput);
            a.playerStringForObjects = "";
            optionsToChoose++;
        }
        else if(a.playerStringForObjects.equalsIgnoreCase("Center")){
            a.textArea.append(beginOutput + "  \"ooooh, bad choice!! Unfortunately, you've lost the game... What? You" + "\n" + "  think that's unfair? Well maybe stop being a gambler and" + "\n" + "  go straight to the next floor! Too bad, sucker!\" As" + "\n" + "  the figure finishes their sentence, a massive head comes out" + "\n" + "  of the door and bites you in half..." + "\n" + "\n" + "  YOU DIE" + endOutput);
            death = true;
            a.playerStringForObjects = "";
            floor3 = false;
        }
        else if(!(a.playerStringForObjects.equalsIgnoreCase("right")) || !(a.playerStringForObjects.equalsIgnoreCase("left")) || !(a.playerStringForObjects.equalsIgnoreCase("") || !(a.playerStringForObjects.equalsIgnoreCase("center")))){
            a.textArea.append(beginOutput + "  \"That's not a valid input...\"" + endOutput);
            a.playerStringForObjects = "";
        }
    }

    public void thirdChoice(windowlayout a){
        Intermission sleep = new Intermission(a);
        if(a.playerStringForObjects.equalsIgnoreCase("Left")){
            a.textArea.append(beginOutput + "  \"Hehehe... very well. You may proceed, don't blame me for missing out...\"" + endOutput);
            a.playerStringForObjects = "";
            sleep.sleep(5);
            floor3 = false;
        }
        else if(a.playerStringForObjects.equalsIgnoreCase("Right")){
            a.textArea.append(beginOutput + "  \"Fantastic news! You receive... 3 colored pens! ...What?" + "\n" + "  I'm on a teacher's salary, you didn't expect me to show you a vacation to the Bahamas, did you? I don't even get paid under Newman, it just goes to my \"volunteer\" hours I need to touch up my resume so I can leave..." + "\n" + "  Well anyways, that's the last door!\"" + endOutput);
            a.playerStringForObjects = "";
            optionsToChoose++;
            sleep.sleep(5);
        }
        else if(a.playerStringForObjects.equalsIgnoreCase("Center")){
            a.textArea.append(beginOutput + "  \"ooooh, bad choice!! Unfortunately, you've lost the game... What? You" + "\n" + "  think that's unfair? Well maybe stop being a gambler and" + "\n" + "  go straight to the next floor! Too bad, sucker!\" As" + "\n" + "  the figure finishes their sentence, a massive head comes out" + "\n" + "  of the door and bites you in half..." + "\n" + "\n" + "  YOU DIE" + endOutput);
            death = true;
            a.playerStringForObjects = "";
            floor3 = false;
        }
        else if(a.playerStringForObjects.equalsIgnoreCase("The other one")){
            a.textArea.append(beginOutput + "  \"So, you chose the shady door with a strange number?" + "\n" + "  Definitely sounds like something you'd do. Don't blame me for" + "\n" + "  what's about to happen...\"" + "\n" + "  As the man says this, the world around you begins" + "\n" + "  to disappear into nothing but a void. You find yourself" + "\n" + "  completely and utterly alone in a dark and empty void..." + "\n" + "\n" + "  YOU DIE" + endOutput);
            a.playerStringForObjects = "";
            death = true;
            floor3 = false;            
        }
        else if(!(a.playerStringForObjects.equalsIgnoreCase("right")) || !(a.playerStringForObjects.equalsIgnoreCase("left")) || !(a.playerStringForObjects.equalsIgnoreCase("") || !(a.playerStringForObjects.equalsIgnoreCase("center") || !(a.playerStringForObjects.equalsIgnoreCase("the other one"))))){
            a.textArea.append(beginOutput + "  \"That's not a valid input...\"" + endOutput);
            a.playerStringForObjects = "";
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
