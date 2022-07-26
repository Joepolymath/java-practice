package OOP;

import java.time.LocalDate;
import java.time.LocalTime;

public class Date {
    public static void main(String[] args){
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDate today = LocalDate.now();
        System.out.println(today);
    }
}
