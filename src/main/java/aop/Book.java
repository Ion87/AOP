package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Winnetov")
    private String name;

    @Value("Kar lMay")
    private String author;

    @Value("1880")
    private int yearOfPublication;

    public String getName(){
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
