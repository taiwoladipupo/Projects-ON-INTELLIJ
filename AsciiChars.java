package App;

public class AsciiChars {


    public static void printNumbers() {
        // TODO: print valid numeric input

        System.out.print("\nThe valid numbers are : ");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
    }

    public static void printLowerCaseLetters() {
        // TODO: print valid lowercase alphabetic input
        System.out.print("\nThe valid lowercase alphebets are : ");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }
    }

    public static void printUpperCaseLetters() {
        // TODO: print valid uppercase alphabetic input

        System.out.print("\nThe valid uppercase alphebets are : ");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
    }

    public static void printLowerCase() {
    }

    public static void printUpperCase() {
    }
}
