package festival;
import util.Variables;

import static util.Util.*;


public class Play {
public static String MC = "🧑";
public static String FMC = "\uD83D\uDC69";
    public static void storyPlay() {
        timeString("======= 축제장소 =======");
        timeString("# 축제장소에 도착한 당신은 주변을 둘러보았습니다.");
        timeString("(와, 이렇게 많은 사람들이 모여있다니 놀라운걸)");
        timeString("(장식도 화려하고 이쁜게, 서아가 보면 좋아하겠어)");
        timeString("(서아가 도착할때까지 잠시 앉아있을까...)");
        pressEnter();

        timeString("# 잠시후 서아가 약속장소에 도착했다.");
        timeString("이렇게 저렇게 신나게 놀았다.");

        System.out.println();
        System.out.println("잠시후 축제의 하이라이트인 불꽃놀이가 시작된다.");
        pressEnter();

        timeString(MC + ": 서아야 할 말이 있어.");
        timeString(FMC + ": 예아 무슨일임?");
        grabHerHand();

        if (Variables.love >= 0) {
            HappyEnding.happyEnd();
        }


    }

    private static void grabHerHand() {
        timeString("(서아의 손을 잡고 얘기할까...?)");
        System.out.println("========== 선택지 ==========");
        System.out.println("(1) 서아의 손을 덥썩 잡는다.");
        System.out.println("(2) 그냥 얘기한다.");

        String grab = sc.nextLine();
        switch (grab) {
            case "1":
                timeString("(서아의 두손을 덥썩 잡았다.)");
                timeString("(서아는 갑작스러운 나의 행동에 놀란듯 보였다.)");
                Variables.love += 10;
                pressEnter();
                break;
            case "2":
                timeString("(손을 잡고싶은 마음을 참고 그냥 얘기하기로 했다.)");
                pressEnter();
                break;
        }
    }

}
