import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = SafeInput.getRangedInt(in, "What year were you born", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "What month were you born", 1, 12);

        switch (month % 2 == 0){
            case true:
                if(month == 2){
                    int day = SafeInput.getRangedInt(in, "What day were you born", 1, 29);
                }else {
                    int day = SafeInput.getRangedInt(in, "What day were you born", 1, 30);
                }
                break;
            case false:
                int day = SafeInput.getRangedInt(in, "What day were you born", 1, 31);
                break;
        }
        int hours = SafeInput.getRangedInt(in, "What hour were you born", 1, 24);
        int minutes = SafeInput.getRangedInt(in, "What minute were you born", 1, 59);


    }

}
