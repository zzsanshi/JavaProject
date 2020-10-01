package LearningCode2._DateFormate时间格式类;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 作用:1."日期对象"或"时间毫秒值"格式化我们喜欢的时间格式
 *     2.把字符串的时间形式解析成日期对象
 */
public class Demo1 {
    public static void main(String[] args) throws ParseException {
       //1.得到日期
        Date d=new Date();
        System.out.println(d);
        //2.输入格式
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        //3.得到格式话形式

        System.out.println(sdf.format(d));
        System.out.println(sdf.format(d.getTime()));//毫秒格式化
        String time="2019-11-04 09:30:30";
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date d1=sdf1.parse(time);//解析为日期对象
        System.out.println(sdf1.parse(time));
        long time1=d1.getTime()+(24l*60*60+15*60*60+30*60+29)*1000;
        System.out.println(sdf1.format(time1));


    }

}
