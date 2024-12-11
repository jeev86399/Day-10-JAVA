import java.util.*;
public class Methodoverloading4{
    static void a(){
        System.out.println("HELLO");
    }
    static void a(int b){
        System.out.println("HELLO  "+b);
    }
    static void a(int b,int c){
        System.out.println("HELLO  "+b+" "+c);
    }
    static void a(int b,int c,String d){
        System.out.println("HELLO  "+b+" "+c+" "+d);
    }
    public static void main(String args[]){
        a();
        a(5);
        a(6,7);
        a(5,3,"RAJU");
    }
}                                                  