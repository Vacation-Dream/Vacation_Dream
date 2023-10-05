package walkEvent;

import java.util.Scanner;

public class Utils {
    static Scanner sc = new Scanner(System.in);
    public static void makeLine(){
        System.out.println("=========================================");
    }
    public static String input(String message){
        System.out.print(message);
        return sc.nextLine();
    }
    public static void br(){
        System.out.println("");
    }
}
