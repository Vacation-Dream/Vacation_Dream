package Market;

import river.River;
import util.Variables;


import static util.Util.*;
import static util.Variables.love;

public class Market {
    static boolean vege = true;
    static boolean flow = true;
    static boolean snack = true;


    public static void main1() {
        if(vege || flow || snack) {
            trio();
        } else {
            talk();
        }
    }

    private static void talk() {
        int random = (int)(Math.random() * 3 + 1);
        switch (random) {
            case 1:
                Scene1();
                break;
            case 2:
                Scene2();
                break;
            case 3:
                Scene3();
                break;
        }
    }

    private static void trio() {
        int random = (int)(Math.random() * 3 + 1);
        switch (random) {
            case 1:
                if(vege) vegetable();
                vege = false;
                break;
            case 2:
                if(flow) flower();
                flow = false;
                break;
            case 3:
                if(snack) snackBar();
                snack = false;
                break;
            default:
                trio();
        }
    }


    // 상인들과 대화(채소가게 아저씨)
    public static void vegetable(){
        timeString("# 나는 기분 전환할 겸 시장으로 걸어갔다. ");
        timeString("# 시장을 걷던 중 채소가게 아저씨가 말을 걸어왔다.");
        talkVegetable("# 학생 채소좀 보고가 사면 좋은걸 알려줄지도 흐흐 ");
        timeString("# 채소를 사시겠습니까?");
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
        talkMe("# 살게요..!");
        talkVegetable("# 허허 고마워 학생");
        talkVegetable("# 서아는 오이를 싫어 한다더라 맛있는데,,,");
        timeString("# 서아가 싫어하는 채소는 오이 라는 정보를 얻었습니다.");
        timeString("# 이제 집으로 돌아가자");
    }
    public static void vegetable2(){
        talkMe("# 나 : '안살레요.'");
        talkVegetable("# 채소가게 아저씨 : '그래..? 아쉽구만...'");
        timeString("# 시장을 둘러보다 집으로 갔습니다.");
    }

