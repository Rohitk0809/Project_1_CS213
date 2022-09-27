import java.util.Scanner;
import java.util.StringTokenizer;

public class GymManager {
    public void run(){

        Scanner userin = new Scanner(System.in);
        String[] user_input = new String[5];
        String command = null;

        String request, name, dateofbirth, expdate, cityname;
        String string_genre = "null";

        Member member = null;
        Member mlist = new Member();
        int z = 0;

        System.out.println("Collection Manager starts running.");

        while (0 < 1) {
            String cmd = userin.nextLine();
            user_input = cmd.split(",");
            command = user_input[0];

            switch (command) {
                case "A":
                    
                    break;
                case "R":


                    break;
                case "P":


                    break;
                case "PC":

                    break;
                case "PN":

                    break;
                case "PD":

                    break;
                case "S":

                    break;

                default:
                    System.out.println("Invalid command!");
                    break;
            }
        }
    }


}
