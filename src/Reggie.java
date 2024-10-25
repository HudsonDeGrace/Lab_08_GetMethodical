import java.util.Scanner;
public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SafeInput.getRegExString(in, "What is your social security number", "^\\d{3}-\\d{2}-\\d{4}$");
        SafeInput.getRegExString(in, "What is your UC Student M number", "^(M|m)\\d{5}$");
        SafeInput.getRegExString(in, "What is your menu choice", "^[OoSsVvQq]$");
    }
}
