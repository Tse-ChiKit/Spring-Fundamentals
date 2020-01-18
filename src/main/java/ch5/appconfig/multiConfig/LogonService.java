package ch5.appconfig.multiConfig;

import commons.LogDao;
import commons.UserDao;

public class LogonService {

    private LogDao logDao;
    private UserDao userDao;

    public LogDao getLogDao() {
        return logDao;
    }

    public void setLogDao(LogDao logDao) {
        this.logDao = logDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void printHelllo() {
        System.out.println("hello test rewrite emails!");
    }

}
