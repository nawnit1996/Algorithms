/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class KadanesAlgo {
public static int printMaxSum(String[] arr) {
		int start=1,end=1,sum,currentSum;
		sum=currentSum=Integer.parseInt(arr[0]);
		for(int i=1;i<arr.length;i++) {
		    int cel=Integer.parseInt(arr[i]);
		    int temp=currentSum+cel;
		    if(temp>cel) {
		    	currentSum=temp;
		    }else {
		    	currentSum=cel;
		    }
			if(currentSum==cel){
			    start=i;
			}
			 if(sum<currentSum){
	                end=i;
	                sum=currentSum;
	            }   
			System.out.println("cel:"+cel+"temp="+temp+" sum="+sum+" currSum = "+currentSum);
   
		}
		System.out.println(String.format("Start= %s, End= %s",start,end));
		return sum;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int noOfTestCase = Integer.valueOf(br.readLine());
				StringBuffer sb = new StringBuffer(); 

		for (int i = 0; i < noOfTestCase; i++) {
			int inputLen = Integer.valueOf(br.readLine());
			int[] arr = new int[inputLen];
			 String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+"); 
		
  sb.append(printMaxSum(strs)+"\n");
 
		}
		System.out.println(sb);
	}
}