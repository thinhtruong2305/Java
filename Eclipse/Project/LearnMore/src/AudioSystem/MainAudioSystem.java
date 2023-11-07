package AudioSystem;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;


public class MainAudioSystem {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			File file = new File("Nightcore - Royalty -- Lyrics (online-audio-converter.com).wav");
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
			Clip clip = AudioSystem.getClip();
			clip.open(audioStream);
			String response = "";
			while(!response.equalsIgnoreCase("Q")) {
				System.out.println("P = play, S = stop, R = restart, Q = quit");
				response = sc.next();
				switch(response) {
				case("P"):clip.start();break;
				case("S"):clip.stop();break;
				case("R"):clip.setMicrosecondPosition(0);break;
				case("Q"):clip.close();break;
				default:System.out.println("not a valid response");
				}
			}
		}
	}

}
