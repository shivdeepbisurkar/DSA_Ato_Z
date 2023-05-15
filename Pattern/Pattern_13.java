Input: 5

Output:
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15

//{ Driver Code Starts
    import java.io.*;
    import java.util.*;
    
    class Main {
        // Driver code
        public static void main(String[] args) throws Exception {
            BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine().trim());
                Solution obj = new Solution();
                obj.printTriangle(n);
            }
        }
    }
    // } Driver Code Ends
    
    
    // Back-end complete function Template for Java
    
    class Solution {
    
        void printTriangle(int n) {
            int cnt=1;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(j<=i){
                        System.out.print(cnt+" ");
                        cnt++;
                    }
                    
                }
                System.out.println();
            }
        }
    }