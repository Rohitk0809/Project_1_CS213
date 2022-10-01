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
    public static int compareDates(Date date1, Date date2){
        int diff;
        if (date1.month > date2.month && date1.day > date2.day){
            return (date1.year - date2.year);
        }
        else {
            return (date1.year - date2.year - 1);
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

