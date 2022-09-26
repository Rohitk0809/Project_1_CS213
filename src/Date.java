import java.util.Calendar;
/**
 The Date class keeps track of the day, month and year of a date and validates that it is a legitimate date
 @author Sameer Ahmed
 */
public class Date implements Comparable<Date> {
    private int year;
    private int month;
    private int day;
    /**
     QUADRENNIAL represents something that happens every four years
     */
    public static final int QUADRENNIAL = 4;
    /**
     CENTENNIAL represents something that happens every one-hundred years
     */
    public static final int CENTENNIAL = 100;
    /**
     QUARTERCENTENNIAL represents something that happens every four-hundred years
     */
    public static final int QUARTERCENTENNIAL = 400;
    /**
     THIRTYONEDAYS stands in for the number 31, the most common number of days in a month
     */
    public static final int THIRTYONEDAYS = 31;
    /**
     THIRTYDAYS stands in for the number 30, the second most common number of days in a month
     */
    public static final int THIRTYDAYS = 30;
    /**
     TWENTYNINEDAYS stands in for the number 29, the number of days in February during a leap year
     */
    public static final int TWENTYNINEDAYS = 29;

    /**
     This is a constructor that will turn the String argument in the form "MM/DD/YYYY" into a Date object,
     with the appropriate date assigned
     * @param date a string in the form "MM/DD/YYYY representing the date
     */
    public Date(String date) {
        String[] dateSplit = date.split("/");
        this.month = Integer.parseInt(dateSplit[0]);
        this.day = Integer.parseInt(dateSplit[1]);
        this.year = Integer.parseInt(dateSplit[2]);
    }

    /**
     This constructor will create a Date object with today's date and assign it to the newly created Date object
     */
    public Date() {
        Calendar calendar = Calendar.getInstance();
        this.month = calendar.get(Calendar.MONTH) + 1;
        this.day = calendar.get(Calendar.DATE);
        this.year = calendar.get(Calendar.YEAR);
    }

    /**
     This method checks to see if an appointment date is a valid date, and takes place this year
     @return true if the date is valid, else returns false
     */
    public boolean apptDateIsValid() {
        if (this.year != (new Date().year)) {
            return false;
        } else {
            return this.isValid();
        }
    }

    /**
     This method checks to see if an appointment date is a valid date, checking the number of days in each month,
     including leap year
     @return true if it is a valid date, else false
     */
    public boolean isValid() {
        int[] thirtyOne = {MonthIndex.JANUARY.index, MonthIndex.MARCH.index, MonthIndex.MAY.index, MonthIndex.JULY.index,
                MonthIndex.AUGUST.index, MonthIndex.OCTOBER.index, MonthIndex.DECEMBER.index};
        int[] thirty = {MonthIndex.APRIL.index, MonthIndex.JUNE.index, MonthIndex.SEPTEMBER.index, MonthIndex.NOVEMBER.index};
        for (int j : thirtyOne) {
            if (j == this.month) {
                if (this.day > THIRTYONEDAYS) {
                    return false;
                }
            }
        }
        for (int j : thirty) {
            if (j == this.month) {
                if (this.day > THIRTYDAYS) {
                    return false;
                }
            }
        }
        if (this.month == MonthIndex.FEBRUARY.index) {
            if ((this.day == TWENTYNINEDAYS) && !isLeapYear()) {
                return false;
            } else return this.day <= TWENTYNINEDAYS;
        }
        return true;
    }

    /**
     This method checks to see if the given date takes place during a leap year
     @return true if it is a leap year, else false
     */
    private boolean isLeapYear() {
        if (this.year % QUADRENNIAL == 0) {
            if (this.year % CENTENNIAL == 0) {
                return this.year % QUARTERCENTENNIAL == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    /**
     This method creates a String representation of the given date
     @return a String object representing the given date
     */
    public String toString() {
        return this.month + "/" + this.day + "/" + this.year;
    }

    /**
     This method compares two dates
     @param date a date to compare against
     @return 0 if the dates are the same, -1 if the argument date is before and 1 if the argument date is after
     */
    @Override
    public int compareTo(Date date) {
        if (Integer.compare(date.year, this.year) != 0) {
            return Integer.compare(date.year, this.year);
        } else if (Integer.compare(date.month, this.month) != 0) {
            return Integer.compare(date.month, this.month);
        } else {
            return Integer.compare(date.day, this.day);
        }
    }
    /**
     This is the testbed main, which is used as a driver to exercise the code in this class
     @param args the command line arguments
     **/
    public static void main(String[] args) {
        Date testOne = new Date("3/32/1992");
        System.out.println("The validity of the date 3/32/1992 is " + testOne.isValid());
        Date testTwo = new Date("2/29/1900");
        System.out.println("The validity of the date 2/29/1900 is " + testTwo.isValid());
        Date testThree = new Date("8/16/2024");
        System.out.println("The validity of the date 8/16/2024 is " + testThree.isValid());
        Date testFour = new Date("10/31/2024");
        System.out.println("The validity of the date 10/31/2024 is " + testThree.isValid());
        Date testFive = new Date("4/31/2018");
        System.out.println("The validity of the date 4/31/2018 is " + testThree.isValid());
        Date testSix = new Date("7/31/2018");
        System.out.println("The validity of the date 7/31/2018 is " + testSix.isValid());
        Date testSeven = new Date("2/29/2021");
        System.out.println("The validity of the date 2/29/2021 is " + testSeven.isValid());
    }

}
