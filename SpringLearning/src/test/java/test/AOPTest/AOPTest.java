package test.AOPTest;

import LearningCode0925.Proxy.cglib.Target;
import LearningCode0926.aop.TargetInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration ("classpath:applicationContext.xml")
public class AOPTest {
   @Autowired
    private TargetInterface target;
  @Test
    public void test1(){
      target.save();
  }
}
