import Market.Market;
import river.River;
import util.Variables;


import java.util.Scanner;

import static util.Util.*;

public class Play {
    static Scanner sc = new Scanner(System.in);
    public static void start() {
        firstStory();
        dayStart();
    }

    private static void firstStory() {
        System.out.println("여름방학을 맞이해 주인공은 할머니댁에 놀러가게 됩니다.\n" +
                "이곳은 평화로운 시골 동네로, 주인공은 조용한 여름 휴가를 즐기려고 기대합니다.\n" +
                "하지만 할머니댁 옆집에 사는 서아라는 손녀를 만나게 됩니다.\n" +
                "서아는 동네에서 유명한 미녀로,\n " +
                "그녀의 아름다움과 매력에 주인공은 반한 것 같습니다.\n");
        pressEnter();
        System.out.println("==================");
        System.out.println("# 방학목표: 서아와 가까워지기");
        System.out.print("# 당신의 이름을 정해주세요: ");
        Variables.name = sc.nextLine();
    }


    private static void dayStart() {
        System.out.printf("\n  ☀\uFE0F %d일차 아침입니다. ☀\uFE0F \n", Variables.today);
        System.out.println("서아의 호감도: ♡♡♡♡♡");
        System.out.println("========== 오늘의 선택지 ==========");
        System.out.println("(1) 공터로 이동한다.");
        System.out.println("(2) 냇가로 이동한다.");
        System.out.println("(3) 시장으로 이동한다.");
        String choice = sc.nextLine();
        switch (choice){
            case "1":
                walkEvent.Main.select();
            case "2":
                new River().event();
            case "3":
                Market.vegetable();
        }

        Variables.today += 1;
    }
















}
