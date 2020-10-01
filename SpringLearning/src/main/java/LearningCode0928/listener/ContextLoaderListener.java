package LearningCode0928.listener;

import LearningCode0928.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener {


    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        //读取web.xml中的全全局参数
        ServletContext servletContext = servletContextEvent.getServletContext();

        String contextConfigLocation=servletContext.getInitParameter("contextConfigLocation");
        ApplicationContext app = new ClassPathXmlApplicationContext("contextConfigLocation");

        //将Spring的应用上下文对象存储到最大的域--ServerContext中

        servletContext.setAttribute("app", app);
        System.out.println("创建完毕");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
