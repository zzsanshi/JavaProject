package LearningCode0926.annoation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect//标注为切面
public class MyAspect {
    @Before("execution(* LearningCode0926.annoation.*.*(..))")
    public void before(){
        System.out.println("前置增强!");
    }


    //定义切点表达式
    @Pointcut("execution(* LearningCode0926.annoation.*.*(..))")
    public void a(){
        System.out.println("抽取!");
    }


}
