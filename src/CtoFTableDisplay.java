public class CtoFTableDisplay {
    public static void main(String[] args) {
        System.out.println("C | F");
        for(int i = -100; i < 101; i++){
            System.out.printf("%1$d | %2$,.1f\n", i, CtoF(i));
        }
    }

    public static double CtoF(double Celsius){
        return ((Celsius * ((double) 9 / 5)) + 32);
    }
}
