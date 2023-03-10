import java.util.Scanner;

public class Main {

	public String solution(String str) {

		String answer;
		String str2 = str.toUpperCase();
		int lt = 0, rt = str2.length() - 1;
		char[] a = str2.toCharArray();
		int cnt = 0;
		
		while (lt < rt) {
			if (a[lt] != a[rt]) {
				cnt++;
				lt++;
				rt--;
			} else {
				lt++;
				rt--;
			}
		}

		if (cnt == 0) {
			answer = "yes";
		}else {
			answer="no";
		}
		
		return answer;
	}

	public static void main(String args[]) {

		Main T = new Main();

		Scanner kb = new Scanner(System.in);
		String str = kb.next();

		System.out.println(T.solution(str));

	}

}
