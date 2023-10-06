package river;

import util.Util;
import util.Variables;

public class test {
    public static void talkGirl(String s){
        System.out.print("# 서아: ");
        Util.timeString(s);
    }
    public static void talkMe(String s){
        System.out.print("# "+ Variables.name+": ");
        Util.timeString(s);
    }
}
