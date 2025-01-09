import java.util.Scanner;
public class Demo018{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the minutes you have survived: ");
        long minutes = sc.nextLong();
        long minutesInDay = 24 * 60;
        long minutesInYear = 365 * minutesInDay;
        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;
        long days = remainingMinutes / minutesInDay;
        System.out.println(minutes + " minutes is converted to " + years + " years and " + days + " days.");
        
       
        

    }
}