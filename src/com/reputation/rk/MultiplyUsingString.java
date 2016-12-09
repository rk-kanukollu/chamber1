package com.reputation.rk;

public class MultiplyUsingString {
public static void main(String[] args) {
	String s1 = new String("51");
	String s4 = new String("20");
	String s3 = new String("");
	String s2 = s1; 
	int l = 20; // somehow derive it
	
	
	for(int o = 0; o<l-1; o++){
		

		int length1 = s1.length();
		int length2 = s2.length();
		int length3 = 0;

		int difference =0;
		if (length1 == length2)
			length3 = length1;
		else if (length1 - length2 >0){
		difference = length1 - length2;
		length3 = length1;

		for(int x =0; x<difference; x++)
			s2 = "0" + s2;
		}
		else
			{difference = length2 - length1;
			length3 = length2;

			for(int x =0; x<difference; x++)
				s1 = "0" + s1;
			
			}


		
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;

				for (int z = (length3 - 1); z>=0;z--)
				{
					String firstLetter1 = String.valueOf(s1.charAt(z));
		String firstLetter2 = String.valueOf(s2.charAt(z));

		

		
//		System.out.println(firstLetter1);
//		System.out.println(firstLetter2);

		
		if(firstLetter1.equals("0"))
			a=0;
		if(firstLetter1.equals("1"))
			a=1;
		if(firstLetter1.equals("2"))
			a=2;
		if(firstLetter1.equals("3"))
			a=3;
		if(firstLetter1.equals("4"))
			a=4;
		if(firstLetter1.equals("5"))
			a=5;
		if(firstLetter1.equals("6"))
			a=6;
		if(firstLetter1.equals("7"))
			a=7;
		if(firstLetter1.equals("8"))
			a=8;
		if(firstLetter1.equals("9"))
			a=9;
		
		
		if(firstLetter2.equals("0"))
			b=0;
		if(firstLetter2.equals("1"))
			b=1;
		if(firstLetter2.equals("2"))
			b=2;
		if(firstLetter2.equals("3"))
			b=3;
		if(firstLetter2.equals("4"))
			b=4;
		if(firstLetter2.equals("5"))
			b=5;
		if(firstLetter2.equals("6"))
			b=6;
		if(firstLetter2.equals("7"))
			b=7;
		if(firstLetter2.equals("8"))
			b=8;
		if(firstLetter2.equals("9"))
			b=9;
		
		
		 
		
		
		c=a+b +e;
		d=c%10;
		e=(c-d)/10;
		
		 

		
		if(d == 0)
	s3 = "0" + s3	;
		else if(d==1)
			s3 = "1" + s3 	;
		else if(d==2)
			s3 =  "2" +s3	;
		else if(d==3)
			s3 =  "3" + s3	;
		else if(d==4)
			s3 =  "4" + s3	;
		else if(d==5)
			s3 = "5" + s3	;
		else if(d==6)
			s3 = "6" + s3	;
		else if(d==7)
			s3 =  "7" + s3	;
		else if(d==8)
			s3 =  "8" +s3	;
		else if(d==9)
			s3 =  "9"	+ s3;

		
				}
				
				
				
				if(e == 0)
						;
						else if(e==1)
							s3 = "1" + s3 	;
						else if(e==2)
							s3 =  "2" +s3	;
						else if(e==3)
							s3 =  "3" + s3	;
						else if(e==4)
							s3 =  "4" + s3	;
						else if(e==5)
							s3 = "5" + s3	;
						else if(e==6)
							s3 = "6" + s3	;
						else if(e==7)
							s3 =  "7" + s3	;
						else if(e==8)
							s3 =  "8" +s3	;
						else if(e==9)
							s3 =  "9"	+ s3;
				System.out.println(s3);
				s1=s3;
				s3="";

		
	}
		
	System.out.println(s3);
	
}
}
