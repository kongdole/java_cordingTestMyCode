import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public int solution(int[][] a, int num) {
		int answer = 0;
		int cnt;
		for (int i = 1; i < num + 1; i++) {
			for (int j = 1; j < num + 1; j++) {
				cnt = 0;
				if (a[i][j] > a[i][j - 1]&& a[i][j] > a[i][j + 1] && a[i][j] > a[i - 1][j] && a[i][j] > a[i + 1][j]) {
					cnt++;
				}
				if (cnt == 1) {
					answer++;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[][] arr = new int[num + 2][num + 2];

		StringTokenizer st;

		for (int i = 1; i < num + 1; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j < num + 1; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		System.out.println(T.solution(arr, num));
	}

};