/*
* Template by Aftaab Siddiqui
* For CodeForces and Atcoder problems
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import static java.lang.System.out;

public class x172A {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        InputReader in = new InputReader(inputStream);

        // Read the number of test case.
        int T = in.nextInt();
        String[] arr = in.readStrArr(T);
        int n = arr[0].length();
        int ans=0;
        outer: for (int i=0; i<n; i++){
            String sub = arr[0].substring(0, i+1);
            for(int j=1; j<arr.length; j++){
                if (!arr[j].startsWith(sub)){
                    break outer;
                }
            }
            ans++;
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

        public String[] readStrArr(int N) throws Exception {
            String[] arr = new String[N];
            for(int i=0; i < N; i++)
                arr[i] = next();
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
