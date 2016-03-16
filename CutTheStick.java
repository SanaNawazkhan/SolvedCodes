import java.util.*;
import java.math.*;

public class CutTheStick {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();        
        for(int i=0; i < n; i++){
            arr.add(in.nextInt());
        }            
        while(arr.size()!=0){        
        	int ctr = 0;
        	int small = arr.get(0);
        	for(int i= 1;i<arr.size();i++) {
        		if(arr.get(i)<small)
        			small = arr.get(i);
        	}        	        	
        	for(int i =0;i<arr.size();i++) {  
        		if(arr.get(i)-small ==0) {
        			arr.set(i, arr.get(i)-small);
        			arr.remove(i);
        			i--;
        		}
        		ctr++;        	        		
        	}
        	System.out.println(ctr);        	
        }               
    }
}
