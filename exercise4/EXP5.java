package exercise4;

public class EXP5 {
    // Calculate the sum of al the values in the array.
    public static final ArrayProcessor sum_er = array -> {
        int i;
        double total;

        total = 0;
        for (i=0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    } ;  // The semicolon is not part of the lambda expression; it marks the end of the assignment statement.

    // Calculate the average of all the valued in the array;
    public static final ArrayProcessor average = array -> sum_er.apply(array)/array.length;

    // Count the number of times a value is repeated in an array.
    public static ArrayProcessor counter (double value) {
        return array -> {
            int count, i;

            count = 0;
            for (i=0; i < array.length; i++) {
                if (array[i] == value)
                    count++;
            }
            return count;
        } ;
    }

    // Find the biggest number in an array.
    public static final ArrayProcessor max_er = array -> {
        int i;
        double max;

        max = array[0];
        for (i=0; i<array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    } ;

    // Find the smallest number in an array.
    public static final ArrayProcessor min_er = array -> {
        int i;
        double min;

        min = array[0];
        for (i=0; i<array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    } ;

    // Main program and test all the stuff...hmmm lambda stuff uoo
    public static void main(String[] args) {
        double[] firstList = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        double[] secondList = { 17.0, 3.14, 17.0, -3.4, 17.0, 42.0, 29.2, 3.14 };

        System.out.println("The sum of firstList should be 55: " + sum_er.apply(firstList));
        System.out.println("The average of firstList should be 5.5: " + average.apply(firstList));
        System.out.println("The smallest value of secondList should be -3.4: " + min_er.apply(secondList));
        System.out.println("The biggest value of secondList should be 42.0: " + max_er.apply(secondList));

        System.out.println();  // Copy & past most of the tests.
        System.out.println("Count of 17.0 in second list should be 3: " + counter(17.0).apply(secondList));
        System.out.println("Count of 20.0 in second list should be 0: " + counter(20.0).apply(secondList));
        System.out.println("Count of 5.0 in first list should be 1: " + counter(5.0).apply(firstList));
    }


}