package 문자관련_내코드;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public Integer solution(String str) {
		
		int answer=0;
		str=str.toUpperCase();
		String temp = str.replaceAll("[^0-9]","");
		Integer a = Integer.parseInt(temp);
		answer = a;
		return answer;
	}

	public static void main(String args[]) throws IOException {
		
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(T.solution(str));
		
	}

}