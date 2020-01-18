package ch5.appconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigTest {
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(User.class);
        User user = ctx.getBean("user",User.class);
        System.out.println("user is :" +user);
    }
}
