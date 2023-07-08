import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2577 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 1;
        int[] counts = new int[10];

        for(int i=0;i<3;i++) {
            result *= Integer.parseInt(br.readLine());
        }

        while(result > 0) {
            counts[result % 10]++;
            result /= 10;
        }

        for(int i=0;i<10;i++) {
            System.out.println(counts[i]);
        }
    }
}
