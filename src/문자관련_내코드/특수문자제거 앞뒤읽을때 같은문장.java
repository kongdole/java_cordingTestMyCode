import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public String solution(String str) {
		
		String answer = "yes";
		int lt=0, rt=str.length()-1;
		str = str.toUpperCase();
		char[] a= str.toCharArray();
		
		while(lt<rt) {
			
			if(!Character.isAlphabetic(a[lt])) {
				lt++;
			}else if(!Character.isAlphabetic(a[rt])) {
				rt--;
			}else if(a[lt]!=a[rt]) {
				return "no";
			}else {
				lt++;
				rt--;
			}
		}
		return answer;
	}
	public static void main(String args[]) throws IOException{
		
		Main T = new Main();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		System.out.println(T.solution(str));
		
	}

}
