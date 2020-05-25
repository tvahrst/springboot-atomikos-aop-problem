package com.example.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class JdbcAspect {
    private static Logger logger = LoggerFactory.getLogger(JdbcAspect.class);

    @Around("execution(* javax.sql.DataSource.getConnection(..))")
    public Object aroundCreateConnection(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info("bevor getConnection");
        try{
            return joinPoint.proceed();
        }finally {
            logger.info("after getConnection");
        }
    }
}
