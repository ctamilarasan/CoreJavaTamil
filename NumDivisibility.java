package day7;

public class NumDivisibility {
	public static void main(String[] args) {
		System.out.println("Numbers divisible by 3 from 1 to 30:");
		int count=0;
		for(int i=1;i<=30;i++) {
			if(i%3==0) {
				System.out.println(i);
				count++;	
			}
		}
		System.out.println("count of number divisible by 3 :"+count);
	}

	}


