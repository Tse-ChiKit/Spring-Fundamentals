package ch4.beanLifeCycle;


import commons.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationLifeCycle {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("beanfactory/beans.xml");
        Car car = ctx.getBean("car", Car.class);
    }
}
