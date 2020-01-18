package ch5.appconfig.multiConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaMultiConfigTest {
    public static void main(String[] args){

        ApplicationContext ctx = new AnnotationConfigApplicationContext(ServiceConfig.class);
        LogonService logonService = ctx.getBean("logonService", LogonService.class);
        System.out.println("logonService is :" +logonService);
        logonService.printHelllo();
    }

}
