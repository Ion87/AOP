package aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAcces {

    @Before("aop.aspects.MyPointCats.allAddMethods()")
    public void beforeAllExceptionHandlingAdvice(){
        System.out.println("beforeGetExceptionHandlingAdvice: prindem exceptia la incercarea de a prmi ceva");
        System.out.println("--------------------------------");
    }
}
