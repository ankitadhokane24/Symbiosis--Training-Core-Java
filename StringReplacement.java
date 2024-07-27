class StringReplacement 
{
	public static void main(String[] args) 
	{
        		String name = "Ankita Dhokane";
        		String replacement = "I AM IDIOT";
		
        		char[] nameArray = name.toCharArray();
        		char[] replacementArray = replacement.toCharArray();
		char[] result = new char[nameArray.length];
		System.out.print("Original String:");
		for(int i=0;i<nameArray.length;i++)
		{
			System.out.print(nameArray[i]);
		}
       		for (int i = 0; i < nameArray.length; i++) 
		{
            		if (i < replacementArray.length) 
			{
                			result[i] = replacementArray[i];
            		} 
			else 
			{
               			 result[i] = ' ';
            		}
       	 	}
		System.out.println("\nString After Replacement:"+new String(result));
    	}
}
