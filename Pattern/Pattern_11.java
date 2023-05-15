Input: 5

Output:
1 
0 1 
1 0 1
0 1 0 1 
1 0 1 0 1


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
            int flg=1;
            for(int i=0;i<n;i++){
                if(i%2!=0)
                    flg=0;
                else 
                    flg=1;
                for(int j=0;j<n;j++){
                    if(j<=i){
                        System.out.print(flg+" ");
                        if(flg==0)
                            flg=1;
                        else
                            flg=0;
                    }
                }
                System.out.println("");
            }
        }
    }