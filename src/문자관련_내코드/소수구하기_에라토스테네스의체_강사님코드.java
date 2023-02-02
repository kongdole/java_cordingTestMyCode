import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public int solution(int num) {
		int answer = 0;
		int[] arr = new int[num + 1];
		for (int i = 2; i <= num; i++) {
			if (arr[i] == 0) {
				answer++;
				for (int j = i; j <= num; j =j+i) {
					arr[j] = 1;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		long start = System.currentTimeMillis();
		System.out.println(T.solution(num));
		long end = System.currentTimeMillis();
		System.out.println("SDB에서 노드생성까지의 실행시간 : " + (end - start) / 1000.0);
	}
}
