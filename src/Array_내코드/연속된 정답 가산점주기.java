import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
	public int solution(ArrayList<String> arr, int num) {
		
		int answer=0;
		int cnt=0;
		
		for(int i =0; i<arr.size(); i++) {
		
			if(arr.get(i).equals("1")) {
				cnt++;
				answer+=cnt;
			}else {
				cnt=0;
			}		
		}
		return answer;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Main T = new Main();
		ArrayList<String> arr = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		String str = br.readLine();

		StringTokenizer st = new StringTokenizer(str);

		while (st.hasMoreTokens()) {
			arr.add(st.nextToken());
		}
		System.out.println(T.solution(arr, num));

	}
}
