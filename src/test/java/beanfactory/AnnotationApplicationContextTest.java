package beanfactory;

import commons.BeansWithConfig;
import commons.Car;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApplicationContextTest {

    @Test
    public void getBean() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeansWithConfig.class);
        Car car = ctx.getBean("car", Car.class);
        Assert.assertNotNull(car);
    }
}
