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



    public static void timeStringBehind(String text, long delay, long period) {
        synchronized (lock) {
            currentIndex =0;
            Timer timer = new Timer();
            timer.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    if (currentIndex < text.length()) {
                        System.out.print(text.charAt(currentIndex));
                        currentIndex++;
                    } else {
                        timer.cancel();
                    }
                }
            }, delay, period);
        }
    }



    }
