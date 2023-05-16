
    import java.io.*;
    import java.util.*;
    
    class GFG {
        public static void main(String args[]) throws IOException {
            BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(read.readLine());
            while (t-- > 0) {
                String S[] = read.readLine().split(" ");
                Long A = Long.parseLong(S[0]);
                Long B = Long.parseLong(S[1]);
    
                Solution ob = new Solution();
                Long[] ptr = ob.lcmAndGcd(A,B);
                
                System.out.print(ptr[0]);
                System.out.print(" ");
                System.out.println(ptr[1]);
            }
        }
    }
/*
 
Brute force
    class Solution {
        static Long[] lcmAndGcd(Long A , Long B) {
            Long []a=new Long[2];
            for (Long i = 1; i <= Math.min(num1, num2); i++) {
                 if (num1 % i == 0 && num2 % i == 0) {
            a[1]= i;                     //GCD
            a[0]=A*B/a[1];               //LCM
            return a;
      }
    }
    System.out.print("The GCD of the two number is "+ans);
  }
}
 */


/*
    Time Complexity: O(logɸmin(a,b)), where ɸ is 1.61.

    Space Complexity: O(1).

    Below solution is using Euclidean’s theorem.

    gcd(a,b)=gcd (b,a%b)   where a>b

    TO calculate LCM,
    LCM * GCD = a *b  where a and b are inputed number
  */  
    class Solution {
        static Long[] lcmAndGcd(Long A , Long B) {

            Long []a=new Long[2];
            Long x=A,y=B;
            while(x%y!=0){
                Long rem=x%y;
                x=y;
                y=rem;
            }
            a[0]=(A*B)/y;
            a[1]=y;
            return a;
        }
    };