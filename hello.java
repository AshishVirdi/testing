//DeprecatedExample.java
class DeprecatedExample {
 @Deprecated
 String oldField;
  
 String newField;
  
 @Deprecated
 public void oldMethod(){
  System.out.println("Deprecated method invoked");
 }
 public void newMethod() {
  System.out.println("Non-depricate alternative invoked");
 }
}
//MainClass.java
public class MainClass {
 public static void main(String args[]){
  DeprecatedExample exObj=new DeprecatedExample();
  System.out.println(exObj.oldField);//deprecated field
  exObj.oldMethod();//deprecated method
 }
}
