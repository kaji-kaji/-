package track;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
  
  public static void main(String[] args) {

    //標準入力と配列宣言
    String[] lines = getStdin();
    int n = Integer.parseInt(lines[0]);
    int[] a = new int[n];
    int[] b = new int[n];

    for(int i = 1; i < n+1; i++){
      String[] str = lines[i].split(" ");
      a[i-1] = Integer.parseInt(str[0]);
      b[i-1] = Integer.parseInt(str[1]);
    }

    for(int i = 0; i < n; i++){
      if(b[i] <= 60 && a[i] + b[i] <= 100){
        System.out.println("fail");
      }else if(b[i] <= 60 || a[i] + b[i] <= 100){
        System.out.println("reexamination");
      }else {
        System.out.println("pass");
      }
    }

  }

  private static String[] getStdin() {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> lines = new ArrayList<>();
    while (sc.hasNext()) {
      lines.add(sc.nextLine());
    }
    return lines.toArray(new String[lines.size()]);
  }
}
