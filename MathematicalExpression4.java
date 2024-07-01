import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int a=sc.nextInt();
            char ch=sc.next().charAt(0);
            int b=sc.nextInt();
            char ch1=sc.next().charAt(0);
            int c=sc.nextInt();
            if(ch=='+')
            {
                if((a+b)==c)
                
                    System.out.println("Yes");
                    else
                    System.out.println(a+b);
                
            }
                else if(ch=='-')
            {
                if((a-b)==c)
                
                    System.out.println("Yes");
                    else
                    System.out.println(a-b);
                }
                    else
                    {
                if((a*b)==c)
                
                    System.out.println("Yes");
                    else
                    System.out.println(a*b);
                }
                 t--; 
    }
}
                
            }
