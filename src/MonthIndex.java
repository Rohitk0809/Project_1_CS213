public enum MonthIndex {
    /**
     JANUARY represents the first month of the year
     */
    JANUARY (1),
    /**
     FEBRUARY represents the second month of the year
     */
    FEBRUARY (2),
    /**
     MARCH represents the third month of the year
     */
    MARCH (3),
    /**
     APRIL represents the fourth month of the year
     */
    APRIL (4),
    /**
     MAY represents the fifth month of the year
     */
    MAY (5),
    /**
     JUNE represents the sixth month of the year
     */
    JUNE (6),
    /**
     JULY represents the seventh month of the year
     */
    JULY (7),
    /**
     AUGUST represents the eighth month of the year
     */
    AUGUST (8),
    /**
     SEPTEMBER represents the ninth month of the year
     */
    SEPTEMBER (9),
    /**
     OCTOBER represents the tenth month of the year
     */
    OCTOBER (10),
    /**
     NOVEMBER represents the eleventh month of the year
     */
    NOVEMBER (11),
    /**
     DECEMBER represents the twelfth month of the year
     */
    DECEMBER (12);

    /**
     The index of each month
     */
    public final int index;

    /**
     This constructor creates a MonthIndex object with the index assigned to the month
     @param index the index of the month
     */
    MonthIndex (int index) {
        this.index = index;
    }
}
