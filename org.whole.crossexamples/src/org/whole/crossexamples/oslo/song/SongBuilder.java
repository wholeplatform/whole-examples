package org.whole.crossexamples.oslo.song;

import javax.sound.midi.*;

public class SongBuilder {
	private Sequence sequence;
	private Track track;
	int timeTicks = 0;
	public int noteLenght = 16;
	
	public void play() throws MidiUnavailableException, InvalidMidiDataException {
		final int tempo = 120;
		
        final Sequencer sequencer = MidiSystem.getSequencer( );
        sequencer.open();  
        Synthesizer synthesizer = MidiSystem.getSynthesizer( );
        synthesizer.open();
        sequencer.getTransmitter().setReceiver(synthesizer.getReceiver());

        sequencer.setSequence(getSequence());
        sequencer.setTempoInBPM(tempo);
        sequencer.start();
        sequencer.addMetaEventListener(new MetaEventListener( ) {
            public void meta(MetaMessage m) {
                if (m.getType() == 47) {
                	sequencer.close();
                }
            }
        });
	}

	protected Sequence getSequence() throws InvalidMidiDataException {
		if (sequence == null)
			sequence = createSequence();
		return sequence;
	}
	protected Sequence createSequence() throws InvalidMidiDataException {
		return new Sequence(Sequence.PPQ, 16);
	}

    public void buildTrack() throws InvalidMidiDataException {
    	buildTrack(0);
    }
    public void buildTrack(int strumento) throws InvalidMidiDataException {
		track = getSequence().createTrack( );

		ShortMessage message = new ShortMessage();
		message.setMessage(ShortMessage.PROGRAM_CHANGE, 0, strumento, 0);
		track.add(new MidiEvent(message, 0));
	}

	public void buildRest() {
		timeTicks += noteLenght;	
	}
	public void buildNote(String note) throws InvalidMidiDataException {
		final int baseKey = 60;
		final int speed = 64; 

		int key = baseKey + offsets[note.charAt(0)  - 'A'];
		if (note.endsWith("b"))
			key--; 
		else if (note.endsWith("#"))
			key++;

		buildNote(timeTicks, noteLenght, key, speed);
		timeTicks += noteLenght;	

	}
    private static final int[] offsets = {
        // A   B  C  D  E  F  G
          -4, -2, 0, 1, 3, 5, 7  
    };

	protected void buildNote(int startTick, int tickLenght, int key, int speed) throws InvalidMidiDataException {
		ShortMessage on = new ShortMessage();
		on.setMessage(ShortMessage.NOTE_ON,  0, key, speed);
		ShortMessage off = new ShortMessage();
		off.setMessage(ShortMessage.NOTE_OFF, 0, key, speed);
		track.add(new MidiEvent(on, startTick));
		track.add(new MidiEvent(off, startTick + tickLenght));
	}
	
	public static void main(String[] args) throws InvalidMidiDataException, MidiUnavailableException {
		SongBuilder b = new SongBuilder();
		b.buildTrack();
		b.buildNote("C");
		b.buildNote("D");
		b.buildNote("E");
		b.play();
	}
}
