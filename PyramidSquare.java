
public class PyramidSquare {
    public static void main(String[] args) {

        int n = 8;

        // Using for loop to iterate from 1 to 8
        for (int i = 1; i <= n; ++i) {
            // This loop print blank spaces
            for (int j = 1; j <= n - i; ++j) {
                System.out.print("   ");
            }

            /*
             * This loop starts as the value of i decrementes until it reches 1
             * and also in this loop we initilize the a new variable k to 1 and
             * multiplies it by 2 in each iteration. This loop generates a sequence of
             * powers of 2 in reverse order.
             */
            for (int j = i, k = 1; j >= 1; --j, k *= 2) {
                System.out.printf("%3d", k);
            }
            /*
             * This loop starts with 2 and increments by 1 until it value is equvalent to i.
             * This variable k do the same thing as previous loop k which is multiplies it
             * by 2 in each iteration
             * This generates a sequence of powers of 2 in ascending order.
             */
            for (int j = 2, k = 1; j <= i; ++j, k *= 2) {
                System.out.printf("%3d", k);
            }

            // We used this println("\n") to create a new line
            System.out.println("\n");
        }
    }
}