
package rod_cuttong;
import java.util.*;
import java.lang.*;


public class Rod_cuttong {
 public int cutRod(int price[], int n)
    {
        if (n <= 0)
            return 0;
        int max_val = Integer.MIN_VALUE;
 
        // Recursively cut the rod in different pieces and
        // compare different configurations
        for (int i = 0; i < n; i++)
            max_val = Math.max(max_val,
                               price[i] + cutRod(price, n - i - 1));
 
        return max_val;
    }
    
    public static void main(String[] args) {
        Rod_cuttong r=new Rod_cuttong(); 
        int a[] = new int[] { 1, 3, 5, 7,8, 10, 11,13 };
        int size = a.length;
        System.out.println("Maximum Obtainable Value is " + r.cutRod(a, size));
    }
    
}
