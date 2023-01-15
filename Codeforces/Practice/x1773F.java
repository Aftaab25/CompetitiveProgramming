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

public class x1773F {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        InputReader in = new InputReader(inputStream);

        // Read the number of test case.
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int d = 0;
        if (n==1){
            out.println(a==b ? 1:d);
            out.println(a + ":" + b);
        }
        else if(n - a - b > 0){
            d = n-a-b;
            out.println(d);
            for (int i=0; i<d; i++){
                out.println("0:0");
            }
            for (int i=0; i<a; i++){
                out.println("1:0");
            }
            for (int i=0; i<b; i++){
                out.println("0:1");
            }
        }
        else if(a+b >= n && (a==0 || b==0)){
            out.println(d);
            for(int i=0; i<n-1; i++){
                out.println("0:1");
                b -= i;
            }
            out.println("0:"+b);
        }
        else{
            out.println(d);
            while (n-1!=0){
                if (a>0){
                    out.println("1:0");
                    a--;
                }
                else if (b>0) {
                    out.println(("0:1"));
                    b--;
                }
                n--;
            }
            out.println(a+":"+b);
        }

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
