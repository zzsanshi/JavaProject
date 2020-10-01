package LearningCode2._Date日期类;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Date d=new Date();
        Date d1=new  Date(d.getTime()+121*10000);//时间毫秒转换为日期对象
        System.out.println(d);
        System.out.println(d1);
        System.out.println(d.getTime());//得到毫秒值;毫秒值1s=1000ms

    }
}
