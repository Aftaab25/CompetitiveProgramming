/*
* Template by Aftaab Siddiqui
* For CodeForces and Atcoder problems
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;

import static java.lang.System.out;

public class x169A {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        InputReader in = new InputReader(inputStream);

        // Read the number of test case.
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        ArrayList<Integer> arr = in.readArrList(n);
        Collections.sort(arr, Collections.reverseOrder());
        out.println(abs(arr.get(a) - arr.get(a-1)));
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

        public ArrayList<Integer> readArrList(int N) throws Exception {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int i=0; i < N; i++)
                arr.add(Integer.parseInt(next()));
            return arr;
        }

        public ArrayList<Long> readArrList2(int N) throws Exception {
            ArrayList<Long> arr = new ArrayList<Long>();
            for(int i=0; i < N; i++)
                arr.add(Long.parseLong(next()));
            return arr;
        }
    }
}
/*
* 100 6 3 2 1 => 2, 3
* 9 1 1 1 1 1 1 => 3, 4
* */
