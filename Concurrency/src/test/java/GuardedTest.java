import lombok.extern.slf4j.Slf4j;
import org.openjdk.jol.info.ClassLayout;

@Slf4j
public class GuardedTest {
    public static void main(String[] args) {
        Guarded guarded = new Guarded();
        new Thread(()->{
            log.debug("11");
            guarded.get(1);
        },"t1").start();

        new Thread(()->{
            guarded.complete(1);
        }).start();
    }
}

class Guarded{
    //结果
    private Object response;
    //获取结果
    //添加超时参数
    public Object get(long timeout){
        synchronized (this){
            long time = System.currentTimeMillis();
            long passTime=0;
            //没有结果
            while(response == null){
                if(passTime >= timeout){
                    break;
                }
                try{
                    this.wait(timeout-passTime);//虚假唤醒
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                passTime = System.currentTimeMillis()-time;
            }
        }
        return response;
    }
    //产生结果
    public void complete(Object response){
        synchronized (this){
            this.response = response;
            this.notify();
        }
    }
}