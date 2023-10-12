package walkEvent;

import util.Variables;

import static util.Util.*;

public class DogEvent {
    static String me = Variables.name;
    public static void start(){
        makeLine();
        System.out.println("# 강아지 이벤트");
        makeLine();
        br();
        since1();
    }
    private static void since1(){
        talkMe("길을 걷다 저 멀리 강아지가 뛰어오는 것을 보았다.");
        talkMe("덩치가 꽤 있는 모습에 주춤 했지만 얌전히 내 앞에 앉아 꼬리를 흔들었다.");
        talkMe("(강아지의 머리를 쓰다듬어 주었다)");
        talkSeo("'안녕~ 그 강아지는.. 최근 너희 할머니께서 자주 챙겨주시던데 기르는거야?'");
        talkMe("'아니.. 모르겠어 나는 처음 보는데'");
        talkSeo("'처음 본거 치고는 널 잘 따르는데?'");
        talkMe("서아 말대로 강아지가 너무 순하다. 어디선가 본 기억이..");
        pressEnter();

        talkMe("기억났다.");
        talkMe("어릴적 기르던 개가 개장수에게 잡혀가 엉엉 울었던 적이 있었지.. ");
        talkMe("할머니께서 개장수에게 잡혀가면 절대 못 돌아온다고 했는데.. 어떻게..");
        talkMe("나는 이 깜이를 어떻게 대하지?");
        pressEnter();

        System.out.println("1. 깜이를 만났으니 기쁘다!");
        System.out.println("2. 언제적 강아지야ㅡㅡ 게다가 크니까 못 생겼네");

        w: while (true){
            String select = input("# 선택 : ");
            switch (select){
                case "1":
                    since2();
                    loveGage(5);
                    System.out.println("# 그 후 깜이와 집으로 돌아갔다");
                    pressEnter();
                    break w;
                case "2":
                    since1_2();
                    loveGage(-5);
                    System.out.println("# 그 후에 집으로 돌아갔다");
                    pressEnter();
                    break w;
                default:
                    System.out.println("# 선택지에 있는 숫자를 입력해주세요");
            }
        }


    }

    private static void since2() {
        talkMe("'서아야.. 예전에 우리집에 있던 강아지 기억나? 깜이'");
        talkSeo("'깜이는 개장수한테 잡혀갔다고 하지 않았어?'");
        talkMe("'그랬는데.. 이건 분명 깜이야! 여길봐봐 가슴에 하트 모양 흰 털!'");
        talkSeo("'정말이네?? 어떻게 살아있는거지?'");
        talkMe("'우리가 보고싶어서 탈출한게 아닐까..? 깜아 그런거지?!!'");
        timeString("멍!");

        timeString("# 서아와 나는 서로 기뻐하며 깜이를 귀여워 했다.");
    }

    private static void since1_2() {
        talkMe("'이게 정말 깜이라고? 너무 못생겼잖아!!'");
        talkSeo("'뭐? 너 너무 말이 너무 심한거 아니야?'");
        timeString("# 깜이의 꼬리가 축 처졌다");
    }
}
