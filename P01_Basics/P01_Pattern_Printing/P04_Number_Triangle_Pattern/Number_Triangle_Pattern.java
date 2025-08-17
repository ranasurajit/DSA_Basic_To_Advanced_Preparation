package P01_Basics.P01_Pattern_Printing.P04_Number_Triangle_Pattern;

import java.util.Scanner;

import P01_Basics.P01_Pattern_Printing.utils.PatternPrinter;

public class Number_Triangle_Pattern {
    public static void main(String[] args) {
        Number_Triangle_Pattern solution = new Number_Triangle_Pattern();

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        String pattern = solution.printPattern(n);
        PatternPrinter.print(n, pattern);

        scn.close();
    }

    /**
     * Pattern needed:
     * 
     *    1
     *   2 2
     *  3 3 3
     * 4 4 4 4
     * 
     * TC: O(N x N)
     * SC: O(1)
     * 
     * @param n
     * @param ch
     */
    private String printPattern(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                sb.append(' ');
            }
            for (int j = 1; j <= i; j++) {
                sb.append(i).append(' ');
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
