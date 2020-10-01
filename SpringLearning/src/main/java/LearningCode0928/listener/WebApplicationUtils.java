package LearningCode0928.listener;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

public class WebApplicationUtils {
    public static ApplicationContext getweb(ServletContext servletContext){
        return (ApplicationContext) servletContext.getAttribute("app");
    }
}
