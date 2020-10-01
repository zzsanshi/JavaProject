package LearningCode2._泛型Genericity;

import javax.naming.PartialResultException;

/**
 * 泛型是一个标签:<数据类型>
 * 在编译阶段约束只能操作的数据类型
 * 只支持引用数据类型
 *
 * 好处:不会出现类型转换异常
 * 泛型类的格式:
 *    修饰符 class 类名<泛型变量>{
 *    }
 *    泛型变量:E,T,K,V
 * 泛型方法:
 *    修饰符 <泛型变量> 返回值 方法名(形参){}
 * 泛型接口:
 *    修饰符 interface 接口名<泛型变量>{}
 *泛型通配符:?--代表一切
 * 泛型的上下限:?extends...上限
 *            ?super... 下限
 */
public class Demo {
    //泛型方法
    public <T> void P (T e){
       return ;
    }
}
//泛型类
class test<E>{
    public void add(E e){

    }
}
//泛型接口
interface t <T >{

}