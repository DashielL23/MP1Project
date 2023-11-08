public class beginscreen {
    private final String beginOutput = "\n" + "----------" + "\n";
    private final String endOutput = "\n" + "----------" + "\n" + "\n";
    private String storedPreviousCommand = "";
    private boolean sentCommand = false;
    private boolean begin = true;

    public void startScreen(windowlayout a){
        storedPreviousCommand = a.playerStringForObjects;
        System.out.println(a.playerStringForObjects);
        a.textArea.append(beginOutput + "  █░█░█ █▀▀ █░░ █▀▀ █▀█ █▀▄▀█ █▀▀   ▀█▀ █▀█ "  + "\n" + "  ▀▄▀▄▀ ██▄ █▄▄ █▄▄ █▄█ █░▀░█ ██▄   ░█░ █▄█ " + "\n" + "\n" + "   ▀█▀ █▀▀ █▀▀ █░█   █▀█ █░█ █▀▀ █▀ ▀█▀" + "\n" + "   ░█░ ██▄ █▄▄ █▀█   ▀▀█ █▄█ ██▄ ▄█ ░█░");
        a.textArea.append(beginOutput + "  Please submit something to begin" + endOutput);
        while(begin){
            System.out.println(sentCommand);
            commandCheck(a);
            if(sentCommand == true){
                a.playerStringForObjects = "";
                begin = false;
            }
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
