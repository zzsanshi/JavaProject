package 贪心;

import com.sun.jdi.ArrayReference;

import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _135分发糖果 {
    public int candy(int[] ratings) {
        int[] candy = new int[ratings.length];
        Arrays.fill(candy,1);

        for (int i = 1; i <candy.length ; i++) {
            if (ratings[i] > ratings[i-1]) {
                candy[i] = candy[i-1] + 1;
            }
        }
        for(int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i+1]) {
                candy[i] = Math.max(candy[i], candy[i+1]+1);
            }
        }
        return IntStream.of(candy).sum();
    }
}
