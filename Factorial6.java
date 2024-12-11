import java.util.*;
public class Factorial6{
    int sum(int n){
        if(n==0)return 1;
        return n*sum(n-1);
    }
    public static void main(String args[]){
        Factorial6 b=new Factorial6();
        int res=b.sum(10);
        System.out.println(res);
    }
}