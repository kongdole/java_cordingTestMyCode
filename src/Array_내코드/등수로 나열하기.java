import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public int[] solution(int[] arr) {
		
		int[] answer= new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			int cnt=1;
			for(int j=0; j<arr.length; j++) {
				if(i==j) {}
				else if(arr[i]<arr[j])
				{
					cnt++;
				}
			}
			answer[i]=cnt;
		}
		
		
		
		return answer;
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Main T = new Main();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int[] arr = new int[num];
		
		while(st.hasMoreTokens()) {
			for(int i = 0; i<arr.length; i++) {
				arr[i]=Integer.parseInt(st.nextToken());
			}
		}
		for(int x : T.solution(arr)) {
		System.out.print(x+" ");
		}
	}
	
}
