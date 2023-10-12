package festival;
import util.Variables;

import static util.Util.*;
import static util.Util.talkSeo;


public class Play {
    static String choice;
    public static void storyPlay() {
        timeString("======= 축제장소 =======");
        timeString("# 축제장소에 도착한 당신은 주변을 둘러보았습니다.");
        timeString("와, 이렇게 많은 사람들이 모여있다니 놀라운걸");
        timeString("장식도 화려하고 이쁜게, 서아가 보면 좋아하겠어");
        timeString("서아가 도착할때까지 잠시 앉아있을까...");
        pressEnter();

        timeString("# 잠시후 서아가 약속장소에 도착했다.");
        talkSeo("미안해 많이 기다렸지");
        talkMe("아니 나도 방금 왔어");
        timeString("# 그때 서아의 휴대폰이 울린다.");
        timeString("# \uD83D\uDCF1: \uD83C\uDFB6~~ \uD83C\uDFB6~");
        pressEnter();

        talkSeo("어? 준석이 전화잖아?");
        timeString("# 당신은 서아가 전화를 받게 두면");
        timeString("# 무언가 돌이킬 수 없을것 같은 느낌이 듭니다.");
        timeString("어떡하지? 전화를 받게 둬야할까...?");

        System.out.println("(1) 전화를 받게 둔다.");
        System.out.println("(2) 전화를 받지 못하게 한다.");
        System.out.println(">> ");
        choice = sc.nextLine();

        switch (choice) {
            case "1":
                JunsukEnding.junsukEnd();
            case "2":
                System.out.println();
        }

        talkMe("서아야 잠시만");
        talkSeo("응?");
        talkMe("전화.. 받지 말아줘");
        talkMe("부탁이야");
        talkSeo("...");
        pressEnter();

        if (Variables.love < 50) {
            talkSeo("그게 무슨 말이야, 준석이 전화니까 잠깐만..");
            JunsukEnding.junsukEnd();
        }
        timeString("# 서아는 휴대폰을 다시 주머니에 넣었다.");
        talkSeo("그래 알았어. 그렇게 까지 말하는데 이유가 있겠지?");
        talkMe("!! 정말 고마워 서아야..");

        timeString("서아는 날 위해 준석이의 전화를 받지 않았어.");
        timeString("이건 혹시... ");
        pressEnter();

        timeString("서아와 나는 축제를 돌아다니며 이것저것 해보았다.");
        timeString("그리고 결전의 때는 코앞으로 다가왔다...");

        System.out.println();
        System.out.println("# 둘은 축제의 하이라이트인 불꽃놀이를 보기위해");
        System.out.println("# 높은 언덕으로 올라왔다.");
        pressEnter();

        talkMe("...서아야 할 말이 있어.");
        talkSeo("응?");
        grabHerHand();


        HappyEnding.happyEnd();



    }

    private static void grabHerHand() {
        timeString("서아의 손을 잡고 얘기할까...?");
        System.out.println("========== 선택지 ==========");
        System.out.println("(1) 서아의 손을 덥썩 잡는다.");
        System.out.println("(2) 그냥 얘기한다.");
        System.out.println(">> ");
        String grab = sc.nextLine();
        switch (grab) {
            case "1":
                timeString("(서아의 두손을 덥썩 잡았다.)");
                timeString("서아는 갑작스러운 나의 행동에 놀란듯 보였다.");
                timeString("# 호감도가 조금 증가했습니다.");
                loveGage(5);
                pressEnter();
                break;
            case "2":
                timeString("손을 잡고싶은 마음을 참고 그냥 얘기하기로 했다.");
                pressEnter();
                break;
        }
    }




}
