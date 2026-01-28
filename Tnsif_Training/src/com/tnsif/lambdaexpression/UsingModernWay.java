package com.tnsif.lambdaexpression;


public class UsingModernWay {

	public static void main(String[] args) {
		MyCube obj=(no) -> no*no*no;
		
		
		System.out.println("Cube is "+obj.getCube(3));
		
		Operations op;
		
		
		op=(a,b)-> a+b;
		System.out.println("Addition is "+op.performmultiplication(10,5));
		
		
		op=(a,b) ->a-b;
		System.out.println("subtraction is "+op.performmultiplication(10,5));
		
		
		op=(a,b) -> a*b;
		System.out.println("Multiplication is "+op.performmultiplication(10,5));
		
		
		op=(a,b) ->a/b;
		System.out.println("Division is "+op.performmultiplication(10,5));
		
		
		Palindrome<String> strPalin;
		strPalin=(data)->
		{
			String revData=new StringBuffer(data).reverse().toString();
			return data.equals(revData);				
		};
		System.out.println("Is man Palindrome? : "+strPalin.checkPalindrome("man"));
		System.out.println("Is malayalam Palindrome? : "+strPalin.checkPalindrome("malayalam"));
		
		
		Palindrome<Integer> intPalin;
		intPalin=(data) ->
		{
			int rev=0, no=data;
			while(no!=0)
			{
				rev=rev*10+no%10;
				no=no/10;
			}
			if (data==rev)
				return true;
			else
				return false;
		};
		
		System.out.println("Is 232 Palindrome? : "+intPalin.checkPalindrome(232));
		System.out.println("Is 109 Palindrome? : "+intPalin.checkPalindrome(109));
	}
}
