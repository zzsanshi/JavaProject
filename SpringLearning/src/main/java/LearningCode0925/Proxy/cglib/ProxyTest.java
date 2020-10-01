package LearningCode0925.Proxy.cglib;



import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        //目标对象
        final Target target = new Target();
        //获得增强对象
        final Advice advice = new Advice();
        //返回值就是动态生成的代理对象 基于cglib
        //1.创建增强器
        Enhancer enhancer = new Enhancer();

        //2.设置父类(目标)

        enhancer.setSuperclass(Target.class);
        //3.设置回调
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                advice.before();//执行前置增强
                Object invoke = method.invoke(target, args);//目标
                advice.afterReturning();//后置
                return null;
            }
        });
        //4.生成代理对象
        Target proxy = (Target) enhancer.create();
        proxy.save();

    }
}
