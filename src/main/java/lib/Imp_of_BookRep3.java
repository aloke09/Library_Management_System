package lib;

import static lib.Main.bookMap;

public class Imp_of_BookRep3 implements BookRep3{
    @Override
    public Book findBookByISBN(String ISBN)
    {
        if (bookMap.containsKey(ISBN))
        {
            System.out.println(bookMap.get(ISBN));
        }
        else {
            System.out.println("book does not exists in library ");
        }
        return bookMap.get(ISBN);
    }
}
