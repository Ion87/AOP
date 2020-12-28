package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        University university = context.getBean("university",University.class);
        university.addStudents();
       try {
           List<Student> students = university.getStudents();
       }catch (IndexOutOfBoundsException e){
           System.out.println("Exceptie prinsa");
       }
//        System.out.println(students);


        context.close();
    }
}
