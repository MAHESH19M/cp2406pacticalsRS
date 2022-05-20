package exercise3;

import textio.TextIO;

public class EXP4 {
    public static void main(String[] args) {
        String input;
        String words[];
        int i;

        System.out.print("Enter: ");
        input = TextIO.getln();
        input = input.replaceAll("\\s+", " ");  // "\\s+" is passed as regular expression that matches any number of whitespaces and single space (“ “)
        words = input.split(" ");

        for (i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        System.out.printf("%nThe long way...");
        System.out.println(" ");
        System.out.println(" ");
        longWay(input);
    }

    // TODO: Improve program so that it would list "that's" as a single word.
    public static void longWay(String input) {
        int i;
        char ch;
        boolean didCR = false;

        input.strip();
        for (i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                System.out.print(ch);
                didCR = false;
            } else {
                if (didCR == false) {
                    System.out.println();
                }
                didCR = true;
            }
        }
    }


}
