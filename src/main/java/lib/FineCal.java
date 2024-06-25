package lib;

import java.time.LocalDate;
public class FineCal
{
    public static int isFine(LocalDate borrowDate, LocalDate returnDate)
    {
        int d=returnDate.getDayOfMonth()-borrowDate.getDayOfMonth();
        if(d<=2)
        {
            System.out.println("Book returned successfully on time ");
            System.out.println(d);
            return 0;
        }
        else {
            System.out.println("Book was not returned successfully on time ");
            int fine = TotalFine(d);
            return fine;
        }
    }
    public static int TotalFine(int days)
    {
        return days*50;
    }
}
