import java.util.*;
public class Recursion5{
    int sum(int n){
        if(n==0) return 0;
        return n+sum(n-1);
    }
    public static void main(String args[]){
        Recursion5 ob=new Recursion5();
        int res=ob.sum(10);
        System.out.println(res);
    }
}