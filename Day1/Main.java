package DailyCodingProblem.Day1;

public class Main {
    public static void main(String[] args) {
        
        // Loop through a given list and find if it adds up to k.

        System.out.println(elementsAddUpToK(17, new int[] {10, 15, 3, 7}));

    }

    private static boolean elementsAddUpToK(int k, int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = (i + 1); j < list.length; j++) {
                if (list[i] + list[j] == k) {
                    return true;
                }
            }
        }
        return false;
    }
}