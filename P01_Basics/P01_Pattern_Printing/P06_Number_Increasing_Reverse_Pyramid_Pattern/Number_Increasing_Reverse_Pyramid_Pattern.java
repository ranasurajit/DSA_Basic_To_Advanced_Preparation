package P01_Basics.P01_Pattern_Printing.P06_Number_Increasing_Reverse_Pyramid_Pattern;

import java.util.Scanner;

import P01_Basics.P01_Pattern_Printing.utils.PatternPrinter;

public class Number_Increasing_Reverse_Pyramid_Pattern {
    public static void main(String[] args) {
        Number_Increasing_Reverse_Pyramid_Pattern solution = new Number_Increasing_Reverse_Pyramid_Pattern();

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        boolean hasSpaceSeparator = scn.nextBoolean();

        String pattern = solution.printPattern(n, hasSpaceSeparator);
        PatternPrinter.print(n, hasSpaceSeparator, pattern);

        scn.close();
    }

    /**
     * Pattern needed:
     * 
     * 1 2 3 4 5
     * 1 2 3 4
     * 1 2 3
     * 1 2
     * 1
     *
     * TC: O(N x N)
     * SC: O(1)
     * 
     * @param n
     * @param ch
     */
    private String printPattern(int n, boolean hasSpaceSeparator) {
        StringBuilder sb = new StringBuilder();
        for (int i = n; i >= 1; i--) { // TC: O(N)
            for (int j = 1; j <= i; j++) { // TC: O(N)
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
