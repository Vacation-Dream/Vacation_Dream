package walkEvent;


import util.Variables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static util.Util.*;


public class WalkWithSeoah {

    public static boolean isHome = true;
    static List<Integer> scences = new ArrayList<>(
            List.of(0,0,0,1,2)
    );
    static List<Integer> talks = new ArrayList<>(
            List.of(0,1)
    );
    public static void start(){
        makeLine();
        System.out.println("# 서아와의 산책 이벤트 ");
        makeLine();
        br();

        if (scences.size()>1)
            Collections.shuffle(scences);
        //시작할 이벤트 선택
        int startEvent = scences.get(0);

        switch (startEvent) {
            case 0:
                genericTalk();
                pressEnter();
                break;
            case 1:
                if (Variables.love > 50) {
                    since1();
                    deleteEvent();
                } else
                    genericTalk();
                break;
            case 2:
                if (Variables.love > 40) {
                    since2();
                    deleteEvent();
                } else
                    genericTalk();
                break;
        }
    }
    private static void genericTalk(){
        timeString("# 산책중에 서아를 만나 같이 걷기 시작했다 ");
        selectTalk();
    }
    private static void selectTalk(){
        timeString("# 무엇을 할까? ");

        System.out.println("1. 산책 하며 대화한다");
        if (isHome)
            System.out.println("2. 내 집으로 초대한다");

        w : while (true){
            String select = input("# 선택 : ");

            switch (select){
                case "1":
                    if (talks.size()>1)
                        Collections.shuffle(talks);
                    //시작할 이벤트 선택
                    int startEvent = talks.get(0);
                    switch (startEvent){
                        case 0:
                            selectTalk1();
                            deleteEvent();
                            break;
                        case 1:
                            selectTalk2();
                            deleteEvent();
                            break;
                    }
                    break w;
                case "2":
                    goHome();
                    break w;
                default:
                    System.out.println("# 선택지에 있는 숫자를 입력해 주세요");
            }
        }
    }

    private static void goHome() {
        talkMe("'서아야! 우리 집에 가서 놀래?'");
        if (Variables.love < 30){
            talkSeo("'어.. 너희 집에? 그냥 산책 하고 싶은데.. '");
            talkMe("'아잉~ 가자 서아야~ '");
            talkSeo("'왜이래 정말!'");
            timeString("# 서아는 저멀리 혼자 가버렸다");
            loveGage(-5);
            isHome = false;
        } else if (Variables.love < 50){
            talkSeo("'할 것도 없는데 그럴까?'");
            talkMe("'응! 아 방 더러워서 좀 치워야 하니까 밖에 잠깐 있어'");
            talkSeo("'어? 이거 우리집에도 있는건데.. 이거 뭐지?'");
            talkMe("이건.. 내가 예전에 서아와 주운 도토리인데.. 잊어버렸나보다");

            System.out.println("1. 그거 우리 예전에 같이 주웠었잖아 기억 안나?");
            System.out.println("2. 그것도 잊어버렸어? 실망이다..");
            w : while (true){
                String select = input("# 선택 : ");

                switch (select){
                    case "1":
                        talkMe("옛날에 같이 주운건데.. 기억 안나?");
                        talkSeo("'아 그랬었지, 잊고있었네 미안 ㅠㅠ '");
                        loveGage(5);
                        endEvent();
                        break w;
                    case "2":
                        talkMe("'같이 주웠던건데.. 실망이네 서아..'");
                        talkSeo("'기억 못 할수도 있지!!'");
                        timeString("# 서아는 씩씩 거리며 집을 나갔다.");
                        loveGage(-5);
                        endEvent();
                        break w;
                    default:
                        System.out.println("# 선택지에 있는 숫자를 입력해 주세요");
                }
            }
            isHome = false;



        } else{
            talkSeo("'부모님 안 계셔..?'");
            talkMe("'응.. 할머니 할아버지는 회관에 가셨고, 부모님은 일 가셨어'");
            talkSeo("'알겠어 그럼 너네집..가자'");
            pressEnter();
            timeString("# 서로 이상한 기류가 흐르며 집 안으로 들어갔다.");
            talkMe("'저기 서아야..' (옆에 있던 서아의 손이 닿았다)");
            talkSeo("'어어? 왜..? '");
            talkMe("서아의 볼이 빨갛다 어떻게 할까?");
            System.out.println("1. 바로 돌직구 뽀뽀를 한다.");
            System.out.println("2. 뽀뽀해도 되냐고 물어본다.");

            w : while (true){
                String select = input("# 선택 : ");

                switch (select){
                    case "1":
                        talkMe("(서아에게 바로 뽀뽀를 했다)");
                        talkSeo("'지금 뭐하는거야..!!' (뺨을 친다)");
                        timeString("# 서아는 도망가듯 집을 나갔다");
                        loveGage(-5);
                        endEvent();
                        break w;
                    case "2":
                        talkMe("혹시.. 뽀뽀..해도 돼?");
                        talkSeo("(고개를 끄덕이고 눈을 감는다)");
                        timeString("# 뽀뽀를 하고 어색해져 한동안 아무말도 안한다.");
                        talkSeo("'나.. 먼저 가볼게'");
                        timeString("# 서아는 재빨리 집을 나갔다.");
                        loveGage(5);
                        endEvent();
                        break w;
                    default:
                        System.out.println("# 선택지에 있는 숫자를 입력해 주세요");
                }
            }
            isHome = false;


        }

    }

