package LearningJavaDay0803._11Stream流;



import java.util.ArrayList;
import java.util.List;

/*
Stream:用于解决已有集合/数组类既有的弊端

能解决什么问题:可以解决类库或者数组API的弊端
             Stream认为集合和数组操作的API很不好用,所以采用了Stream流简化集合和数组的操作!
    核心:是先得到结合或者数组的Stream流(就是一根传送带)
         然后就用这个Stream流操作集合或者数组的元素
         然后用Stream流简化替代集合操作的API

    集合获取流的API:
        (1)default Stream<E> stream();
     小结:
         结合获取Stream流用 stream();
         数组 Arrays.stream(数组) /stream.of(数组);

Stream流常用API:
    forEach:逐一遍历
    count:统计个数
        ---long count()
    filter :过滤元素
        ---Stream<T> filter(Predicate<? super T>predicate)
     limit:取前几个元素
     skip:跳过前几个
     map(映射):加工方法(把原来的元素加工后,重新放上去)
     concat:合并流
     终结方法:foreach count


 */
public class StreamDemo {
    public static void main(String[] args) {
     List<String> list=new ArrayList();
     list.add("1");
     list.add("2");
     list.add("3");
     //过滤
     list.stream().filter(s->s.startsWith("")).filter(s->s.length()==3).forEach(s->System.out.println("11"));//支持链式
    }
}
