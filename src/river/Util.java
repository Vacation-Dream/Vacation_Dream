package river;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Util {
    private static int currentIndex = 0;
    private static final Object lock = new Object();



    public static int onetofive(){
        int number=(int)(Math.random()*5+1);
        return number;
    }





    public static void timeString(String text, int sleep){
        for(char c : text.toCharArray()){
            System.out.print(c);
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



    }
