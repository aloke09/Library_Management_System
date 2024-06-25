package lib;

import static lib.Main.bookMap;

public class Imp_of_BookRep implements BookRep
{
    @Override
    public void addBook(Book book) {
        bookMap.put(book.getISBN(),book);
        System.out.println(book.toString()+" Added successfully!!");
    }

//    @Override
//    public void removeBook(String ISBN) {
//        if(bookMap.containsKey(ISBN))
//        {
//            System.out.println("Book with id "+ISBN+" is removed successfully!!");
//            bookMap.remove(ISBN);
//        }
//        else {
//            System.out.println("book does not exists in library ");
//        }
//
//    }
//
//    @Override
//    public Book findBookByISBN(String ISBN)
//    {
//        if (bookMap.containsKey(ISBN))
//        {
//            System.out.println(bookMap.get(ISBN));
//        }
//        else {
//            System.out.println("book does not exists in library ");
//        }
//        return bookMap.get(ISBN);
//    }
}
