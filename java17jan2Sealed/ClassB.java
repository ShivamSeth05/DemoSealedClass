package java17jan2Sealed;

@SuppressWarnings("preview")
public non-sealed class ClassB extends ClassA implements ITest
{
 public void methodB()
 {
 System.out.println("====methodB()====");
 }
 public void dis()
 {
 System.out.println("====ITest dis()===="); }
}