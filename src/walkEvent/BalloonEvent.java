package walkEvent;

import util.Variables;

import static util.Util.*;

public class BalloonEvent {
    static String me = Variables.name;
    //산책을 나온 도중 꼬마아이의 풍선이 나뭇가지에 걸렸다!!
    public static void start(){
        System.out.println("# 풍선 이벤트");
        makeLine();
        since1();
    }

    public static void since1() {
        timeString("# 집을 나서 걷기 시작했다.");
        timeString("# 저 멀리 꼬마아이와 서아가 보인다.");
        timeString("# 앗! 자세히보니 풍선이 나뭇가지에 껴있는 것 같다.");
        pressEnter();
        talkMe("어떡할까?");
        System.out.println("1. 나무에 올라가 풍선을 꺼내준다");
        System.out.println("2. 모른척 한다");

        w:while (true){
            String select = input("# 선택 : ");
            switch (select){
                case "1":
                    since1_1();
                    loveGage(20);
                    break w;
                case "2":
                    since1_2();
                    loveGage(-10);
                    break w;
                default:
                    System.out.println("# 선택지에 있는 숫자를 입력해주세요");
            }
        }


    }
    public static void since1_1(){
        talkMe("# 무서웠지만 무사히 나무에 올라가 풍선을 꺼내왔다");
        talkSeo("'너 꽤 담력있네?'");
        pressEnter();
        since2();
    }
    public static void since1_2(){
        talkMe("지나가다 서아와 눈이 마주쳤지만 집으로 돌아갔다");
        talkSeo("좀 도와주지...");
        pressEnter();
    }

    public static void since2(){
        talkMe("꼬마아이는 고맙다고 인사를 하며 풍선을 들고 돌아갔다.");
        talkMe("덕분에 풍선을 계기로 나와 서아는 더 가까워졌다");
        talkSeo("'어릴때부터 나무에 잘 올라가더니 여전하구나'");
        talkMe("' : 맞아 그랬었지.. 서아 너는 ...'");

        pressEnter();
        talkMe("서아는 뭐를 좋아했더라? ");
        System.out.println("1. 모래성 놀이 ");
        System.out.println("2. 잠자리채집 ");
        System.out.println("3. 공주와 기사놀이 ");

        w: while (true){
            String select = input("# 선택 : ");
            switch (select){
                case "1":
                    since2_1();
                    System.out.println("# 그 후에 집으로 돌아갔다");
                    pressEnter();
                    break w;
                case "2":
                    since2_2();
                    loveGage(-5);
                    System.out.println("# 그 후에 집으로 돌아갔다");
                    pressEnter();
                    break w;
                case "3":
                    since2_3();
                    loveGage(5);
                    System.out.println("# 그 후에 집으로 돌아갔다");
                    pressEnter();
                    break w;
                default:
                    System.out.println("# 선택지에 있는 숫자를 입력해주세요");
            }
        }

    }
    private static void since2_1() {
        talkMe("'모래성 만드는 거 좋아했잖아'");
        talkMe("'모래성 자꾸 쓰러져서 너 울고 그랬던거 기억나네~'");
        talkSeo("'서아 : ㅇ..안 울었거든!'");
    }

    private static void since2_2() {
        talkMe("'잠자리 채집 하는거 좋아했잖아~'");
        talkSeo("'무슨 소리야 나 잠자리 무서워하는데'");
    }

    private static void since2_3() {
        talkMe("'공주와 기사놀이 하는거 좋아했잖아~'");
        talkMe("'서아 공주..! 구하러 왔소'");
        talkSeo("'낯간지럽게.. 그만해//'");
    }

    public static void since3() {

    }
}

