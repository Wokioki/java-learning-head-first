package risky_behavior;

import javax.sound.midi.*;

public class MusicTest1 {

    public void play() {

        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("We got a synthesizer");
        } catch (MidiUnavailableException e) {
            System.out.println("Failure");
        }
    }

    public static void main(String[] args){
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}
