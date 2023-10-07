package walkEvent;


import util.Variables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static util.Util.*;


public class WalkWithSeoah {
    // generic = 0 , s1 = 1 , s2 = 2
    static List<Integer> events = new ArrayList<>(
            List.of(0,0,0,0,0,0,1,1,2,2)
    );
    public static void start(){
        System.out.println("# 서아와의 산책 이벤트 ");

        List<Integer> copy = new ArrayList<>(events);
        Collections.shuffle(copy);
        //시작할 이벤트 선택
        int startEvent = copy.get(0);

        switch (startEvent) {
            case 0:
                genericTalk();
                pressEnter();
                break;
            case 1:
                if (Variables.love > 50)
                    since1();
                else
                    genericTalk();
                break;
            case 2:
                if (Variables.love > 40)
                    since2();
                else
                    genericTalk();
                break;
        }


        makeLine();
        since1();
    }
    private static void genericTalk(){
        timeString("# 산책중에 서아를 만나 같이 걷기 시작했다 ");
        selectTalk();
    }
    private static void selectTalk(){
        timeString("# 무슨 이야기를 할까? ");

        System.out.println("1. 음식에 대한 이야기");
        System.out.println("2. 노래에 대한 이야기");
        System.out.println("3. 동물에 대한 이야기");
        System.out.println("4. 꽃에 대한 이야기");
        w : while (true){
            String select = input("# 선택 : ");

            switch (select){
                case "1":
                    selectTalk1();
                    break w;
                case "2":
                    selectTalk2();
                    break w;
                case "3":
                    selectTalk3();
                    break w;
                default:
                    System.out.println("# 선택지에 있는 숫자를 입력해 주세요");
            }
        }
    }

    private static void selectTalk1() {
        timeString("# 꼬마아이가 아이스크림을 들고 뛰어간다.");
        talkSeo("'아이스크림 시원하겠다..'");
        talkMe("'그러게.. 날이 너무 덥네'");
        talkSeo("'아이스크림하니까 생각났는데 너는 좋아하는 음식이 뭐야?'");
        talkMe("내가 좋아하는 음식..? ");
        
        pressEnter();
        System.out.println("1. 빙수");
        System.out.println("2. 떡볶이");
        System.out.println("3. 곱창");

        w : while (true){
            String select = input("# 선택 : ");

            switch (select){
                case "1":
                    selectTalk1_1();
                    endEvent();
                    break w;
                case "2":
                    selectTalk1_2();
                    loveGage(5);
                    endEvent();
                    break w;
                case "3":
                    selectTalk1_3();
                    loveGage(-5);
                    endEvent();
                    break w;
                default:
                    System.out.println("# 선택지에 있는 숫자를 입력해 주세요");
            }
        }

    }

    private static void selectTalk1_1() {
        talkSeo("'지금 날씨에 시원하겠네. 맛있겠다~'");
    }

    private static void selectTalk1_2() {
        talkSeo("'어! 나 그거 엄청 좋아하는데.'");
        talkMe("'정말? ㄴㄷ'");
    }

    private static void selectTalk1_3() {
        talkSeo("'아.. 그렇구나..'");
    }

    private static void selectTalk2() {

    }

    private static void selectTalk3() {

    }

