package better_living_in_objectville;

public class TestBoats {
    public static void main(String[] args) {
        Boat b1 = new Boat();
        Sailboat b2 = new Sailboat();
        Rowboat b3 = new Rowboat();

        b2.setLength(32);
        b1.move();
        b3.move();
        b2.move();
    }
}

class Boat {
    private int length;

    public void setLength(int len) {
        length = len;
    }

    public int getLength() {
        return length;
    }

    public void move() {
        System.out.print("drift ");
    }
}

class Rowboat extends Boat {
    public void rowTheBoat() {
        System.out.print("Come on Natasha!");
    }

    public void move() {
        System.out.print("drift ");
    }
}

class Sailboat extends Boat {
    public void move() {
        System.out.print("raise sail!");
    }
}