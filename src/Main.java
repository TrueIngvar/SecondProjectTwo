public class Main {
    public static void main(String[] args) {
        int fsum = 100;
        int addSum = 1100;
        int toPlusToS = 100;
        int eq = addSum/toPlusToS;
        if (addSum >= 1000) {
            System.out.println(fsum + addSum + eq);
        } else {
            System.out.println(fsum + addSum);
        }
    }
}