    public class Intermission{
        private final String beginOutput = "\n" + "----------" + "\n";
        private final String endOutput = "\n" + "----------" + "\n" + "\n";
        private int b;

        private levelscreen levelScreen = new levelscreen();

        public Intermission(int a){
            b = a;
        }
        public Intermission(windowlayout a){
            //empty thing for initialization? idk
        }

        public void sleep(int a){
            try{
            Thread.sleep(a*1000);
            }
            catch(Exception e){
            System.out.println("whoopsie doopsie");
            }
        }

        public void floorChecks(windowlayout a){
            if(b==1){
                a.textArea.setText("");
                levelScreen.levelDisplay(a);
                sleep(4);
                a.textArea.append(beginOutput +  "  You wait for a train and eventually one arrives... You" + "\n" + "  enter and begin your journey to retake your A+ GPA." + "\n" + "  After walking towards Brooklyn Tech, you enter one of the" + "\n" + "  Center Entrances..." + endOutput);
                sleep(4);
            }
            else if(b==2){
                a.textArea.setText("");
                levelScreen.levelDisplay(a);
                sleep(4);
                a.textArea.append(beginOutput + "  You use the ELEVATOR KEYCARD, and successfully enter the elevator. You" + "\n" + "  proceed up towards the second floor..." + endOutput);
                sleep(4);
            }
            else if(b==3){
                a.textArea.setText("");
                levelScreen.levelDisplay(a);
                sleep(4);
                a.textArea.append(beginOutput + "  You climb up the stairwell, but it seems the staircase to" + "\n" + "  the fourth floor have collapsed. With nowhere else to go," + "\n" + "  you enter the third floor..." + endOutput);
                sleep(4);
            }
            else if(b==4){
                a.textArea.setText("");
                levelScreen.levelDisplay(a);
                sleep(4);
            }
        }
    }