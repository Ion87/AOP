package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class SecurityAspect {

    @Before("aop.aspects.MyPointCats.allAddMethods()")
    public void beforeAddSecurityAdvice(){
        System.out.println("BeforeGetSecurityAdvice");
        System.out.println("--------------------------------");
    }
}