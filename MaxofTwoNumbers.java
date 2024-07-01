import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        while(a>b){
            System.out.println(a);
            break;                
            }
        while(b>a){
            System.out.println(b);
            break;
        }
    }
}
