package com.company.logger.impl;

import com.company.logger.Logger;

/*
* Not thread safe :(
* */
public class LazyLoggerImpl extends Logger {

    private static LazyLoggerImpl loggerInstance;

    private LazyLoggerImpl() {};

    public static LazyLoggerImpl getInstance() {
        if (loggerInstance == null) {
            loggerInstance = new LazyLoggerImpl();
        }
        return loggerInstance;
    }

    @Override
    public void log(String msg) {
        System.out.println(msg);
    }
}
