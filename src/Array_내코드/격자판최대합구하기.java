import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public int solution(int[][] arr, int num) {
		int answer = 0;

		ArrayList<Integer> temp = new ArrayList<>();
		int cnt3 = 0;
		int cnt4 = 0;
		for (int i = 0; i < num; i++) {
			int cnt1 = 0;
			int cnt2 = 0;

			for (int j = 0; j < num; j++) {
				cnt1 += arr[i][j];
				cnt2 += arr[j][i];
			}
			if (cnt1 >= cnt2) {
				temp.add(cnt1);
			} else {
				temp.add(cnt2);
			}
			cnt3 += arr[i][i];
			cnt4 += arr[i][4 - i];

		}
		temp.add(cnt3);
		temp.add(cnt4);

		for (int i = 0; i < temp.size() - 1; i++) {
			if (temp.get(i) > temp.get(i + 1)) {
				answer = temp.get(i);
			} else {
				answer = temp.get(i + 1);
			}
		}
		return answer;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int num = Integer.parseInt(br.readLine());
		int[][] arr = new int[num][num];
		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < num; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		System.out.println(T.solution(arr, num));
	}

};