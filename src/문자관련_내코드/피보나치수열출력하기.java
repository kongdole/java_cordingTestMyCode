import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public int[] solution(int num) {
		int[] answer=new int[num];
		int temp1=1;
		int temp2=1;
		int temp3;
		answer[0]=temp1;
		answer[1]=temp2;
		for(int i=2; i<num;i++) {
			
			temp3=temp1+temp2;
			answer[i]=temp3;
			temp1=temp2;
			temp2=temp3;
		
		}
		return answer;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());

		for (int x : T.solution(num)) {
			System.out.print(x+" ");
		}
		
	}
}