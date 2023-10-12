package Market;

import river.River;
import util.Variables;


import static util.Util.*;
import static util.Variables.love;

public class Market {
    // 상인들과 대화(채소가게 아저씨)
    public static void vegetable(){
        System.out.println("# 나는 기분 전환할 겸 시장으로 걸어갔다. ");
        System.out.println("# 시장을 걷던 중 채소가게 아저씨가 말을 걸어왔다.");
        System.out.println("# 채소가게 아저씨 : '학생 채소좀 보고가 사면 좋은걸 알려줄지도 흐흐' ");
        System.out.println("# 채소를 사시겠습니까?");
        System.out.println("# 1. 산다");
        System.out.println("# 2. 안산다");
        System.out.print("# >>");
        String choice = sc.nextLine();
        switch (choice){
            case "1":
                vegetable1();
                Variables.hateList.add("오이");
                break;
            case "2":
                vegetable2();
                break;
        }
        pressEnter();
    }
    public static void vegetable1(){
        System.out.println("# 나 : '살게요..!'");
        System.out.println("# 채소가게 아저씨 : '허허 고마워 학생'");
        System.out.println("# 채소가게 아저씨 : '서아는 오이를 싫어 한다더라 맛있는데,,,'");
        System.out.println("# 서아가 싫어하는 채소는 오이 라는 정보를 얻었습니다.");
        System.out.println("# 이제 집으로 돌아가자");
    }
    public static void vegetable2(){
        System.out.println("# 나 : '안살레요.'");
        System.out.println("# 채소가게 아저씨 : '그래..? 아쉽구만...'");
        System.out.println("# 시장을 둘러보다 집으로 갔습니다.");
    }

    // 상인들과 대화(꽃가게 사장님)
    public void flower(){
        System.out.println("# 나는 기분 전환할 겸 시장으로 걸어갔다. ");
        System.out.println("# 시장을 걷던 중 꽃가게 사장님이 말을 걸어왔다.");
        System.out.println("# 꽃가게 사장님 : '학생 이 꽃들좀 가게 안으로 들이는것좀 도와줄 수 있을까?' ");
        System.out.println("# 꽃가게 사장님을 도와주시겠습니까?");
        System.out.println("# 1. 돕는다");
        System.out.println("# 2. 돕지않는다");
        System.out.print("# >>");
        String choice = sc.nextLine();
        switch (choice){
            case "1":
                flower1();
                Variables.likeList.add("라일락");
                break;
            case "2":
                flower2();
                break;
        }
        pressEnter();
    }
    public void flower1(){
        System.out.println("# 나 : '안에 들여놓으면 되는거죠?'");
        System.out.println("# 꽃가게 사장님 : '고마워 학생 덕분에 살았어'");
        System.out.println("# 꽃가게 사장님 : '그 우리 동네에 서아라는 애가 우리 가게를 자주 들르는데 라일락을 정말 좋아한단다'");
        System.out.println("# 꽃가게 사장님 : '꽃말이 이쁘다면서 ㅎㅎ'");
        System.out.println("# 서아가 좋아하는 꽃이 라일락 이라는 정보를 얻었습니다.");
        System.out.println("# 이제 집으로 돌아가자");

    }
    public void flower2(){
        System.out.println("# 나 : '죄송해요 제가 바빠서...'");
        System.out.println("# 꽃가게 사장님 : '그래요? 이걸 언제다 옮긴담...'");
        System.out.println("# 시장을 둘러보다 집으로 갔습니다.");
    }

