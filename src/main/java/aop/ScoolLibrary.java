package aop;

import org.springframework.stereotype.Component;

@Component
public class ScoolLibrary extends AbstarctLibrary{

//    @Override
    public void getBook(String bookName) {
        System.out.println("luam cartea "+bookName+" din ScoolLibrary");
    }
}
