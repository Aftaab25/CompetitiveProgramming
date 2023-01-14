/*
* Template by Aftaab Siddiqui
* For CodeForces and Atcoder problems
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.out;

public class x282A {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        InputReader in = new InputReader(inputStream);

        // Read the number of test case.
        int T = in.nextInt();
        int x = 0;
        while (T-- > 0) {
            String s = in.nextLine();
            if (s.startsWith("+") || s.endsWith("+"))
                x++;
            else x--;

        }
        out.println(x);

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public Long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble(){
            return Double.parseDouble(next());
        }

        public String nextLine() {
            String str = "";
            try {
                if(tokenizer.hasMoreTokens()){
                    str = tokenizer.nextToken("\n");
                }
                else{
                    str = reader.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        public int[] readArr(int N) throws Exception {
            int[] arr = new int[N];
            for(int i=0; i < N; i++)
                arr[i] = Integer.parseInt(next());
            return arr;
        }
    }
}
