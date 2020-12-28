package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary unilibrary = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);

        unilibrary.getBook();
        unilibrary.addBook("Ion",book);
        unilibrary.addMagazine();

//        unilibrary.returnBook();
//
//
//        ScoolLibrary scoolLibrary = context.getBean("scoolLibrary", ScoolLibrary.class);
//        scoolLibrary.getBook("java");

        context.close();

    }
}
