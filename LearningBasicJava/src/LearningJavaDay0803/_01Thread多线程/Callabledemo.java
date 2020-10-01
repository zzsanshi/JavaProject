package LearningJavaDay0803._01Thread多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Callabledemo {
    public static void main(String[] args) {
        //3.创建Callable对象
        Callable call=new MyCallable();
        //4.Callable 任务对象包装为为未来任务对象
        FutureTask<String> task=new FutureTask<>(call);//FutureTask其实就是一个Runnable对象,可以得到结果
        Thread t=new Thread(task,"call");
        t.start();
        System.out.println(t.getName());
         //最后获取线程执行结果
        try {
            String result=task.get();//获取call的结果
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

//1.实现接口
class MyCallable implements Callable<String>{
   //2.重写call
    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName()+",Callable!");
        return "hao!";
    }
}