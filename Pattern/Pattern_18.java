Input: 5

Output:
E
E D
E D C
E D C B
E D C B A

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
            for(int i=0;i<n;i++){
                char ch=(char)(64+n);
                for(int j=0;j<n;j++){
                    if(i>=j){
                        System.out.print(ch+" ");
                    }
                    ch--;
                }
                System.out.println();
            }
        }
    }