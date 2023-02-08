import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public int solution(int[][] a, int test, int rank) {

		int answer = 0;

		int[] stu1;
		int cnt;
		ArrayList<int[]> arr = new ArrayList<>();

		for (int k = 0; k < rank; k++) {
			stu1 = new int[test];
			for (int i = 0; i < test; i++) {
				cnt = 1;
				for (int j = 0; j < rank; j++) {
					if (a[i][j] == k + 1) {
						stu1[i] = cnt;
					} else {
						cnt++;
					}
				}
			}
			arr.add(stu1);
		}
		boolean b;
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.size(); j++) {
				b=true;
				for (int k = 0; k < test; k++) {
					if (arr.get(i)[k] <= arr.get(j)[k]) {
						b=false;
					}
				}
				if(b==true) {
					answer++;
				}
			}
		}

		return answer;

	}

	public static void main(String[] args) throws IOException {

		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int rank = Integer.parseInt(st.nextToken());
		int test = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[test][rank];
		for (int i = 0; i < test; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < rank; j++) {
				
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		System.out.println(T.solution(arr, test, rank));
	}
};