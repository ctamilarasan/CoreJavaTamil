package StringMethods_EX;

public class StringMethods {
	public static void main(String[] args) {
		
		String str="Hello java";
		String str2="hello java";
		
		System.out.println("Original String: '"+str+"'");
		System.out.println();
		
		//length()
		System.out.println("length: "+str.length());
		System.out.println();
		
		//charAt()
		System.out.println("charater at index 6 : "+str.charAt(6));
		System.out.println();
		
		//Substring(beginIndex)
		System.out.println("Substring from index 6: "+str.substring(6));
		System.out.println();
		
		//SubString(beginIndex, endIndex)
		System.out.println("Substring (beginIndex,endINdex) (1,7): "+str.substring(1, 7));
		System.out.println();
		
		
		//tolowerCase()
		System.out.println("lower case: "+str.toLowerCase());
		System.out.println();
		
		//toUpperCase()
		System.out.println("Upper case: "+str.toUpperCase());
		System.out.println();
		
		//equals()
		System.out.println("equals str and str2: "+str.equals(str2));
		System.out.println();
		
		//equalsIgnoreCase()
		System.out.println("EqulsIngoreCase: "+str.trim().equalsIgnoreCase(str2));
		System.out.println();
		
		//contains()
		System.out.println("contains 'Hello' :"+str.contains("Hello"));
		System.out.println();
		
		//StartsWith()
		System.out.println("Starts With' He': "+str.startsWith("He"));
		System.out.println();
		
		//endsWith()
		System.out.println("Ends With' va': "+str.endsWith("va"));
		System.out.println();
		
		//IndexOf()
		System.out.println("Index of 'j':"+str.indexOf('j'));
		System.out.println();
		
		//IndexOf(String)
		System.out.println("index of 'java ': "+str.indexOf("java"));
		System.out.println();
		
		//replace()
		System.out.println("Replace 'a' with 'o'  "+str.replace('a', 'o'));
		System.out.println();
		
		//trim()
		System.out.println("trimmed String: '"+str.trim()+"'");
		System.out.println();
		
		//isEmty()
		String emptystr="";
		System.out.println("Is Emty String: "+emptystr.isEmpty());
		System.out.println();
		
		//split()
		String[] words=str.trim().split(" ");
		System.out.println("split words ");
		for(String w:words) 
		{
			System.out.println(w);
		}
		System.out.println();
		
		// concat()
		System.out.println("Concat with str + 'programing ':"+str.concat(" programing"));
		
		
	}

}
