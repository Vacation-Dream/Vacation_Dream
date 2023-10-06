package util;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Util {

    public static int onetofive(){
        int number=(int)(Math.random()*5+1);
        return number;
    }

    public static void timeString(String text){
        for(char c : text.toCharArray()){
            System.out.print(c);
            try {
                Thread.sleep(85);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            System.out.println();
    }

    public static void pressEnter() {
        System.out.print("# 엔터를 눌러 계속.....");
        while (true) {
            String a = sc.nextLine();
            if(a.isEmpty()) {
                break;
            }
        }
    }

    public static Scanner sc = new Scanner(System.in);
    public static void makeLine(){
        System.out.println("=========================================");
    }
    public static String input(String message){
        System.out.print(message);
        return sc.nextLine();
    }
    public static void br(){
        System.out.println("");
    }

    public static void loveCheck() {
        if(Variables.love == 0) {
            System.out.println("서아의 호감도: \uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D");
        }
        else if(Variables.love >= 100) {
            System.out.println("서아의 호감도: \uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96");
        }
        else if(Variables.love >= 90) {
            System.out.println("서아의 호감도: \uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83E\uDD0D");
        }
        else if(Variables.love >= 80) {
            System.out.println("서아의 호감도: \uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83E\uDD0D\uD83E\uDD0D");
        }
        else if(Variables.love >= 70) {
            System.out.println("서아의 호감도: \uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D");
        }
        else if(Variables.love >= 60) {
            System.out.println("서아의 호감도: \uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D");
        }
        else if(Variables.love >= 50) {
            System.out.println("서아의 호감도: \uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D");
        }
        else if(Variables.love >= 40) {
            System.out.println("서아의 호감도: \uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D");
        }
        else if(Variables.love >= 30) {
            System.out.println("서아의 호감도: \uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D");
        }
        else if(Variables.love >= 20) {
            System.out.println("서아의 호감도: \uD83D\uDC96\uD83D\uDC96\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D");
        }
        else if(Variables.love >= 10) {
            System.out.println("서아의 호감도: \uD83D\uDC96\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D");
        }
    };


    }
