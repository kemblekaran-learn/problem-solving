public class PatternCreator {
    public static void main(String[] args) {

        // Prints pattern of x * y matrix
        // printPattern(new Pattern<String>("*"), 4, 4);
        // printPattern(new Pattern<String>("<>"), 5, 5);
        // printPattern(new Pattern<String>("@"), 3, 3);
        // printPattern(new Pattern<String>("%"), 10, 8);

        // printPattern(new Pattern<Integer>(1), 3, 3);

        // printRightAngledTrialnglePattern(10);

        // printInvertedPyramid(5);

        // printPyramidPattern(5);

        printDiamondPattern(5);
    }

    /**
     * Prints a pattern in a grid format with the specified number of rows and
     * columns.
     *
     * @param pattern The pattern object containing the type of element to print.
     * @param rows    The number of rows in the grid.
     * @param column  The number of columns in the grid.
     * @param <T>     The type of the pattern element.
     */
    private static <T> void printPattern(Pattern<T> pattern, int rows, int column) {

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < column; j++) {
                System.out.print(String.format("%s ", pattern.getType()));
            }

            System.out.println();
        }

        System.out.println("=".repeat(50));
    }

    /**
     * Prints a right-angled triangle pattern of asterisks ('*') with the given
     * number of rows.
     * 
     * <p>
     * The method uses nested loops to generate the pattern:
     * <ul>
     * <li>The outer loop iterates from 1 to {@code n}, representing the current row
     * number.</li>
     * <li>The inner loop iterates from 1 to the current row number, printing an
     * asterisk ('*')
     * followed by a space for each iteration.</li>
     * <li>After completing the inner loop for a row, a newline character is printed
     * to move to the next row.</li>
     * </ul>
     * 
     * <p>
     * For example, if {@code n = 4}, the output will be:
     * 
     * <pre>
     * * 
     * * * 
     * * * * 
     * * * * *
     * </pre>
     * 
     * @param n the number of rows for the triangle pattern
     *          (must be a positive integer)
     */
    private static void printRightAngledTrialnglePattern(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    /**
     * Prints an inverted pyramid pattern of asterisks ('*') based on the given
     * height.
     * 
     * <p>
     * The method generates an inverted pyramid pattern where the first row contains
     * 'n' asterisks, the second row contains 'n-1' asterisks, and so on, until the
     * last
     * row contains 1 asterisk. Each row's asterisks are separated by a single
     * space.
     * 
     * <p>
     * Logic:
     * - The outer loop starts from 'n' and decrements down to 1, controlling the
     * number
     * of rows in the pyramid.
     * - The inner loop iterates from 1 to the current value of the outer loop
     * variable,
     * printing the required number of asterisks for each row.
     * - After printing all asterisks for a row, a newline character is printed to
     * move
     * to the next row.
     * 
     * @param n the height of the inverted pyramid (number of rows)
     *          Must be a positive integer.
     */
    private static void printInvertedPyramid(int n) {

        for (int i = n; i > 0; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    /**
     * Prints a pyramid pattern of asterisks (*) with the specified number of
     * levels.
     * 
     * <p>
     * The pyramid is constructed such that:
     * <ul>
     * <li>Each level of the pyramid is centered with spaces on the left.</li>
     * <li>The number of asterisks in each level increases by 2, starting from 1 at
     * the top.</li>
     * <li>The total number of levels is determined by the input parameter
     * {@code n}.</li>
     * </ul>
     * 
     * <p>
     * Logic:
     * <ol>
     * <li>Outer loop iterates from 1 to {@code n}, representing the levels of the
     * pyramid.</li>
     * <li>For each level:
     * <ul>
     * <li>First inner loop prints spaces to center the asterisks.</li>
     * <li>Second inner loop prints the required number of asterisks for the current
     * level.</li>
     * </ul>
     * </li>
     * <li>After printing each level, a newline is added to move to the next
     * level.</li>
     * </ol>
     * 
     * @param n The number of levels in the pyramid. Must be a positive integer.
     * 
     * @note This method may not work properly for very large values of {@code n}
     *       due to console width limitations.
     */
    private static void printPyramidPattern(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    private static void printInvertedPyramidPattern(int n) {

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= (n - i) + 1; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    /**
     * Prints a diamond pattern of asterisks (*) for the given size.
     * The pattern consists of a pyramid followed by an inverted pyramid.
     *
     * @param n the number of rows for the top pyramid pattern
     */
    private static void printDiamondPattern(int n) {
        printPyramidPattern(n);
        printInvertedPyramidPattern(n - 1);
    }

    /**
     * A generic class representing a pattern element.
     *
     * @param <T> The type of the pattern element.
     */
    private static class Pattern<T> {
        private T type;

        public Pattern(T type) {
            this.type = type;
        }

        public T getType() {
            return type;
        }
    }
}
