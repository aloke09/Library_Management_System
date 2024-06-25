package lib;

import static lib.Main.bookMap;
import static lib.Main.bookMap;

public class Return {
    Borrow b=new Borrow();

    public void isreturnItem(Book book,Member member)
    {
        if(b.MaxNoOfBooks>0 && b.MaxNoOfBooks<=2)
        {
            b.MaxNoOfBooks++;
            System.out.println("book can be returned");
            returned(book,member);

        }
        else {
            System.out.println("Exceeded return  limit");

        }
    }
    public static void returned(Book b, Member m)
    {
        if(bookMap.containsKey(b.getISBN()))
        {
            System.out.println(m.toString()+"can return the book ");
            bookMap.put(b.getISBN(),new Borrow().btemp);
        }

        int fine = FineCal.isFine(m.getBDate(), m.getRDate());
        String message = fine == 0 ? "No fine is calculated" : fine + " fine is calculated";
        System.out.println(message);
    }
}
