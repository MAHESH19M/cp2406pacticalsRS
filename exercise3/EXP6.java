package exercise3;

import textio.TextIO;

public class EXP6 {
    // TODO: Make the code more user readable... Uggg WHY!
    public static void main(String[] args) {
        int maxDivisors=1, numWithMax=1, i, d, n;
        int allNumWMaxD[] = new int[10_001];
        allNumWMaxD[1] = 1;

        for (i=2; i<10_000; i++) {
            int divisorsCount = 0;
            for (d=1; d<=i; d++) {
                if (i%d == 0) {
                    divisorsCount++;
                }
            allNumWMaxD[i] = divisorsCount;

            if (divisorsCount > maxDivisors) {
                maxDivisors = divisorsCount;

            }
            }
        }

        System.out.printf(" Among integers between 1 and 10000, %n The maximum number of divisors is: %s%n A number with %s divisors is %s",maxDivisors, maxDivisors, numWithMax);

        System.out.println("");
        System.out.println("Numbers with that many divisors include:");
        for (n=1; n<=10_000; n++) {  // Remember to check your numbers
            if (allNumWMaxD[n] == maxDivisors) {
                System.out.println("   " + n);
            }
        }
    }
}