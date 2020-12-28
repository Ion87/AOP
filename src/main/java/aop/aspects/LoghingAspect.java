package aop.aspects;


import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoghingAspect {

//    @Pointcut("execution(* aop.UniLibrary.*())")
//    private void allMethodsFromUniLibrary(){
//    }
//
//    @Pointcut("execution(* aop.UniLibrary.getMagazine())")
//    private void getMagazineFromUniLibrary(){
//    }
//
//    @Pointcut("allMethodsFromUniLibrary() && !getMagazineFromUniLibrary()")
//    private void allExcludingGetMagazineFromUniLibrary(){
//    }
//
//    @Before("allExcludingGetMagazineFromUniLibrary()")
//    public void excludingGetMagazine(){
//        System.out.println("Not getMagazine()");
//    }



//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){
//    }
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){
//    }
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethods(){
//    }
//
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice : writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice : writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethods()")
//    public void beforeGetAndReturn(){
//        System.out.println("beforeGetAndReturn : writing Log #3");
//    }


    @Before("aop.aspects.MyPointCats.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){

        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        System.out.println("methodSignature = "+methodSignature);
        System.out.println("methodSignature.grtMethod() = "+ methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = "+ methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = "+ methodSignature.getName());

        if (methodSignature.getName().endsWith("addBook")){
            Object[] argiments = joinPoint.getArgs();

            for (Object obj: argiments) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("informatia despre carte: " +
                            "\n  nume :"+ myBook.getName()+"\n" +
                            "autor : "+myBook.getAuthor()+"\n" +
                            "anul : "+myBook.getYearOfPublication());
                }else if (obj instanceof String){
                    System.out.println("cartea a adaugato + "+obj);
                }
            }
        }

        System.out.println("beforeGetLoggingAdvice :" +
                " logarea incercarii de a primi carte sau jurnal");
        System.out.println("--------------------------------");
    }
//
//    @Before("execution (public * return*())")
//    public void beforeReturnBook(){
//        System.out.println("before return Book");
//    }
}
