package DailyCodingProblem.Day2;

public class Day2 {
    public static void main(String[] args) {
        // Make a new array of the numbers that has the product of all numbers in the array, apart from the one at the index currently looked at.

        int[] list = {3, 2, 1};
        int[] sol = product(list);
        for (int num: sol) {
            System.out.print(num + " ");
        }
    }

    private static int[] product(int[] list) {
        int[] productsList = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            // Multiply all the numbers in the list, but then divide it by the number at i.
            productsList[i] = multiplyAllNums(list) / list[i];
        }
        return productsList;
    } 

    private static int multiplyAllNums(int[] list) {
        int product = 1;
        for (int num: list) {
            product = product * num;
        }
        return product;
    }
}
