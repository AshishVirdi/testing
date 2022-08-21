public class deprecated {
    /**
 * @deprecated  As of release 1.3, replaced by {@link #getPreferredSize()}
 */
    @Deprecated public Dimension preferredSize() {
    return getPreferredSize();
    }
    @Deprecated
    //old method
    public void method1(){
        System.out.println("This is a deprecated method");
    }
    /* @deprecated The field num1 will be replaced by
    * newnum field
    */
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
