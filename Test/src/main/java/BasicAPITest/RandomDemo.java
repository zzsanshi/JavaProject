package BasicAPITest;

import java.util.Random;

/**
* Description:
 * 随机数产生Demo
* date: 2021/5/7 19:31
* @author: zzsanshi
* @since JDK 14
*/
public class RandomDemo {
    public static void main(String[] args) {

        // 调用Math.Random()函数
        // 返回带正号的double值，该值大于等于0.0且小于1.0
        double random = Math.random();//产生一个[0，1)之间的随机数
        System.out.println("1.Math.random:"+random);

        Random ran = new Random(10);
        System.out.println("使用种子为10的Random对象生成[0,10)内随机整数序列: "+ran.nextInt(10));
    }
}
