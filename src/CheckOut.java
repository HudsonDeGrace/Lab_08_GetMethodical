import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        do{
            double item = SafeInput.getRangedDouble(in, "What is the price of your item", 0.50, 10.00);
            sum = item + sum;
            in.nextLine();
        }while(SafeInput.getYNConfirm(in, "Do you have more items"));

        System.out.printf("\nThe total cost of your items is %.2f",sum);
    }
}
