package Market;

import util.Variables;

import static util.Util.pressEnter;
import static util.Util.*;
import static util.Variables.*;

public class Special {
    public static void SpecialScene(){
        System.out.println("# 나는 기분 전환할 겸 시장으로 걸어갔다. ");
        System.out.println("# 길을 걷던 중 마을회관을 지나칠 때 누가 나를 큰 소리로 불렀다. ");
        System.out.println("# 우리 할머니였다. ");
        System.out.println("# 나 : '할머니 부르셨어요?'");
        System.out.println("# 할머니 : '그래 우리 손주 잠깐 이리로 와보렴' ");
        System.out.println("# 그렇게 나는 할머니의 부름에 마을회관에 들어갔다. ");
        System.out.println("# 들어가려는 순간 나는 내 두 눈을 의심했다. ");
        System.out.println("# 우리 할머니 옆에 소아서아 할머니와 소아가서아가 있었다. ");
        System.out.println("# 나는 서둘러 서아 할머니와 서아에게 인사 후 할머니 옆으로 앉았다. ");
        System.out.println("# 할머니 : '##아 옆집 서아 기억나~? 어릴때 둘이 그렇게 붙어다니잖아~' ");
        System.out.println("# 1. 기억난다");
        System.out.println("# 2. 기억안난다");
        System.out.print("# >>");
        String choice = sc.nextLine();
        switch (choice){
            case "1":
                SpecialScene1();
                love += 10;
                break;
            case "2":
                SpecialScene2();
                love -= 5;
                break;
        }
        pressEnter();
    }

    private static void SpecialScene1() {
        System.out.println("# 나 : '기억나죠 '");
        System.out.println("# 나 : '8살 때 아무것도 없는 시골에서 심심해하던 저와 놀아준 아주 고마운 친구요ㅎㅎ'");
        System.out.println("# 말이 끝나자 소아와 눈이 마주쳤다");
        System.out.println("# 서아는 눈을 피했지만, 입가에 살짝 미소가 띄어져 있었다. ");
        System.out.println("# 서아 : '에이 할머니 그때면 엄청 오래죠 ㅎㅎ' ");
        System.out.println("# 서아 : '저 카페에서 친구 만나기로 해서 먼저 일어나 볼게요' ");
        System.out.println("# 그렇게 서아는 자리를 떴고 나는 마을회관에서 잡일을 돕고 집으로 돌아갔다. ");

    }

    private static void SpecialScene2() {
        System.out.println("# 나 : '아뇨 기억이 잘...'");
        System.out.println("# 나도 모르게 거짓말을 해버렸어");
        System.out.println("# 서아 : '에이 할머니 그때면 엄청 오래죠 ㅎㅎ...' ");
        System.out.println("# 서아 : '저 카페에서 친구 만나기로 해서 먼저 일어나 볼게요' ");
        System.out.println("# 그렇게 서아는 자리를 떴고 나는 마을회관에서 잡일을 돕고 집으로 돌아갔다.");
    }
}
