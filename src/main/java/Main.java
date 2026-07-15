import java.util.*;

public class Main{
    public static void main(String[] args){
        Clock brClock = new BRLClock();
        brClock.setSecond(05);
        brClock.setMinute(06);
        brClock.setHour(15);

        System.out.println(brClock.getTime());
        System.out.println(new USClock().convert(brClock).getTime());


    }
}