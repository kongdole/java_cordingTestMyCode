import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public String solution(String str) {

		String answer="";

		str =str.replaceAll("#","1");
		str =str.replaceAll("\\*", "0");

		System.out.println(str);

		String[] strArr = new String[str.length() / 7];
		
		for(int i=0; i<(str.length()/7); i++) {
			strArr[i]="";
		}
		
		for (int i = 0; i < str.length(); i++) {
			strArr[i / 7] += str.charAt(i);
		}
		for (int i = 0; i < strArr.length; i++) {
			int num = 0;

			for (int j = 0; j < 7; j++) {
				
				if (strArr[i].charAt(j) == '1') {
					num += Math.pow(2, 6 - j);
				}
				if (j == 6) {
					answer += String.valueOf((char) num);
				}
			}
		}

		return answer;
	}

	public static void main(String args[]) throws IOException {

		Main T = new Main();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		System.out.println(T.solution(str));

	}

}