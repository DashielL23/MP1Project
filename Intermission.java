public class Intermission{
    private final String beginOutput = "\n" + "----------" + "\n";
    private final String endOutput = "\n" + "----------" + "\n" + "\n";

    public void intermissionFloor0(windowlayout a){
        a.textArea.setText("");
        a.textArea.append(beginOutput +  "  You wait for a train and eventually one arrives... You" + "\n" + "  enter and begin your journey to retake your A+ GPA." + "\n" + "  After walking towards Brooklyn Tech, you enter one of the" + "\n" + "  Center Entrances..." + endOutput);
    }
    public void intermissionFloor1(windowlayout a){
        a.textArea.setText("");
        a.textArea.append(beginOutput + "You use the ELEVATOR KEYCARD, and successfully enter the elevator. You" + "\n" + "  proceed up towards the second floor..." + endOutput);
    }
}