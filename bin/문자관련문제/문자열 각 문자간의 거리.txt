import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public int[] solution(String str, char ch) {

		int[] answer = new int[str.length()];
		int[] left = new int[str.length()];
		int[] right = new int[str.length()];

		char[] carr = str.toCharArray();
		int cnt = 1000;
		int cnt2 = 1000;

		for (int i = 0; i < str.length(); i++) {
			if (carr[i] != ch) {
				cnt++;
			} else {
				cnt = 0;
			}
			left[i] = cnt;
		}
		for (int i = 0; i < str.length(); i++) {
			if (carr[str.length() - i - 1] != ch) {
				cnt2++;
			} else {
				cnt2 = 0;
			}
			right[str.length()-i-1] = cnt2;
		}
		for (int i = 0; i < str.length(); i++) {
			if (left[i] >= right[i]) {
				answer[i] = right[i];
			} else {
				answer[i] = left[i];
			}
		}
		
//		System.out.println("left");
//		for (int i = 0; i < str.length(); i++) {
//			System.out.print(left[i]+" ");
//		}
//		System.out.println();
//		System.out.println("right");
//		for (int i = 0; i < str.length(); i++) {
//			System.out.print(right[i]+" ");
//		}

		return answer;
	}

	public static void main(String args[]) throws IOException {

		Main T = new Main();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String str=st.nextToken();
		char ch=st.nextToken().charAt(0);
		
//		String brstr = br.readLine();
//		String strarr[]=brstr.split(" ");
//		String str=strarr[0];
//		char ch=strarr[1].charAt(0);
		
		for(int i=0; i<str.length(); i++) {
			System.out.print(T.solution(str, ch)[i]+" ");
		}		
	}

}