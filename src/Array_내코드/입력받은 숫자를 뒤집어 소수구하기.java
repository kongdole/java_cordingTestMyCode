import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public ArrayList<Integer> solution(String[] a, int num) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> answer = new ArrayList<>();
		char temp = 'a';

		for (int i = 0; i < num; i++) {
			char[] b = new char[a[i].length()];
			b = a[i].toCharArray();
			int lt = 0;
			int rt = b.length - 1;
			while (lt < rt) {
				temp = b[lt];
				b[lt] = b[rt];
				b[rt] = temp;
				System.out.println("lt" + lt);
				System.out.println("rt" + rt);
				lt++;
				rt--;
				System.out.println("lt" + lt);
				System.out.println("rt" + rt);
			}
			System.out.println(String.valueOf(b));
			list.add(Integer.parseInt(String.valueOf(b)));
		}
		for (int j = 0; j < list.size(); j++) {
			int cnt = 0;
			for (int k = 1; k < list.get(j); k++) {
				if (list.get(j) % k == 0) {
					cnt++;
				}
			}
			if (cnt == 1) {
				answer.add(list.get(j));
			}
		}

		return answer;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		String str = br.readLine();
		String[] a = str.split(" ");

		for (Integer x : T.solution(a, num)) {
			System.out.print(x + " ");
		}
	}

}
