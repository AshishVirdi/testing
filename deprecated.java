public class deprecated {
    /** @deprecated The function method1 will be replaced by method2
     */
    @Deprecated
    //old method
    public void method1(){
        System.out.println("This is a deprecated method");
    }
    //new method
    public void method2(String m1, String m2){
        System.out.println(m1+m2);
    }
    public static void main(String[] a){
        //class object
        deprecated obj = new deprecated();
        //call old method
        obj.method1();
    }}
