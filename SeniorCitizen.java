import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        int n=sc.nextInt();
         if(ch=='m'||ch=='M')
         {
             if(n>=60)
             {
             System.out.println("Senior Citizen");
             }
             else
             {
                 System.out.println("Not A Senior Citizen");
             }
        }
     if(ch=='f'||ch=='F')
        {
            if(n>=58)
            {
                System.out.println("Senior Citizen");
            }
            else
            {
                System.out.println("Not A Senior Citizen");
            }
        }
    }
}
