package P01_Basics.P01_Pattern_Printing.P01_Square_Fill_Pattern;

import java.util.Scanner;

import P01_Basics.P01_Pattern_Printing.utils.PatternPrinter;

public class Square_Fill_Pattern {
    public static void main(String[] args) {
        Square_Fill_Pattern solution = new Square_Fill_Pattern();

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
     * # # # # #
     * # # # # #
     * # # # # #
     * # # # # #
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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(ch);
                if (hasSpaceSeparator) {
                    sb.append(' ');
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