    // 상인들과 대화(분식집 아줌마)
    public void snackBar(){
        System.out.println("# 나는 기분 전환할 겸 시장으로 걸어갔다. ");
        System.out.println("# 길을 걷던중 배가 출출해져서 나는 근처 분식집으로 향했다.");
        System.out.println("# 이 분식집은 어릴때 서아네 어머니가 나랑 서아를 데리고 떡볶이를 사주시곤 했다. ");
        System.out.println("# 가게 안에 들어서니 어릴때 갔던 그 모습 그대로 였다.");
        System.out.println("# 벽에는 나랑 서아가 했던 낚서도 그대로 남아있었다.");
        System.out.println("# 감상에 빠져있던중 주인아주머니가 주문을 받으러오셨다.");
        System.out.println("# 아주머니 : '주문하시겠어요?'");
        System.out.println("# 나 : '떡볶이 1인분 주세요'");
        System.out.println("# 아주머니 : '어? 너 ##이 아니니?'");
        System.out.println("# 나 : '기억하시네요 아주머니 ㅎㅎ'");
        System.out.println("# 아주머니 : '그럼~ 너랑 서아가 아줌마가 만든 떡볶이가 최고라고 칭찬해줬잖아'");
        System.out.println("# 아주머니 : '아줌마는 그말이 너무 고마웠단다.'");
        System.out.println("# 나 : '하지만 아줌머니 떡볶이가 최고로 맛있는걸요!'");
        System.out.println("# 아주머니 : '그래 아줌마가 맛있게 만들어줄게'");
        System.out.println("# 그렇게 가게를 둘러보던중 떡볶이가 나왔다.");
        System.out.println("# 아주머니 : '맛있게 먹으렴~'");
        System.out.println("# 나 : '감사합니다!'");
        System.out.println("# 떡볶이를 먹으려는데 떡볶이가 짜다... 설탕이랑 소금이랑 헷갈리신거 같은데... 어떡하지?");
        System.out.println("# 1. 그냥 먹는다.");
        System.out.println("# 2. 말씀드린다.");
        System.out.print("# >>");
        String choice = sc.nextLine();
        switch (choice){
            case "1":
                snackBar1();
                Variables.likeList.add("로제 떡볶이");
                break;
            case "2":
                snackBar2();
                break;
        }
        pressEnter();
    }
    public void snackBar1(){
        System.out.println("# 아주머니 : '입에 맞니?'");
        System.out.println("# 나 : '오랜만에 먹는다 아직도 맛있는데요~?'");
        System.out.println("# 나 : '도시에서 사먹는것 보다 맛있어요!'");
        System.out.println("# 아주머니 : '아참! 요즘 서아가 우리가게 로제떡볶이를 먹었는데 그게 최고 맛있다고 하더라'");
        System.out.println("# 아주머니 : '너도 나중에 한번 아줌마가 해줄게~'");
        System.out.println("# 나 : '네! 감사합니다!'");
        System.out.println("# 그렇게 떡볶이를 먹고 가게를 나왔다.");
        System.out.println("# 비록 떡볶이는 짰지만 좋은 정보를 얻었다.");
        System.out.println("# 서아가 좋아하는 분식은 로제떡볶이 라는 정보를 얻었습니다.");
        System.out.println("# 이제 집으로 돌아가자");

    }
    public void snackBar2() {
        System.out.println("# 나 : '아주머니 혹시 설탕이랑 소금을 헷갈리신거 아니에요?'");
        System.out.println("# 아주머니 : '그래? 이상하다 분명 설탕이였는데...'");
        System.out.println("# 그렇게 아주머니는 떡볶이를 다시 만드셨고");
        System.out.println("# 계산을 하고 가게를 나올때 아주머니가 말을 걸어오셨다.");
        System.out.println("# 아주머니 : '아줌마가 헷갈려서 미안해'");
        System.out.println("# 나는 죄송해하시는 아주머니를 뒤로하고 가게를 나왔다.");
        System.out.println("# 시장을 둘러보다 집으로 갔습니다.");
    }

    // 서아와 시장에서 만났을떄
    private static void Scene1() {
        System.out.println("# 시장을 걷던중 서아와 만났다.");
        System.out.println("# 서로 눈이 마주치고 어색한 기류가 흘렀다.");
        System.out.println("# 나는 이 분위기를 어떡하지? 말을 걸어야하는데... 뭐라고 걸지?");
        System.out.println("# 1. 어? 이쁘다~");
        System.out.println("# 2. 안녕 서아야?");
        String choice = sc.nextLine();
        switch (choice){
            case "1":
                Scene1_1();
                love -= 5;
                break;
            case "2":
                Scene1_2();
                love += 10;
                break;
        }
        pressEnter();
    }

    private static void Scene1_1() {
        System.out.println("# 나 : '안녕~ 어? 이쁘다'");
        System.out.println("# 서아 : '어? 어... 응 고마워...'");
        System.out.println("# 서아 : '저기 나 친구 만나러 가기로 해서 먼저 가볼게...'");
        System.out.println("# 서아는 어색한 표정으로 자리를 피했다");
        System.out.println("# 뭐가 문제였을까...?");
        System.out.println("# 서아와 헤어지고 시장을 구경하다 집으로 돌아갔다.");
    }

    private static void Scene1_2() {
        System.out.println("# 나 : '안녕 서아야?");
        System.out.println("# 서아 : '응 안녕? 어디가?'");
        System.out.println("# 나 : '그냥 바람이나 쐬러 나왔어 너는?'");
        System.out.println("# 서아 : '그래? 나도 심심해서 나와봤는데... 혹시 지금 안바쁘면 나랑 같이 걸을래?'");
        System.out.println("# 나 : '그럴까?'");
        System.out.println("# 서아와 걸으면서 옛날이야기를 하면서 걷다보니 서아네 집에 도착했다.");
        System.out.println("# 서아 : '벌써 우리집이네 난 이만 들어가볼게 데려다줘서 고마워 ㅎㅎ'");
        System.out.println("# 나 : '응 나도 집에 가봐야겠다 다음에 또 보자 ㅎㅎ'");
        System.out.println("# 서아와 더욱 가까워진 것 같다.");
        System.out.println("# 이제 집으로 돌아가자");
    }

}
