import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 int t = s.nextInt();
		 int H=1;
		 int a[] = new int[t];
		 for(int i =0; i<t;i++){
			 int N = s.nextInt();
			 if(N==0)
				 a[i]= H;
			 else{
				 for(int  j=0;j<N;j++){
					 if(j%2==0)
						 H = H*2;
					 else
						 H = H+1;					 				
				 }
				 a[i]=H;	
				 H=1;
			 }
		 }
		 for(int i =0;i<a.length;i++){
			 System.out.println(a[i]);
		 }
	}

}
