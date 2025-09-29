package risky_behavior;

import javax.sound.midi.*;

public class MiniMusicCmdLine {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java MiniMusicCmdLine <instrument 0-127> <note 0-127>");
            return;
        }

        try {
            int instrument = Integer.parseInt(args[0]);
            int note       = Integer.parseInt(args[1]);
            new MiniMusicCmdLine().play(instrument, note);
        } catch (NumberFormatException nfe) {
            System.out.println("Both arguments must be integers (0–127).");
        }
    }

    public void play(int instrument, int note) {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            ShortMessage changeInstrument = new ShortMessage();
            changeInstrument.setMessage(192, 1, instrument, 0);
            track.add(new MidiEvent(changeInstrument, 1));

            ShortMessage noteOn = new ShortMessage();
            noteOn.setMessage(144, 1, note, 100);
            track.add(new MidiEvent(noteOn, 1));


            ShortMessage noteOff = new ShortMessage();
            noteOff.setMessage(128, 1, note, 100);
            track.add(new MidiEvent(noteOff, 16));

            player.setSequence(seq);
            player.start();

            while (player.isRunning()) {
                Thread.sleep(50);
            }
            player.close();

        } catch (MidiUnavailableException | InvalidMidiDataException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}