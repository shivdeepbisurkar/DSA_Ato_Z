
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}

/*
 Time Complexity = O(log N)
 Space Complexity = O(1)
 */

class Solution {
    static String armstrongNumber(int n){
        int cube=0;
        int m=n;
        while(n>0){
            cube=cube+((n%10)*(n%10)*(n%10));  
            n=n/10;
        }
        if(cube==m){
            return "Yes";
        }
        return "No";
    }
}