import javax.xml.stream.Location;

public class Member implements Comparable<Member>{
    private String fname;
    private String lname;
    private Date dob;
    private Date expire;
    private Location location;

    @Override
    public String toString() {
        return this.fname + " " + this.lname + ", DOB: " + dob.toString()
                + "Membership expires " + expire.toString() + ", Location: " + location.toString();
    }

    /**
     The Patient constructor associates the member's first name, last name, date of birth, expiration and location with the new object
     @param fname the member's first name
     @param lname the member's last name
     @param dob the member's date of birth
     @param expire the member's expiration date
     @param location the member's location
     */
    public Member(String fname, String lname, Date dob, Date expire, Location location) {
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.expire = expire;
        this.location = location;
    }
    /**
     This method checks to see if two members are equal, using the string representation of each to check the
     member's name, date of birth, and the expiration date and location of the member.
     @param obj an appointment to check against
     @return true if the members are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {

        Member member = (Member) obj;
        if ((this.fname.equalsIgnoreCase(member.fname)) && (this.lname.equalsIgnoreCase(member.lname)) && (this.dob.compareTo(member.dob)==0))
        {
            return true;
        }
        else{
            return false;
        }
    }
    /**
     This method compares two members, sorted by last name, first name, then date of birth
     @param member a member to compare against
     @return 0 if the patients are the same, -1 if the numeric representation of the argument patient is lower and
     1 if the argument patient is higher
     */
    @Override
    public int compareTo(Member member) {
        if (member.lname.compareTo(this.lname) == 0) {
            if (member.fname.compareTo(this.fname) == 0) {
                return member.dob.compareTo(this.dob);
            } else {
                return member.fname.compareTo(this.fname);
            }
        } else {
            return member.lname.compareTo(this.lname);
        }
    }
    //return textual formation of member in toString
}


