import java.util.*;
    // constructor overloading
    class a{
        String b;
        a()
        {
            b="RAJESH";
        }
        a(String b)
        {
            this.b=b;
        }
        void display(){
            System.out.println(b);
        }
    }
    public class construtover10{
        public static void main(String args[]){
            a s=new a("AMAR");
            s.display();
            a s1=new a();
            s1.display();
        }
    }