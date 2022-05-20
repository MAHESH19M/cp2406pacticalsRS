package exercise2;
import textio.TextIO;

public class EXP5 {
    public static void main(String[] args) {
        int egg, groos, dozen, extra, extraG;

        System.out.print("Enter number of eggs: ");
        egg = TextIO.getlnInt();

        groos = egg/144;
        extraG = egg%144;

        dozen = extraG/12;
        extra = extraG%12;

        System.out.printf("Your number of eggs is %d groos, %d dozen and %d extra eggs.%n", groos, dozen, extra);  // %n is next line.
    }
}
