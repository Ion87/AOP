package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice(){
        System.out.println("beforeGetStudentsLoggingAdvice :" +
                " logam primirea listei cu Studenti" +
                " pina la getStudents()");
    }

//    @AfterReturning(value = "execution(* getStudents())"
//    , returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){
//        Student firstStudent = students.get(0);
//
//        String nameStudent = firstStudent.getName();
//        nameStudent = "Mr." + nameStudent;
//        firstStudent.setName(nameStudent);
//
//        double avgGarde = firstStudent.getAvgGrage();
//        avgGarde += 1;
//        firstStudent.setAvgGrage(avgGarde);
//
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice :" +
//                " logam primirea listei cu Studenti" +
//                " dupa lucru cu getStudents()");
//    }

//    @AfterThrowing(value = "execution(* getStudents())"
//                   , throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception){
//
//        System.out.println("afterThrowingGetStudentsLoggingAdvice : " +
//                "logam aruncarea Exceptiei :"+ exception);
//
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice : " +
                "finisatre normala sau cu exceptie");
    }
}
