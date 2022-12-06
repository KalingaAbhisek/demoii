
public class Even_Fibonacci_numbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lim=4000000;
		int a=1;
		int b=2;
		int sum=2;
		int c=a+b;
		while(c<lim) {
			a=b;
			b=c;
			c=a+b;
			if(c%2==0)
				sum+=c;
		}
		System.out.println(sum);
	}

}
