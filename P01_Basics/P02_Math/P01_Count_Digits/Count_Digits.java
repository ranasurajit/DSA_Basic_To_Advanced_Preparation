package P01_Basics.P02_Math.P01_Count_Digits;

public class Count_Digits {
    public static void main(String[] args) {
        Count_Digits solution = new Count_Digits();

        int n1 = 12;
        int countDigits1 = solution.evenlyDivides(n1);
        System.out.println(countDigits1);

        int n2 = 2446;
        int countDigits2 = solution.evenlyDivides(n2);
        System.out.println(countDigits2);

        int n3 = 23;
        int countDigits3 = solution.evenlyDivides(n3);
        System.out.println(countDigits3);
    }

    /**
     * Approach : Using Math Approach
     * 
     * TC: O(log(N) Base10)
     * SC: O(1)
     */
    private int evenlyDivides(int n) {
        int num = n;
        int count = 0;
        while (num > 0) { // TC: O(log(N) Base10)
            int digit = num % 10;
            if (digit > 0 && n % digit == 0) {
                count++;
            }
            num = num / 10;
        }
        return count;
    }
}
