import java.util.*;
public class this11{
    void display(){
        System.out.println("HELLO");
    }
    void dis1(){
        this.display();
    }
    public static void main(String args[]){
        this11 b=new this11();
        b.dis1();
    }
}