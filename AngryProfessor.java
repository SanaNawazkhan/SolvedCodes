import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AngryProfessor {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);       
        int testcase = s.nextInt();        
        for(int  i=0;i<testcase;i++){
        	int N = s.nextInt();
        	int K = s.nextInt();
        	int stundent_ct[] = new int[N];
        	int ctr[] =new int[N];
        	for(int j=0;j<N;j++){
        		stundent_ct[j] = s.nextInt();
        		if(stundent_ct[j]<=0)
        			ctr[i]++;
        	}        	
        	if(ctr[i]<K)
        		System.out.println("YES");
        	else
        		System.out.println("NO");
        }
    }
}
