import java.util.Scanner;

public class SimpleGame {



	public String convertTime(int seconds){
		int m,h;
		String mS, hS, sS;

		if(seconds < 0){
			return "-1:-1:-1";
		}
		else if(seconds >= 3600){
			h=seconds/3600;
		}else{
			h=0;
		}
		seconds -= (3600*h);
		if(seconds >= 60){
			m=seconds/60;
		}else{
			m=0;
		}
		seconds -= (60*m);

		mS = Integer.toString(m);
		hS = Integer.toString(h);
		sS = Integer.toString(seconds);

		return hS + ":" + mS + ":" + sS;
	}

	public int digitsSum(int input){
		int sum=0;
		String S = Integer.toString(input);
		int nbrDigits = S.length();

		for (int i = 0; i < nbrDigits; i++) {
			int digit = input % 10;
			sum += digit;
			input = input / 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
        // Create an instance of the SimpleGame class.
		SimpleGame game = new SimpleGame();

		Scanner sc = new Scanner(System.in);

        // Ask the user which game to play.
        System.out.println("Quel jeu souhaitez vous jouer 1 ou 2 :");
        int choice;
        do {
            choice = sc.nextInt();
        }while (choice > 2 || choice < 1);
		if (choice == 1) {
			System.out.println(game.convertTime(86399));
			System.out.println(game.convertTime(1432));
			System.out.println(game.convertTime(-1));
			System.out.println(game.convertTime(0));
			System.out.println(game.convertTime(10000));
		} else {
			System.out.println(game.digitsSum(2394));
			System.out.println(game.digitsSum(565));
			System.out.println(game.digitsSum(7));
			System.out.println(game.digitsSum(0));
		}

        sc.close();
    }
}