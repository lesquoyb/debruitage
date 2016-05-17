import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {

	public static void main(String... args) {
		if (args.length != 1) {
			System.out.println("Usage : SoundSignal <file.wav>");
		System.exit(-1);
	}
	try {
		SoundSignal signal = new SoundSignal();

		signal.setSignal(args[0]);

		System.out.println("Length of the signal (in sample) : "+ signal.getSignalLength());
		System.out.println("Sampling frequency : " + signal.getSamplingFrequency());
		System.out.println("Length of the signal (in ms) : "+ signal.getSignalLength() * 1000 / signal.getSamplingFrequency());

		for(int alpha = 0 ; alpha < 5 ; alpha++){
			for(int beta = 0 ; beta < 5 ; beta++){
				for(double gamma = 0.25 ; gamma < 1 ; gamma+=0.25){
					signal.setSignal(args[0]);
					signal.debruitage(alpha, beta, gamma);
					signal.exportSignal("output/A"+alpha+"B"+beta+"G"+gamma+".wav", true);

				}
			}
		}
		

	} catch (IOException e) {
		System.err.println("error cannot read file <" + args[0] + ">");

	} catch (UnsupportedAudioFileException e) {
		System.err.println("error bad sound file <" + args[0] + ">");
	}

	}

}
