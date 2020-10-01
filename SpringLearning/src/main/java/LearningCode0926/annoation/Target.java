package LearningCode0926.annoation;

import org.springframework.stereotype.Component;

@Component("Target")
public class Target implements TargetInterface {
    public void save(){
        System.out.println("save running...");
    }

}
