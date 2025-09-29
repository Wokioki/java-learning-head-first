package breaking_the_surface;

public class Test {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {
            // Choose one block and uncomment it:

            // Block 1
            // y = x - y;

            // Block 2
            // y = y + x;

            // Block 3
            // y = y + 2;

            // Block 4
            // if (y < 5) {
            //     x = x + 1;
            // }

            // Block 5
            // if (y > 4) {
            //     y = y - 1;
            // }

            y = y + x; // ← default block to test
            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}
