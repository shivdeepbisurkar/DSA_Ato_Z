Input: 5

Output:
1                 1
1 2             2 1
1 2 3         3 2 1
1 2 3 4     4 3 2 1
1 2 3 4 5 5 4 3 2 1

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
    
    
    class Solution {
    
        void printTriangle(int n) {
            // code here
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n*2;j++){
                    if(j>i && j<=2*n-i)
                    System.out.print("  ");
                    else if(j<=i ){
                        
                    System.out.print(j+" ");
                    }
                    else{
                        
                    System.out.print((2*n-j+1)+" ");
                    }
                    
                }
                System.out.println();
            }
        }
    }