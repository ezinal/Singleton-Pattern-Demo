package com.company.logger.impl;

import com.company.logger.Logger;

/*
* Creates instance even if we don't use it :(
* */
public class EagerLoggerImpl extends Logger {

    private static final EagerLoggerImpl loggerInstance = new EagerLoggerImpl();

    private EagerLoggerImpl() {};

    public static EagerLoggerImpl getInstance() {
        return loggerInstance;
    }

    @Override
    public void log(String msg) {
        System.out.println(msg);
    }
}
