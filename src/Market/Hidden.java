package Market;

import static util.Util.pressEnter;
import static util.Util.*;
import static util.Variables.*;

public class Hidden {
    public static void HiddenScene(){
        System.out.println("# 나는 기분 전환할 겸 시장으로 걸어갔다. ");
        System.out.println("# 길을 걷던중 서아와 같이놀때 같이 놀던 준석이를 만났다 ");
        System.out.println("# 준석이는 소심한 성격에 작고 외소한 친구였다. ");
        System.out.println("# 그런 준석이를 서아는 곧잘 챙겨주었다. ");
        System.out.println("# 하지만 오랜만에 만난 준석이는 달라졌다.  ");
        System.out.println("# 키는 180이 넘어보이고 딱 벌어진 어깨 다부진몸까지... 언제 이렇게 커졌지? ");
        System.out.println("# 준석 : '##? ##맞지?' ");
        System.out.println("# 가까이서 보니 준석이는 더 커보이기만 했다. ");
        System.out.println("# 준석 : '이야 오랜만이다! 나 기억나? 준석이야' ");
        System.out.println("# 나 : '준석이 맞지? 기억나' ");
        System.out.println("# 준석 : 이렇게 보니까 좋다야  ");
        System.out.println("# 준석 : 너도 이번에 축제 구경오지? 사실... 이번축제때 나 서아한테 고백할 생각이야 ");
        System.out.println("# 준석 : 너는 어떻게 생각해? ");
        System.out.println("# 준석이도 서아를 좋아하는것 같은데 어쩌지... ");
        System.out.println("# 1. 찬성한다");
        System.out.println("# 2. 반대한다");
        System.out.print("# >>");
        String choice = sc.nextLine();
        switch (choice){
            case "1":
                HiddenScene1();
                break;
            case "2":
                HiddenScene2();
                break;
        }
        pressEnter();
    }

    private static void HiddenScene1() {
        System.out.println("# 나 : '고백하는게 좋지 않을까?'");
        System.out.println("# 준석 : '정말 그렇게 생각해? 고마워 덕분에 용기가 난다!'");
        System.out.println("# ");
    }

    private static void HiddenScene2() {
        System.out.println("# 나 : '아..안돼..!'");
        System.out.println("# 이런 나도 모르게 반대해버렸다...");
        System.out.println("# 준석 : '왜?'");
        System.out.println("# 준석이는 놀라며 나에게 물었다.");
        System.out.println("# 나 : '사실 나도 서아를 좋아해 나도 이번 축제때 서아게 고백할 생각이였어...'");

    }
}
