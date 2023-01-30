package 문자관련_내코드;
import java.util.Scanner;

public class Main {
	public String solution(String str) {


		char[] a = new char[str.length()];
		
		String answer="";
				
		for(int i = 0; i<str.length(); i++) {
			
			if(str.charAt(i)<'a') {
				a[i]=str.toLowerCase().charAt(i);
			}else {
				a[i]=str.toUpperCase().charAt(i);
			}	
		}
		for(char x : a) {
			answer=answer+x;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();

		System.out.println(T.solution(str));
		

	}
}