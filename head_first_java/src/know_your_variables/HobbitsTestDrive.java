package know_your_variables;

class Hobbits {
    String name;
}

public class HobbitsTestDrive {
    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        int z = -1;

        while (z < 2) {
            z = z + 1;
            h[z] = new Hobbits();

            if (z == 0) {
                h[z].name = "Bilbo";
            } else if (z == 1) {
                h[z].name = "Frodo";
            } else if (z == 2) {
                h[z].name = "Sam";
            }

            System.out.print(h[z].name + " - ");
            System.out.println("a good hobbit name");
        }
    }
}