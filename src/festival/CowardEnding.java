package festival;
import util.Variables;

import static festival.Play.MC;
import static festival.Play.FMC;
import static util.Util.pressEnter;
import static util.Util.timeString;
public class CowardEnding {

    public static void cowardEnd() {
        System.out.println();
        timeString("나는 고백이 실패할게 두려워서 약속장소로 가지 않았다.");
        if (Variables.love >= 40) {
            timeString("문자와 부재중전화가 쌓이지만, 나는 휴대폰을 확인할 수 없었고");
        } else {
            timeString("잠시 휴대폰을 지켜봤으나, 아무런 연락이 오지 않았고");
        }
        timeString("짐을 챙겨 도망치듯 도시로 돌아왔다.");
        timeString("나는 앞으로 무엇을 할 수 있을까... 뭐든 도망쳐버리고 말텐데..");
        pressEnter();
        System.out.println();
        timeString("# 몇년 뒤 주인공의 소식은 누구도 들을 수 없었다.");
        timeString("========== Coward Ending ==========");
        System.exit(0);
    }
}
