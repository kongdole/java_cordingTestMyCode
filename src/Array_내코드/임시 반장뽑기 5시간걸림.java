import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public int solution(int[][] a, int num) {
		int answer = 0;
		ArrayList<ArrayList<Integer>> temp = new ArrayList<>();
		ArrayList<Integer> temp2= new ArrayList<>();
		int[] arr = new int[num];
		for (int i = 0; i < 5; i++) {
			 temp2= new ArrayList<>();
			for (int j = 0; j < num; j++) {
				temp2.add(a[j][i]);
				
			}
			temp.add(temp2);
		}
		
		for (int j = 0; j < num; j++) {
			for (int i = 0; i < 5; i++) {
				for(int k=0; k<num; k++) {
					if(temp.get(i).get(k)==a[j][i]) {
						arr[j]++;
					}
				}
			}
		}
		int tmp = 0;
		for (int x : arr) {
			x-=5;
		}
		for (int i = 0; i < arr.length; i++) {
			if (tmp < arr[i]) {
				tmp = arr[i];
				answer = i;
			} else {
			}
		}
		return answer+1;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		Main T = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[][] arr = new int[num][5];

		StringTokenizer st;

		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		System.out.println(T.solution(arr, num));
	}
};