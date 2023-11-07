public class levelscreen {
    private String level = "";
    private int iterationNum = 8;
    private final String beginOutput = "\n" + "----------" + "\n";
    private final String endOutput = "\n" + "----------" + "\n" + "\n";
    private MP1project projInfo = new MP1project();

    
    public void levelDisplay(windowlayout a){
        a.textArea.append(beginOutput + levelScreen(projInfo.floorNumForLevelScreen()-1) + endOutput);
    }

    public String levelScreen(int a){
        while(iterationNum >= 0){
            if(iterationNum == 8){
                level+= "    [F9:N/A]";
            }
            else if(a == iterationNum){
                level+= "\n" + "    [F" + (iterationNum + 1) + "] <== YOU ARE HERE";
            }
            else if(iterationNum < 3){
                level+= "\n" + "    [F" + (iterationNum + 1) +"]";
            }
            else{
                level+= "\n" + "    [F" + (iterationNum + 1) + ":N/A]";
            }
            iterationNum--;
        }
        return level.toString();
    }
}