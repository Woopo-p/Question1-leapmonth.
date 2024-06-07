package final_exam;

import java.util.Scanner;

public class leapmonth{
    public static void main(String[] args) {
        // variables for the program
        int year;
        String month_name;
        int month_number = 0; // to initialize 0 to any invalid month input
        boolean isLeap_month = false;

        // Array of month names
        String[] month_names = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        Scanner scanner = new Scanner(System.in);

        // gets input for year and month
        System.out.print("Enter year: ");
        year = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter month (January-December): ");
        month_name = scanner.nextLine();

        // converting  month name to month number
        for (int i = 0; i < month_names.length; i++) {
            if (month_names[i].equalsIgnoreCase(month_name)) {
                month_number = i + 1; 
                break;
            }
        }

        // Check if a valid month number was found
        if (month_number > 0) {
            // to check if the given month is a leap month
            isLeap_month = (year % 4 == 0);


            // Output the result
            if (isLeap_month) {
                System.out.println(month_name + " in year " + year + " is a leap month.");
            } else {
                System.out.println(month_name + " in year " + year + " is not a leap month.");
            }
        } else {
            System.out.println("Invalid month entered.");
        }


        scanner.close();
    }
}
