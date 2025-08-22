package P01_Basics.P01_Pattern_Printing.P09_Diamond_Star_Pattern;

import java.util.Scanner;

import P01_Basics.P01_Pattern_Printing.utils.PatternPrinter;

public class Diamond_Star_Pattern {
    public static void main(String[] args) {
        Diamond_Star_Pattern solution = new Diamond_Star_Pattern();

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        char ch = scn.nextLine().charAt(0);

        String pattern = solution.printPattern(n, ch);
        PatternPrinter.print(n, ch, pattern);

        scn.close();
    }

    /**
     * Pattern needed:
     * 
     *          ^ 
     *        ^ ^ ^ 
     *      ^ ^ ^ ^ ^ 
     *    ^ ^ ^ ^ ^ ^ ^ 
     *  ^ ^ ^ ^ ^ ^ ^ ^ ^ 
     *  ^ ^ ^ ^ ^ ^ ^ ^ ^ 
     *    ^ ^ ^ ^ ^ ^ ^ 
     *      ^ ^ ^ ^ ^ 
     *        ^ ^ ^ 
     *          ^
     *
     * TC: O(N x N)
     * SC: O(1)
     * 
     * @param n
     * @param ch
     */
    private String printPattern(int n, char ch) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) { // TC: O(N)
            for (int j = 0; j < n - i; j++) { // TC: O(N)
                sb.append(' ').append(' ');
            }
            for (int j = 0; j < 2 * i + 1; j++) { // TC: O(N)
                sb.append(ch).append(' ');
            }
            sb.append('\n');
        }
        for (int i = 0; i < n; i++) { // TC: O(N)
            for (int j = 0; j < i + 1; j++) { // TC: O(N)
                sb.append(' ').append(' ');
            }
            for (int j = 0; j < 2 * (n - i) - 1; j++) { // TC: O(N)
                sb.append(ch).append(' ');
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
