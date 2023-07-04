import java.io.*;
import java.util.StringTokenizer;

/**
 * 백준 2720번 세탁소 사장 동혁
 */
public class Baek2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] changes = {25, 10, 5, 1};
        for(int i=0;i<N;i++) {
            int change = Integer.parseInt(br.readLine());

            for(int j=0;j<4;j++) {
                bw.write((change / changes[j]) + " ");

                if(change / changes[j] > 0) {
                    change = change % changes[j];
                }
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}
