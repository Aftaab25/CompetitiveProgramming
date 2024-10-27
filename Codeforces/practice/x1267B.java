/*
* Template by Aftaab Siddiqui
* For CodeForces and Atcoder problems
* */


//import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import static java.lang.System.out;

public class x1267B {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        InputReader in = new InputReader(inputStream);

        char[] c = in.next().toCharArray();
        ArrayList<Pair<Character, Integer>> segments = new ArrayList<>();
        int counter = 0;
        for (int i=0; i<c.length; i++){
            if (i==0){
                counter++;
            }

            else if (c[i] != c[i-1]) {
                Pair<Character, Integer> p = new Pair<>(c[i-1], counter);
                segments.add(p);
                counter = 1;
            }
            else {
                counter++;
            }
        }
        Pair<Character, Integer> p = new Pair<>(c[c.length-1], counter);
        segments.add(p);
//        for (Pair x: segments)
//            out.println(x);
//        out.println(segments.size());

        int mid = segments.size()/2;
        boolean flag = false;
        if (segments.size() % 2 == 0 || segments.get(mid).b < 2){
            out.println(0);
            return;
        }
        int idx = 0;
        while (idx <= mid){
            int right = mid + idx;
            int left = mid - idx;
            if (segments.get(left).b + segments.get(left).b >= 3
                && segments.get(left).a == segments.get(right).a){
                flag = true;
            } else {
                out.println(0);
                return;
            }
            idx++;
        }
        if (flag){
            out.println(segments.get(mid).b + 1);
        }
    }

    static class Pair<C, I extends Number> implements Comparable{
        Character a;
        Integer b;
        public Pair(Character a, Integer b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(Object o) {
            Pair<C, Number> ob = (Pair<C, Number>) o;
            if(this.a==ob.a)
                return this.b - ob.b;
            return this.a - ob.a;
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
