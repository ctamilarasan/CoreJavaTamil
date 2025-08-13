package day20;
import java.util.*;



public class Maptypes {
	public static void main(String[] args) {
		
		Map<Integer,String> m= new HashMap<>();
		m.put(101, "java");
		m.put(102, "python");
		m.put(103, "c");
		m.put(101, "c++");
		m.put(101, "basha");
		
		System.out.println(m);
		
		System.out.println("KEY");
		for(Integer num :m.keySet())
		{
			
			System.out.println(num);
		}
		
		System.out.println("VALUES");
		for(String num :m.values())
		{
			
			System.out.println(num);
			

		}
		
		System.out.println("KEYS AND VALUES ");
		
		for(Map.Entry<Integer,String> en:m.entrySet()) 
		{
			System.out.println(en.getKey()+"="+en.getValue());
		}
		
	}
	

}
