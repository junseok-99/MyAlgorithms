import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Baek4673 {

    public static int makeSelfNumber(int n) {
        int ret = n;

        while(n > 0) {
            ret += n % 10;
            n /= 10;
        }

        return ret;
    }
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Integer> cnts = new HashSet<>();

        for(int i=1;i<10001;i++) {
            cnts.add(makeSelfNumber(i));
        }

        for(int i=1;i<10001;i++) {
            if(!cnts.contains(i)) {
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();

    }
}
