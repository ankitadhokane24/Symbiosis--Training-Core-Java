import java.util.Scanner;

class calendar
{
    	public static void main(String args[])
 	{
       		 Scanner s = new Scanner(System.in);

       		 System.out.println("Enter month (1-12):");
       		 int m = s.nextInt();

       		 System.out.println("Enter year:");
       		 int y = s.nextInt();

       		 printCalendar(m, y);
    	}

    	public static void printCalendar(int m, int y) 
	{
        		String[] months = {
            			"", "January", "February", "March", "April", "May", "June",
            			"July", "August", "September", "October", "November", "December" };

        		int[] daysInMonth = {
           		 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        		if (m == 2 && isLeapYear(y)) 
		{
            		daysInMonth[m] = 29;
        		}
        
        		System.out.println("   " + months[m] + " " + y);
        		System.out.println(" S  M Tu  W Th  F  S");
        
        		int d = dayOfWeek(1, m, y);

        		for (int i = 0; i < d; i++) 
		{
            		System.out.print("   ");
        		}

        		for (int i = 1; i <= daysInMonth[m]; i++) 
		{
            		System.out.printf("%2d ", i);
            		if (((i + d) % 7 == 0) || (i == daysInMonth[m])) 
			{
               			 System.out.println();
            		}
       		 }
    	}

    	public static int dayOfWeek(int day, int m, int y) 
	{
        		y = y - (14 - m) / 12;
        		int x = y + y / 4 - y / 100 + y / 400;
       		 int m1 = m + 12 * ((14 - m) / 12) - 2;
        		return (day + x + (31 * m1) / 12) % 7;
    	}

    	public static boolean isLeapYear(int y)
 	{
        		if (y % 4 == 0)
      		{
         			if (y % 100 == 0) 
			{
               		 	if (y % 400 == 0) 
				{
                    			return true;
                			} 
				else 
				{
                    			return false;
                			}
            		} 
			else 
			{
                			return true;
            		}
       		 } 
		else 
		{
          	 	 return false;
        		}
    	}
}

                		