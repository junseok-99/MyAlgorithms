import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek2805 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());
        int[] trees = new int[N];

        st = new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++) {
            trees[i] = Integer.parseInt(st.nextToken());
        }

        long min = (long)Arrays.stream(trees).min().getAsInt();
        long max = (long)Arrays.stream(trees).max().getAsInt();
        long mid = (max+min)/2L;

        while(min <= max) {
            int sum = 0;

            for (int i=0;i<N;i++) {
                if(trees[i] > mid) {
                    sum += ((long)trees[i] - mid);
                }
            }

            if(sum >= height) {
                min = mid + 1;
            } else if(sum < height) {
                max = mid - 1;
            }

            mid = (max+min)/2L;
        }

        System.out.println(mid);
    }
}
