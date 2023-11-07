public class Movement {
    private final String beginOutput = "\n" + "----------" + "\n";
    private final String endOutput = "\n" + "----------" + "\n" + "\n";
    private boolean movingEast, movingNorth = false;

    public int[] movements(windowlayout window, int xCoord, int yCoord, String[][] stringArray, int floorArrayMaxInt){
        int[] newCoords = new int[2];
        if(window.playerStringForObjects.equalsIgnoreCase("go east")){
            xCoord++;
            movingEast = true;  
            xCoord = invalidAreaInArrayX(window, stringArray, xCoord, yCoord, floorArrayMaxInt);
            window.textArea.append(stringArray[xCoord][yCoord]);
            window.playerStringForObjects = "";
        }
        else if(window.playerStringForObjects.equalsIgnoreCase("go west")){
            xCoord--;
            movingEast = false;  
            xCoord = invalidAreaInArrayX(window, stringArray, xCoord, yCoord, floorArrayMaxInt);
            window.textArea.append(stringArray[xCoord][yCoord]);
            window.playerStringForObjects = "";
        }
        else if(window.playerStringForObjects.equalsIgnoreCase("go north")){
            yCoord++;
            movingNorth = true;  
            yCoord = invalidAreaInArrayY(window, stringArray, xCoord, yCoord, floorArrayMaxInt);
            window.textArea.append(stringArray[xCoord][yCoord]);
            window.playerStringForObjects = "";
        }
        else if(window.playerStringForObjects.equalsIgnoreCase("go south")){
            yCoord--;
            movingNorth = false;  
            yCoord = invalidAreaInArrayY(window, stringArray, xCoord, yCoord, floorArrayMaxInt);
            window.textArea.append(stringArray[xCoord][yCoord]);
            window.playerStringForObjects = "";
        }
        newCoords[0] = xCoord;
        newCoords[1] = yCoord;
        return newCoords;
    }

    public boolean movementsFloor0(windowlayout window, int xCoord, String[] stringArray, boolean boolValueForValidity, boolean boolValueForLevel){
        if(window.playerStringForObjects.equalsIgnoreCase("go east")){
            if(boolValueForValidity){
                invalidAreainArrayXFloor1(window, stringArray, xCoord);
                xCoord++;
                window.textArea.append(stringArray[1]);
                window.playerStringForObjects = "";
                boolValueForLevel = false;
            }
            else{
                if(boolValueForValidity == false && window.playerStringForObjects.equalsIgnoreCase("go east")){
                    window.textArea.append(stringArray[1]);
                    window.playerStringForObjects = "";
                }
            }
        }
        else if(window.playerStringForObjects.equalsIgnoreCase("go west")){
            window.textArea.append(beginOutput + "  Invalid movement" + endOutput);
            window.playerStringForObjects = "";
        }
        else if(window.playerStringForObjects.equalsIgnoreCase("go north")){
            window.textArea.append(beginOutput + "  Invalid movement" + endOutput);
            window.playerStringForObjects = "";
        }
        else if(window.playerStringForObjects.equalsIgnoreCase("go south")){
            window.textArea.append(beginOutput + "  Invalid movement" + endOutput);
            window.playerStringForObjects = "";
        }
        return boolValueForLevel;
    }

    public int invalidAreaInArrayX(windowlayout window, String[][] stringArray, int xCoord, int yCoord, int floorArrayMaxInt){
        if( xCoord > floorArrayMaxInt || xCoord < 0)
        {
            window.textArea.append(beginOutput + "  Invalid movement!" + endOutput);
            if(!movingEast) xCoord++;
            else xCoord--;
        }
        else if(stringArray[xCoord][yCoord] == "  Cannot Enter"){
            window.textArea.append(beginOutput + "  Can't go here!" + endOutput);
            if(movingEast)xCoord--;
            else xCoord++;
        }
        return xCoord;
    }

    public int invalidAreainArrayXFloor1(windowlayout window, String[] stringArray, int xCoord){
        if( xCoord > 2 || xCoord < 0)
        {
            window.textArea.append(beginOutput + "  Invalid movement!" + endOutput);
            if(!movingEast) xCoord++;
            else xCoord--;
        }
        else if(stringArray[xCoord] == "  Cannot Enter"){
            window.textArea.append(beginOutput + "  Can't go here!" + endOutput);
            xCoord--;
        }
        return xCoord;
    }

    public int invalidAreaInArrayY(windowlayout window, String[][] stringArray, int xCoord, int yCoord, int floorArrayMaxInt)
    {
        if(yCoord > floorArrayMaxInt || yCoord < 0)
        {
            window.textArea.append(beginOutput + "  Invalid movement!" + endOutput);
            if(!movingNorth) yCoord++;
            else yCoord--;
        }
        if(stringArray[xCoord][yCoord] == "  Cannot Enter"){
            window.textArea.append(beginOutput + "  Can't go here!" + endOutput);
            if(movingNorth) yCoord--;
            else yCoord++;
        }
        return yCoord;
    }
}
