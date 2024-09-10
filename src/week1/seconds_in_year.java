package week1;

public class seconds_in_year {
    public static void main(String[] args) {
        int SecondsInMinutes= 60;
        int MinutesInHours= 60;
        int HoursInDays= 24;
        int DaysInYear= 365;
        int SecondsInYear;
        SecondsInYear = SecondsInMinutes * MinutesInHours * HoursInDays * DaysInYear;
        System.out.println("There are " + SecondsInYear + " seconds in year.");
    }
}