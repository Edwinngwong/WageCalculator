import java.util.*;

public class CalcWages {
    public static void calculateWages(int hours, double rate) {
        double wages;

        if(hours <= 40) {
            wages = hours * rate;
            System.out.println("Your payment is: $" + wages);
        }
        else {
            wages = 40 * rate;
            double overTime = (hours - 40) * 1.5 * rate;
            System.out.println("Your payment is: $" + (wages + overTime));
            System.out.println("Regular payment: $" + wages + "\nOver Time payment: $" + overTime);
        }

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Hours Worked: ");
        while(!s.hasNextInt()) {
            System.out.println("Invalid input, please try again \n.\n.");
            s.next();
            System.out.print("Enter Hours Worked: ");
        }
        int hours = s.nextInt();

        System.out.print("Enter Hourly Rate: ");
        while(!s.hasNextDouble()) {
            System.out.println("Invalid input, please try again \n.\n.");
            s.next();
            System.out.print("Enter Hourly Rate: ");
        }
        double rate = s.nextDouble();

        calculateWages(hours, rate);
    }
}
