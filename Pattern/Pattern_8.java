Input: 5

Output:

*********
 *******
  *****
   ***
    *


//{ Driver Code Starts
    import java.io.*;
    import java.util.*;
    
    class Main {
        // Driver code
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine().trim());
                Solution obj=new Solution();
                obj.printTriangle(n);
            }
        }
    }
    // } Driver Code Ends
    
    
    class Solution {
    
        void printTriangle(int n) {
            // code here
            for(int i=0;i<n;i++){
                for(int j=1;j<n*2;j++){
                    if(j>i && j<n*2-i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }