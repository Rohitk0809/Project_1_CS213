import java.util.Scanner;
import java.util.StringTokenizer;

public class GymManager {
    public int findMem(Member member, Member[] mlist) {
        for (int i = 0; i < mlist.length; i++){
            if (mlist[i] !=null){
                if (mlist[i].equals(member)){
                    return i;
                }
            }
        }
        return -1;
    }

    public void run(){
        Date today = new Date();
        System.out.print(today);

        Scanner userin = new Scanner(System.in);
        String[] user_input = new String[5];
        String command = null;

        String request, firstname, lastname, d, e, c;
        String string_genre = "null";

        Member member = null;

        MemberDatabase mlist = new MemberDatabase();



        System.out.println("Gym Manager starts running.");

        while (0 < 1) {
            String cmd = userin.nextLine();
            user_input = cmd.split(",");
            command = user_input[0];

            switch (command) {
                case "A":
                    firstname = user_input[1];
                    lastname = user_input[2];
                    d = user_input[3];
                    e = user_input[4];
                    c = user_input[5];
                    Date dateofbirth = new Date(d);
                    Date expdate = new Date(e);
                    Location cityname = null;
                    try{
                        cityname = Location.valueOf(c);
                    }
                    catch(IllegalArgumentException ex){
                        System.out.print(c+": is invalid location");
                    }
                    if (!dateofbirth.isValid()){
                        System.out.print("DOB"+dateofbirth+": invalid calendar date!");
                    }
                    else if(!expdate.isValid()){
                        System.out.print("Expiration date "+expdate+": invalid calendar date!");
                    }
                    else if(today.compareTo(dateofbirth) == 0 || today.compareTo(dateofbirth)==-1){
                        System.out.print("DOB"+dateofbirth+": cannot be today or future date");
                    }
                    else if (Date.compareDates(today, dateofbirth) < 18){
                        System.out.print("DOB"+dateofbirth+": must be 18 or older to join");
                    }
                    else {
                       member = new Member (firstname, lastname, dateofbirth, expdate, cityname);
                       if (!mlist.add(member)){
                           System.out.println(firstname+" "+lastname+" is already in the database");
                       }
                       else{
                           mlist.add(member);
                           System.out.print(firstname+" "+lastname+" added.");
                       }
                    }


                    break;
                case "R":
                    firstname = user_input[1];
                    lastname = user_input[2];
                    d = user_input[3];
                    dateofbirth = new Date(d);

                    member = new Member(firstname, lastname, dateofbirth, null, null);
                    if (mlist.remove(member)){
                        System.out.print(firstname+" "+lastname+" removed.");
                    }
                    else {
                        System.out.println(firstname+" "+lastname+" is not in the database.");
                    }

                    break;
                case "P":

                    mlist.print();

                    break;
                case "PC":
                    mlist.printByName();

                    break;
                case "PN":
                    mlist.printByName();


                    break;
                case "PD":

                    break;
                case "S":

                    break;

                case "C":

                    break;
                case "D":

                    break;
                case "Q":

                    break;

                default:
                    System.out.println("Invalid command!");
                    break;
            }
        }
    }


}

