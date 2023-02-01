import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public ArrayList<Integer> solution(int[] numarr) {
		
		ArrayList<Integer> answer = new ArrayList();
		answer.add(numarr[0]);
		for(int i=0; i<numarr.length-1; i++) {
			int tem =numarr[i];
			if(tem<numarr[i+1]) {
				answer.add(numarr[i+1]);
			}
		}
		
		return answer;
		
		
		
	}
	public static void main(String[] args) throws IOException {
		
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] numarr = new int[a];
		for(int i =0 ; i<a ; i++) {	
			numarr[i] = Integer.parseInt(st.nextToken());
		}
		for(Integer x : T.solution(numarr)) {
		System.out.print(x+" ");
		}
	}
}