package exercise4;

import textio.TextIO;

public class EXP2 {
    public static void main(String[] args) {
        String input;
        int output, i;
        boolean valid;

        // Get user unput. lol ooin
        System.out.print("Enter hexa.. value: ");
        input = TextIO.getlnWord();

        // Check if input is a valid hex...
        valid = true;
        for (i=0; i<input.length(); i++){
            if (hexValue(input.charAt(i)) == -1) {
                valid = false;
                break;
            }
        }

        // Now the actual conversion. Finally!
        output = 0;
        if (valid) {
            for (i=0; i<input.length(); i++) {
                output = output*16 + hexValue(input.charAt(i));
            }
        } else {
            System.out.println("INCORRECT INPUT: Check your input dumb ass.");  // That's right. SOUT! it's a short cut or something...
        }

        // Output.
        System.out.println("Decimal value: " + output);

    }

    public static int hexValue(char ch) {
        switch (ch) {
            case '0' -> {return 0;}
            case '1' -> {return 1;}
            case '2' -> {return 2;}
            case '3' -> {return 3;}
            case '4' -> {return 4;}
            case '5' -> {return 5;}
            case '6' -> {return 6;}
            case '7' -> {return 7;}
            case '8' -> {return 8;}
            case '9' -> {return 9;}
            case 'A', 'a' -> {return 10;}
            case 'B', 'b' -> {return 11;}
            case 'C', 'c' -> {return 12;}
            case 'D', 'd' -> {return 13;}
            case 'E', 'e' -> {return 14;}
            case 'F', 'f' -> {return 15;}
            default -> {return -1;}
        }
    }


}
