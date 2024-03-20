import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



       String ssNumber = safeinput.getRegExString(in,"Enter SS Number", "\\d{3}-\\d{2}-\\d{4}");


        System.out.println(ssNumber);

    }
}
