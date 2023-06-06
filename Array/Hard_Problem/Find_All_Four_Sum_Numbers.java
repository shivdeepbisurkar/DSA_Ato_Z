//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required
//Time complexity: O(n*logn)
//Space complexity: O(n)
class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        ArrayList<ArrayList<Integer>> b=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1])continue;
            for(int j=i+1;j<arr.length;j++){
                if(j>i+1 && arr[j]==arr[j-1])continue;
                int p=j+1;
                int l=arr.length-1;
                while(p<l){
                    ArrayList<Integer> a=new ArrayList<>();
                    int sum=arr[i]+arr[j]+arr[p]+arr[l];
                    if(sum<k)
                    {
                        p++;
                    }
                    else if(sum>k){
                        l--;
                    }
                    else {
                        /*
                        a.add(arr[i]);
                        a.add(arr[j]);
                        a.add(arr[p]);
                        a.add(arr[l]);
                        */
                        Collections.addAll(a,arr[i], arr[j], arr[p], arr[l]);
                        b.add(a);

                        p++;
                        l--;
                        while(p<l && arr[p]==arr[p-1])p++;
                        while(p<l && arr[l]==arr[l+1])l--;
                    }
                    
                }
            }
        }
        return b;
    }
}