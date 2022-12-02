package com.sam.sample.crudsample.error;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Slf4j
@Aspect
public class ErrorInterceptor{
    @AfterThrowing(pointcut = "execution(* com.sam.sample.crudsample..* (..))", throwing = "ex")
    public void errorInterceptor(Exception ex) {
        if (log.isDebugEnabled()) {
            log.debug("Error Message Interceptor started");
        }

        log.debug( ex.getCause().getMessage());


        if (log.isDebugEnabled()) {
            log.debug("Error Message Interceptor finished.");
        }
    }
}
