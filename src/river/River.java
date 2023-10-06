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
                Util.timeString("주인공이 수영을 합니다",  100);
                break;
            case 3:
                Util.timeString("아무일도 없었다 그만 돌아가자",100);
                break;
            case 4:
                Util.timeString("강가에서 서아를 만났다 ...\n안녕..",  100);
                break;
            case 5:
                Util.timeString("오늘은 낚시를 했다",  300);
                break;
            default:
                System.out.println("디폴트");
                break;

        }
    }

    public void kidEvent(){
        Util.timeString("냇가에서 어떤 꼬마가 허우적 거리고 있다",  100);
    }


}
