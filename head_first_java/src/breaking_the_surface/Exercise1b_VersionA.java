package breaking_the_surface;

public class Exercise1b_VersionA {
    public static void main(String[] args) {
        int x = 1;
        while (x < 10) {
            x = x + 1;
            if (x > 3) {
                System.out.println("Big X");
            }
        }
    }
}