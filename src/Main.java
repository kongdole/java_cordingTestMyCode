import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public String solution(String str) {
		
		String answer="no";
		
		String temp = str.toUpperCase();
		String temp2 = temp.replaceAll("^A-Z","");
		String temp3 = new StringBuilder(temp2).reverse().toString();
		
//		if(temp2==temp3) return "yes";
		if(temp2.equals(temp3)) return "yes";
		
		return answer;
	}
	public static void main(String args[]) throws IOException{
		
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(T.solution(str));
		
	}

}