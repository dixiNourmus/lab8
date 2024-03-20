import java.util.Scanner;

public class getUserName {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String fname = safeinput.getNonZeroLenString(in, "what is your first name?");
        String lname = safeinput.getNonZeroLenString(in,"what is your last name?");
        System.out.println("your name is "+fname +" "+lname );





    }

}
