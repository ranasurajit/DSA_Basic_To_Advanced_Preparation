package P01_Basics.P01_Pattern_Printing.P01_Square_Fill_Pattern;

import java.util.Scanner;

public class Square_Fill_Pattern {
    public static void main(String[] args) {
        Square_Fill_Pattern solution = new Square_Fill_Pattern();

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        char ch = scn.nextLine().charAt(0);
        solution.printPattern(n, ch);
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
    private void printPattern(int n, char ch) {
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
