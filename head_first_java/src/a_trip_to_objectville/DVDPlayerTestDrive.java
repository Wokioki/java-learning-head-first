package a_trip_to_objectville;

class DVDPlayer {
    boolean canRecord = false;

    void recordDVD() {
        System.out.println("DVD is recording");
    }

    void playDVD() {
        System.out.println("DVD is playing");
    }
}

class DVDPlayerTestDrive {
    public static void main(String[] args) {
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        d.playDVD();

        if (d.canRecord == true) {
            d.recordDVD();
        }
    }
}
