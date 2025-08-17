package P01_Basics.P01_Pattern_Printing.P03_Number_Increasing_Pyramid_Pattern;

import java.util.Scanner;

import P01_Basics.P01_Pattern_Printing.utils.PatternPrinter;

public class Number_Increasing_Pyramid_Pattern {
    public static void main(String[] args) {
        Number_Increasing_Pyramid_Pattern solution = new Number_Increasing_Pyramid_Pattern();

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        boolean hasSpaceSeparator = scn.nextBoolean();

        String pattern = solution.printPattern(n, hasSpaceSeparator);
        PatternPrinter.print(n, hasSpaceSeparator, pattern);

        scn.close();
    }

    private String printPattern(int n, boolean hasSpaceSeparator) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append(j);
                if (hasSpaceSeparator) {
                    sb.append(' ');
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
