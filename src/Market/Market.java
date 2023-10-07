package Market;

import river.River;
import util.Variables;


import static util.Util.*;

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

    // 상인들과 대화(카페 알바생)
    public void cafe(){
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
                cafe1();
                Variables.likeList.add("라일락");
                break;
            case "2":
                cafe2();
                break;
        }
        pressEnter();
    }
    public void cafe1(){
        System.out.println("# 나 : '안에 들여놓으면 되는거죠?'");
        System.out.println("# 꽃가게 사장님 : '고마워 학생 덕분에 살았어'");
        System.out.println("# 꽃가게 사장님 : '그 우리 동네에 서아라는 애가 우리 가게를 자주 들르는데 라일락을 정말 좋아한단다'");
        System.out.println("# 꽃가게 사장님 : '꽃말이 이쁘다면서 ㅎㅎ'");
        System.out.println("# 서아가 좋아하는 꽃이 라일락 이라는 정보를 얻었습니다.");
        System.out.println("# 이제 집으로 돌아가자");

    }
    public void cafe2() {
        System.out.println("# 나 : '죄송해요 제가 바빠서...'");
        System.out.println("# 꽃가게 사장님 : '그래요? 이걸 언제다 옮긴담...'");
        System.out.println("# 시장을 둘러보다 집으로 갔습니다.");
    }



}
