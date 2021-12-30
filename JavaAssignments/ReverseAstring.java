package JavaAssignments;


public class ReverseAstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // using + (String concatenation ) operator
	
		String str ="ABCD";
		String rev =" ";
		
		int len=str.length();
		
		for(int i=len-1 ;i>=0 ;i--) 
			
		{
			rev=rev+str.charAt(i);
			
			System.out.println("Reverse string is"+rev);
			
			
		}
	}

}
