import java.util.*;
    // default constructor 
    class a{
        int c;
        String b;
        a()
        {
            this.c=345;
            this.b="hello Amar";
        }
        void display(){
            System.out.println(b+" "+c);
        }
    }
    public class construt19{
        public static void main(String args[]){
            a s=new a();
            s.display();
        }
    }