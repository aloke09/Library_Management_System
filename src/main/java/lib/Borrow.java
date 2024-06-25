package lib;

import java.util.HashMap;

import static lib.Main.bookMap;

public class Borrow
{
    Book btemp;
    public int MaxNoOfBooks=2;
    public void isborrow(Book book,Member member)
    {
        if(MaxNoOfBooks!=0)
        {
            MaxNoOfBooks--;
            System.out.println(member.getName()+"can borrow book");
            borrowd(book,member);
//            return MaxNoOfBooks;
        }
        else {
            System.out.println("Exceded borrow limit");
//            return 0;
        }
    }
    public static void borrowd(Book b, Member m)
    {
        if(bookMap.containsKey(b.getISBN()))
        {
            if(bookMap.get(b.getISBN())==null)
            {
                System.out.println("someone already took that book!!");
            }
            else {
                System.out.println(m.getName()+" took the book ");
                new Borrow().btemp=b;
                bookMap.put(b.getISBN(),null);
//                System.out.println(bookMap.get(b.getISBN()));
            }

        }
    }
//    public void isreturnItem(Book book,Member member)
//    {
//        if(MaxNoOfBooks>0 && MaxNoOfBooks<=2)
//        {
//            MaxNoOfBooks++;
//            System.out.println("book can be returned");
//            returned(book,member);
//
//        }
//        else {
//            System.out.println("Exceeded return  limit");
//
//        }
//    }
//    public static void returned(Book b, Member m)
//    {
//        if(bookMap.containsKey(b.getISBN()))
//        {
//            System.out.println(m.toString()+"can return the book ");
//            bookMap.put(b.getISBN(),new Borrow().btemp);
//        }
//
//        int fine = FineCal.isFine(m.getBDate(), m.getRDate());
//        String message = fine == 0 ? "No fine is calculated" : fine + " fine is calculated";
//        System.out.println(message);
//    }

}

