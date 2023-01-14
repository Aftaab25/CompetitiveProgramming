/*
* Template by Aftaab Siddiqui
* For CodeForces and Atcoder problems
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Math.abs;
import static java.lang.System.out;

public class x263A {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        InputReader in = new InputReader(inputStream);

        int[][] arr = in.readArr2D(5, 5);
        int c = 2;
        int ans = 0;
        for (int i=0; i<5; i++)
            for (int j=0; j<5; j++){
                if (arr[i][j] == 1)
                    ans = ans + abs(c-i) + abs(c-j);
            }
        out.println(ans);
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

        public int[][] readArr2D(int M, int N) throws Exception {
            int[][] arr = new int[M][N];
            for(int i=0; i < M; i++)
                for (int j=0; j < N; j++)
                    arr[i][j] = Integer.parseInt(next());
            return arr;
        }
    }
}
