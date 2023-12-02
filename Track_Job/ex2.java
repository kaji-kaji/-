package track;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
  
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String g = sc.nextLine();
		String[] s_ary = g.split(" ");	      
		int n = s_ary.length;

		//問題で使用する変数
		int[] a = new int[n];
		String[] s = new String[n];
		int m = Integer.parseInt(s_ary[n-1]);

		for(int i = 0; i < n-1; i++){
			String[] k = s_ary[i].split(":");
			a[i] = Integer.parseInt(k[0]);
			s[i] = k[1];
		}
		selectionSort(a,s, n-1);

		String ans = "";
		for(int i = 0; i < n-1; i++) {
			if(m % a[i] == 0){
				ans += s[i];
			}
		}

		if(ans.equals("")) {
			System.out.println(m);
		}else {
			System.out.println(ans);
		}

	}

	static void selectionSort(int[] a, String[] s, int n) {
		for(int i = 0; i < n-1; i++) {
			for(int j = i+1; j < n; j++) {
				if(a[i] > a[j]) {
					int tmp = a[i];
					String stmp = s[i];
					a[i] = a[j];
					a[j] = tmp;
					s[i] = s[j];
					s[j] = stmp;
				}
			}
		}
	}
}
