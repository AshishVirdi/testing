class DeprecatedDemo {
        /**
    * Method1
    * .....
    * @deprecated
    * @return
    */
    @Deprecated
    int num = 10;

    final int MAX_NUM = 10;

    /**
  * ... <snip> ...
  *
  * @deprecated in drupal:8.6.0 and is removed from drupal:9.0.0. Use
  *   mb_strlen() instead.
  *
  * @see https://www.drupal.org/node/2850048
  */
    @Deprecated
    public void myMsg() {
        System.out.println("This method is marked as deprecated");
    }

    public void myMsg2(String msg, String msg2) {
        System.out.println(msg + msg2);
    }

    public static void main(String a[]) {
        DeprecatedDemo obj = new DeprecatedDemo();
        obj.myMsg();
        System.out.println(obj.num);
    }
}
