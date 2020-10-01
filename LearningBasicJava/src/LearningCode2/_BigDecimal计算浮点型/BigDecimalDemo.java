package LearningCode2._BigDecimal计算浮点型;
import java.math.*;

/**
 * 作用:解决失真问题
 * 方式: BigDecimal
 */
public class BigDecimalDemo {
    public static void main(String[] args) {
        double a=0.1;
        double b=0.2;
        double c=a+b;
        System.out.println(c);

        BigDecimal a1=BigDecimal.valueOf(a);
        BigDecimal b1=BigDecimal.valueOf(b);
        BigDecimal c1=a1.add(b1);
        System.out.println(c1);
        //传数据,转换成double
        double c2=c1.doubleValue();
    }
}
