package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstarctLibrary{


    public void getBook(){
        System.out.println("luam o carte din UniLibrary");
        System.out.println("--------------------------------");
    }

    public String returnBook(){
        int i = 1/0;
        System.out.println("intoarcem cartea la UniLibrary");
//        System.out.println("--------------------------------");
        return "Winnetov";
    }

    public void getMagazine(){
        System.out.println("luam Jurnal din UniLibrary prin getMagazine()");
        System.out.println("--------------------------------");
    }

    public void returnMagazine(){
        System.out.println("intoarcem Jurnal in UniLibrary prin returnMagazine()");
        System.out.println("--------------------------------");
    }

    public void addBook(String person_name, Book book){
        System.out.println("Adaugam o carte din UniLibrary");
        System.out.println("--------------------------------");
    }

    public void addMagazine(){
        System.out.println("Adaugam Jurnal in UniLibrary");
        System.out.println("--------------------------------");
    }

}