    private static void selectTalk1() {
        timeString("# 꼬마아이가 아이스크림을 들고 뛰어간다.");
        talkSeo("'아이스크림 시원하겠다..'");
        talkMe("'그러게.. 날이 너무 덥네'");
        talkSeo("'너는 무슨 아이스크림이 제일 좋아?'");
        talkMe("내가 좋아하는 아이스크림..? ");
        
        pressEnter();
        System.out.println("1. 비비빙");
        System.out.println("2. 세계콘");
        System.out.println("3. 꿀꿀바");

        w : while (true){
            String select = input("# 선택 : ");

            switch (select){
                case "1":
                    selectTalk1_1();
                    loveGage(-5);
                    endEvent();
                    break w;
                case "2":
                    selectTalk1_2();
                    loveGage(5);
                    endEvent();
                    break w;
                case "3":
                    selectTalk1_3();
                    loveGage(0);
                    endEvent();
                    break w;
                default:
                    System.out.println("# 선택지에 있는 숫자를 입력해 주세요");
            }
        }

    }

    private static void selectTalk1_1() {
        talkSeo("'아.. 그렇구나.. 그거 우리 할머니가 제일 좋아하는거긴 한데..'(목소리가 점점 작아진다)");
        talkMe("'응? 뭐라고?'");
        talkSeo("'아.. 아무것도 아니야~'");
    }

    private static void selectTalk1_2() {
        talkSeo("'어! 나 그거 엄청 좋아하는데.'");
        talkMe("'진짜?! 콘부분이 진짜 맛있지?'");
        talkSeo("'맞아~ 콘이랑 아이스크림 조합이 짱이지~'");
        timeString("# 신나게 대화하며 걸었다.");
    }

    private static void selectTalk1_3() {
        talkSeo("'아, 그렇구나~'");
        talkMe("'서아 너는 뭐 좋아하는데?'");
        talkSeo("'나는 콘이 좋아.'");
        talkMe("'아..! 그럼 나중에 콘 사줄게!'");
        talkSeo("'정말? 고마워~ '");

        timeString("# 약속없는 기약에 호감도가 오르지 않았다");

    }

