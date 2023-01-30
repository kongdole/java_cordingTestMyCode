import java.util.Scanner;

public class Main {
	
	public String solution(String str) {
		
		String answer = " ";
		String arr[] = str.split(" ");
		String a = "";
		int cnt =1;
		
		for(String x : arr) {
			
			System.out.println(cnt+"번째"+"a의 길이"+a.length());
			System.out.println(cnt+"번째"+"x의 길이"+x.length());
			cnt++;

			if(a.length()<x.length()) a=x;
		}
		answer=a;
		return answer;
	}
	
	public static void main(String args[]) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}
}
