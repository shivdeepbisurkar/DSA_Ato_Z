/*
Observe properly, you will find that all the numbers in total appear (N/i) times.

Like in 4

1s = 4/1 = 4 times  ==> 1x4 = 4

2s = 4/2 = 2times   ==> 2x2 = 4

3s = 4/3 = 1 times  ==> 3x1 = 3

4s = 4/4 = 1 times  ==> 4x1 = 4
*/

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            
            Solution ob = new Solution();
            long ans  = ob.sumOfDivisors(N);
            System.out.println(ans);
        }
    }
}
/*
Time Complexity: O(N)
Auxiliary Space: O(1)
*/
class Solution{
    static long sumOfDivisors(int N){
        // code here
    long sum=0;
        for(int i=1;i<=N;i++){
            int div=N/i;
            sum=sum+(div*i);
        }
    return sum;
    }
}