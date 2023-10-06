package walkEvent;

import util.Variables;

import static util.Util.*;

public class BalloonEvent {
    //산책을 나온 도중 꼬마아이의 풍선이 나뭇가지에 걸렸다!!
    public static void start(){
        System.out.println("# 풍선 이벤트 시작");
        makeLine();
        since1();
    }

    public static void since1() {
        timeString("# 터벅터벅");
        timeString("# 꼬마아이와 서아가 나무 옆에 서있다. ");
        timeString("# 앗! 자세히보니 풍선이 나뭇가지에 껴있는 것 같다. 어떡하지?");
        br();
        System.out.println("1. 나무에 올라가 풍선을 꺼내준다");
        System.out.println("2. 모른척 한다");

        w:while (true){
            String select = input("# 선택 : ");
            switch (select){
                case "1":
                    since1_1();
                    break w;
                case "2":
                    since1_2();
                    break w;
                default:
                    System.out.println("# 선택지에 있는 숫자를 입력해주세요");
            }
        }


    }
    public static void since1_1(){
        timeString("# 무서웠지만 무사히 나무에 올라가 풍선을 꺼내왔다");
        timeString("\uD83D\uDC69:너 꽤 담력있네? (호감+10)");
        Variables.love += 20;
        pressEnter();
        since2();
    }
    public static void since1_2(){
        timeString("# 지나가다 서아와 눈이 마주쳤지만 집으로 돌아갔다");
        timeString("\uD83D\uDC69:(좀 도와주지. .. . ) (호감도-10)");
        Variables.love -= 10;
        pressEnter();
        br();
    }

    public static void since2(){
        timeString("# 꼬마아이는 고맙다고 인사를 하며 풍선을 들고 돌아갔다.");
        timeString("# 덕분에 풍선을 계기로 나와 서아는 더 가까워졌다");
        timeString("서아: 어릴때부터 나무에 잘 올라가더니 여전하구나 ");
        timeString("쥔공: 맞아 그랬었지.. 서아 너는 ... ");
        br();
        pressEnter();
        timeString(" 서아는 뭐를 좋아했더라? ");
        System.out.println("1. 모래성 놀이 ");
        System.out.println("2. 잠자리채집 ");
        System.out.println("3. 공주와 기사놀이 ");

        w: while (true){
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
        timeString("쥔공: 모래성 만드는 거 좋아했잖아");
        timeString("쥔공: 모래성 자꾸 쓰러져서 너 울고 그랬던거 기억나네~");
        timeString("서아: ㅇ..안 울었거든! (호감도+0)");
        pressEnter();
    }

    private static void since2_2() {
        timeString("쥔공: 잠자리 채집 하는거 좋아했잖아~");
        timeString("서아: 무슨 소리야 나 잠자리 무서워하는데 (호감도-5)");
        Variables.love -= 5;
        pressEnter();
    }

    private static void since2_3() {
        timeString("쥔공: 공주와 기사놀이 하는거 좋아했잖아~");
        timeString("쥔공: 서아공주..! 구하러 왔소");
        timeString("서아: 아하하 뭐하는거야~(호감도+5)");
        Variables.love += 5;
        pressEnter();
    }

    public static void since3() {

    }
}