    private static void selectTalk2() {
        talkMe("'어 여기 꽃이 이렇게 많았나?'");
        talkSeo("'몇년 전에 누가 많이 심어 놨더라고, 이쁘지?'");
        talkMe("'그러게 이쁘다~'");
        talkSeo(Variables.name+"은(/는) 무슨 꽃이 제일 좋아?");
        talkMe("내가 좋아하는 꽃..?");
        pressEnter();

        System.out.println("1. 꽃? 그런건 기지배들이나 좋아하는거지");
        System.out.println("2. 향이 매우 좋은 라일락");
        System.out.println("3. 뾰족한 가시가 일품인 장미");

        w : while (true){
            String select = input("# 선택 : ");

            switch (select){
                case "1":
                    selectTalk2_1();
                    loveGage(-5);
                    endEvent();
                    break w;
                case "2":
                    selectTalk2_2();
                    loveGage(5);
                    endEvent();
                    break w;
                case "3":
                    selectTalk2_3();
                    endEvent();
                    break w;
                default:
                    System.out.println("# 선택지에 있는 숫자를 입력해 주세요");
            }
        }
    }

    private static void selectTalk2_1() {
        talkMe("'난 꽃 안 좋아해, 그런건 기지배들이나 좋아하는거지'");
        talkSeo("'뭐? 어떻게 그런 심한말을 할 수 있어? 됐어 나 갈래'");
    }

    private static void selectTalk2_2() {
        talkMe("'난 라일락이 제일 좋더라, 향이 좋잖아'");
        talkSeo("'정말? 나도 엄청 좋아하는데! 우리 꽤 잘 맞네~'");
    }

    private static void selectTalk2_3() {
        talkMe("'장미가 빨갛고 이쁘던데..'");
        talkSeo("'장미 이쁘긴 한데, 가시 있어서 난 별로 안 좋아해~'");
        talkMe("'요새 가시 없는 장미도 있어!'");
        talkSeo("'아 그렇구나~'");

        timeString("# 서아의 호감도를 쌓지 못했다.");
    }

    //호감도 40일때 나오는 스토리
    private static void since2() {
        timeString("# 산책중 서아의 집에 찾아 갔다.");
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
                    loveGage(0);
                    break w;
                case "3":
                    since2_3();
                    loveGage(5);
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
        talkMe("(얼굴이 화끈 해져 시선을 돌렸다.)");
        talkSeo("'어 "+Variables.name+" 여긴 웬일이야? ");
        talkMe("'별거는..아니고 너랑 놀고 싶어서.. '");
        talkSeo("'그럼 집에 들어와서 조금만 기다려, 옷 갈아입고 올게'");
        pressEnter();
        talkMe("(쇼파에 앉아 서아가 나오길 기다렸다.)");
        talkMe("거실에 있던 빨랫대에 서아의 속옷으로 추정되는 것이 걸려있었다.");
        talkMe("나는 얼굴이 빨개지다 못해 터질거같아 서아의 집에서 도망갔다.");

        timeString("# 서아의 호감도를 쌓지 못했다.");
    }

    private static void since2_3() {
        talkMe("'어! 서아야! 안녕~'");
        timeString("# 서아는 급하게 방으로 돌아가더니 옷을 바꿔입고 왔다. ");
        talkSeo("'여긴 어쩐일이야?'");
        talkMe("'너랑 놀고싶어서 왔지~ 너무 갑작스러웠으면 미안'");
        timeString("할머니 : 홀홀홀. 좋을때구먼.. 놀다 오그라~");
        talkSeo("할머니 그런거 아니거든!! 아휴.. 가자 "+Variables.name+"아");

        timeString("# 이후 서로의 얼굴이 빨개진 채로 산책하다 집으로 돌아갔다.");

    }

    // 호감도 50일때 나오는 스토리
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
        if (!isHome){
            talkMe("'이뻐서 ^^, 다음에 우리집 놀러 올래?'");
            talkSeo("'응? 그래 알았어~'");
            isHome = true;
        }
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
        if (!isHome){
            talkMe("아. 집에 들어가기 전, 서아에게 '나중에 우리집에 놀러 와'라고 했다.");
            isHome = true;
        }

        pressEnter();
    }
    private static void since1_3() {
        talkSeo("뭐..뭐라고? 어이가 없어서 정말!");
        timeString("# 서아는 화를 내며 집으로 돌아갔다. ");
        pressEnter();
    }


    private static void endEvent(){
        timeString("# 이후 집으로 돌아갔다.");
        pressEnter();
    }
    private static void deleteEvent(){
        scences.remove(0);

    }

}
