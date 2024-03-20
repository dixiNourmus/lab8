import java.util.Scanner;

public class birthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //year
        int intY = safeinput.getIntRange(in,"give me your birthdate year",1950,2010);
        //month
        int intM = safeinput.getIntRange(in,"give me your birthdate month",1,12);
        int day;
        switch (intM){
            case 9:
                day = safeinput.getIntRange(in,"give me your birthdate day",1,30);
                break;
            case 4:
                day = safeinput.getIntRange(in,"give me your birthdate day",1,30);
                break;

            case 6:
                day = safeinput.getIntRange(in,"give me your birthdate day",1,30);
                break;

            case 11:
                day = safeinput.getIntRange(in,"give me your birthdate day",1,30);
                break;
            case 2:
                day = safeinput.getIntRange(in,"give me your birthdate day",1,28);
                break;

            default:
                day = safeinput.getIntRange(in,"give me your birthdate day",1,31);
                break;
        }
        int hour = safeinput.getIntRange(in,"give me the hour",1,24);
        int min = safeinput.getIntRange(in,"give me the min",1,59);
        System.out.println("you were born "+intY + "/" + intM + "/" + day + " " + hour + ":"+ min);

    }
}
