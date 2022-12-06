
public class Sum_square_difference {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int sumsquare=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
			sumsquare+=(int) Math.pow(i, 2);
		}
		System.out.println((int)Math.pow(sum,2)-sumsquare);
	}
}
