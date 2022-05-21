package exercise4;

public class EXP3 {
    public static void main(String[] args) {
        System.out.println("It took " + rollingPairs(7) + " rolls to get snake eyes 🎲 🎲");  // A little imagination and LMAO! 😆
    }

    public static int rollingPairs(int bruh) {
        int die1, die2, total, instances;

        if ( bruh < 2 || bruh > 12)
            throw new IllegalArgumentException(" 😒 bruh impossible to roll that pair");  // he he heee

        instances = 0;
        do {
            die1 = (int) (6*Math.random()) + 1;  // Uff
            die2 = (int) (6*Math.random()) + 1;  // Uff Uff
            total = die1+die2;                   // Ouuffff
            instances ++;
        } while (total != bruh);

        return instances;  // bruhhh
    }
}
