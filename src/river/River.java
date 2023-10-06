package river;
import util.Util.*;
import util.Variables;

import static util.Util.*;

public class River {
    private int chance;
    public static int cat = 0;


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
        System.out.print(Variables.name+": ");
        timeString("아.. 안녕 .. 서아야..");
        System.out.print("서아: ");
        timeString(": 안녕 "+Variables.name);
        System.out.println("# 1. 같이 낚시하자고 물어본다");
        System.out.println("# 2. 같이 물수제비 하자고 물어본다");
        String s =input(">> ");
        talkSeoah(Integer.parseInt(s));
    }
    public void talkSeoah(int choiceNumber){
        switch (choiceNumber){
            case 1:
                System.out.print(Variables.name+": ");
                timeString("서아야.. 나랑 낚시 하지 않을래??");
                if(Variables.love >=30){
                    System.out.print("서아: ");
                    timeString("그래 좋아 같이 낚시하자!!");
                    Variables.love +=5;
                }else{
                    System.out.print("서아: ");
                    timeString("싫어 낚시 안할꺼야!!");
                    Variables.love -=5;
                }
                break;
            case 2:
                System.out.print(Variables.name+": ");
                timeString("서아야.. 나랑 물수제비 하지 않을래??");
                if(Variables.love <=60){
                    System.out.print("서아: ");
                    timeString("그래 좋아 같이 물수제비 하자!!");
                    Variables.love +=5;
                }else{
                    System.out.print("서아: ");
                    timeString("싫어 나 물수제비 안할꺼야");
                    Variables.love -=5;
                }
                break;
        }
    }
    public  void found(int choice){
        reroll();
        switch (choice){
            case 1:
                if (chance<=4){
                    System.out.println("서아가 아이를 구출하는 모습을 보고 멋있다고 생각한다.");
                    Variables.love +=20;
                }else{
                    System.out.println("아무일도 일어나지 않았다");
                }
                break;
            case 2:
                if(chance<=4){
                    System.out.println("서아가 아이를 구하지 않고 무시하는 모습을 보고 실망했다.");
                    Variables.love-=10;
                }else{
                    System.out.println("아무일도 일어나지 않았다");
                }
                break;
        }
    }

    public void fish(){
        reroll();
        if(chance<=4){
            System.out.println("혼자 낚시를 하고 집에 왔다");
        }else if (cat !=1){
            timeString("혼자 낚시를 하는 도중에 고양이가 배고픈지 내 옆으로 왔다");
            System.out.println("# 1. 고양이에게 물고기를 준다");
            System.out.println("# 2. 고양이를 무시하고 낚시를 한다");
            String s =input(">> ");
            switch (Integer.parseInt(s)){
                case 1:
                    System.out.println("고양이가 맛있게 먹고 돌아간다");
                    cat++;
                    break;
                case 2:
                    System.out.println("고양이가 매섭게 쳐다본다!");
                    break;
            }
        }


    }


}
