package exercise2;

import textio.TextIO;

public class EXP6 {
    public static void main(String[] args) {
        String input, firstName, lastName;
        int spaceAt;

        System.out.println("Please enter your first name and last name, separated by a space.");
        System.out.print("Name: ");

        // Getting input using TextIO.getWord()
        firstName = TextIO.getWord();
        lastName = TextIO.getWord();

        /* Getting input using space and substring()

        input = TextIO.getln();
        spaceAt = input.indexOf(' ');
        firstName = input.substring(0, spaceAt);
        lastName = input.substring(spaceAt+1);
        */

        System.out.println("Your first name is " + firstName + ", which has " + firstName.length() + " characters");
        System.out.println("Your last name is " + lastName + ", which has " + lastName.length() + " characters");
        System.out.println("Yours initials are " + firstName.charAt(0) + lastName.charAt(0));


    }
}
