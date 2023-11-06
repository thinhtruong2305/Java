package Game;

import java.util.Scanner;

public class GameLauncher {
	static boolean restart = true;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		GuessGame guessGame = new GuessGame();
		while (restart) {
			guessGame.startGame();
			System.out.println("		Bạn có muốn chơi lại không");
			System.out.println("	Chơi lại 					Không");
			System.out.println("Nhập lựa chọn của bạn: ");
			String str = sc.nextLine();
			if(str.equalsIgnoreCase("Chơi lại")) {
				restart = true;
			}else {
			restart = false;
			System.out.println("Tạm biệt người chơi");
			}
		}
	}
}
