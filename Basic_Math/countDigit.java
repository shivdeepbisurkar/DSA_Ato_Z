//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
Expected Time Complexity: O(log N)
Expected Space Complexity: O(1)

class Solution{
    static int evenlyDivides(int N){
        // code here
        
        int m=N,cnt=0;
        while(m>0){
            int no=m%10;
            if(no!=0 && N%no==0)               // to avoid ArithmeticException: divide by zero
                cnt++;
            m=m/10;
        }
        return cnt;
    }
}

/* Below code is to solve above problem in O(1) time complexity.
Count digit:    Time complexity= O(1)     Space Complexity=O(1)

static int count_digits(int n) 
{
	 String n2 = Integer.toString(n); 
	return n2.length(); //length() is inbuild function which is used to count length of string
} 

OR 

Time complexity= O(1)     Space Complexity=O(1)
static int count_digits(int n) 
{ 
	int digits = (int) Math.floor(Math.log10(n) + 1);   
	 return digits; 
} */