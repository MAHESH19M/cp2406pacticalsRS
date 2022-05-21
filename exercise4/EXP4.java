package exercise4;

public class EXP4 {
    public final static double HAHA = 10_000;  // It's a double...future me!

    public static void main(String[] args) {
        int i;
        double average;

        System.out.println("Total On Dice     Average Number of Rolls");
        System.out.println("-------------     -----------------------");

        for (i=2; i<=12; i++) {
            average = average(i);
            System.out.printf("%10d%22.4f\n", i, average);
        }
    }

    public static double average(int duh) {  // Uff done even smaller in the book... Ugg
        int total, instance, i;

        total = 0;
        for (i=0; i < HAHA; i++) {
            instance = EXP3.rollingPairs(duh);
            total = total + instance;
        }
        double average = total/HAHA;
        return average;
    }
}
