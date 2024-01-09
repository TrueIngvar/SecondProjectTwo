public class Main {
    public static void main(String[] args) {
        int firstSum = 100;
        int addSum = 1000;
        int divideAddSum = 100;
        int addToAllSum = addSum / divideAddSum;
        if (addSum >= 1000) {
            System.out.println(firstSum + addSum + addToAllSum);
        } else {
            System.out.println(firstSum + addSum);
        }
    }
}