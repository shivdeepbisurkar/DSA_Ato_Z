//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            String ans = ob.is_palindrome(n);
            System.out.println(ans);
        }
    }
}


//Time Complexity : O(N)=log(N)
//Space Complexity : O(N)=1
//Palindrome : An integer is considered a palindrome when it reads the same backward as forward
class Solution
{
    public String is_palindrome(int n)
    {
        int m=n;
        int res=0;
        while(m>0){
            res=(res*10)+m%10;
            m=m/10;
        }
        if(n==res)
            return "Yes";
        return "No";
    }
}