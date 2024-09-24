import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        for(int i = 0; i < 2; i++) {
            st  = new StringTokenizer(br.readLine());

            while(st.hasMoreTokens()) {
                String input = st.nextToken();
                System.out.println(input);
                sb.append(input);
            }
            System.out.println(sb.toString());
        }
    }
}