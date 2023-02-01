import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public String[] solution(String arr[], String arr2[]) {
		String[] answer= new String[arr.length];
		
		for(int i =0; i<arr.length; i++) {
			System.out.println("뭐들어옴?" +arr[i] +arr2[i]);
			System.out.println(arr[i].equals(arr2[i]));
			if(arr[i].equals(arr2[i])) {
				answer[i]="D";
			}else if(arr[i].equals("1")) {
				if(arr2[i].equals("2")) {
					answer[i]="B";
				}else {
					answer[i]="A";
				}	
			}else if(arr[i].equals("2")) {
				if(arr2[i].equals("3")) {
					answer[i]="B";
				}else {
					answer[i]="A";
				}
			
			}else if(arr[i].equals("3")){
				if(arr2[i].equals("1")) {
					answer[i]="B";
				}else {
					answer[i]="A";
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		String[] arr = new String[num];
		String[] arr2 = new String[num];
		
		for(int i =0; i<num; i++) {
			arr[i]=st.nextToken();
			arr2[i]=st2.nextToken();
		}
		
		for(String x : T.solution(arr, arr2)) {
			System.out.println(x);
		
		}
	}
}