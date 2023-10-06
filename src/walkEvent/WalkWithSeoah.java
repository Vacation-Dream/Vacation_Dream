package walkEvent;


import util.Variables;

import static util.Util.*;


public class WalkWithSeoah {
    public static void start(){
        System.out.println("# 서아와의 산책 이벤트 시작");
        makeLine();
        since1();
    }

    private static void since1(){
        timeString("# 길을 걷다 저 멀리 서아를 만난다");
        // 호감도가 0이상일때
        timeString("# 눈이 마주치자 서로 인사를 했다. ");
        timeString("서아 : \"우리 동네 되게 볼거 없지? 맨날 산에 밭에 논에...\" ");
        timeString("쥔공: \"아냐아냐! 볼게 왜 없어~\" ");
        timeString("너만봐도 재밌는데..");
        timeString("서아 : \" 왜 그렇게 쳐다봐? 나 얼굴에 뭐 묻었어?\" ");
        br();
        timeString("# 앗! 기회다!!");
        pressEnter();
        System.out.println("1. 어 여기.. [이쁨]이 묻어있네~ ");
        System.out.println("2. 머리카락에 나뭇잎 붙었어 ");
        System.out.println("3. 응 [못생김]이 묻어있네.");
        w : while (true){
            String select = input("# 선택 : ");

            switch (select){
                case "1":
                    since1_1();
                    break w;
                case "2":
                    since1_2();
                    break w;
                case "3":
                    since1_3();
                    break w;
                default:
                    System.out.println("# 선택지에 있는 숫자를 입력해주세요");
            }
        }
    }

    private static void since1_1() {
        timeString("# 서아의 볼을 쿡 찔렀다. 그녀는 천사같은 웃음을 지어주었다.");
        timeString("서아 : 뭐하는거야~ (호감도+5)");
        timeString("# 산책 내내 재밌는 얘기를 하며 집으로 돌아갔다.");
        pressEnter();
        Variables.love = 5;
    }
    private static void since1_2() {
        timeString("# 서아의 머리카락을 손으로 쓸어내렸다");
        timeString("어? 이거 좀 가까운 거 같은데.. ");
        timeString("# 서아는 아무말이 없었지만 볼이 살짝 빨개진 것 같았다(호감도+10)");
        timeString("쥔공 : 이제 뗐어..");
        timeString("서아 : 그..그래? 언제 나뭇잎이 붙었었지~?");
        timeString("# 산책 내내 심장이 두근거려 일찍 집으로 돌아갔다.");
        pressEnter();
        Variables.love +=10;
    }
    private static void since1_3() {
        timeString("서아 : 뭐..뭐라고? 어이가 없어서 정말! (호감도-5)");
        timeString("# 서아는 화를 내며 집으로 돌아갔다. ");
        pressEnter();
        Variables.love -= 5;
    }

    private static void since2(){
        timeString("#서아의 집에 찾아갔다.");
    }

}
