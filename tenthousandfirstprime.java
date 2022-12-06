import java.util.*;
public class tenthousandfirstprime {
	int lim=10000000;
	boolean[] arr=new boolean[lim+1];
    public void sieve() {
    	int cnt=0;
    	int var=-1;
    	for(int i=2;i<=lim;i++)
    		arr[i]=true;
    	for(int i=2;i*i<=lim;i++) {
    		if(arr[i]==true) {
        		for(int j=i*i;j<=lim;j+=i) {
        			arr[j]=false;
        		}    			
    		}
    	}
		for(int i=2;i<=lim;i++) {
			if(arr[i]==true) {
				cnt++;
			}
			if(cnt==10001) {
				var=i;
				System.out.println(var);
				break;
			}
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tenthousandfirstprime t=new tenthousandfirstprime();
		t.sieve();
	}

}
