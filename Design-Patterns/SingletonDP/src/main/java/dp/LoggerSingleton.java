package main.java.dp;

import javax.security.auth.login.LoginException;

public class LoggerSingleton {

    // example of eager loading i.e. instance already initialized
//    private static LoggerSingleton instance = new LoggerSingleton();
//
//    private LoggerSingleton() {
//
//    }
//
//    public static LoggerSingleton getInstance() {
//        return instance;
//    }

    // example of lazy loading
//    private static LoggerSingleton instance = null;
//
//    private LoggerSingleton() {
//
//    }
//
//    public static LoggerSingleton getInstance() {
//
//        if (instance == null) {
//            instance = new LoggerSingleton();
//        }
//        return instance;
//    }

    // thread safe example
    // volatile - this variable's value can be modified by different threads
    // changes always visible to other threads, prevents thread caching issues
    private static volatile LoggerSingleton instance = null;

    private LoggerSingleton() {
        if (instance != null) {
            throw new RuntimeException("Please don't try to be smart");
        }
    }

    public static LoggerSingleton getInstance() {
        if (instance == null) {
            synchronized (LoggerSingleton.class) {
                if (instance == null) {
                    instance = new LoggerSingleton();
                }
            }
        }
        return instance;
    }

}
