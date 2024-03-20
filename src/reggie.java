import java.util.Scanner;

public class reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



        String ssNumber = safeinput.getRegExString(in,"Enter SS Number", "\\d{3}-\\d{2}-\\d{4}");
        String mNumber = safeinput.getRegExString(in,"what is your M number?","(M|m)\\d{5}");
        String menu = safeinput.getRegExString(in,"what is your choice, open, save, view, quit?","[OoSsVvQq]");


        System.out.println("your ssNumber is " +ssNumber + ", your M number is " + mNumber + ", your choice is " + menu);

    }
}
