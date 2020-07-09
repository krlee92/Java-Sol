import java.util.Random;

public class Computer {
	Random brain = new Random();

	public void start(Player p) {
		int gameAns = think();
		System.out.println(gameAns);
		int playerAns = 0;
		int turn = 0;
		String result = null;
		for (turn = 1; true; turn++) {
			playerAns = ask(p);
			result = judge(gameAns, playerAns);
			tellResult(result);
			if (result.equals("정답")) {
				break;
			}
		}
		bye(turn);
	}
	
	public void tellResult(String result) {
		System.out.println(result);
	}

	public int think() {
		return brain.nextInt(10000) + 1;
	}

	public int ask(Player p) {
		System.out.print("뭐 : ");
		return p.tell();
	}
	

	public String judge(int gameAns, int playerAns) {
		if (gameAns == playerAns) {
			return "정답";
		} else if (gameAns > playerAns) {
			return "UP";
		} 
		return "DOWN";
	}
	
	public void bye(int turn) {
		System.out.printf("%d턴만에 정답", turn);
		
	}

}
