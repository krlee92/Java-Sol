import java.util.Random;
//랜덤 짝수를 뽑기 - 기존의 랜덤에 기능추가
public class RandomMachine extends Random{ // 랜덤기능 확장
	
	@Override
	public int nextInt(int bound) {
		int n = super.nextInt(bound);
		return (n % 2 == 0) ? n: nextInt(bound);
	}

}
