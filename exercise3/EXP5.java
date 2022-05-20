package exercise3;

import textio.TextIO;

public class EXP5 {
    public static void main(String[] args) {
        int missingCount;
        double totalSales;

        try {
            TextIO.readFile("src/exercise3/sales.dat");
        } catch (IllegalArgumentException e) {
            System.out.printf("Can't open file \"sales.dat\" for reading!%nPlease make sure the file is present before nrunning the program.");
            System.exit(1);  // Terminates the program.
        }

        totalSales = 0.0;
        missingCount = 0;
        while (TextIO.eof() == false) {
            double sales;
            String line;
            String[] parts;

            line = TextIO.getln();
            parts = line.split(":");

            try {
                sales = Double.parseDouble(parts[1]);
                totalSales = totalSales + sales;
            } catch (NumberFormatException e) {
                missingCount++;
            }
        }

        System.out.printf("Total sales recorded from all cities: $%1.2f\n\n", totalSales);
        switch (missingCount) {
            case 0:
                System.out.println("Data was received from all cities.");
                break;
            case 1:
                System.out.println("Data was missing from 1 city.");
                break;
            default:
                System.out.println("Data was received from all cities.");
        }


    }
}
