import java.util.Scanner;

public class checkout {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0;
        boolean input = false;
        do {

            double doubA = safeinput.getDoubleRange(in, "what is the price of the item", 0.5, 9.99);
            total = doubA + total;
            input = safeinput.getYN(in,"are you done?");

        }while(input == false);

        System.out.println("your total is "+total);
    }


}
