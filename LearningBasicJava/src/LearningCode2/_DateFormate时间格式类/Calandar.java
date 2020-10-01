package LearningCode2._DateFormate时间格式类;

import java.util.Calendar;

/**
 * 日历类是抽象对象,不能直接创建对象
 * 语法:Calendar s1= Calendar.getInstance();
 */
public class Calandar {
    public static void main(String[] args) {
        Calendar s1= Calendar.getInstance();
        System.out.println(s1.get(Calendar.YEAR));//单个取,用"get"拿
        //修改日历时间--set
        //701后日期
        s1.add(Calendar.DAY_OF_YEAR,701);
    }
}
