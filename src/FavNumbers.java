import java.util.Scanner;
public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int favInt = SafeInput.getInt(in, "What is your favorite integer");
        double favDouble = SafeInput.getDouble(in, "What is your favorite double");

        System.out.println("\nYour favorite integer is " + favInt + " and your favorite double is " + favDouble + "!");
    }
}
