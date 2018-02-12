//package homework;
import java.util.Scanner; 

public class Problem3_5 {
	public static void main(String[] args) {
        String today;
        String futureday;
         
        Scanner input = new Scanner(System.in);
         
        System.out.print("Enter today's day: ");
 int day = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
 int numDays = input.nextInt();
         
        if (day == 0)
            today = "Sunday";
        else if (day == 1)
            today = "Monday";
        else if (day == 2)
            today = "Tuesday";
        else if (day == 3)
            today = "Wednesday";
        else if (day == 4)
            today = "Thursday";
        else if (day == 5)
            today = "Friday";
        else
            today = "Saturday";
         
        int calcFutureday = (day + numDays) % 7;
         
        if (calcFutureday == 0)
            futureday = "Sunday";
        else if (calcFutureday == 1)
            futureday = "Monday";
        else if (calcFutureday == 2)
            futureday = "Tuesday";
        else if (calcFutureday == 3)
            futureday = "Wednesday";
        else if (calcFutureday == 4)
            futureday = "Thursday";
        else if (calcFutureday == 5)
            futureday = "Friday";
        else
            futureday = "Saturday";
         
        System.out.println("Today is " + today + " and the future day is " + 
                futureday);
}
}