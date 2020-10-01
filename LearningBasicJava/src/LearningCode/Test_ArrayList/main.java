package LearningCode.Test_ArrayList;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        //集合:容量可变
        //数组:容量不可变
        ArrayList ls = new ArrayList();//不限制类型
        ArrayList<String> ls1 = new ArrayList<>();//限制类型
        ls.add("s");
        ls.add(123);
        ls.add(456);
        ls.add(2, 1);//指定位置
        System.out.println(ls);
//set:修改
//remove:1 根据索引,2 根据元素,返回被修改的元素
// get:索引查询.
//size:元素个数

    }
}
