package test.AnnoTest;


import LearningCode0926.annoation.TargetInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application2.xml")
public class AnnoTest {
    @Autowired
    private TargetInterface target;

    @Test
    public void test1(){
        target.save();
    }
}
