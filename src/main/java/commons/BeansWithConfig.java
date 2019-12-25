package commons;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansWithConfig {

    @Bean(name = "car")
    public Car buildCar() {
        Car car = new Car();
        car.setBrand("Audi A6");
        car.setMaxSpeed(240);
        return car;
    }
}
