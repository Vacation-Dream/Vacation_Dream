package walkEvent;

import util.Variables;

import static util.Util.*;

public class DogEvent {
    static String me = Variables.name;
    public static void start(){
        System.out.println("# 강아지 이벤트");
        makeLine();
        br();
        since1();
    }
    private static void since1(){
        timeString("# 길을 걷다 저 멀리 강아지가 뛰어오는 것을 보았다.");
        timeString("# 덩치가 꽤 있는 모습에 주춤 했지만 얌전히 내 앞에 앉아 꼬리를 흔들었다.");
        timeString("# 강아지의 머리를 쓰다듬어 주었다.");
        timeString("서아 : \"안녕~ 그 강아지는.. 너희 할머니께서 자주 챙겨주시던데 기르는거야?\" ");
        timeString(me+" : \"아니.. 모르겠어 나는 처음 보는데\" ");
        timeString("서아 : \"처음 본거 치고는 널 잘 따르는데? \" ");
        timeString("# 서아 말대로 강아지가 너무 순하다. 어디선가 본 기억이..");
        pressEnter();

        timeString("기억났다.");
        timeString("어릴적 기르던 개가 개장수에게 잡혀가 엉엉 울었던 적이 있었지.. ");
        timeString("할머니께서 개장수에게 잡혀가면 절대 못 돌아온다고 했는데.. 어떻게..");
        pressEnter();

        timeString(me+" : 서아야.. 예전에 우리집에 있던 강아지 기억나? 깜이 ");
        timeString("서아 : 그 쪼꼬미? 그게 이렇게 컸단말이야?? 게다가 잡혀갔다고.. ");
        timeString("# 서아와 나는 서로 기뻐하며 깜이를 귀여워 했다.");
        pressEnter();
    }
}
