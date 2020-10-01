package LearningJavaDay0803._06volatile关键字;



/**
 * volatile
 * 目标:并发编程下,多线程访问变量的不可见性问题
 * 引入:
 *     多个线程访问共享变量,会出现一个线程修改变量的值后,其他线程看不到最新值的情况
 */
public class volatileDemo extends Thread{
    private boolean flag=false;

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
class Visable{
    public static void main(String[] args) {
        //启动子线程修改flag的变量为true
        volatileDemo t=new volatileDemo();
        t.start();
        while(true){
            if(t.isFlag()){
                System.out.println("主线程进入");
            }
        }
    }
}