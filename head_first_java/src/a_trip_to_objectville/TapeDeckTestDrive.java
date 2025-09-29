package a_trip_to_objectville;

class TapeDeck {
    boolean canRecord = false;

    void playTape() {
        System.out.println("tape is playing");
    }

    void recordTape() {
        System.out.println("tape is recording");
    }
}

class TapeDeckTestDrive {
    public static void main(String[] args) {
        TapeDeck t = new TapeDeck();
        t.canRecord = true;
        t.playTape();

        if (t.canRecord == true) {
            t.recordTape();
        }
    }
}
