import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2864 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String[] str = {st.nextToken(), st.nextToken()};
        String[] ref = {"6", "5"};
        for(int i=0;i<2;i++) {
            int sum = Integer.parseInt(str[0].replace(ref[i%2], ref[(i+1)%2]));
            sum += Integer.parseInt(str[1].replace(ref[i%2], ref[(i+1)%2]));
            System.out.print(sum + " ");
        }

    }
}
