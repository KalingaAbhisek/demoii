
public class Largest_palindrome_product {

	public static boolean pali(int num) {
		int rev=0;
		int x=num;
		while(num>0){
			int rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		if(rev==x) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int max=Integer.MIN_VALUE;
		for(int i=100;i<=998;i++) {
			for(int j=i+1;j<=999;j++) {
				if(pali(i*j)) {
					max=Math.max(max, i*j);
				}
			}
		}
		System.out.println(max);
	}

}
