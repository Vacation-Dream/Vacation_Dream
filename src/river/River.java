package river;

public class River {
    private int chance;
    private static int done;


    public void reroll(){
        chance=Util.onetofive();

    }


    public void event(){
        reroll();

        switch (chance){
            case 1:
                kidEvent();
                break;
            case 2:
                Util.timeStringBehind("주인공이 수영을 합니다", 0, 100);
                System.out.println("");

                break;
            case 3:
                Util.timeStringBehind("아무일도 없었다 그만 돌아가자", 0, 100);
                break;
            case 4:
                Util.timeStringBehind("강가에서 서아를 만났다 ...\n안녕..", 0, 100);
                break;
            case 5:
                Util.timeStringBehind("오늘은 낚시를 했다", 0, 100);
                break;
            default:
                System.out.println("디폴트");
                break;

        }
    }

    public void kidEvent(){
        Util.timeStringBehind("냇가에서 어떤 꼬마가 허우적 거리고 있다", 0 , 100);
    }


}
