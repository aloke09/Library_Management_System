package lib;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;

import static lib.Borrow.borrowd;
import static lib.Return.returned;

public class Main
{
    static HashMap<String,Book> bookMap=new HashMap<>();
    static HashMap<String,Book> MemberMap=new HashMap<>();
    static Date borr;

    public static void main(String[] args) {
        Book nul=new Book();
        Book b1=new Book("11","title1","author1","publisher1",2021);
        Book b2=new Book("12","title2","author2","publisher2",2022);
        Book b3=new Book("13","title3","author3","publisher3",2023);
        Book b4=new Book("14","title4","author4","publisher4",2024);
        Book b5=new Book("15","title5","author5","publisher5",2025);

        Imp_of_BookRep bookObj=new Imp_of_BookRep();
        Imp_of_BookRep2 bookObj2=new Imp_of_BookRep2();
        Imp_of_BookRep3 bookObj3=new Imp_of_BookRep3();
        bookObj.addBook(b1);
        bookObj.addBook(b2);
        bookObj.addBook(b3);
        bookObj.addBook(b4);
        bookObj.addBook(b5);

        bookObj3.findBookByISBN(b3.getISBN());//search before del

        bookObj2.removeBook(b3.getISBN());//book del

        bookObj3.findBookByISBN(b3.getISBN());//search after del

//        bookMap.put("0",nul);
        Imp_Of_MemberRep memObj=new Imp_Of_MemberRep();
        Imp_Of_MemberRep2 memObj2=new Imp_Of_MemberRep2();
        Imp_OF_MemberRep3 memObj3=new Imp_OF_MemberRep3();

        Member m1=new Member("91","name1","bgm1","contact1",LocalDate.of(2020, 1, 13),LocalDate.of(2020, 1, 20));
        Member m2=new Member("92","name2","bgm2","contact2",LocalDate.of(2020, 1, 14),LocalDate.of(2020, 1, 17));
        Member m3=new Member("94","name4","bgm4","contact4",LocalDate.of(2020, 1, 15),LocalDate.of(2020, 1, 18));
        memObj.addMember(m1);
        memObj.addMember(m2);
        memObj.addMember(m3);

        memObj3.findMemberById(m3.getMemberId());
        memObj2.removeMember(m3.getMemberId());
        memObj3.findMemberById(m3.getMemberId());

        Borrow bor1=new Borrow();
        Return re1=new Return();

        bor1.isborrow(b1,m1);
//        bor1.isborrow(b1,m2);
        re1.isreturnItem(b1,m1);
    }
}
