import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder leftStr = new StringBuilder(st.nextToken());
        StringBuilder rightStr = new StringBuilder(st.nextToken());

        int left = Integer.parseInt(leftStr.reverse().toString());
        int right = Integer.parseInt(rightStr.reverse().toString());

        if(left > right) {
            System.out.println(left);
        } else if (left < right) {
            System.out.println(right);
        }
    }
}
