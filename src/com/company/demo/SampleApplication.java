package com.company.demo;

import com.company.logger.Logger;
import com.company.logger.impl.EagerLoggerImpl;
import com.company.logger.impl.LazyLoggerImpl;
import com.company.logger.impl.ThreadSafeLoggerImpl;

public class SampleApplication {

    public static void main(String[] args) {
        Logger logger = LazyLoggerImpl.getInstance();
        logger.log("abc");
        Logger logger2 = LazyLoggerImpl.getInstance();
        System.out.println(logger.hashCode() == logger2.hashCode());

        Logger logger3 = EagerLoggerImpl.getInstance();
        Logger logger4 = EagerLoggerImpl.getInstance();
        System.out.println(logger3.hashCode() == logger4.hashCode());

        Logger logger5 = ThreadSafeLoggerImpl.getInstance();
        Logger logger6 = ThreadSafeLoggerImpl.getInstance();
        System.out.println(logger5.hashCode() == logger6.hashCode());

    }
}
