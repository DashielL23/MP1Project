import java.util.TimerTask;

public class CustomTimerTask extends TimerTask{
    //vars
    private windowlayout a; //get a new window

    //constructor for windowlayout
    public CustomTimerTask(windowlayout a){
        this.a = a; //set window in other object to window in this custom timer
    }
    //main void to run
    public void run(){
        a.textArea.setText("");
    }
}
