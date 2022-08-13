// Java Hello World
// changed
// TODO task 3
public class another_class {
    /* @deprecated The field num1 will be replaced by
     * NewNum field
     */
    // TODO task 2
    @Deprecated
    int num1 = 10;
    //new field
    final int NewNum = 10;
    // TODO task 4
    public static void main(String[] a){
        //create an object for the class
        another_class obj = new another_class();
        //print num
        System.out.println(obj.num1);
    }
}
