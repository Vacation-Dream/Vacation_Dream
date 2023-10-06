package walkEvent;

import static util.Util.*;

public class BalloonEvent {
    //산책을 나온 도중 꼬마아이의 풍선이 나뭇가지에 걸렸다!!
    public static void start(){
        System.out.println("# 풍선 이벤트 시작");
        makeLine();
        since1();
    }
    public static void selectSelf(int since, String select){
        switch (since){
            case 1:
                if (select.equals("1"))
                    since1_2();
                else since1_3();
                break;
            case 2:
        }

    }
    public static void since1() {
        System.out.println("# 터벅터벅");
        System.out.println("# 앗! 꼬마아이와 서아가 나무 옆에 서있다!");
        System.out.println("# 자세히보니 풍선이 나뭇가지에 껴있는 것 같다. 어떡하지?");
        br();
        System.out.println("1. 나무에 올라가 풍선을 꺼내준다");
        System.out.println("2. 모른척 한다");

        String select = input("# 선택 : ");
        makeLine();
        selectSelf(1,select);
    }
    public static void since1_2(){
        System.out.println("# 무서웠지만 무사히 나무에 올라가 풍선을 꺼내왔다");
        System.out.println("\uD83D\uDC69:너 꽤 담력있네? (호감도+10)");
        //if 호감도 0일때
        since2();
    }
    public static void since1_3(){
        System.out.println("# 지나가다 서아와 눈이 마주쳤지만 집으로 돌아갔다");
        System.out.println("\uD83D\uDC69:(좀 도와주지. .. . ) (호감도-10)");
        br();
    }

    public static void since2(){
        System.out.println("# 풍선을 계기로 나와 서아는 더 가까워졌다");
        System.out.println("\uD83D\uDC69:너 이름이 뭐야?");
        System.out.println("쥔공: 내 이름은 ##이야 너는 서아지? ");
        System.out.println("서아 : 내 이름은 어떻게 알아?");
        br();
        System.out.println("# 어? 이상하다? 서아의 눈빛이 싸늘하다.. 만회를 해야해!");
        makeLine();

        System.out.println("1. 너 이 동네 최고미인이잖아~ 모르는사람이 없을걸?");
        System.out.println("2. 우리 어릴때 같이 놀았었잖아~ 기억 안나?");
        System.out.println("3. 그..그게 너가 너무 좋아서 스토킹했어.. 네 방이 화장실 옆에 있다는 것도 알아..");
    }
}

