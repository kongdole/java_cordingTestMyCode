package 문자관련_내코드;
import java.util.Scanner;

public class Main {

	public String solution(String str) {

		String answer = String.valueOf(str.charAt(0));

		for (int i = 0; i < str.length(); i++) {

			int cnt = 0;
			for (int j = 0; j < answer.length(); j++) {
				if (str.charAt(i) == answer.charAt(j)) {
					cnt++;
				}
			}
			if (cnt == 0) {
				answer = answer + String.valueOf(str.charAt(i));
			}

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
