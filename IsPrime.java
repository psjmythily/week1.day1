package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		
		int n = 7;
		int check = 0;
		boolean isPrime = false;
		
		for(int i=2; i<(n-1); i++)
		{
			if(n%i==0)
			{
				isPrime = true;
			     break;
			}
		}	
          if(isPrime == true)
        	  System.out.println("It is not a prime number");
          else
        	  System.out.println("It is a prime number");
	}

}
