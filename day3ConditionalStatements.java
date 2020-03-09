import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String result = "";
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        /*
        Conditions:
        n >=1 - just a constraint
        n <=100 - just a constraint
        n is odd, n is weird
        n is even and 2 to 5, n is not weird 
        n is even and 6 to 20, n is weird 
        n is even and greater than 20, n is not weird */

    if(n%2==1 || ((n%2==0)&&(n>=6 && n<=20)))
    {
    result = "Weird";
    }
    else
    {   
    result = "Not Weird";
    }
    System.out.println(result);
    scanner.close();
    }
}
