import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public int solution(int num) {
		int answer=0;
		for(int i =2; i<=num;i++) {
			int cnt=0;
			for(int j =1; j<i; j++) {
				if(i%j==0) {
					cnt++;
				}
			}
			if(cnt==1) {
				answer++;
			}
		}
		System.out.println();
		return answer;
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		long start = System.currentTimeMillis();
		System.out.println(T.solution(num));
		long end = System.currentTimeMillis();
		System.out.println("출력하는데 걸린시간 : " + (end - start)/1000.0);
	}
}