    private static void since1(){
        timeString("# 길을 걷다 저 멀리 서아를 만난다");
        timeString("# 눈이 마주치자 서로 인사를 했다. ");
        talkSeo("'우리 동네 되게 볼거 없지? 맨날 산에 밭에 논에...'");
        talkMe("'아냐아냐! 볼게 왜 없어~'");
        talkMe("너만봐도 재밌는데..");
        talkSeo("' 왜 그렇게 쳐다봐? 나 얼굴에 뭐 묻었어?'");
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
                    loveGage(5);
                    break w;
                case "2":
                    since1_2();
                    loveGage(10);
                    break w;
                case "3":
                    since1_3();
                    loveGage(-5);
                    break w;
                default:
                    System.out.println("# 선택지에 있는 숫자를 입력해 주세요");
            }
        }
    }

    private static void since1_1() {
        timeString("# 서아의 볼을 쿡 찔렀다. 그녀는 천사같은 웃음을 지어주었다.");
        talkSeo("'뭐하는거야~'");
        timeString("# 산책 내내 재밌는 얘기를 하며 집으로 돌아갔다.");
        pressEnter();
    }
    private static void since1_2() {
        talkMe("(서아의 머리카락을 손으로 쓸어내렸다)");
        talkMe("어? 이거 좀 가까운 거 같은데.. ");
        talkMe("# 서아는 아무말이 없었지만 볼이 살짝 빨개진 것 같았다");
        talkMe("이제 뗐어..");
        talkSeo("그..그래? 언제 나뭇잎이 붙었었지~?");
        talkMe("산책 내내 심장이 두근거려 일찍 집으로 돌아갔다.");
        pressEnter();
    }
    private static void since1_3() {
        talkSeo("뭐..뭐라고? 어이가 없어서 정말!");
        timeString("# 서아는 화를 내며 집으로 돌아갔다. ");
        pressEnter();
    }

    private static void since2() {
        timeString("# 산책중 서아의 집에 찾아갔다.");
        talkMe("계세요..~?");
        timeString("# 집에 문이 열리고 할머니 한 분이 나오셨다.");
        timeString("할머니 : 누구여? ");
        talkMe("옆집에 사는 서아 친구인데.. 서아 있나요?");
        timeString("할머니 : 잉? 뭐라고~?");
        talkMe("저 !! 서아 !! 친구 !! 인데 !! 서아 !! 있어요???!! ");
        timeString("할머니 : 잉~ 조금 있어봐~ / 서아야~ 니 친구 왔다~ ");
        pressEnter();

        timeString("# 현관문 사이로 서아의 모습이 보였다. ");
        timeString("# 서아는 하얀 끈 나시에 짧은 바지를 입고있었다.");
        timeString("# 어떻게 행동하지?");
        pressEnter();

        System.out.println("1. 이런 기회 흔하지 않다. 서아를 계속 쳐다본다. ");
        System.out.println("2. 그래도 프라이버시가 있지.. 시선을 돌린다. ");
        System.out.println("3. 우리 사이에 뭘~ 인사를 한다. ");
        w : while (true){
            String select = input("# 선택 : ");

            switch (select){
                case "1":
                    since2_1();
                    loveGage(-5);
                    break w;
                case "2":
                    since2_2();
                    loveGage(5);
                    break w;
                case "3":
                    since2_3();
                    break w;
                default:
                    System.out.println("# 선택지에 있는 숫자를 입력해주세요");
            }
        }
    }
    private static void since2_1() {
        talkSeo("너 왜 자꾸 쳐다보는거야? ");
        talkMe("응? 이..이뻐서.. ");
        talkMe("ㅁ..뭐라는거야 돌아가!! ");
        timeString("# 서아는 방에 들어가 나오지 않았다 ");
        pressEnter();
    }
    private static void since2_2() {
        talkMe("(얼굴이 화끈해져 시선을 돌렸다.)");
        talkSeo("'어 "+Variables.name+" 여긴 웬일이야? ");
        talkMe("'별거는..아니고 너랑 놀고싶어서.. '");
        talkSeo("'그럼 집에 들어와서 조금만 기다려, 옷 갈아입고 올게'");
        pressEnter();
        talkMe("(쇼파에 앉아 서아가 나오길 기다렸다.)");

    }

    private static void since2_3() {
        talkMe("'어! 서아야! 안녕~'");
        timeString("# 서아는 급하게 방으로 돌아가더니 옷을 바꿔입고 왔다. ");
        talkSeo("'여긴 어쩐일이야?'");
        talkMe("'너랑 놀고싶어서 왔지~ 너무 갑작스러웠으면 미안'");
        timeString("할머니 : 홀홀홀. 좋을때구먼.. 놀다 오그라~");
        talkSeo("할머니 그런거 아니거든!! 아휴.. 가자 "+Variables.name+"아");
        loveGage(5);

        br();
        timeString( "서아 : 그럼 이제 우리 뭐하고 놀까?");
        pressEnter();

        timeString( "1. 마을 산책을 한다.");
        timeString( "2. 서아네 집에서 논다.");
        timeString( "3. 우리집으로 서아를 초대한다.");
        timeString( "4. 갑자기 쉬고 싶어졌다.");

        w : while (true){
            String select = input("# 선택 : ");

            switch (select){
                case "1":
                    since3();
                    break w;
                case "2":
                    since4();
                    break w;
                case "3":
                    since5();
                    break w;
                case "4":
                    since6();
                    loveGage(-5);
                    pressEnter();
                    break w;
                default:
                    System.out.println("# 선택지에 있는 숫자를 입력해주세요");
            }
        }

    }
    private static void since3() {
        talkMe("그냥.. 걷자~");
        talkSeo("그래 좋아");
        selectTalk();
    }
    private static void since4() {
        talkMe("음.. 너희 집에서 놀래?");
    }

    private static void since5() {
        talkMe(" : 어.. 서아야, 우리집.. 갈래?");

    }

    private static void since6() {
        talkMe(" : 서아야 미안.. 갑자기 쉬고 싶어졌어. 내일봐");
        timeString("# 서아는 어이없다는 표정으로 돌아갔다.");
    }


    private static void endEvent(){
        timeString("# 이후 집으로 돌아갔다.");
    }


}
