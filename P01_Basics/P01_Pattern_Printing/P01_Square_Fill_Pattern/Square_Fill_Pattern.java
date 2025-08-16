package P01_Basics.P01_Pattern_Printing.P01_Square_Fill_Pattern;

public class Square_Fill_Pattern {
    public static void main(String[] args) {
        Square_Fill_Pattern solution = new Square_Fill_Pattern();

        int n = 5;
        char ch = '*';
        solution.printPattern(n, ch);
    }

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
