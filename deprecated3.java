// TODO: Correct the code
public class deprecated3 {
    /* @deprecated The field num1 will be replaced by
     * newnum field
     */
    @Deprecated
    int num1=10;
    //new field
    final static int newnum=10;
    /* @deprecated The constructor depexamplewill be replaced by second depexample
     */
//old constructor
    deprecated3(int a, int b, int c){
        System.out.println("This is a deprecated method");
         System.out.println("TODO ");
    }
    // TODO: task 5
    //new constructor
    deprecated3(float d, int e, float f){
        System.out.println(d+f);
    }
    public static void main(String[] a){
//class object
        deprecated3 obj = new deprecated3(newnum, newnum, newnum);
//print num
        System.out.println(obj.num1);
    }}
