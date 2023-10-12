package walkEvent;

import util.Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        while (true){
            select();
        }
    }
    // BalloonEvent = 0 , Walk = 1 , Dog = 2 , Not = 3
    static List<Integer> events = new ArrayList<>(
            List.of(0,1,1,2,3,3)
    );
    //select() : 이벤트 랜덤 선택 함수
    public static void select(){
        Collections.shuffle(events);
        //시작할 이벤트 선택
        int startEvent = events.get(0);
        System.out.println("events = " + events);
        switch (startEvent) {
            case 0:
                BalloonEvent.start();
                deleteEvent();
                break;
            case 1:
                WalkWithSeoah.start();
                break;
            case 2:
                DogEvent.start();
                deleteEvent();
                break;
            case 3:
                NotThing.start();
                break;
        }
    }

    //이벤트를 삭제하는 함수
    public static void deleteEvent(){
        events.remove(0);
    }
}
