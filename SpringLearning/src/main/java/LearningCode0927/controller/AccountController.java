package LearningCode0927.controller;

import LearningCode0927.domain.Account;
import LearningCode0927.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountController {
    public static void main(String[] args) {
        ApplicationContext app=new ClassPathXmlApplicationContext("application-0927.xml");//读取配置文件
        AccountService accountService= (AccountService) app.getBean("accountService");
        accountService.transfer("Tom","lucy",1);
    }
}
