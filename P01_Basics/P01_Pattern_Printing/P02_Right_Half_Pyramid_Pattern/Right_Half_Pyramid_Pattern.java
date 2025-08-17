package P01_Basics.P01_Pattern_Printing.P02_Right_Half_Pyramid_Pattern;

import java.util.Scanner;

import P01_Basics.P01_Pattern_Printing.utils.PatternPrinter;

public class Right_Half_Pyramid_Pattern {
    public static void main(String[] args) {
        Right_Half_Pyramid_Pattern solution = new Right_Half_Pyramid_Pattern();

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        char ch = scn.nextLine().charAt(0);
        boolean hasSpaceSeparator = scn.nextBoolean();

        String pattern = solution.printPattern(n, ch, hasSpaceSeparator);
        PatternPrinter.print(n, ch, hasSpaceSeparator, pattern);

        scn.close();
    }

    /**
     * Pattern needed:
     * 
     * #
     * # #
     * # # #
     * # # # #
     * # # # # #
     * 
     * TC: O(N x N)
     * SC: O(1)
     * 
     * @param n
     * @param ch
     */
    private String printPattern(int n, char ch, boolean hasSpaceSeparator) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append(ch);
                if (hasSpaceSeparator) {
                    sb.append(' ');
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
