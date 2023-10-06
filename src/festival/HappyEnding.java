package festival;

import static festival.Play.MC;
import static festival.Play.FMC;
import static util.Util.pressEnter;
import static util.Util.timeString;

public class HappyEnding {

    public static void happyEnd() {
        timeString(MC + ": 너와 함께보낸 일주일간의 순간과");
        timeString(MC + ": 지금 이 축제를 함께보낸 시간이 너무나 특별하고 소중해");
        timeString(MC + ": 비록 짧은시간이였지만, 넌 나의 인생을 밝게 비춰줬어");
        pressEnter();

        timeString("# 서아는 의미심장한 미소로 듣고있습니다.");
        System.out.println();

        timeString("(주머니에서 작은 반지상자를 꺼낸다)");
        timeString(MC + ": 이 반지를 너에게 주고 싶어.");
        timeString(MC + ": 너와 함께 보낸 이번 여름처럼, 평생 함께하고 싶어.");
        pressEnter();

        timeString(FMC + ": ㅇㅋ 콜");
        System.out.println();

        timeString("(나는 서아와 사귀게되었고, 곧 여름방학이 끝났다.)");
        timeString("(나는 서아를 위해 도시로 돌아가지 않았고)");
        timeString("(이곳 OO마을에서 자리를 잡기로 했다.)");
        timeString("# HAPPY ENDING..");
        System.exit(0);
    }
}
