import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()) {
            String s1 = cin.nextLine();
            int n = Integer.parseInt(s1);
            String s = cin.nextLine();
            int count = 0;
            int left0 = 0;
            int left1 = 0;
            int right0 = 0;
            int right1 = 0;
            int mid = n/2;
            for (int i = 0; i <n ; i++) {
                char a = s.charAt(i);
                if ( i <= mid) {
                    if( a == '0') {
                        left0++;
                    }else
                        left1++;
                }else {
                    if( a == '0') {
                    right0++;
                }else
                    right1++;
                }
            }
            if (left0 < left1 && left0 != 0) {
                count +=left0;
            }else {
                count+=left1;
            }
            if (right0 < right1) {
                count +=right0;
            }else {
                count+= right1;
            }

            System.out.println(count);

        }


    }
}

