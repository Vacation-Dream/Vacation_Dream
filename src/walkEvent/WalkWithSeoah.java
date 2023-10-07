package walkEvent;


import util.Variables;

import static util.Util.*;


public class WalkWithSeoah {
    static String me = Variables.name;
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
        timeString(me+": \"아냐아냐! 볼게 왜 없어~\" ");
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
                    System.out.println("# 선택지에 있는 숫자를 입력해 주세요");
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
        timeString(me+" : 이제 뗐어..");
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

    private static void since2() {
        timeString("# 산책중 서아의 집에 찾아갔다.");
        timeString(me+" : 계세요..~?");
        timeString("# 집에 문이 열리고 할머니 한 분이 나오셨다.");
        timeString("할머니 : 누구여? ");
        timeString(me+" : 저 옆집에 사는 서아 친구인데.. 서아 있나요?");
        timeString("할머니 : 잉? 뭐라고~?");
        timeString(me+" : 저 !! 서아 !! 친구 !! 인데 !! 서아 !! 있어요???!! ");
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
                    break w;
                case "2":
                    since2_2();
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
        timeString("서아 : 너 왜 자꾸 쳐다보는거야? ");
        timeString(me+" : 응? 이..이뻐서.. ");
        timeString("서아 : 뭐라는거야 이 변태가 (호감도 -5) ");
    }
    private static void since2_2() {
        timeString("# 얼굴이 화끈해져 시선을 돌렸다. ");
        timeString("서아 : 어 "+me+" 여긴 웬일이야? ");
        timeString(me+" : 별거는..아니고 너랑 놀고싶어서..  ");
        timeString("서아 : 그럼 집에 들어와서 조금만 기다려, 옷 갈아입고 올게 (호감도+5) ");
        pressEnter();
        timeString("# 쇼파에 앉아 서아가 나오길 기다렸다.");

    }

    private static void since2_3() {
        timeString(me+" : 어! 서아야! 안녕~");
        timeString("# 서아는 급하게 방으로 돌아가더니 옷을 바꿔입고 왔다. ");
        timeString("서아 : 여긴 어쩐일이야? ");
        timeString(me+" : 너랑 놀고싶어서 왔지~ 너무 갑작스러웠으면 미안 ");
        timeString("할머니 : 홀홀홀. 좋을때구먼.. 놀다 오그라~");
        timeString("서아 : 할머니 그런거 아니거든!! 아휴.. 가자 "+me+"아 (호감도+5)");

        timeString( "# 우리는 집 밖으로 나왔다. ");
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
                    break w;
                default:
                    System.out.println("# 선택지에 있는 숫자를 입력해주세요");
            }
        }

    }
    private static void since3() {
        timeString(me+"그냥.. 걷자~");
    }
    private static void since4() {
        timeString(me+"음.. 너희 집에서 놀래?");
    }

    private static void since5() {
        timeString(me+" : 어.. 서아야, 우리집.. 갈래?");

    }

    private static void since6() {
        timeString(me+" : 서아야 미안.. 갑자기 쉬고 싶어졌어. 내일봐");
        timeString("# 서아는 어이없다는 표정으로 돌아갔다. (호감도-5)");
    }




}
