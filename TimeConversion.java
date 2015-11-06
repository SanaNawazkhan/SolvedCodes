import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String time = s.nextLine();
        String timepart = time.substring(time.length()-2);
        String hour = time.substring(0,2);
        String remain = time.substring(2,time.length()-2);
        int convert=0;
        int for_24[] = {13,14,15,16,17,18,19,20,21,22,23,24};
        if(timepart.equals("PM")){     
            if(hour.charAt(0)=='0'){
                convert = for_24[Character.getNumericValue(hour.charAt(1))-1];
            }
            if(hour.equals("12")){
               convert = 12;
            }
             else {
                convert = for_24[Integer.parseInt(hour)-1];
            }
        System.out.println(convert+remain);
        }
        else
           if(hour.equals("12"))
                System.out.println("00"+remain);
           else
                System.out.println(hour+remain);
    }
}
