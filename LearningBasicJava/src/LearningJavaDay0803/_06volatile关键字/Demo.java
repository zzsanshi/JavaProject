package LearningJavaDay0803._06volatile关键字;



/**
 * volatile
 * 目标:并发编程下,多线程访问变量的不可见性问题
 * 引入:
 *     多个线程访问共享变量,会出现一个线程修改变量的值后,其他线程看不到最新值的情况
 *
 *
 * 解决方式:
 *     1.加锁:得到锁,会清空工作内存--可以修饰方法和代码块
 *       --每次会清空工作内存,重新读取主内存最新值
 *
 *     2.对共享变量volatile修饰--修饰变量
 *       ---可以在多线程并发修改下,实现线程间变量的可见性
 *       ---一旦一个线程修改了volatile变量,另一个线程立即获取最新值
 */
public class Demo extends Thread{
    private volatile boolean flag=false;

    @Override
    public void run() {
        //
        System.out.println("true修改");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag=true;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
class Visable1{
    public static void main(String[] args) {
        //启动子线程修改flag的变量为true
        Demo t=new Demo();
        t.start();
        while(true){
            if(t.isFlag()){
                System.out.println("主线程进入");
            }
        }
    }
}