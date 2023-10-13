import Market.*;
import river.River;
import util.Util;
import util.Variables;
import util.Util.*;
import java.util.ArrayList;



import java.util.Scanner;

import static Market.Hidden.HiddenScene;
import static Market.Special.SpecialScene;
import static util.Util.*;

public class Play {
    static Scanner sc = new Scanner(System.in);
    public static void start() {
        firstStory();
        dayStart();
    }

    private static void firstStory() {
        timeString("# 여름방학을 맞이해 주인공은 할머니댁에 놀러왔습니다.");
        timeString("# 일주일 뒤에있는 불꽃놀이 축제를 보고 돌아갈 예정입니다.");
        pressEnter();

        System.out.println("========= 이름설정 =========");
        System.out.print("# 당신의 이름을 정해주세요: ");
        Variables.name = sc.nextLine();


        SpecialScene();

    }


    private static void dayStart() {


        System.out.println();
        if (Variables.dayplus.equals("아침")) System.out.print("☀\uFE0F ");
        else if (Variables.dayplus.equals("오후")) System.out.print("⛅ ");
        else System.out.print("\uD83C\uDF19 ");
        System.out.printf("%d일차 %s입니다. \n", Variables.today, Variables.dayplus);

        if (Variables.today == 5 && Variables.dayplus.equals("아침")){
            HiddenScene();
            System.out.printf("%d일차 %s입니다. \n", Variables.today, Variables.dayplus);
        }




        Util.loveCheck();
        System.out.println("========== 오늘의 선택지 ==========");
        if (Variables.today != 7) {
            System.out.println("(1) 근처에서 산책한다.");
            System.out.println("(2) 냇가로 이동한다.");
            System.out.println("(3) 시장으로 이동한다.");
            System.out.println("(4) 메모장을 편다.");
            System.out.print(">> ");
        } else if (Variables.today == 7){
            System.out.println("(1) 축제장소로 이동한다.");
            System.out.println("(2) 집에 있는다.");
            System.out.print(">> ");
        }
        String choice = sc.nextLine();
        if (Variables.today != 7) {
            switch (choice) {
                case "1":
                    walkEvent.Main.select();
                    roof();
                    break;
                case "2":
                    new River().event();
                    roof();
                    break;
                case "3":
                    Market.main1();
                    roof();
                    break;
                case "4":
                    hint();
                    break;
            }
        } else {
            switch (choice) {
                case "1":
                    festival.Play.storyPlay();
                case "2":
                    festival.CowardEnding.cowardEnd();
            }
        }


        dayStart();
    }

    public static void roof() {
        if (Variables.dayplus.equals("아침")) {
            Variables.dayplus = "오후";
        }
        else if (Variables.dayplus.equals("오후")) {
            Variables.dayplus = "저녁";
        }
        else if (Variables.dayplus.equals("저녁")) {
            Variables.dayplus = "아침";
            Variables.today += 1;
        }
        dayStart();
    }

    public static void hint() {
        System.out.println("====================");
        System.out.println("메모장을 폈다 뭐부터 볼까?");
        System.out.println("(1) 서아가 좋아하는것");
        System.out.println("(2) 서아가 싫어하는것");
        String choice = sc.nextLine();
        switch (choice){
            case "1":
                like();
                break;
            case "2":
                hate();
                break;
        }
    }

    public static void like(){
        System.out.println("서아가 좋아하는것 리스트");
        System.out.println("====================");
        for (String element : Variables.likeList) {
            System.out.println(element);
        }
        pressEnter();
    }

    public static void hate(){
        System.out.println("서아가 싫어하는것 리스트");
        System.out.println("====================");
        for (String element : Variables.hateList) {
            System.out.println(element);
        }
        pressEnter();
    }














}
