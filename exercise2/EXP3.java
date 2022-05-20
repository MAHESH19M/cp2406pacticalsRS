package exercise2;
import textio.TextIO;

public class EXP3 {
    public static void main(String[] args) {
        String input, output;

        System.out.print("Enter your name: ");
        input = TextIO.getln();

        output = input.toUpperCase();
        System.out.println("Hello " + output + ", nice to meet you!");

    }
}
