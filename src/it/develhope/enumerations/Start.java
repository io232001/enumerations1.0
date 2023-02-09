package it.develhope.enumerations;
public class Start
{
    public static void main(String[] args)
    {
        enum Month
        {
            JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
        }
        for (Month month : Month.values())
        {
            String monthName = month.name();
            if (monthName.endsWith("Y"))
            {
                System.out.println(monthName + " ends with y");
            }
            else
            {
                System.out.println(monthName + " doesn't end with y");
            }
        }
    }

}
