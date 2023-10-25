package defensive_programming;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;

public class CalendarEvent {
    private LocalDate startDate;
    private LocalDate endDate;

    //invariant - start is before end
    //invariant - start is not earlier than today
    //LocalDate objects are immutable which prevents start and end from being modified outside the class.
    public CalendarEvent(LocalDate startDate, LocalDate endDate){
        LocalDate now = LocalDate.now(ZoneId.of("America/Chicago"));
        if (startDate.compareTo(endDate)>0){
            throw new IllegalArgumentException(startDate + " must be before "+ endDate);
        }
        if (startDate.compareTo(now) <= 0){
            throw new IllegalArgumentException(startDate + " must be after now "+ now);
        }
        this.startDate = startDate;
        this.endDate = endDate;
    }


    // period is immutable so we don't have to worry about it changing outside the class.
    public Period getEventDuration(){
        return startDate.until(endDate);
    }

    public static void main(String[] args) {
        LocalDate tomorrow = LocalDate.of(2023, Month.OCTOBER, 26);
        LocalDate monday = LocalDate.of(2023, Month.OCTOBER, 30);

        CalendarEvent fallBreak = new CalendarEvent(tomorrow, monday);
        System.out.println("The length of fall break is "+ fallBreak.getEventDuration().getDays()+ " days!");

    }
}
