package ch5.appconfig.multiConfig;

import commons.LogDao;
import commons.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoConfig {

    @Bean
    public UserDao userDao() {
        return new UserDao();
    }

    @Bean
    public LogDao logDao() {
        return new LogDao();
    }
}
