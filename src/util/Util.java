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
        if(Variables.love < 0) Variables.love = 0;

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
        else if(Variables.love >= 1) {
            System.out.println("서아의 호감도: \uD83D\uDC96\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D\uD83E\uDD0D");
        }


    };


    public static void talkSeo(String s){
        System.out.print("\uD83D\uDC69\uD83C\uDFFB(서아): ");
        Util.timeString(s);
    }
    public static void talkMe(String s){
        System.out.print("\uD83E\uDDD1\uD83C\uDFFB"+ "(" + Variables.name+"): ");
        Util.timeString(s);
    }
    public static void talkJun(String s){
        System.out.print("\uD83D\uDC66\uD83C\uDFFB(준석): ");
        Util.timeString(s);
    }
    public static void talkMadam(String s){
        System.out.print("\uD83D\uDC69\uD83C\uDFFB\u200D\uD83E\uDDB0(분식집 아주머니): ");
        Util.timeString(s);
    }
    public static void talkFlower(String s){
        System.out.print("\uD83D\uDC69\uD83C\uDFFC\u200D\uD83E\uDDB1(꽃가게 사장님): ");
        Util.timeString(s);
    }
    public static void talkVegetable(String s){
        System.out.print("\uD83E\uDDD4(야채가게 아저씨): ");
        Util.timeString(s);
    }
    public static void loveGage(int num){
        Variables.love += num;
        if (num >= 10){
            System.out.println("# 호감도가 상승했습니다.");
        } else if (num >=5) {
            System.out.println("# 호감도가 조금 상승했습니다.");
        } else if (num >= -5) {
            System.out.println("# 호감도가 조금 하락했습니다.");
        } else {
            System.out.println("# 호감도가 하락했습니다");
        }
    }
    }
