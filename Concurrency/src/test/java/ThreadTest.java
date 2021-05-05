
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.LockSupport;

@Slf4j(topic = "c.test")
public class ThreadTest {
    public static void main(String[] args) {

        Runnable runnable = () -> {
            log.debug("Runnable");
        };

        FutureTask<?> task = new FutureTask(() -> {
            log.debug("future");
            LockSupport.park();
            return 1;
        });


         Thread t1=new Thread(task,"t1"){
//            @Override
//            public void run() {
//                log.debug("22");
//            }
        };
         t1.start();
        System.out.println(t1.getName());

    }
}
