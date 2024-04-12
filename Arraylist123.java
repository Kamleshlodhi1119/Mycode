import java.io.*;
import java.util.*;
//import java.util.stream.*;

class Arraylist {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter ot = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		
		while(t-->0){
		    
		    //input size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //inserting elements in the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		  //  StringBuffer str = new StringBuffer();
		    ArrayList<Integer> res = new ArrayList<Integer>();
		  
		    //calling leaders() function
		    res =obj.leaders(arr, n);
		    

		    for(int i=0; i<res.size(); i++){
		        ot.print(res.get(i)+" ");
		    }
		    
		    ot.println();
		}
		ot.close();
		
	}
}
   class Solution{
    //Function to find the leaders in the array.
    ArrayList<Integer> leaders(int a[], int n){
         ArrayList<Integer>k=new ArrayList<Integer>();
        int k1=0;
       
		
        for(int i=0;i<n;i++){
            for (int j=1;j<n;j++){
                  if(a[j]>a[i]){
                     k1=1;
                      }
             
                   }
            if(k1==0){
              k.add(a[i]);
              break;}
         }
        
        return k;
    }
}
