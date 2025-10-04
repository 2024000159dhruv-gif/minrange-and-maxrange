import java.util.*;

public class previous{
	
	public static void operation(int minrange,int maxrange) {
		int count=0;
		for(int i=minrange;i<=maxrange;i++) {
			if(i%3==0) {
				count++;
				
			}
			else if(i%5==0) {
				count++;
			}
			
		}
		System.out.println(count);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter mini range:");
		int minrange=sc.nextInt();
		System.out.println("enter the max range:");
		int maxrang=sc.nextInt();
		
		previous.operation(minrange, maxrang);
		
	}

}
