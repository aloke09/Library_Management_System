package lib;

import static lib.Main.bookMap;

public class Imp_of_BookRep2 implements BookRep2{
    @Override
    public void removeBook(String ISBN) {
        if(bookMap.containsKey(ISBN))
        {
            System.out.println("Book with id "+ISBN+" is removed successfully!!");
            bookMap.remove(ISBN);
        }
        else {
            System.out.println("book does not exists in library ");
        }

    }
}
