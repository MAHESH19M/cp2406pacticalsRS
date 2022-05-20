package exercise2;
import textio.TextIO;

public class EXP4 {
    public static void main(String[] args) {
        int i, input, quarters = 0, dimes = 0, nickels = 0, pennies = 0;
        String[] x = new String[]{"quarters", "dimes", "nickels", "pennies"};
        double dollars;

        for (i=0; i < x.length; i++) {
            System.out.print("Enter the number of " + x[i] + ": ");
            input = TextIO.getlnInt();
            switch (i) {
                case 0:
                    quarters = input;
                case 1:
                    dimes = input;
                case 2:
                    nickels = input;
                case 3:
                    pennies = input;
            }
        }
        dollars = (0.25 * quarters) + (0.10 * dimes) + (0.05 * nickels) + (0.01 * pennies);
        System.out.println();
        System.out.print("The total in dollars is $");
        System.out.printf("%1.2f", dollars);

    }
}
