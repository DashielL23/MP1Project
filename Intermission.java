public class Intermission{
    private final String beginOutput = "\n" + "----------" + "\n";
    private final String endOutput = "\n" + "----------" + "\n" + "\n";

    public Intermission(windowlayout a, int b){
        floorChecks(a, b);
    }
    public Intermission(windowlayout a){
        //empty thing for initialization? idk
    }

    public void floorChecks(windowlayout a, int b){
        if(b==1){
            a.textArea.setText("");
            a.textArea.append(beginOutput +  "  You wait for a train and eventually one arrives... You" + "\n" + "  enter and begin your journey to retake your A+ GPA." + "\n" + "  After walking towards Brooklyn Tech, you enter one of the" + "\n" + "  Center Entrances..." + endOutput);
        }
        else if(b==2){
            a.textArea.setText("");
            a.textArea.append(beginOutput + "  You use the ELEVATOR KEYCARD, and successfully enter the elevator. You" + "\n" + "  proceed up towards the second floor..." + endOutput);
        }
        else if(b==3){
            a.textArea.setText("");
            a.textArea.append(beginOutput + "  You use the ELEVATOR KEYCARD, and successfully enter the elevator. You" + "\n" + "  proceed up towards the second floor..." + endOutput);
        }
        else if(b==4){
            a.textArea.setText("");
            a.textArea.append(beginOutput + "  You climb up the stairwell, but it seems the staircase to the fourth floor have collapsed. With nowhere else to go, you enter the third floor...");
        }
    }
}