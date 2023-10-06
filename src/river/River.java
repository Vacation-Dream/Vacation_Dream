package river;
import util.Util.*;

import static util.Util.onetofive;
import static util.Util.timeString;

public class River {
    private int chance;
    private static int done;


    public void reroll(){
        chance= onetofive();

    }


    public void event(){
        reroll();

        switch (chance){
            case 1:
                kidEvent();
                break;
            case 2:
                timeString("주인공이 수영을 합니다");
                break;
            case 3:
                timeString("아무일도 없었다 그만 돌아가자");
                break;
            case 4:
                timeString("강가에서 서아를 만났다 ...\n안녕..");
                break;
            case 5:
                timeString("오늘은 낚시를 했다");
                break;
            default:
                System.out.println("디폴트");
                break;

        }
    }

    public void kidEvent(){
        timeString("냇가에서 어떤 꼬마가 허우적 거리고 있다");
    }


}
