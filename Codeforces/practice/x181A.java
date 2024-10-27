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

public class x181A {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        InputReader in = new InputReader(inputStream);

        // Read the number of test case.
        int rows = in.nextInt();
        int cols = in.nextInt();
        char[][] arr = in.readArr2D(rows, cols);

        int row = 0;
        int col = 0;
        for (int i=0; i<rows; i++){
            int check=0;
            for (int j=0; j<cols; j++) {
               if ( arr[i][j] == '*'){
                   check++;
               }
            }
            if (check == 1){
                row = i+1;
            }
        }
        for (int i=0; i<cols; i++){
            int check=0;
            for (int j=0; j<rows; j++) {
                if ( arr[j][i] == '*'){
                    check++;
                }
            }
            if (check == 1){
                col = i+1;
            }
        }

        out.print(String.valueOf(row) + " " + String.valueOf(col));
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

        public char[][] readArr2D(int N, int M) {
            char[][] arr = new char[N][M];
            for (int i=0; i<N; i++){
                arr[i] = nextLine().toCharArray();
            }
            return arr;
        }
    }
}
