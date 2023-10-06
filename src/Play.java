import Market.*;
import river.River;
import util.Util;
import util.Variables;
import util.Util.*;


import java.util.Scanner;

import static util.Util.*;

public class Play {
    static Scanner sc = new Scanner(System.in);
    public static void start() {
        firstStory();
        dayStart();
    }

    private static void firstStory() {
//        timeString("여름방학을 맞이해 주인공은 할머니댁에 놀러가게 됩니다.");
//        timeString("이곳은 평화로운 시골 동네로, 주인공은 조용한 여름 휴가를 즐기려고 기대합니다.");
//        timeString("하지만 할머니댁 옆집에 사는 서아라는 손녀를 만나게 됩니다.");
//        timeString("서아는 동네에서 유명한 미녀로,");
//        timeString( "그녀의 아름다움과 매력에 주인공은 반한 것 같습니다.");
//        pressEnter();

        System.out.println("==================");
        timeString("# 방학목표: 축제에서 서아에게 고백하기");
        System.out.print("# 당신의 이름을 정해주세요: ");
        Variables.name = sc.nextLine();
    }


    private static void dayStart() {
        System.out.println();
        if (Variables.dayplus.equals("아침")) System.out.print("☀\uFE0F ");
        else if (Variables.dayplus.equals("오후")) System.out.print("⛅");
        else System.out.print("\uD83C\uDF19 ");
        System.out.printf("%d일차 %s입니다. \n", Variables.today, Variables.dayplus);
        Util.loveCheck();
        System.out.println("========== 오늘의 선택지 ==========");
        if (Variables.today != 7) {
            System.out.println("(1) 공터로 이동한다.");
            System.out.println("(2) 냇가로 이동한다.");
            System.out.println("(3) 시장으로 이동한다.");
        } else if (Variables.today == 7 && Variables.dayplus.equals("저녁")){
            System.out.println("(1) 축제장소로 이동한다.");
            System.out.println("(2) 실패가 두려워서 가지않는다.");
        }
        String choice = sc.nextLine();
        if (Variables.today != 7) {
            switch (choice) {
                case "1":
                    walkEvent.Main.select();
                    break;
                case "2":
                    new River().event();
                    break;
                case "3":
                    Special.SpecialScene();
                    break;
            }
        } else {
            switch (choice) {
                case "1":
                festival.Play.storyPlay();
                case "2":
//                    집에있는다.
            }
        }


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
















}
