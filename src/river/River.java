package river;
import util.Util.*;
import util.Variables;

import static util.Util.*;

public class River {
    private int chance;
    public static int cat = 0;
    public static boolean rain = false;


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
                timeString("아무일도 없었다 집에 돌아왔다");
                break;
            case 4:
                meetSeoah();
                break;
            case 5:
                fish();
                break;
            default:
                System.out.println("디폴트");
                break;

        }
    }

    public void kidEvent(){
        timeString("냇가에서 어떤 꼬마가 허우적 거리고 있다");
        System.out.println("# 1. 도와준다");
        System.out.println("# 2. 무시하고 지나간다");
        String s =input(">> ");
        found(Integer.parseInt(s));

    }
    public void meetSeoah(){
        timeString("냇가를 산책하던 도중에 서아를 만났다");
        talkMe("\'아.. 안녕 .. 서아야..\'");
        talkSeo("\'안녕 "+Variables.name+"\'");
        talkSeo("\'너도 산책하러 나왔구나 ??\'");
        talkMe("\'웅\'");
        System.out.println("# 1. 같이 낚시하자고 물어본다");
        System.out.println("# 2. 같이 물수제비 하자고 물어본다");
        String s =input(">> ");
        try{talkSeoah(Integer.parseInt(s));}catch (NumberFormatException e){
            System.out.println("숫자로 입력해주세요");
        }
    }
    public void talkSeoah(int choiceNumber){
        switch (choiceNumber){
            case 1:
                talkMe("\'서아야.. 나랑 낚시 하지 않을래??\'");
                if(Variables.love >=30){
                    if(rain==false){
                        rainEvent();
                    }else{
                        talkSeo("\'그래 좋아 같이 낚시하자!!\'");
                        System.out.println("서아와 재미있게 놀고 집에 돌아왔다.");
                        loveGage(5);
                    }
                }else{
                    talkSeo("\'싫어 낚시 안할꺼야!!\'");
                    loveGage(-5);
                }
                break;
            case 2:
                talkMe("\'서아야.. 나랑 물수제비 하지 않을래??\'");
                if(Variables.love <=60){
                    talkSeo("\'그래 좋아 같이 물수제비 하자!!\'");
                    System.out.println("서아와 재미있게 놀고 집에 돌아왔다.");
                    loveGage(5);
                }else{
                    talkSeo("\'싫어 나 물수제비 안할꺼야\'");
                    loveGage(-5);
                }
                break;
        }
    }
    public  void found(int choice){
        reroll();
        switch (choice){
            case 1:
                if (chance<=4){
                    System.out.println("# 서아가 아이를 구출하는 모습을 보고 멋있다고 생각한다.");
                    loveGage(20);
                }else{
                    System.out.println("아무일도 일어나고 집에 돌아 왔다");
                }
                break;
            case 2:
                if(chance<=4){
                    System.out.println("서아가 아이를 구하지 않고 무시하는 모습을 보고 실망했다.");
                    loveGage(-5);
                }else{
                    System.out.println("아무일도 일어나고 집에 돌아 왔다");
                }
                break;
        }
    }

    public void fish(){
        reroll();
        if(chance<=4){
            System.out.println("혼자 낚시를 하고 집에 왔다");
        }else if (cat !=1){
            timeString("혼자 낚시를 하는 도중에 \uD83D\uDC08(고양이)가 배고픈지 내 옆으로 왔다");
            System.out.println("# 1. 고양이에게 물고기를 준다");
            System.out.println("# 2. 고양이를 무시하고 낚시를 한다");
            String s =input(">> ");
            try{
            switch (Integer.parseInt(s)){
                case 1:
                    System.out.println("고양이가 맛있게 먹고 돌아간다");
                    System.out.println("집에 돌아왔다");
                    cat++;
                    break;
                case 2:
                    System.out.println("고양이가 매섭게 쳐다본다!");
                    System.out.println("집에 돌아왔다");
                    break;
            }}catch (NumberFormatException e){
                System.out.println("숫자를 입력해주세요");
            }
        }
    }
    public void rainEvent(){
        timeString("# ☔갑자기 비가 내리기 시작했다.");
        timeString("# 나랑 서아는 급한대로 큰 나무 아래로 왔다.");
        timeString(".... \uD83E\uDDD1\uD83C\uDFFB ...\uD83D\uDC69\uD83C\uDFFB ..");
        timeString("# 나랑 서아가 이렇게.. 붙어 있다니 .. 너무 떨린다 무슨 말을 해야하지..");
        System.out.println("# 1. 서아야 이렇게 나무 아래 있으니깐 옛날 생각난다 그치??");
        System.out.println("# 2. 서아야 우리 이렇게 단 둘이 있는 것도 되게 오랜만이다 그치??");
        try{
            String s =input(">> ");
            int choiceNumber=Integer.parseInt(s);
            if(choiceNumber ==1){
                talkMe("\'서아야 이렇게 나무 아래 있으니깐 옛날 생각난다 그치??\'");
                talkSeo("\'무슨 소리야 나 너랑 나무 아래 있었던 적이 없었는데..?\'");
                talkSeo("\'너 예지랑 헷갈린거 아니야..? 너 어렸을 때 예지 좋아했잖아..\'");
                timeString("# 서아가 실망한듯 눈치다...");
                System.out.println("비가 그치고 나랑 서아는 각자 집에 돌아왔다");
                loveGage(-20);
            }else{
                talkMe("\'서아야 우리 이렇게 단 둘이 있는 것도 되게 오랜만이다 그치??\'");
                talkSeo("\'그러게.. 너랑 이렇게 둘이 있는거 되게 오랜만이야...\'");
                timeString("# 서아가 약간 부끄러워 하는 것 같다.");
                System.out.println("비가 그치고 나랑 서아는 각자 집에 돌아왔다");
                loveGage(20);
            }
            rain = true;
        }
        catch (NumberFormatException e){
            System.out.println("숫자로 입력해주세요 1혹은2");
        }
    }


}
