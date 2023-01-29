import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public String solution(String str) {

		String answer = "";
		str = str.toUpperCase();
		char[] a = str.toCharArray();
		int cnt = 1;
		char temp = '#';
		String save = "";

		for (int i = 0; i < str.length(); i++) {
			if (temp == '#') {
				temp = a[i];
				save += String.valueOf(a[i]);
			} else if (temp != a[i]) {
				temp = a[i];
				if (cnt != 1) {
					save += String.valueOf(cnt);
				}
				save += String.valueOf(a[i]);
				cnt = 1;
			} else {
				cnt++;
			}
		}
		answer = save;
		return answer;
	}

	public static void main(String args[]) throws IOException {

		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(T.solution(str));

	}

}