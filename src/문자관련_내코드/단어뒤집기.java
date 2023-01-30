package 문자관련_내코드;
import java.util.Scanner;

public class Main {
	public String[] solution(int num, String[] arr) {
		
		String[] answer = new String[num];
		String[] arr2 = arr;
		
		for(int i=0; i<num; i++) {
			String str ="";
			for(int j=0; j<arr2[i].length(); j++) {
				str=arr2[i].charAt(j)+str;
			}
			answer[i]=str;
		}
		return answer;
	}
	
	public static void main(String args[]) {
	
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		
		int num = kb.nextInt();
		String[] arr = new String[num];
		
		for(int i =0; i<num; i++) {
			arr[i] = kb.next();
		}
		
		for(String x : T.solution(num,arr)) {
			
			System.out.println(x);
		}
	}
}
