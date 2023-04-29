package com.nogayhusrev.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private Logger logger = LoggerFactory.getLogger(LoggingAspect.class);


//    @Pointcut("execution(* com.nogayhusrev.controller.CourseController.*(..))")
//    public void myPointcut(){}
//
//    @Before("myPointcut()")
//    public void log(){
//        logger.info("Info log..............");
//    }

//    @Before("execution(* com.nogayhusrev.controller.CourseController.*(..))")
//    public void log(){
//        logger.info("Info log..............");
//    }

//    @Pointcut("execution(* com.nogayhusrev.repository.CourseRepository.findById(*))")
//    public void courseRepositoryFindByIdPC() {}
//
//    @Before("courseRepositoryFindByIdPC()")
//    public void beforeCourseRepositoryFindByIdPC(JoinPoint joinPoint){
//        logger.info("Before -> Method: {}, Arguments: {}, Target: {}",
//                joinPoint.getSignature(), joinPoint.getArgs(), joinPoint.getTarget());
//    }

    @Pointcut("")
    public void anyControllerOperation() {
    }
}

