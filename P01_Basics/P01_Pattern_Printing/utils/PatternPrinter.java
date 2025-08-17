package P01_Basics.P01_Pattern_Printing.utils;

public class PatternPrinter {
    public static final String RESET = "\u001B[0m";

    // Regular Colors
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    // Background Colors
    public static final String RED_BACKGROUND = "\u001B[41m";
    public static final String GREEN_BACKGROUND = "\u001B[42m";

    public static void print(int n, char ch, boolean hasSpaceSeparator, String pattern) {
        System.out.println(RESET);
        System.out.println(RED + "Input N : " + n + RESET);
        System.out.println(RED + "Input Character : " + ch + RESET);
        System.out.println(RED + "Input Include Space ? : " + hasSpaceSeparator + RESET);
        System.out.println();
        System.out.println(GREEN + "Output Pattern : " + RESET);
        System.out.println();
        System.out.println(PURPLE + pattern);
    }

    public static void print(int n, boolean hasSpaceSeparator, String pattern) {
        System.out.println(RESET);
        System.out.println(RED + "Input N : " + n + RESET);
        System.out.println(RED + "Input Include Space ? : " + hasSpaceSeparator + RESET);
        System.out.println();
        System.out.println(GREEN + "Output Pattern : " + RESET);
        System.out.println();
        System.out.println(CYAN + pattern);
    }
}
