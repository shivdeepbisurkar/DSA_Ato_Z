/*
 Input:
N = 4
A[] = {-1 , 2, 1, -4}
X = 1
Output: 2
Explaination: 
Sums of triplets:
(-1) + 2 + 1 = 2
(-1) + 2 + (-4) = -3
2 + 1 + (-4) = -1
2 is closest to 1.
 */

 //{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            int X = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.closest3Sum(Arr, N, X));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int closest3Sum(int A[], int N, int X)
    {
        // code here
        /*Brute force
        Time complexity: O(n^3);
        Space Complexity: O(1);
        int min=Integer.MAX_VALUE;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                for(int k=j+1;k<N;k++){
                    int diff=Math.abs(X-(A[i]+A[j]+A[k]));
                    
                    if(min>diff){
                        min=diff;
                        ans=A[i]+A[j]+A[k];
                    }
                    
                }
            }
        }
        return ans;
        */
        //Time complexity: O(logn*(n^2))
        //space complexity: O(1);
        int min=Integer.MAX_VALUE;
        int ans=Integer.MIN_VALUE;
        Arrays.sort(A);
        for(int i=0;i<A.length;i++){
            int j=i+1;
            int k=A.length-1;
            while(j<k){
                int sum=(A[i]+A[j]+A[k]);
                if(sum== X) return sum;
                
                int diff=Math.abs(X-sum);
                   
                    if(min>diff){
                        min=diff;
                        ans=A[i]+A[j]+A[k];
                    }
                    if(sum<X)
                        j++;
                    else
                        k--;
            }
        }
        return ans;
    }
}