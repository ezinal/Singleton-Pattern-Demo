package com.company.logger.impl;

import com.company.logger.Logger;

/*
* Synchronized block overhead
* */
public class ThreadSafeLoggerImpl extends Logger {

    private static ThreadSafeLoggerImpl loggerInstance;

    private ThreadSafeLoggerImpl() {};

    public static synchronized ThreadSafeLoggerImpl getInstance() {
        if(loggerInstance == null) {
            loggerInstance = new ThreadSafeLoggerImpl();
        }
        return loggerInstance;
    }

    @Override
    public void log(String msg) {
        System.out.println(msg);
    }
}