    // 상인들과 대화(꽃가게 사장님)
    public static void flower(){
        timeString("# 나는 기분 전환할 겸 시장으로 걸어갔다. ");
        timeString("# 시장을 걷던 중 꽃가게 사장님이 말을 걸어왔다.");
        talkFlower("# 학생 이 꽃들좀 가게 안으로 들이는것좀 도와줄 수 있을까?");
        timeString("# 꽃가게 사장님을 도와주시겠습니까?");
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
    public static void flower1(){
        talkMe("# 안에 들여놓으면 되는거죠?");
        talkFlower("# 고마워 학생 덕분에 살았어'");
        talkFlower("# 그 우리 동네에 서아라는 애가 우리 가게를 자주 들르는데 라일락을 정말 좋아한단다");
        talkFlower("# 꽃말이 이쁘다면서 ㅎㅎ");
        timeString("# 서아가 좋아하는 꽃이 라일락 이라는 정보를 얻었습니다.");
        timeString("# 이제 집으로 돌아가자");
    }
    public static void flower2(){
        talkMe("# 죄송해요 제가 바빠서...");
        talkFlower("#그래? 이걸 언제다 옮긴담...");
        timeString("# 시장을 둘러보다 집으로 갔습니다.");
    }

    // 상인들과 대화(분식집 아줌마)
    public static void snackBar(){
        timeString("# 나는 기분 전환할 겸 시장으로 걸어갔다. ");
        timeString("# 길을 걷던중 배가 출출해져서 나는 근처 분식집으로 향했다.");
        timeString("# 이 분식집은 어릴때 서아네 어머니가 나랑 서아를 데리고 떡볶이를 사주시곤 했다. ");
        timeString("# 가게 안에 들어서니 어릴때 갔던 그 모습 그대로 였다.");
        timeString("# 벽에는 나랑 서아가 했던 낚서도 그대로 남아있었다.");
        timeString("# 감상에 빠져있던중 주인아주머니가 주문을 받으러오셨다.");
        talkMadam("# 주문하시겠어요?");
        talkMe("# 떡볶이 1인분 주세요");
        talkMadam("# 어? 너 ##이 아니니?");
        talkMe("# 기억하시네요 아주머니 ㅎㅎ");
        talkMadam("# 그럼~ 너랑 서아가 아줌마가 만든 떡볶이가 최고라고 칭찬해줬잖아");
        talkMadam("# 아줌마는 그말이 너무 고마웠단다.");
        talkMe("# 하지만 아줌머니 떡볶이가 최고로 맛있는걸요!");
        talkMadam("# 그래 아줌마가 맛있게 만들어줄게");
        timeString("# 그렇게 가게를 둘러보던중 떡볶이가 나왔다.");
        talkMadam("# 맛있게 먹으렴~");
        talkMe("# 감사합니다!");
        timeString("# 떡볶이를 먹으려는데 떡볶이가 짜다... 설탕이랑 소금이랑 헷갈리신거 같은데... 어떡하지?");
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
    public static void snackBar1(){
        talkMadam("# 입에 맞니?");
        talkMe("# 오랜만에 먹는다 아직도 맛있는데요~?");
        talkMe("# 도시에서 사먹는것 보다 맛있어요!");
        talkMadam("# 아참! 요즘 서아가 우리가게 로제떡볶이를 먹었는데 그게 최고 맛있다고 하더라");
        talkMadam("# 너도 나중에 한번 아줌마가 해줄게~");
        talkMe("# 네! 감사합니다!");
        timeString("# 그렇게 떡볶이를 먹고 가게를 나왔다.");
        timeString("# 비록 떡볶이는 짰지만 좋은 정보를 얻었다.");
        timeString("# 서아가 좋아하는 분식은 로제떡볶이 라는 정보를 얻었습니다.");
        timeString("# 이제 집으로 돌아가자");

    }
    public static void snackBar2() {
        talkMe("# 아주머니 혹시 설탕이랑 소금을 헷갈리신거 아니에요?");
        talkMadam("# 그래? 이상하다 분명 설탕이였는데...");
        timeString("# 그렇게 아주머니는 떡볶이를 다시 만드셨고");
        timeString("# 계산을 하고 가게를 나올때 아주머니가 말을 걸어오셨다.");
        talkMadam("# 아줌마가 헷갈려서 미안해");
        timeString("# 나는 죄송해하시는 아주머니를 뒤로하고 가게를 나왔다.");
        timeString("# 시장을 둘러보다 집으로 갔습니다.");
    }

    // 서아와 시장에서 만났을떄
    private static void Scene1() {
        timeString("# 시장을 걷던중 서아와 만났다.");
        timeString("# 서로 눈이 마주치고 어색한 기류가 흘렀다.");
        timeString("# 나는 이 분위기를 어떡하지? 말을 걸어야하는데... 뭐라고 걸지?");
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
        talkMe("# 안녕~ 어? 이쁘다");
        talkSeo("# 어? 어... 응 고마워...");
        talkSeo("# 저기 나 친구 만나러 가기로 해서 먼저 가볼게...");
        timeString("# 서아는 어색한 표정으로 자리를 피했다");
        timeString("# 뭐가 문제였을까...?");
        timeString("# 서아와 헤어지고 시장을 구경하다 집으로 돌아갔다.");
    }

    private static void Scene1_2() {
        talkMe("# 안녕 서아야?");
        talkSeo("# 응 안녕? 어디가?");
        talkMe("# 그냥 바람이나 쐬러 나왔어 너는?");
        talkSeo("# 그래? 나도 심심해서 나와봤는데... 혹시 지금 안바쁘면 나랑 같이 걸을래?");
        talkMe("# 그럴까?");
        timeString("# 서아와 걸으면서 옛날이야기를 하면서 걷다보니 서아네 집에 도착했다.");
        talkSeo("# 벌써 우리집이네 난 이만 들어가볼게 데려다줘서 고마워 ㅎㅎ");
        talkMe("# 응 나도 집에 가봐야겠다 다음에 또 보자 ㅎㅎ");
        timeString("# 서아와 더욱 가까워진 것 같다.");
        timeString("# 이제 집으로 돌아가자");
    }

    // 서아와 시장에서 만났을떄
    private static void Scene2() {
        timeString("# 시장을 걷던중 서아와 만났다.");
        timeString("# 서아는 나에게 오더니 말을 걸었다.");
        talkSeo("야채가게 가려고 하는데 같이 갈레?");
        talkMe("그...그럴까?");
        timeString("그렇게 서아와 야채가게를 가면서 서아가 나에게 질문을 던졌다.");
        talkSeo("넌 야채중에 뭘 싫어해?");
        talkMe("응? 싫어하는 야채?");
        timeString("# 싫어하는 야채... 뭐라고 하지?");
        System.out.println("# 1. 오이");
        System.out.println("# 2. 당근");
        String choice = sc.nextLine();
        switch (choice){
            case "1":
                Scene2_1();
                love += 10;
                break;
            case "2":
                Scene2_2();
                break;
        }
        pressEnter();
    }

    private static void Scene2_1() {
        talkMe("난... 오이?");
        talkSeo("# 정말? 나도 오이 싫어하는데~");
        talkSeo("# 엄마가 가끔 김밥 만들어주시는데 엄마몰래 오이 빼서 먹어 ㅎㅎ");
        timeString("# 그렇게 수다를 떨며 장을 보고 서아를 집에 데려다 주었다");
        timeString("# 이제 집으로 돌아가자");
    }

    private static void Scene2_2() {
        talkMe("난... 당근?");
        talkSeo("# 정말? 난 오이를 싫어하는데");
        talkSeo("# 엄마가 가끔 김밥 만들어주시는데 엄마몰래 오이 빼서 먹어 ㅎㅎ");
        timeString("# 그렇게 수다를 떨며 장을 보고 서아를 집에 데려다 주었다");
        timeString("# 이제 집으로 돌아가자");
    }

    private static void Scene3() {
        timeString("# 나는 기분 전환할 겸 시장으로 걸어갔다. ");
        timeString("걷다가 다리가 아파 시장안에 있는 벤치에 앉았다.");
        timeString("내 옆쪽 벤치에는 커플이 꽁냥거리고 있었다.");
        timeString("기분이 울적해졌다 집으로 돌아가자");
    }

}
