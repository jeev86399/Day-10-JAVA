class StaticAcess2{
    public static void p(){
        System.out.println("public acess");
    }
    private static void q(){
        System.out.println("private acess");
    }
    protected static void r(){
        System.out.println("protected acess");
    }
    public static void main(String args[]){
        p();
        q();
        r();
    }
}
