package walkEvent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
//    public static void main(String[] args) {
//        select();
//    }
    // BalloonEvent = 0 , Walk = 1 , Dog = 2 , Not = 3
    static List<Integer> events = new ArrayList<>(
            List.of(0,0,1,1,2,2,2,3,3,3)
    );
    //select() : 이벤트 랜덤 선택 함수
    public static void select(){
        List<Integer> copy = new ArrayList<>(events);
        Collections.shuffle(copy);
        //시작할 이벤트 선택
        int startEvent = copy.get(0);

        switch (startEvent) {
            case 0:
                BalloonEvent.start();
                //deleteEvent(startEvent);
                break;
            case 1:
                WalkWithSeoah.start();
                break;
            case 2:
                DogEvent.start();
                //deleteEvent(startEvent);
                break;
            case 3:
                NotThing.start();
                break;
        }
    }

    //이벤트를 삭제하는 함수
    public static void deleteEvent(int event){
        while (events.contains(event)){
            events.remove(event);
            System.out.println(events);
        }
    }
}
