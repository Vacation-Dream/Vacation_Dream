package festival;
import util.Variables;

import static util.Util.*;
import static util.Util.talkSeo;

public class JunsukEnding {

    public static void junsukEnd() {
        timeString("서아는 전화를 받았다.");
        timeString("급한 볼일이 생겼다며 잠시만 있어달라고,");
        timeString("미안하다며 어디론가 떠났다.");
        talkSeo("정말 미안해, 금방 돌아올테니까!");
        talkMe("...");

        System.out.println();
        timeString("나는 이 상황이 무엇을 뜻하는지 알고있다.");
        timeString("그럼에도 왜 나는 서아를 잡지 않은걸까..");
        timeString("지금이라도 따라가면 잡을 수 있을까?");
        timeString("모르겠다, 생각할수록 머리만 아파진다.");
        timeString("나는 잠시동안 멍한얼굴로 앉아있을 수 밖에 없었다.");
        pressEnter();

        timeString("나는 다시 돌아온다는 서아의 말이 떠올라");
        timeString("이제라도 서아를 잡기위해 서아가 갔던 방향으로");
        timeString("걸어나가기 시작했다.");
        pressEnter();

        timeString("5분쯤 지났을까, 주위에서 대화소리가 났다.");
        timeString("이런곳에 누가 있는건지 궁금해져서");
        timeString("소리가 나는 방향으로 움직였다.");
        pressEnter();

        timeString("이윽고 나는 그 자리에서 멈춰설 수 밖에 없었다.");
        timeString("서아가 준석이와 입맞춤을 하고 있었다.");
        timeString("이런 외진 숲에서...........");
        System.out.println();
        timeString("나는 그 이후의 일이 기억나지 않는다.");
        timeString("정신을 차렸을땐 다리에 쥐가 날 정도로 달려서");
        timeString("집에 도착했을 때였다.");
        pressEnter();

        timeString("나는 곧바로 모두에게 작별인사도 하지않고,");
        timeString("짐을 모두 챙겨서 도시로 돌아왔다.");
        timeString("서아도 돌아온다는 말을 잊었는지, 연락이 오지 않았다.");
        timeString("그렇게.. 나는 모두에게 잊혀져갔다.");
        pressEnter();

        timeString("# 몇년 뒤 " + Variables.name + "의 집 우편함에는");
        timeString("# 한 부부의 청첩장이 배송되었으나,");
        timeString("# 어째서인지 " + Variables.name + "의 집은");
        timeString("# 마치 사람이 살지 않는 듯한 모습이었다.");
        System.out.println();
        timeString("========== Junsuk Ending ==========");
        pressEnter();
        System.exit(0);

    }
}
