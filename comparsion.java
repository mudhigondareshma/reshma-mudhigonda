import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception{
     Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a=sc.nextInt();
            char ch=sc.next().charAt(0);
            int b=sc.nextInt();
            switch(ch)
            {
                case'>':if(a>b)
                        System.out.println("Right");
                 else
                    System.out.println("Wrong");
                  break;
                case '<':if(a<b)
                         System.out.println("Right");
                 else
                    System.out.println("Wrong");
                   break;
                case '=':if(a==b)
                         System.out.println("Right");
                  else
                    System.out.println("Wrong");
                   break;
            }
            //t--;
        }
    }
    
}
